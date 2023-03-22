package h_09;

/**
 *
 * @author Helix
 */
public class Dog extends Animal {

    // Nem példányosítható az abstract
    private Boolean ball;
    private String owner;

    public Dog(String name, Integer age, Boolean male) {
        super(name, age, male);
    }

    public Dog() {
        super();
    }

    public Dog(Boolean ball, String owner, String name, Integer age, Boolean male) {
        super(name, age, male);
        this.ball = ball;
        this.owner = owner;
    }

    public Boolean getBall() {
        return ball;
    }

    public void setBall(Boolean ball) {
        this.ball = ball;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}
