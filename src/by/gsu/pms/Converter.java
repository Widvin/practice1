package by.gsu.pms;

import java.math.BigDecimal;

import static java.math.BigDecimal.ROUND_FLOOR;

public class Converter {

    public static BigDecimal convert(double amount, double divider, int accuracy){
        BigDecimal decimal = new BigDecimal(amount/divider).setScale(accuracy, ROUND_FLOOR);

        return decimal;
    }

}
