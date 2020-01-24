package by.sTm.target1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Component
public class EuroConverter implements CurrencyExchange {
    @Value("#{new java.math.BigDecimal(${currency.rate.euro})}")
    private BigDecimal bdRate;
    @Override
    public String getExchange(int byn) {
        return "EURO cost = " + new BigDecimal(byn).divide(bdRate, 2,  RoundingMode.HALF_UP);
    }
}