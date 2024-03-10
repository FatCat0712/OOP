public class Country {
    private String countryName;
    private String countryCode;

    public Country(String countryName,String countryCode){
        if(!countryName.isEmpty()){
            this.countryName = countryName;
        }
        if(!countryCode.isEmpty()){
            this.countryCode = countryCode;
        }
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        if(!countryName.isEmpty()){
            this.countryName = countryName;
        }

    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        if(!countryCode.isEmpty()){
            this.countryCode = countryCode;
        }
    }

    @Override
    public String toString() {
        return countryCode + "-" +countryName;
    }
}
