// 4. **На шахматной доске расставить 8 ферзей так,
// чтобы они не били друг друга.

import java.util.Arrays;

public class Ex_04EightQueens {
    public static void main(String[] args) {
       int n = 8;
       Integer[] x = new Integer[n];
       Integer[] y = new Integer[n];
//       for (i )


        String[][] mas = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                mas[i][j] = " ";
                if (i < 4) {
                    mas[i][i*2 + 1] = "*";
                } else {
                    mas[4][2] = "*";
                    mas[5][0] = "*";
                    mas[6][6] = "*";
                    mas[7][4] = "*";
                }
            }
        }
        Arrays.stream(mas)
                .forEach(arr -> {
                    System.out.println(Arrays.toString(arr));
                });
    }
}
