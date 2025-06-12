package kfc;


public class Main {


    public static void main(String[] arg) {
        Person person = new Person("Динис", 28, 0);
        person.talk();
        person.setFullName("");
        person.setAge(-1);
        person.count();
        person.setId(2);

    }
}
