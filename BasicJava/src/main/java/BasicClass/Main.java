package BasicClass;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(14);
        Person person1 = new Person("AAAAAAAAAAAAAAAA");
        Person person2 = new Person();
        System.out.println(cat1.getYear());
        person1.animalSay();
        person2.animalSay();
        cat1.setYear(15);
        System.out.println(cat1.getYear());
    }
}
