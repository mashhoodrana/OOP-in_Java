class Stock {
    String symbol; // stock symbol
    String name; // stock name
    double PreviousClosingPrice; // price of the last day
    double CurrentPrice;

    Stock(String symbol, String name, double PreviousClosingPrice, double CurrentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.CurrentPrice = CurrentPrice;
        this.PreviousClosingPrice = PreviousClosingPrice;
    }

    public double getChangePercent() {
        return ((CurrentPrice - PreviousClosingPrice) / PreviousClosingPrice) * 100;
    }

    public String toString() {
        return "Stock [symbol=" + symbol + ", name=" + name + ", previousClosingPrice=" + PreviousClosingPrice
                + ", currentPrice=" + CurrentPrice + "]";
    }

}

public class Q2 {
    public static void main(String[] args) {
        Stock obj = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
        System.out.println(obj);
    }
}
