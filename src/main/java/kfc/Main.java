package kfc;


public class Main {


    public static void main(String[] arg) {
        Person person = new Person("Динис", 28);
        Person person1 = new Person("Иван", 22);
        Person person2 = new Person("Егор", 25);
        person.talk();
        person1.talk();
        person2.talk();
        person.setFullName("");
        person.setAge(-1);
        person.count();
        person.setId(2);

    }
}
