class Stock {
    String symbol; // stock symbol
    String name; // stock name
    double PreviousClosingPrice; // price of the last day
    double CurrentPrice;

    Stock() {
        this.symbol = symbol;
        this.name = name;
        this.CurrentPrice = CurrentPrice;
        this.PreviousClosingPrice = PreviousClosingPrice;
    }

    public double getChangePercent() {
        return ((CurrentPrice - PreviousClosingPrice) / PreviousClosingPrice) * 100;
    }

    public String toString()
    {
        return "Stock [symbol=" + symbol + ", name=" + name + ", previousClosingPrice=" + PreviousClosingPrice + ", currentPrice=" + CurrentPrice + "]";
    }

}

public class Q2 {
    public static void main(String[] args) {

    }
}
