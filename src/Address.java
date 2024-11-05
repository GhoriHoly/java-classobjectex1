public class Address {
    private String street;
    private String streetNo;
    private String city;

    public Address(String street, String streetNo, String city) {
        this.street = street;
        this.streetNo = streetNo;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", streetNo='" + streetNo + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
