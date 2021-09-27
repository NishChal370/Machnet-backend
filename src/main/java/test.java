import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MINUTE,LocalDateTime.now().getMinute()+20);
        System.out.println(calendar.getTime());
        System.out.println(calendar.HOUR_OF_DAY);
    }
}


//        while (nowTime.getMonth() < 11){
//            System.out.println(nowTime.getMonth());
////        }
//        System.out.println("nowTime.getYear()"+nowTime.plusYears(-1).toLocalDate());
//        System.out.println("LocalDateTime.now().toLocalDate()"+LocalDateTime.now().toLocalDate().getMonthValue());
//        System.out.println("nowTime.getMonthValue()"+nowTime.getMonthValue());
//        nowTime = nowTime.plusDays(30);
//        System.out.println(nowTime.getMonthValue());

//        while (nowTime.getMonth() < "2022")
//        System.out.println("Out "+nowTime.toLocalDate()+" "+ LocalDateTime.now().toLocalDate());
//                System.out.println(nowTime.toLocalDate().getYear()+"->"+nowTime.toLocalDate().getMonthValue()+"->"+nowTime.toLocalDate().getDayOfMonth());
//                System.out.println(LocalDateTime.now().toLocalDate().getYear()+"->"+LocalDateTime.now().toLocalDate().getMonthValue()+"->"+LocalDateTime.now().toLocalDate().getDayOfMonth());
//
//-----
//        int year = LocalDate.now().getYear();
//        String month = (LocalDate.now().getMonthValue() <10)
//                ? 0+""+LocalDate.now().getMonthValue()
//                : Integer.toString(LocalDate.now().getMonthValue());
//        int day = LocalDate.now().getDayOfMonth();
//        LocalDateTime nowTime = LocalDateTime.of(LocalDate.parse(year+"-"+month+"-"+day), LocalTime.parse("10:00"));//LocalDateTime.now().toLocalDate()

//--
//
//
//import java.time.LocalDateTime;
//        import java.util.*;
//        import java.util.stream.IntStream;
//
//public class CandleSeriesData {
//    private LocalDateTime time;
//    private String symbol;
//    private double price;
//
//    public CandleSeriesData(LocalDateTime time, String symbol, double price){
//        this.time =time;
//        this.symbol=symbol;
//        this.price=price;
//    }
//
//    public LocalDateTime getTime(){
//        return time;
//    }
//
//    public double getPrice(){
//        return price;
//    }
//
//    public String getSymbol(){
//        return symbol;
//    }
//
//    public static  String generateSymbol(){
//        String[] symbolsList = {"USD", "KES"};
//        Random random=new Random();
//        int symbolsListRandomNumber=random.nextInt(symbolsList.length);
//        return symbolsList[symbolsListRandomNumber];
//    }
//
//    public static int generatePrice(int price){
//        Random random= new Random();
//        float randomPercent = random.nextInt(21) + 10 ;
////        if((int)(Math.random()*2) == 1){
////            price += (randomPercent/100.0f);
////        }
////        else{
////            price -= (randomPercent/100.0f);
////        }
//        price += (int) (Math.random() * 2) == 1
//                ? (randomPercent / 100.0f)
//                : -(randomPercent / 100.0f);
//        return price;
//    }
//
//    public static void main(String[] args) {
//        List<CandleSeriesData> candle = new ArrayList<>();
//        LocalDateTime nowTime = LocalDateTime.now();
//        int price = new Random().nextInt( 2000) + 1200 ;
//
//        String symbol = generateSymbol();
//        for(int i=0; i<5; i++){
//            for(int j=0; j<6; j++){
//                if(j != 0){
//                    price = generatePrice(price);
//                    symbol = generateSymbol();
//                }
//
//                candle.add(new CandleSeriesData(nowTime, symbol, price));
//            }
//        }
//
////        String symbol = generateSymbol();
////        IntStream.range(0, 5)
////                .forEach(i -> {
////                    IntStream.range(0, 6)
////                                .mapToObj(index ->new CandleSeriesData(nowTime,(index!= 0)? generateSymbol(): symbol, generatePrice(price, index))
////                                )
////                                .forEach(candle::add);
////                });
//
//        System.out.println(candle);
//        System.out.println("->>> "+candle.size());
//
//        candle.forEach(i-> System.out.println(i+"->"+i.getTime()+" "+i.getSymbol()+" "+i.getPrice()));
//    }
//}
//
////    public static Date getNewTime(int timeInc){
////        Calendar calendar = Calendar.getInstance();
////        calendar.set(Calendar.MINUTE,LocalDateTime.now().getMinute());
////        return calendar.getTime();
////    }
//
//
////        List<List<Object>> candle = new ArrayList<>();
//
////        IntStream.range(0, 5)
////                .forEach(i -> {
////                    IntStream.range(0, 6)
////                                .mapToObj(index ->new ArrayList<Object>(Arrays.asList(now.plusMonths(10), getSymbol(), getPrice(price, index)))
////                                )
////                                .forEach(candle::add);
////                });
////
////        System.out.println(candle);
//
//
//
//
////    public static int generatePrice(int price, int j){
////        if(j != 0){
////            Random random= new Random();
////            float randomPercent = random.nextInt(21) + 10 ;
////            if((int)(Math.random()*2) == 1){
////                price += (randomPercent/100.0f);
////            }
////            else{
////                price -= (randomPercent/100.0f);
////            }
////        }
////        return price;
////    }
//
////for(int i=0; i<5; i++){
////        for(int j=0; j<6; j++){
////        price = generatePrice(price, j);
////        symbol = (j!= 0)? generateSymbol(): symbol;
////        candle.add(new CandleSeriesData(nowTime, symbol, price));
////        }
////        }
//
