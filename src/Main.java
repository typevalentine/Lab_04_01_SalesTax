public class Main
{
    public static void main (String[] args)
    {
        final double SALES_TAX_RATE = .05;
        double purchasePrice = 55;
        double totalTax = SALES_TAX_RATE * purchasePrice;
        double totalPrice = totalTax + purchasePrice;

        System.out.println("The sales tax is: $" + totalTax);
        System.out.println("The total purchasePrice with tax is: $" + totalPrice);
    }
}
