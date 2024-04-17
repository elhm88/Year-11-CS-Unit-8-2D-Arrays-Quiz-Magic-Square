public class MagicSquare {

    /**
     *
     * @param array2d
     * @return the sum of the first row in array2d.
     */
    public static int calculateCheckSum(int[][] array2d) {
        int sum = 0;
        for (int col : array2d[0]) {
            sum += col;
        }
        return sum;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each row in array2d is equal to checkSum or not.
     *         Because we have already determined the sum of the first row
     *         via the method 'calculateCheckSum', this method can begin
     *         iterating from the second row.
     */
    public static boolean magicRows(int[][] array2d, int checkSum) {
        int sum = 0;
        boolean magic = true;

        for (int[] rows : array2d) {
            for (int col : rows) {
                sum += col;
            }

            if (sum != checkSum) {
                magic = false;
            }

            sum = 0;
        }

        return magic;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each column in array2d is equal to checkSum or not.
     */
    public static boolean magicColumns(int[][] array2d, int checkSum) {
        boolean magic = true;
        int[] sum = new int[array2d.length];

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                sum[j] += array2d[i][j];
            }
        }

        for (int x : sum) {
            if (x != checkSum) {
                magic = false;
            }
        }

        return magic;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each of the two main diagonals is equal to checkSum or not.
     */
    public static boolean magicDiagonals(int[][] array2d, int checkSum) {
        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < array2d.length; i++) {
            sumLeft += array2d[i][i];
            sumRight += array2d[i][array2d.length - 1 - i];
        }

        return sumLeft == checkSum && sumRight ==checkSum;
    }

    /**
     *
     * @param array2d
     * @return whether array2d is magic or not.
     */
    public static boolean isMagic(int[][] array2d) {
        int checkSum = calculateCheckSum(array2d);

        return magicRows(array2d, checkSum) && magicColumns(array2d, checkSum) && magicDiagonals(array2d, checkSum);
    }
}
