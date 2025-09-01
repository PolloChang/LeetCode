package local.strings.lesson1;

import java.util.*;

/**
 * Merge Intervals
 * Example 1:
 *
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
 *
 * Example 2:
 *
 * Input: intervals = [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 */
public class Class06 {

    public static void main(String[] s){
        int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};
//        int[][] intervals = {{1,4},{4,5}};
//        ArrayList<ArrayList<Integer>> bestInterval = execute(intervals);
//
//        for(ArrayList<Integer> i: bestInterval){
//            for(int j : i){
//                System.out.print(j+" - ");
//            }
//            System.out.println();
//            System.out.println("==========");
//        }

        int[][] bestInterval2 = execute2(intervals);
        for (int[] i : bestInterval2){
            System.out.print(i[0]);
            System.out.print(" , ");
            System.out.print(i[1]);
            System.out.println();
            System.out.println("==========");
        }

    }

    private static ArrayList<ArrayList<Integer>> execute(int[][] intervals){
        ArrayList<ArrayList<Integer>> bestInterval = new ArrayList<>();


        if(intervals.length ==1){
            for(int[] i: intervals){
                ArrayList<Integer> j = new ArrayList<>();
                j.add(i[0]);
                j.add(i[1]);
                bestInterval.add(j);
            }

            return bestInterval;
        }

        Map<Integer, Integer> m = new HashMap<>();
        ArrayList<Integer> startDays = new ArrayList<>();
        ArrayList<Integer> allDays = new ArrayList<>();

        for(int[] i: intervals){
            m.put(i[0],i[1]);
            startDays.add(i[0]);
        }

        List<Integer> j = startDays.stream().sorted().toList();
        for(int g : j){
            allDays.add(g);
            allDays.add(m.get(g));
        }

        ArrayList<Integer> k = new ArrayList<>();

        for(int i = 0; i< allDays.size() ; i++){

            //偶數為起始日期
            if(i%2 == 0){
                System.out.print("起始日: "+allDays.get(i));
                int startD = allDays.get(i);
                if(k.size() == 0){
                    k =  new ArrayList<>();
                    k.add(0,startD);
                }else{
                    if (k.get(1) >= startD){

                    }else {
                        bestInterval.add(k);
                        k =  new ArrayList<>();
                        k.add(0,startD);
                    }
                }

            }else{
                System.out.print(",結束日: "+allDays.get(i));

                int endD = allDays.get(i);
                if(k.size() == 1){
                    k.add(1,endD);
                }else{
                    if(k.get(1) <= endD){
                        System.out.println(">>>>>>>>>>>>"+endD);
                        k.remove(1);
                        k.add(1,endD);
                    }
                }

                System.out.println("");
                System.out.println("==========換日線==========");
            }

            System.out.println("");
            System.out.println("本次迴圈結束: "+ i);
            for(int l : k){
                System.out.print(l+" - ");
                System.out.println();
                System.out.println("--------------------------------");
            }

        }
        bestInterval.add(k);

        System.out.println("==========計算完畢==========");
        return bestInterval;
    }

    private static int[][] execute2(int[][] intervals){
        //1. 依照每個起點進行排序
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        //2. 回傳結果
        LinkedList<int[]> merge = new LinkedList<>();

        for(int[] i: intervals){
            if(merge.isEmpty() || i[0] > merge.getLast()[1]){
                merge.add(i);
            } else {
                merge.getLast()[1] = Math.max(i[1],merge.getLast()[1]);
            }
        }

        return merge.toArray(new int[merge.size()][]);

    }

}
