package enums;

public enum URLs {

    BASE_URL("https://demo.opencart.com/");

    private String value;

    private URLs(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

}
