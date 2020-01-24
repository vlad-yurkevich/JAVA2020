package by.sTm.target1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.*;

public class TestWork {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        CurExEngine cee = context.getBean("curExEngine", CurExEngine.class);
        String sCarMark = "", sCurrencyName = "", sFilePath = "";
        if (args.length >= 2) {
            sCurrencyName = args[0] + "Converter";
            sCarMark = args[1];
        }
        if (args.length == 3) {sFilePath = args[2];}
        System.out.println("Марка автомобиля... " + sCarMark);
        cee.getResult(sCarMark, sCurrencyName, sFilePath);
    }
}
