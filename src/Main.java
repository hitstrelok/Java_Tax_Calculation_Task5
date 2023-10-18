import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.math.BigDecimal.valueOf;

public class Main {
    public static void main(String[] args) {

        double productNetX = 9.99;
        double productGrossX;

        System.out.println("Price without VAT: " + productNetX);
        productGrossX =productNetX*1.23;

        System.out.println("Price with VAT:" + productGrossX);

        double productOutcomeX = productGrossX*10_000;
        System.out.println("Value with VAT: "+productOutcomeX);

        double productNoVATX = (productOutcomeX/123)*100;

        System.out.println("Value without VAT: "+productNoVATX+"\n");



        System.out.println("Using BigDecimal");


        BigDecimal productNet = new BigDecimal("9.99").setScale(2, RoundingMode.HALF_DOWN);

        System.out.println("Price without VAT: " + productNet);

        BigDecimal productGross = productNet.multiply(valueOf(1.23)).setScale(2, RoundingMode.HALF_DOWN);

        System.out.println("Price with VAT rounded:"+ productGross);

        BigDecimal productOutcome = productGross.multiply(valueOf(10_000)).setScale(2, RoundingMode.HALF_DOWN);

        System.out.println("Value with VAT: "+productOutcome);

        BigDecimal productNoVAT = (productOutcome.divide(valueOf(123), RoundingMode.HALF_EVEN)).multiply(valueOf(100));

        System.out.println("Value without VAT: " +productNoVAT);



    }
}
