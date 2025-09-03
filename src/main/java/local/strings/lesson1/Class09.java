package local.strings.lesson1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * ### 第三題：合併兩個有序鏈表 (Merge Two Sorted Lists)
 *
 * **題目敘述：**
 * 將兩個表合併為一個新的**已排序**鏈表。新鏈表是透過拼接前兩個鏈表的節點所構成。
 *
 * **範例 1：**
 * 輸入：`list1 = [1, 2, 4]`, `list2 = [1, 3, 4]`
 * 輸出：`[1, 1, 2, 3, 4, 4]`
 *
 * **範例 2：**
 * 輸入：`list1 = [1, 8, 4]`, `list2 = [1, 3, 4]`
 * 輸出：``[1, 1, 2, 3, 4, 8]`
 */
public class Class09 {
    public static void main(String[] a){
        int[] list1 = {1, 2, 4};
        int[] list2 = {1, 3, 4};
//        int[] list1 = {};
//        int[] list2 = {};
        List<Integer> arr = new ArrayList<>();
        HashMap<Integer , Integer> map = new HashMap<>();
        int k = 0;

        for (int i : list1){
            arr.add(i);
            map.put(k, -1);
            k ++;
        }

        for (int i : list2){
            arr.add(i);
            map.put(k, -1);
            k ++;
        }

        int min = 0;

        for(int i=0 ; i < arr.size() ; i++){
            System.out.println("check = "+arr.get(i));
            System.out.println("min = "+min);
            int maxIdx = 0;
            for(int j = i; j< arr.size(); j++){
                System.out.println(arr.get(j));
                if(arr.get(i) > arr.get(j) ){
                    System.out.println("maxIdx++");
                    maxIdx++;
                }
            }
            System.out.println("maxIdx = "+maxIdx);

            for(int g = min ; g < arr.size() ; g++){
                if(map.get(g) == -1){
                    if(maxIdx == 0){
                        map.put(g,arr.get(i));
                        System.out.println("put map");
                        break;
                    }
                    maxIdx--;
                }
            }


            for(int g = min ; g < arr.size() ; g++){
                if(map.get(g) == -1){
                    min = g;
                    break;
                }
            }

            System.out.println("*****************************************");
        }

        int[] ans = new int[arr.size()];
        for(int i=0 ; i < arr.size() ; i++){
            ans[i] = map.get(i);
        }
        System.out.println("================================");
        for(int i : ans){
            System.out.println(i);
        }

    }
}
