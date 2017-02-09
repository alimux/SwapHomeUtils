package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * class which is using for misc tasks
 * @author Alexandre DUCREUX & Logan LEPAGE 2017
 */

public class Utils {


    public boolean isValid(int monthNumber) {
        return monthNumber > 0 && monthNumber < 13;
    }

    public static List<MonthsList> getMonthList() {
        return new ArrayList<>(Arrays.asList(MonthsList.values()));
    }
    
    public static List<CountriesList> getCountriesList() {
        return new ArrayList<>(Arrays.asList(CountriesList.values()));
    }
    

}
