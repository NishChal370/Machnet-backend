import java.time.*;
import java.util.*;

public class CandleSeriesData {
    private LocalDateTime time;
    private String symbol;
    private double price;

    public CandleSeriesData(LocalDateTime time, String symbol, double price){
        this.time =time;
        this.symbol=symbol;
        this.price=price;
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

    public static int generatePrice(int price){
        Random random= new Random();
        float randomPercent = random.nextInt(31) + 10 ;
        price += (int) (Math.random() * 2) == 1
                ? (randomPercent / 100.0f)
                : -(randomPercent / 100.0f);

        return price;
    }

    public static void main(String[] args) {
        List<CandleSeriesData> candles = new ArrayList<>();

        int year = LocalDate.now().getYear();
        String month = (LocalDate.now().getMonthValue() <10)
                ? 0+""+LocalDate.now().getMonthValue()
                : Integer.toString(LocalDate.now().getMonthValue());
        int day = LocalDate.now().getDayOfMonth();
        LocalDateTime nowTime = LocalDateTime.of(LocalDate.parse(year+"-"+month+"-"+day), LocalTime.parse("10:00"));//LocalDateTime.now().toLocalDate()

//        LocalDateTime nowTime = LocalDateTime.of(LocalDateTime.now().toLocalDate(), LocalTime.parse("10:00"));

        int price = new Random().nextInt( 2000) + 1000 ;
        String symbol = generateSymbol();

//        while (nowTime.getMonth() < 11){
//            System.out.println(nowTime.getMonth());
//        }

        while (nowTime.getHour()<15){
            if(nowTime.getMinute() != 0){
                price = generatePrice(price);
                symbol = generateSymbol();
            }
            candles.add(new CandleSeriesData(nowTime, symbol, price));
            nowTime = nowTime.plusMinutes(20);
//            nowTime = nowTime.plusMonths(20);
        }
        System.out.println("size "+candles.size());
        candles.forEach(i->{
            if(i.getTime().getMinute() == 0 ){
                System.out.println("BREAK");
            }
            System.out.println("->"+i.getTime()+" "+i.getSymbol()+" "+i.getPrice());
        } );
    }
}



















//        for(int hour=0; hour<5; hour++){
//            for(int minute=0; minute<6; minute++){
////                System.out.println("Hour"+nowTime.getHour());
//                if(nowTime.getMinute() != 0){
//                    price = generatePrice(price);
//                    symbol = generateSymbol();
//                }
//                candles.add(new CandleSeriesData(nowTime, symbol, price));
//                nowTime = nowTime.plusMinutes(10);
//            }
//        }

