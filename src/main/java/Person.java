public class Person {
    private String name;
    private String surname;
    private String address;
    private double salary;

    public Person(String name, String surname, String address, double salary) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", surName='" + surname + '\'' + ", address='" + address + '\'' + ", salary=" + salary + '}';
    }
}
