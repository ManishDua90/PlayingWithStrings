package charToArrayAndViceVersa;

/**
 * Created by Manish Dua on 1/18/2018.
 */
public class charToArray {
    public static void main(String[] args) {
        String aa = "madam";
        char [] bb = aa.toCharArray();
        System.out.println(bb);

        byte[] cc = aa.getBytes();
        System.out.println(cc);
        String dd = new String(cc);
        System.out.print(dd);
    }
}
