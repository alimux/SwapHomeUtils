package utils;

/**
 *
 * @author Alexandre DUCREUX & Logan Lepage List of countries, this list is
 * non-exhaustive
 */
public enum CountriesList {

    FR("FRANCE"),
    EN("ANGLETERRE"),
    IT("ITALIE"),
    ES("ESPAGNE");

    private String country = "";
    private String name = "";

    /**
     * constructor
     *
     * @param country
     */
    private CountriesList(String country) {
        this.country = country;
        this.name = this.name();
    }

    /**
     * getter getCountry
     *
     * @return country
     */
    public String getCountry() {
        return country;
    }

    /**
     * getter Name
     *
     * @return name
     */
    public String getName() {
        return name;
    }
}
