package by.sTm.target1;

import java.math.BigDecimal;
import java.util.Map;
import java.io.*;

public class CurExEngine {
    private Map<String, CurrencyExchange> ceList;
    private Map<String, Integer> carList;
    public CurExEngine() {}
    public CurExEngine(Map<String, CurrencyExchange> ceList1, Map<String, Integer> carMap)
    {
        this.ceList = ceList1;
        this.carList = carMap;
    }
    void getResult(String carName, String curName, String filePath) throws IOException {
        String sResult = ceList.get(curName).getExchange(new BigDecimal(carList.get(carName)));
        if (filePath.equals("")) {System.out.println(sResult);}
        else{
            FileWriter fw;
            try {
                fw = new FileWriter(filePath + "Result.txt");
                fw.write(sResult);
                fw.close();
                System.out.println("Результат работы успешно сохранён по пути " + filePath + "Result.txt");
            }
            catch(IOException e){
                System.out.println("Ошибка сохранения. Прична: " + e.getMessage());
            }
        }
    }
}

