package hibakezeles2;

/**
 *
 * @author asus
 */
public class Kutya {

    private String name;
    private Integer age;
    private Boolean male;

    private Boolean ball;
    private String Owner;

    public Kutya(String name, Integer age, Boolean male, Boolean ball, String Owner) {
        this.name = name;
        this.age = age;
        this.male = male;
        this.ball = ball;
        this.Owner = Owner;
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

    public Boolean getBall() {
        return ball;
    }

    public void setBall(Boolean ball) {
        this.ball = ball;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

}
