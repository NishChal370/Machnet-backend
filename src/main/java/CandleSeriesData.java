import java.time.*;

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

}
