package h_09;

/**
 *
 * @author Tóth Milán
 */
public class Animal {

    protected String name;
    protected Integer age;
    protected Boolean male;

    public Animal(String name, Integer age, Boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getMale() {
        return male;
    }

    public void setMale(Boolean male) {
        this.male = male;
    }

}
