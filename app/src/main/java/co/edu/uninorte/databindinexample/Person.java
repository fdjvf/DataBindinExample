package co.edu.uninorte.databindinexample;

/**
 * Created by fdjvf on 4/13/2017.
 */

public class Person {
    public Person(String name, int age) {
        Name = name;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    String Name;
    int Age;
}
