
package tasks.task15_01_1;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {
    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {

        if (amount <= 100_000) {
            return amount * 0.10;
        } else {
            return amount * 0.15;
        }
    }
}

