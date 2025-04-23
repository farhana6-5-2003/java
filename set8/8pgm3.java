class Matrix 
{
int rows, cols;
int[][] data;
Matrix(int r, int c, int[][] values)
{
rows = r;
cols = c;
data = values;
}
Matrix(int r, int c) 
{
rows = r;
cols = c;
data = new int[r][c];
}
void displayMatrix() 
{
for (int[] row : data) 
{
for (int num : row)
System.out.print(num + " ");
System.out.println();
}
}
Matrix add(Matrix other) 
{
Matrix result = new Matrix(rows, cols);
for (int i = 0; i < rows; i++)
for (int j = 0; j < cols; j++)
result.data[i][j] = data[i][j] + other.data[i][j];
return result;
}

Matrix multiply(Matrix other) 
{
        Matrix result = new Matrix(rows, other.cols);
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < other.cols; j++)
                for (int k = 0; k < cols; k++)
                    result.data[i][j] += data[i][k] * other.data[k][j];
        return result;
    }
}

class matrix {
public static void main(String[] args) {
if (args.length < 8) { 
System.out.println("provide 8 values ");
return;
}

int[][] values1 = {{Integer.parseInt(args[0]), Integer.parseInt(args[1])}, 
                  {Integer.parseInt(args[2]), Integer.parseInt(args[3])}};
int[][] values2 = {{Integer.parseInt(args[4]), Integer.parseInt(args[5])}, 
                  {Integer.parseInt(args[6]), Integer.parseInt(args[7])}};

        Matrix matrix1 = new Matrix(2, 2, values1);
        Matrix matrix2 = new Matrix(2, 2, values2);

        System.out.println("Matrix 1:");
        matrix1.displayMatrix();

        System.out.println("Matrix 2:");
        matrix2.displayMatrix();

        System.out.println("Addition:");
        matrix1.add(matrix2).displayMatrix();

        System.out.println("Multiplication:");
        matrix1.multiply(matrix2).displayMatrix();
    }
}

