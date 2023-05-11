package hibakezeles2;

/**
 *
 * @author Helix
 */
public class Cat extends Animal {

    private final Integer life = 9;
    private Boolean alombaKakil;

    public Cat(String name, Integer age, Boolean male) {
        // Kötelezően meg kell hívni az ősosztály egyik konstruktorát
        super(name, age, male);
    }

    public Cat() {
        super();
    }

    public Cat(Boolean alombaKakil, String name, Integer age, Boolean male) {
        super(name, age, male);
        this.alombaKakil = alombaKakil;
    }

    public Integer getLife() {
        return life;
    }

    public Boolean isAlombaKakil() {
        return alombaKakil;
    }

    public void setAlombaKakil(Boolean alombaKakil) {
        this.alombaKakil = alombaKakil;
    }

}
