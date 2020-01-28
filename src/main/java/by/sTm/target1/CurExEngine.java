package by.sTm.target1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.io.*;
import java.util.Set;

@Component
public class CurExEngine {
    private final Map<String, CurrencyExchange> ceList;
    @Value("#{${map.car.price}}")
    private Map<String, Integer> carList;
    public CurExEngine(Map<String, CurrencyExchange> ceList1)  {this.ceList = ceList1;}

    void getResult(String carName, String curName, String filePath) {
        String sResult = this.ceList.get(curName).getExchange((carList.get(carName)));
        if (filePath.equals("")) {System.out.println(sResult);}
        else{
            FileWriter fw;
            try {
                fw = new FileWriter(filePath + "Result.txt");
                fw.write(sResult);
                fw.close();
                System.out.println("Результат работы успешно сохранён по пути " + filePath + "BeanResult.txt");
            }
            catch(IOException e){
                System.out.println("Ошибка сохранения. Прична: " + e.getMessage());
            }
        }
    }
}

