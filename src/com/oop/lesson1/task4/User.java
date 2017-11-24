package lesson1.task4;

import java.io.Serializable;

/**
 * Created by MM on 24.11.2017.
 */
public class User implements Serializable {
    private Integer age;

    public User() {
    }

    private String name;
    private Long salary;

    public User(String name, Integer age, Long salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
