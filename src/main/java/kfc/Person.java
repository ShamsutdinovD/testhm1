package kfc;

public class Person {

    private String fullName;

    private int age;

    private int id;

    private static int counter = 0;


    public Person(){

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            System.out.println("Имя не может быть пустым или null");
            return;
        }
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id == 2) {
            System.out.println("Привет я, " + fullName + ", избранный!");
            return;
        }
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Возраст не может быть меньше 0");
            return;
        }
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
        this.id = counter++;
    }

    public void talk(){
                if (fullName != null && !fullName.isEmpty() && age > 0) {
            System.out.println("Привет я " + fullName + " и мне " + age + " лет");
        }
    }

    public static void count(){
        System.out.println("Количество созданных объектов " + counter);
    }
}
