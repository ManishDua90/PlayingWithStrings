package internMethod;

/**
 * Created by Manish Dua on 1/18/2018.
 */
public class InternMethod {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String ("abc").intern();
        System.out.println(str1.equals(str2));
        System.out.println(str1==str2);
    }
}
