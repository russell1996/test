package tasks.task15_01_24;

import java.math.BigDecimal;

public class TaxService {
    public void payOut(BigDecimal taxAmount) {
        System.out.format("Уплачен налог в размере %.2f%n", taxAmount);
    }
}