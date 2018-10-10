public class kap8opg10 {
//kapitel8 opgave10

    // main method

    public static void main(String[] args) {
        int[][] matrix = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 2);    //fylder matrix med tilfældige tal mellem 1 0g 0

            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);     // viser matrixen
            }
            System.out.println();
        }


        System.out.println("The largest row index: " + largestRow(matrix));
        System.out.println("The largest row column: " + largestColumn(matrix)); //her findes 1. kolonne og række med
        //med flest 1 taller
    }

    //largestRow tæller hvor mange 1-taller der eksisterer i rækken
    public static int largestRow(int[][] m) {
        int maxRowIndex = 0;
        int max = 0;
        for (int i = 0; i < m.length; i++) {
            int count = 0;
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 1)
                    count++;
            }
            if (count > max) {
                max = count;
                maxRowIndex = i;
            }
        }
        return maxRowIndex;
    }

    // largestColumn tæller hvor mange 1-taller der eksisterer i kolonnen
    public static int largestColumn(int[][] m) {
        int maxColumnIndex = 0;
        int max = 0;
        for (int col = 0; col < m[0].length; col++) {
            int count = 0;
            for (int row = 0; row < m.length; row++) {
                if (m[row][col] == 1)
                    count++;
            }
            if (count > max) {
                max = count;
                maxColumnIndex = col;
            }
        }
        return maxColumnIndex;
    }
}
