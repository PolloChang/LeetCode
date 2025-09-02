package local.strings.lesson1;

/**
 * **題目敘述：**
 * 判斷一個整數是否為**迴文數**。迴文數是指正著讀和反著讀都一樣的數字。
 *
 * **範例 1：**
 * 輸入：`x = 121`
 * 輸出：`true`
 * 解釋：正著讀是 121，反著讀也是 121，所以是迴文數。
 *
 * **範例 2：**
 * 輸入：`x = -121`
 * 輸出：`false`
 * 解釋：正著讀是 -121，反著讀是 121-。因此它不是迴文數。
 */
public class Class08 {

    public static void main(String[] a){
        String s = "2233";

        char[] sc = s.toCharArray();
        char[] sb = new char[sc.length];

        int j = 0;
        for(int i= sc.length -1 ; i >= 0; i--){
            System.out.println(sc[i]);
            sb[j] = sc[i];
            j++;
        }

        for(int i = 0 ; i < sc.length ; i++){
            if(sc[i] != sb[i]){
                System.out.println("非迴文數");
            }
        }
    }
}
