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
