public class Address {
    private int code;
    private String city;
    private String street;
    private int houseNumber;

    public void setCode(int Code){this.code = Code;}
    public void setCity(String City){this.city = City;}
    public void setStreet(String Street){this.street = Street;}
    public void setHouseNum(int HouseNum){this.houseNumber = HouseNum;}
    public int getAddress(){return this.code;}
    public String getCity(){return this.city;}
    public String getStreet(){return this.street;}
    public int getHouseNum(){return this.houseNumber;}

    public Address(int code , String city , String street, int houseNumber){
        this.code = code;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;

    }

}
