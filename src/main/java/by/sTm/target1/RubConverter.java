package by.sTm.target1;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class RubConverter implements CurrencyExchange {
    private BigDecimal bdRate;
    public RubConverter(double rate){
        bdRate = new BigDecimal(rate);
    }
    @Override
    public String getExchange(BigDecimal byn) {
        return "RUB cost = " + byn.multiply(bdRate, MathContext.DECIMAL64);
    }
}