package Exercicio01;
import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Integer age;
    private List<Address> address;
    private Person filiation;

    public Person(String name, Integer age, List<Address> address) {
        this.name = name;
        this.age = age;
        this.address = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List<Address> getAddress() {
        return address;
    }

    public List<Address> addAddress(Address address) {
        this.address.add(address);
        return addAddress();
    }
}
