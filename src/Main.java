public class Main {
    public static void main (String[] args)
    {
        double salesTax = .05;
        double price = 55;
        double totalTax = salesTax * price;
        double totalPrice = totalTax + price;

        System.out.println("The sales tax is: $" + totalTax);
        System.out.println("The total price with tax is: $" + totalPrice);

    }
}
