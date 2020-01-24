package by.sTm.target1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class EuroConverter implements CurrencyExchange {
    private BigDecimal bdRate;
    public EuroConverter(double rate){
        bdRate = new BigDecimal(rate);
    }
    @Override
    public String getExchange(BigDecimal byn) {
        return "EURO cost = " + byn.divide(bdRate, 2,  RoundingMode.HALF_UP);
    }
}