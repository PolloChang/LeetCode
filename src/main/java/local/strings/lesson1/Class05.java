package local.strings.lesson1;

/**
 * XOR
 */
public class Class05 {

    public static void main(String[] s){
        int a = 10, b = 20;
        a = a ^ b;
        System.out.println(" 1 : "+a + " ,b : "+b);
        b = a ^ b;
        System.out.println(" 1 : "+a + " ,b : "+b);
        a = a ^ b;
        System.out.println(" 1 : "+a + " ,b : "+b);
    }
}
