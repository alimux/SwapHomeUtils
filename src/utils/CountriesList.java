
package utils;


public enum CountriesList {

    FR("FRANCE"),
    EN("ANGLETERRE"),
    IT("ITALIE"),
    ES("ESPAGNE");

    private String country = "";
    private String name="";

    private CountriesList(String country) {
        this.country = country;
        this.name = this.name();
    }

    public String getCountry() {
        return country;
    }
    
    public String getName()
    {
        return name;
    }
}
