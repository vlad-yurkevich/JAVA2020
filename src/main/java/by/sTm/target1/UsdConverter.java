package by.sTm.target1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class UsdConverter implements CurrencyExchange {
    @Value("#{new java.math.BigDecimal(${currency.rate.usd})}")
    private BigDecimal bdRate;
    @Override
    public String getExchange(int byn) {
        return "USD cost = " + new BigDecimal(byn).divide(bdRate, 2,  RoundingMode.HALF_UP) + "$";
    }
}
