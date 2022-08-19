import java.util.*;

public class arrays {

    public static void main(String args[]) {

        // mathod 1
        Scanner s = new Scanner(System.in);
        // int[] marks = new int[3];
        // marks[0] = 99;
        // marks[1] = 90;
        // marks[2] = 88;
        // System.out.println(marks[1] + marks[2] + marks[0]);

        // method 2
        // int [] marks = {98, 97, 95};
        // System.out.println(marks[2]);

        // priting an array

        // int size = s.nextInt();
        // int n[] = new int[size];

        // for(int i=0;i<size; i++){
        // n[i] = s.nextInt();
        // }

        // //printing
        // for(int i=0;i<n.length;i++){
        // System.out.print(n[i]+" ");
        // }

        // array of names and printing

        // int size = s.nextInt();
        // String names[] = new String[size];

        // //input
        // for(int i=0; i<size; i++){
        // names[i] = s.next();

        // }
        // //output
        // for(int i=0; i<names.length; i++){
        // // System.out.println((i+1) + names[i]);
        // System.out.println("name " + (i+1) +" is : " + names[i]);
        // }

        // maxmin number from array
        // Integer.MIN_VALUE & Integer.MAX_VALUE

        // int size = s.nextInt();
        // int n[] = new int[size];

        // // input
        // for(int i = 0; i<size; i++){
        // n[i] = s.nextInt();
        // }

        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;

        // for(int i = 0; i<n.length; i++){
        // if(n[i] < min){
        // min = n[i];
        // }
        // if(n[i] > max){
        // max = n[i];
        // }
        // }

        // System.out.println(max);
        // System.out.println(min);

        // ascending order

        // int size = s.nextInt();
        // int n[] = new int[size];

        // //input
        // for(int i = 0; i<size; i++){
        // n[i] = s.nextInt();
        // }

        // boolean isAscending = true;

        // for(int i = 0; i<n.length-1; i++){
        // if(n[i] > n[i+1]){
        // isAscending = false;
        // }
        // }

        // if(isAscending){
        // System.out.println("ascending");
        // } else {
        // System.out.println("not sorted");
        // }

        // 2D ARRAY

        // int rows = s.nextInt();
        // int cols = s.nextInt();

        // int [][] n = new int[rows][cols];

        // //input
        // //rows
        // for(int i = 0; i<rows; i++){
        // //cols
        // for(int j = 0; j<cols; j++){
        // n[i][j] = s.nextInt();
        // }
        // }

        // // output

        // for(int i = 0; i<rows; i++){
        // for(int j = 0; j<cols; j++){
        // System.out.print(n[i][j] + " ");
        // }
        // System.out.println();
        // }

        // search an element x

        // int rows = s.nextInt();
        // int cols = s.nextInt();

        // int[][] n = new int[rows][cols];

        // //input
        // //rows
        // for(int i = 0; i<rows; i++){
        // //cols
        // for(int j = 0; j<cols; j++){
        // n[i][j] = s.nextInt();
        // }
        // }

        // int x = s.nextInt();

        // for(int i=0; i<rows; i++) {
        // for(int j=0; j<cols; j++) {
        // //compare with x
        // if(n[i][j] == x) {
        // System.out.println("x found at location (" + i + ", " + j + ")");
        // }
        // }
        // }

        // Transpose

        // int n = s.nextInt();
        // int m = s.nextInt();

        // int matrix[][] = new int[n][m];
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // matrix[i][j] = s.nextInt();
        // }
        // }

        // System.out.println("given");

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }

        // System.out.println("The transpose is : ");
        // // To print transpose
        // for (int j = 0; j < m; j++) {
        // for (int i = 0; i < n; i++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }

        int n = s.nextInt();
        int m = s.nextInt();

        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        System.out.println("The Spiral Order Matrix is : ");
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = m - 1;

        // To print spiral order matrix
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // 1
            for (int col = colStart; col <= colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;

            // 2
            for (int row = rowStart; row <= rowEnd; row++) {
                System.out.print(matrix[row][colEnd] + " ");
            }
            colEnd--;

            // 3
            for (int col = colEnd; col >= colStart; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;

            // 4
            for (int row = rowEnd; row >= rowStart; row--) {
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;

            System.out.println();
        }

        s.close();
    }
}
