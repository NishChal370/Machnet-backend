import java.time.*;
import java.util.*;

public class CandleSeriesData {
    private double price;
    private String symbol;
    private LocalDateTime time;

    public CandleSeriesData(LocalDateTime time, String symbol, double price){
        this.time= time;
        this.price= price;
        this.symbol= symbol;
    }

    public LocalDateTime getTime(){
        return time;
    }

    public double getPrice(){
        return price;
    }

    public String getSymbol(){
        return symbol;
    }

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

    public static List<CandleSeriesData>  getCandles(String symbol, LocalDateTime startDate, LocalDateTime endDate, int granularity) {
        List<CandleSeriesData> candles = new ArrayList<>();

        double price = new Random().nextInt( 500) + 500 ;
        String initSymbol = (symbol.isEmpty()) ? generateSymbol() : symbol;

        while (startDate.toLocalDate().compareTo(endDate.toLocalDate()) <=0){
            while (startDate.getHour()<15){
//                System.out.println("startDate.getSecond(): "+startDate);//
                if(startDate.getSecond() != 0){
//                    System.out.println("IN side ZERO->>>");
                    price = generatePrice(price);

                    while ((int)price < 100){
                        price = generatePrice(price + new Random().nextInt( 200) + 200);
                    }

                    initSymbol = (symbol.isEmpty()) ? generateSymbol() : symbol;
                }

                candles.add(new CandleSeriesData(startDate, initSymbol,price));
                startDate = startDate.plusSeconds(granularity);
            }

            startDate = startDate.plusDays(1);
            startDate = startDate.toLocalDate().atTime(10, 0);
        }

        return candles;
    }


    public static void main(String[] args) {
        LocalDateTime nowTime = LocalDateTime.of(LocalDate.now().plusDays(-1), LocalTime.parse("10:00"));
        List<CandleSeriesData> candles = getCandles("",nowTime, LocalDateTime.now(),50);//LocalDateTime.now().toLocalDate()
        ArrayList<ArrayList<CandleSeriesData>> candle2D= new ArrayList<>();
        ArrayList<CandleSeriesData> individualCandle = new ArrayList<>();

        candles.forEach(i->{
            if(i.getTime().getMinute() == 0 && i.getTime().getSecond()==  0){

                System.out.println("BREAK");

                if(!individualCandle.isEmpty()){
                    candle2D.add(individualCandle);
                }

                individualCandle.clear();
            }
            individualCandle.add(i);
            System.out.println("->"+i.getTime()+" "+i.getSymbol()+" "+i.getPrice());
        } );

    }
}
