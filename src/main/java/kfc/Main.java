package kfc;


public class Main {


    public static void main(String[] arg) {
        Person person = new Person("Динис", 28, 2);
        person.talk();
        person.setFullName("Иван");
        person.setAge(-1);
        person.count();

    }
}
