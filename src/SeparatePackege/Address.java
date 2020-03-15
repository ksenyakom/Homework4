package SeparatePackege;

public class Address {
    String city;
    String street;
    int houseNumber;
    int flatNumber;

    public Address() {
    }

    public Address(String city, String street, int houseNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }
    public Address(String city, String street, int houseNumber, int flatNumber) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }



    public String getFullAddress() {
        String fullAddress = "г." + this.city + ", ул." + this.street + " " + this.houseNumber;
        if (this.flatNumber>0 ) {fullAddress = fullAddress +"-" + this.flatNumber;}
        return fullAddress;
    }
}
