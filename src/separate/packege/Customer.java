package separate.packege;

public class Customer {
   public String name;
    public String surname;
    public int age;
    public Address address;

    public Customer() {
    }

    public Customer(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Customer(String name, String surname, int age, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public String getFullName() {
        String name = this.name + " " + this.surname;
        return name;
    }

    public String getFullAddress() {
        return address.getFullAddress();

    }
    public String getAge(){
        int dev = this.age%10;
        String s = String.valueOf(this.age);
        if (dev==0 || dev>=5) s = s+ " лет";
        else if (dev == 1) s = s + " год";
        else s = s + " года";
        return s;
    }

    //    public Customer(String name, String surname, int age, String city, String street, int houseNumber, int flatNumber) {
//        this.name = name;
//        this.surname = surname;
//        this.age = age;
//        this.city = city;
//        this.street = street;
//        this.houseNumber = houseNumber;
//        this.flatNumber = flatNumber;

    //    public String getFullAdress() {
//        String adress = "г."+this.city+", ул."+this.street + " " + this.houseNumber + "-" + this.flatNumber;
//        return adress;
//    }


}
