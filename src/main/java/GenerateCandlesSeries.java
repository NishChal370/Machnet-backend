
import java.time.*;
import java.util.*;
import java.text.DecimalFormat;
import java.util.stream.Collectors;

public class GenerateCandlesSeries {

    public static String generateSymbol(){
        String[] symbolsList = {"USD", "KES"};
        Random random=new Random();
        int symbolsListRandomNumber=random.nextInt(symbolsList.length);

        return symbolsList[symbolsListRandomNumber];
    }

    public static double generatePrice(double price){
        Random random= new Random();

        double randomPercent = random.nextInt(11) ;
        String addOrSub = ((int)(Math.random() * 2) == 1)? "add": "sub";

        price = addOrSub.equals("add")
                ? price +((price*randomPercent) / 100)
                : price -((price*randomPercent )/ 100);

        return price;
    }


    private static List<CandleSeriesData> generateCandleSeriesFakeData(LocalDateTime startDate, LocalDateTime endDate) {
        List<CandleSeriesData> candlesSeriesData = new ArrayList<>();

        double price = new Random().nextInt( 500) + 500 ;

        while (startDate.toLocalDate().compareTo(endDate.toLocalDate()) <=0){
            while (startDate.getHour()<15){
                String symbol = generateSymbol();
                price = generatePrice(price);
                while ((int)price < 100){
                    price = generatePrice(price + new Random().nextInt( 200) + 200);
                }

                candlesSeriesData.add(new CandleSeriesData(startDate, symbol,price));

                startDate = startDate.plusSeconds(5);// fake data will be created in every 5seconds
            }

            startDate = startDate.plusDays(1);
            startDate = startDate.toLocalDate().atTime(10, 0);
        }

        return candlesSeriesData;
    }

    // creating 2D list according to Granularity
    public static List<List<CandleSeriesData>> createCandlesList(String symbol, int granularity, List<CandleSeriesData> candleSeriesFakeData, LocalDateTime startDate, LocalDateTime endDate){
        List<CandleSeriesData> individualCandle = new ArrayList<>();
        List<List<CandleSeriesData>> combineCandlesList = new ArrayList<>();

        int createCandleInSeconds= granularity;
        for ( CandleSeriesData  data: candleSeriesFakeData ) {

            if(startDate.compareTo(data.getTime())==0 || endDate.compareTo(data.getTime())>=0){

                createCandleInSeconds = (createCandleInSeconds >=60) ? createCandleInSeconds-60 : createCandleInSeconds;

                if(data.getTime().getSecond() == createCandleInSeconds){
                    combineCandlesList.add( new ArrayList<>(individualCandle) );
                    individualCandle.clear();
                    createCandleInSeconds += granularity;
                }

                if(data.getSymbol() == symbol) {
                    individualCandle.add(data);
                }
            }
        }

        return combineCandlesList;
    }


    public static List<CandleDTO> getCandles(String symbol, int granularity, LocalDateTime startDate, LocalDateTime endDate){
        List<CandleDTO> candleDTOList = new ArrayList<>();
        LocalDateTime nowTime = LocalDateTime.of(LocalDate.now().plusDays(-1), LocalTime.parse("10:00"));

        List<CandleSeriesData> candleSeriesFakeData = generateCandleSeriesFakeData(nowTime, LocalDateTime.now()); //param: (generate data from(data) , till(date))
        List<List<CandleSeriesData>> candlesList = createCandlesList(symbol, granularity, candleSeriesFakeData, startDate, endDate);

        //finding open close high low, volume
        double openingPrice = 0;
        double closingPrice = 0;
        for (List<CandleSeriesData> candle:candlesList) {
            for (CandleSeriesData data: candle){
                if(candlesList.indexOf(candle) ==0 && candle.indexOf(data) == 0){
                    openingPrice = data.getPrice();
                }
                else if(candle.indexOf(data) == 0){
                    openingPrice = closingPrice;
                }

                closingPrice = (candle.indexOf(data) == candle.size()-1) ? data.getPrice() : 0;
            }

            List<Double> oneCandlePrices= candle.stream().map(CandleSeriesData::getPrice).collect(Collectors.toList());
            List<LocalDateTime> oneCandleTime= candle.stream().map(CandleSeriesData::getTime).collect(Collectors.toList());

            if(oneCandlePrices.size() > 0){
                double lowPrice = Collections.min(oneCandlePrices);
                double highPrice = Collections.max(oneCandlePrices);
                double volume = oneCandlePrices.stream().reduce(0d, Double::sum);

                candleDTOList.add( new CandleDTO(oneCandleTime.get(0), lowPrice, highPrice, openingPrice, closingPrice, volume) );
            }

        }

        return candleDTOList;
    }

    public static void main(String[] args) {
        String symbol = "USD";
        String startTime = "2021-09-28T10:00";
        String endTime = "2021-09-29T15:00";
        List<CandleDTO> candlesDTOList = getCandles(symbol,30, LocalDateTime.parse(startTime), LocalDateTime.parse(endTime));

        System.out.println("---Data of "+ symbol+" from "+ startTime +" to "+endTime +" --------\n");
        int candleNumber=0;
        DecimalFormat df = new DecimalFormat("#.##");
        for(CandleDTO candle: candlesDTOList){
            candleNumber++;
            System.out.println("Candle"+candleNumber+
                    ": { TIME: "+candle.getTime()+
                    " HIGH: "+df.format(candle.getHigh())+
                    " LOW: "+df.format(candle.getLow())+
                    " OPEN: "+df.format(candle.getOpen())+
                    " CLOSE: "+df.format(candle.getClose())+
                    " VOLUME: "+df.format(candle.getVolume())+
                    " }");
        }
    }
}
