package local.strings.lesson1;


import java.util.HashMap;

/**
 * **題目敘述：**
 * 給定一個整數陣列 `nums` 和一個目標值 `target`，請找出陣列中**和為目標值**的那兩個整數，並返回它們的**索引**。
 *
 * 您可以假設每種輸入都只會對應一個答案，且相同的元素不能被重複使用。
 *
 * **範例 1：**
 * 輸入：`nums = [2, 7, 11, 15]`, `target = 9`
 * 輸出：`[0, 1]`
 * 解釋：因為 `nums[0] + nums[1] == 9`，所以我們返回 `[0, 1]`。
 *
 * **範例 2：**
 * 輸入：`nums = [3, 2, 4]`, `target = 6`
 * 輸出：`[1, 2]`
 * 解釋：因為 `nums[1] + nums[2] == 6`，所以我們返回 `[1, 2]`。
 */
public class Class07 {

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5,6,7,8,9};
        int target = 15;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0 ; i<nums.length ; i++){
            int c = target - nums[i];
            if(map.containsKey(c)){
                System.out.println("0: "+map.get(c)+" 1: "+i);
            }

            map.put(nums[i],i);
        }

    }

}
