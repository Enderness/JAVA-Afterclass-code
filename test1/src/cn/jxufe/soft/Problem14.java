package cn.jxufe.soft;

public class Problem14
{
    public static void main(String[] args)
    {
        int N = 5;
        int[][] matrix = new int[N][N];
        int num = 1;

        int row = 0;
        int col = N / 2;

        while (num <= N * N)
        {
            matrix[row][col] = num;
            num++;

            int newRow = (row - 1 + N) % N;
            int newCol = (col + 1) % N;

            if (matrix[newRow][newCol] != 0)
            {

                row = (row + 1) % N;
            }

            else
            {

                row = newRow;
                col = newCol;
            }
        }


        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
