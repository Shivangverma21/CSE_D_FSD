class TaxCalculator {
    public final double calculateGST(double amount) {
        return amount * 0.18;
    }
}
class OnlineTaxCalculator extends TaxCalculator {
    private double internetHandlingFee;
    public OnlineTaxCalculator(double internetHandlingFee) {
        this.internetHandlingFee = internetHandlingFee;
    }
    public double calculateTotalTax(double amount) {
        double gst = calculateGST(amount);
        return gst + internetHandlingFee;
    }
}
public class TaxCalculator2 {
    public static void main(String[] args) {
        OnlineTaxCalculator calc = new OnlineTaxCalculator(20.0);
        double total = calc.calculateTotalTax(1000.0);
        System.out.println("Total Tax: " + total);
    }
}

