package Exercicio01;

public class Address {
    private String street;
    private String block;
    private String city;
    private String uf;

    public Address(String street, String block, String city, String uf) {
        this.street = street;
        this.block = block;
        this.city = city;
        this.uf = uf;
    }

    public String getStreet() {
        return street;
    }

    public String getBlock() {
        return block;
    }

    public String getCity() {
        return city;
    }

    public String getUf() {
        return uf;
    }
}
