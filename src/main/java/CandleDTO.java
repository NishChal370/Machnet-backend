import java.time.LocalDateTime;

public class CandleDTO {
    LocalDateTime time; //timestamp in millisecond
    double low; // min price
    double high; // max price
    double open; // first price
    double close; //last price
    double volume; //total txn amount

    public CandleDTO(LocalDateTime time, double low, double high, double open, double close, double volume) {
        this.time = time;
        this.low = low;
        this.high = high;
        this.open = open;
        this.close = close;
        this.volume = volume;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public double getLow() {
        return low;
    }

    public double getHigh() {
        return high;
    }

    public double getOpen() {return open;}

    public double getClose() {
        return close;
    }

    public double getVolume() {
        return volume;
    }
}
