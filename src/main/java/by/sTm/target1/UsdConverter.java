package by.sTm.target1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class UsdConverter implements CurrencyExchange {
    private BigDecimal bdRate;
    @Override
    public String getExchange(BigDecimal byn) {
        return "USD cost = " + byn.divide(bdRate, 2,  RoundingMode.HALF_UP) + "$";
    }

    public void setBdRate(BigDecimal bdRate) {
        this.bdRate = bdRate;
    }
}
