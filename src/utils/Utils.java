package utils;

import java.util.*;

/**
 * class which is using for misc tasks
 *
 * @author Alexandre DUCREUX & Logan LEPAGE 2017
 * @see https://github.com/alimux/SwapHomeUtils
 */

public class Utils {

    /**
     * check if a month is valid
     *
     * @param monthNumber
     * @return
     */
    public boolean isValid(int monthNumber) {
        return monthNumber > 0 && monthNumber < 13;
    }

    /**
     * Return a global list of months
     *
     * @return new ArrayList<>(Arrays.asList(MonthsList.values()))
     */
    public static List<MonthsList> getMonthList() {
        return new ArrayList<>(Arrays.asList(MonthsList.values()));
    }

    /**
     * Return global list of countries
     *
     * @return new ArrayList<>(Arrays.asList(CountriesList.values()))
     */
    public static List<CountriesList> getCountriesList() {
        return new ArrayList<>(Arrays.asList(CountriesList.values()));
    }

}
