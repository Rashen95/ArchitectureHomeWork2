public class ConcretePersonBuilder implements PersonBuilder {
    private String name;
    private String surname;
    private String address;
    private double salary;

    @Override
    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    @Override
    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public PersonBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    @Override
    public Person build() {
        return new Person(name, surname, address, salary);
    }
}
