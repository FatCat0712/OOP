public class Manufacturer {
    private String brandName;
    private String brandCountry;

    public Manufacturer(String brandName, String brandCountry){
        if(!brandName.isEmpty()){
            this.brandName = brandName;
        }
        if(!brandCountry.isEmpty()){
            this.brandCountry = brandCountry;
        }
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
        return brandCountry;
    }

    public void setBrandCountry(String brandCountry) {
        if(!brandCountry.isEmpty()){
            this.brandCountry = brandCountry;
        }

    }
}
