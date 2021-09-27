//import java.util.Random;
//
//public class GenerateData {
//    public static String generateSymbol(){
//        String[] symbolsList = {"USD", "KES"};
//        Random random=new Random();
//        int symbolsListRandomNumber=random.nextInt(symbolsList.length);
//
//        return symbolsList[symbolsListRandomNumber];
//    }
//
//    public  int generatePrice(int price){
//        Random random= new Random();
//        float randomPercent = random.nextInt(31) + 10 ;
//        price += (int) (Math.random() * 2) == 1
//                ? (randomPercent / 100.0f)
//                : -(randomPercent / 100.0f);
//
//        return price;
//    }
//}
