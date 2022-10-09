package Practice;

public class practice3 {

    static int[][] reduce10(int [][]arr) {
        for(int i =0; i<arr.length; i++) {
            for(int j =0; j<arr[i].length; j++) {
                arr[i][j]=arr[i][j]-10;
            }
        }
        return arr;
    }
}
