public interface PersonBuilder {
    PersonBuilder setName(String name);

    PersonBuilder setSurname(String surName);

    PersonBuilder setAddress(String address);

    PersonBuilder setSalary(double salary);

    Person build();
}
