package local.strings.lesson1;

import java.util.LinkedHashMap;

/**
 * Single Number
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 *
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * Example 1:
 *
 * Input: nums = [2,2,1]
 * Output: 1
 *
 * Example 2:
 *
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 *
 * Example 3:
 *
 * Input: nums = [1]
 * Output: 1
 */
public class Class04 {

    public static void main(String[] s){
        int[] val = {4,1,2,1,2};
//        System.out.println(execute(val));
        System.out.println(executeXOR(val));

    }

    private static Integer execute(int[] arr){
        Integer returnVal = null;
        LinkedHashMap<Integer,Integer> m = new LinkedHashMap<>();

        for (int i : arr){
            if( m.containsKey(i)){
                int now = m.get(i) +1;
                m.put(i,now);
            } else {
                m.put(i,1);
            }
        }

        for(int i : m.keySet()){
            if( m.get(i) == 1){
                returnVal = i;
            }
        }
        return returnVal;
    }

    /**
     * 針對  {4,1,2,1,2,4,0,0} XOR 不是最佳解
     * @param arr
     * @return
     */
    private static Integer executeXOR(int[] arr){
        int returnVal = 0;

        for (int i : arr){
//            returnVal ^= i;
            returnVal = returnVal ^ i;
        }




        return returnVal;
    }

}
