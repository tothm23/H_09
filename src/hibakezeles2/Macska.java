package hibakezeles2;

/**
 *
 * @author asus
 */
public class Macska {

    private String name;
    private Integer age;
    private Boolean male;

    // private final Integer life = 9;
    private Integer life = 9;
    private Boolean alombaKakil;

    public Macska(String name, Integer age, Boolean male, Boolean alombaKakil) {
        this.name = name;
        this.age = age;
        this.male = male;
        this.alombaKakil = alombaKakil;
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

    public void birthday() throws TooOldException {
        if (this.age <= 25) {
            this.age++;
        } else {
            throw new TooOldException("Ez a mcska túl öreg");
        }
    }

    public Boolean getMale() {
        return male;
    }

    public void setMale(Boolean male) {
        this.male = male;
    }

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    public Boolean getAlombaKakil() {
        return alombaKakil;
    }

    public void setAlombaKakil(Boolean alombaKakil) {
        this.alombaKakil = alombaKakil;
    }

}
