package tasks.task15_01_1;

import java.math.BigDecimal;

public class VATaxType extends TaxType{
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        return amount.multiply(new BigDecimal (0.18));
    }
}
