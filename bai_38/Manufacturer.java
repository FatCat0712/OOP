public class Manufacturer {
    private String brandName;
    private Country brandCountry;

    public Manufacturer(String brandName, Country brandCountry) {
        if(!brandName.isEmpty()){
            this.brandName = brandName;
        }
        this.brandCountry = brandCountry;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        if(!brandName.isEmpty()){
            this.brandName = brandName;
        }

    }

    public String getBrandCountry() {
        return brandCountry.getCountryName();
    }

    public void setBrandCountry(Country brandCountry) {
        this.brandCountry = brandCountry;
    }
}
