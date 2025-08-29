package local.strings.lesson1;

import java.util.*;

/* 說明：
 * 題目：
 * 將輸入的字串
 * 1.  以 ","和"."為分隔字元，將字串分解為單字
 * 2.  將所有單字倒序排列，並輸出
 * 3.  找出所有不重複的單字並輸出
 * */
public class Class01 {
    public static void main(String[] args){
        String s = " Hi! , Im ,a boy. Are .u OK? .u OK?,a boy";
        execute(s);
        executeWithStream(s);
    }

    private static void execute(String enterStr){

        // 1.  以 ","和"."為分隔字元，將字串分解為單字
        String[] stringArray = enterStr.replaceAll("\\.",",").split(",");
        ArrayList<String> stL = new ArrayList<>(Arrays.asList(stringArray));

        for (String i : stringArray){
            System.out.print(i);
        }

        //2.  將所有單字倒序排列，並輸出
        Stack<String> bStr = new Stack<>();
        for (String i : stringArray){
            bStr.push(i);
        }
        while (!bStr.empty()){
            System.out.print(bStr.pop());
        }

        //3.  找出所有不重複的單字並輸出
        Set<String> cStr = new HashSet<>();
        for (String i : stringArray){
            cStr.add(i);
        }

        for (String i : cStr){
            System.out.print(i);
        }

    }

    public static void executeWithStream(String enterStr){
        // 1.  以 ","和"."為分隔字元，將字串分解為單字
        String[] stringArray = enterStr.replaceAll("\\.",",").split(",");
//        ArrayList<String> stL = new ArrayList<>(Arrays.asList(stringArray));

        //2.  將所有單字倒序排列，並輸出
        Stack<String> bStr = new Stack<>();
        Set<String> cStr = new HashSet<>();

        Arrays.stream(stringArray).forEach(it -> {
            bStr.push(it); // Arrays.stream(stringArray).forEach(bStr::push);
            cStr.add(it); // Arrays.stream(stringArray).forEach(cStr::add);
        });


        System.out.println("2.  將所有單字倒序排列，並輸出");

        while (!bStr.empty()){
            System.out.print(bStr.pop());
        }
        System.out.println("");
        System.out.println("");

        //3.  找出所有不重複的單字並輸出
        System.out.println("3.  找出所有不重複的單字並輸出");


        cStr.forEach(System.out::print);

    }

}


