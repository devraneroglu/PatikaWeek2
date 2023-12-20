public class Main {

    static void fnApplyB(String[][] arr) {
        arr[4][2] = "";
        arr[4][3] = "";
        arr[3][3] = "";
        arr[5][3] = "";
        arr[3][2] = " *";
        arr[5][2] = " *";
    }

    public static void main(String[] args) {
        String[][] Arr = new String[9][4];
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[0].length; j++) {
                if (i == 0 || i == 4 || i == 8) {
                    Arr[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    Arr[i][j] = " * ";
                } else {
                    Arr[i][j] = "   ";
                }
            }
        }
        fnApplyB(Arr);
        for (String[] row : Arr) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}

