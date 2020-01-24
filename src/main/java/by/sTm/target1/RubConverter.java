package by.sTm.target1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.MathContext;

@Component
public class RubConverter implements CurrencyExchange {
    @Value("#{new java.math.BigDecimal(${currency.rate.rub})}")
    private BigDecimal bdRate;
    @Override
    public String getExchange(int byn) {
        return "RUB cost = " + new BigDecimal(byn).multiply(bdRate, MathContext.DECIMAL64);
    }
}