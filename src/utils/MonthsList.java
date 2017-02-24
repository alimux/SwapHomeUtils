package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * List of the months
 * @author Alexandre DUCREUX & Logan Lepage
 */
public enum MonthsList {

    JANVIER("Janvier"),
    FEVRIER("Fevrier"),
    MARS("Mars"),
    AVRIL("Avril"),
    MAI("Mai"),
    JUIN("Juin"),
    JUILLET("Juillet"),
    AOUT("Aout"),
    SEPTEMBRE("Septembre"),
    OCTOBRE("Octobre"),
    NOVEMBRE("Novembre"),
    DECEMBRE("Decembre");

    private String month = "";

    /**
     * Constructor
     * @param month
     */
    private MonthsList(String month) {
        this.month = month;
    }

    /**
     * Getter month
     * @return month
     */
    public String getMonth() {
        return month;
    }

}
