package introducao;

public class FuncaoString {
    public static void main(String[] args) {
        String original = "O Mario É UM DEV top     _" + ".";
        String s01 = original.substring(2, 7);
        String s02 = original.replace(s01, "Odila").replaceFirst("O", "A");
        System.out.println(original);
        System.out.println(s01);
        System.out.println(s02);
    }
}
