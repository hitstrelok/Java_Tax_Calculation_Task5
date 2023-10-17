import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        double productNet = 9.99; //77% product cost (100%-23% VAT)
        double productGross; //100% product cost

        System.out.println("Product net: " + productNet);
        productGross =productNet/(1-0.23);

        System.out.printf("Product gross: %.2f %n", productGross);

        double productOutcome = productGross*10_000;
        System.out.println("Price of 10,000 pcs of this product: "+productOutcome);

        double productNoVAT = (productOutcome/123)*100;

        System.out.println("The value excluding VAT: "+productNoVAT);



    }
}
