package o4.challenges.code.ds.fk;

public class SpiralArray {

    static int[][] spiral(int n) {
        int[] directionsY = new int[]{1,0,-1,0};
        int[] directionsX = new int[]{0,1,0,-1};
        int[][] result = new int[n][n];
        String[][] result2 = new String[n][n];

        int j=0, k=0;
        int kk = k;
        int dir = 0;
        for (int i=1; i <= n*n; i++) {

            System.out.println(k +", "+j);
            result[k][j] = i;
            print(result);
            j += directionsY[dir];
            k += directionsX[dir];

            if (j < 0 || k < 0 || j >= n || k >= n || result[k][j] != 0) {

                //step back on current direction
                j -= directionsY[dir];
                k -= directionsX[dir];
                if (dir < 3) {
                    dir++;
                } else {
                    dir = 0;
                }
                //forward on new direction
                j += directionsY[dir];
                k += directionsX[dir];
            }
        }
        return result;
    }
    static int[][] spiral2(int n) {
        int[][] result = new int[n][n];
        String[][] result2 = new String[n][n];

        int j=0, k=0;
        int kk = k;
        int dir = 1;
        for (int i=1; i <= n*n; i++) {

            System.out.println(k +", "+j);
            result[k][j] = i;
            if (dir == 1) {
                j++;
            } else if (dir == 2) {
                k++;
            } else if (dir == 3) {
                j--;
            } else if (dir == 4) {
                k--;
            }

            if (j < 0 || k < 0 || j >= n || k >= n || result[k][j] != 0) {
                if (dir < 4) {
                    dir++;
                } else {
                    dir = 1;
                    j++;
                    k++; //STEPBACK
                }
                if (dir == 2) {
                    k++;
                    j--; //stepback
                } else if (dir == 3) {
                    j--;
                    k--;//stepback
                } else if (dir == 4) {
                    k--;
                    j++; //stepback

                }
            }
        }
        return result;
    }
    static void print(int[][] a) {
        System.out.println("---------------------------------");
        for (int i=0; i < a.length; i++) {
            for (int j=0; j < a[0].length; j++) {
                System.out.print(a[i][j]+"      ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        spiral(5);
    }
}
