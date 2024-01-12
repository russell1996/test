package tasks.task15_01_1;

import java.math.BigDecimal;

public class main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                // TODO создать платежи с различным типами налогообложения

                new Bill(new BigDecimal(5000), new IncomeTaxType(), taxService),
                //new Bill(5000, new ProgressiveTaxType(), taxService),
                new Bill(new BigDecimal(5000), new VATaxType(), taxService)

        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();


        }
    }
}
