package gr.aueb.cf.ch6;

/**
 * Ορίζει ένα 2D πίνακα ακεραίων και τον κάνει populate.
 * Τα 2D arrays ορίζονται ως [γραμμές][στήλες]..
 */
public class ArraysTwoDim {

    public static void main(String[] args) {
        int[][] grid = new int[3][4];

        int[][] grid2 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        grid[0][0] = 1;
        grid[0][1] = 2;
        grid[0][2] = 3;
        grid[0][3] = 4;
        grid[1][0] = 5;
        grid[1][1] = 6;
        grid[1][2] = 7;
        grid[1][3] = 8;
        grid[2][0] = 9;
        grid[2][1] = 10;
        grid[2][2] = 11;
        grid[2][3] = 12;


        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] row : grid) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
