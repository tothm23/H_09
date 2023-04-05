package h_09;

/**
 *
 * @author Tóth Milán
 */
public class H_09 {

    public static void main(String[] args) {
        Cat macska = new Cat();
        System.out.println(macska.getName());
        System.out.println(macska.getAge());
        System.out.println(macska.getMale());

        Cat cirmi = new Cat(false, "Cirmi", 6, false);
        System.out.println(cirmi.isAlombaKakil());
        System.out.println(cirmi.getLife());

        Macska m = new Macska("Cica", 100, Boolean.FALSE, Boolean.FALSE);
        System.out.println(m.getAge());

        try {
            m.birthday();
        } catch (TooOldException ex) {
            System.err.println("Ez a mcska túl öreg");
        }

        System.out.println(m.getAge());
    }

}
