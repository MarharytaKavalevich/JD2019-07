package lesson02Tasks;

import java.util.Scanner;

public class lesson02Task19 {
    public static void main(String[] args) {
        int m, n, c, d;
        Scanner in = new Scanner(System.in);

        System.out.println("Input number of rows of matrix");
        m = in.nextInt();
        System.out.println("Input number of columns of matrix");
        n  = in.nextInt();

        int array1[][] = new int[m][n];
        int array2[][] = new int[m][n];

        System.out.println("Input elements of first matrix");

        for (  c = 0 ; c < m ; c++ )
            for ( d = 0 ; d < n ; d++ )
                array1[c][d] = in.nextInt();

        System.out.println("Input the elements of second matrix");

        for ( c = 0 ; c < m ; c++ )
            for ( d = 0 ; d < n ; d++ )
                array2[c][d] = in.nextInt();
    }
}

