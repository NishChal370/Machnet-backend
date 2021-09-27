
public class CandleDTO {
    long time; //timestamp in millisecond
    double low; // min price
    double high; // max price
    double open; // first price
    double close; //last price
    double volume; //total txn amount

    public CandleDTO(long time, double low, double high, double open, double close, double volume) {
        this.time = time;
        this.low = low;
        this.high = high;
        this.open = open;
        this.close = close;
        this.volume = volume;
    }
}
