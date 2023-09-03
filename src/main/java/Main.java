public class Main {
    public static void main(String[] args) {
        Person p1 =
                new ConcretePersonBuilder()
                        .setName("Artem").build();
        Person p2 =
                new ConcretePersonBuilder()
                        .setName("Artem")
                        .setSurname("Privalov")
                        .setAddress("Orbitalnaya 15")
                        .setSalary(15000)
                        .build();
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
