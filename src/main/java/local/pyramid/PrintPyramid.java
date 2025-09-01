package local.pyramid;

/**
 * 列印金字塔
 * 特性:
 * 1. 每行的星星是奇數、空白為偶數
 * 2. 行數與總字元數量 = (行數 -1) * 2 +1
 * 3. Console 列印方式為 從金字塔頂端開始列印
 */
public class PrintPyramid {

    private int showLine;

    public PrintPyramid(int showLine){

        if(showLine<=0){
            throw new IllegalArgumentException("輸入的值不能小於或等於 0。");
        }

        this.showLine = showLine;
    }

    public void execute2(){
        int full =  (showLine * 2) - 1;
        for(int i = 0; i < showLine; i++){
            //計算每層需要多少顆星星
            int starts = (2 * i) +1;
            //計算做編需要多少空白
            int leftBlanks = (full - starts)/2;
            String show = " ".repeat(leftBlanks)+"*".repeat(starts);
            System.out.println(show);

        }
    }

    public void execute3(){
        if(showLine%2==0){
            System.out.println("要奇數才可以列印");
            throw new IllegalArgumentException("要奇數才可以列印");
        }

        int full =  (showLine + 1) /2;
        int fullStarts = full;
        System.out.println("full = "+full);
        for(int i = 0; i < showLine; i++){

            if(i < full){
                //計算每層需要多少顆星星
                int starts = i+1;
                //計算做編需要多少空白
                int leftBlanks = (full - starts);
                String show = " ".repeat(leftBlanks)+"*".repeat(starts);
                System.out.println(show);
            } else {
                fullStarts --;
                int leftBlanks = (full - fullStarts);
                String show = " ".repeat(leftBlanks)+"*".repeat(fullStarts);
                System.out.println(show);
            }

        }
    }

    public void execute(){
        int totalCol = (showLine-1) * 2 + 1;


        for (int i = 0 ; i < showLine ; i++) {
            int startStrCount = i*2+1;
            int blankStrCount = totalCol - startStrCount;
            String showStr = getShowLineStr(
                    startStrCount,
                    blankStrCount
            );
            System.out.println(showStr);
        }
    }

    /**
     * 計算單行的顯示方式
     * @param startStrCount
     * @param blankStrCount
     * @return
     */
    private String getShowLineStr(int startStrCount, int blankStrCount){

        StringBuilder returnVal = new StringBuilder();

        for( int i = 1; i <= 3 ; i++){
            switch (i){
                case 1, 3:
                    for ( int j = 1 ; j <= (blankStrCount/2) ; j++){
                        returnVal.append(" ");
                    }
                    break;
                case 2:
                    for ( int j = 1 ; j <= startStrCount ; j++){
                        returnVal.append("*");
                    }
                    break;
            }
        }

        return returnVal.toString();
    }

}
