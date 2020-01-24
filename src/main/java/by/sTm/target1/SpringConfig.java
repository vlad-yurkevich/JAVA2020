package by.sTm.target1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.HashMap;


@Configuration
@ComponentScan("by.sTm.target1")
@PropertySource("classpath:application.properties")
public class SpringConfig {
    @Bean
    public CurExEngine curExEngineBean() { return new CurExEngine(new HashMap<>()); }

    @Bean
    public CurrencyExchange usdBean() { return new UsdConverter(); }

    @Bean
    public CurrencyExchange euroBean() { return new EuroConverter(); }

    @Bean
    public CurrencyExchange rubBean() {
        RubConverter rubConverter = new RubConverter();
        //--Инициализация поля
        rubConverter.sWarning = "Осторожнее с мошенниками!";
        return rubConverter; }
}
