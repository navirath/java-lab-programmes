import java.util.Scanner;
class MatrixMul{
	public static void main(String args[])
{

	Scanner scanner=new Scanner(System.in);
	int row1;
	int col1;
	int row2;
	int col2;
	System.out.println("enter the row size for matrix 1 ");
	row1=scanner.nextInt();
	System.out.println("enter the column size for matrix 1 ");
	col1=scanner.nextInt();
	System.out.println("enter the row size for matrix 2  ");
	row2=scanner.nextInt();
	System.out.println("enter the column size for matrix 2 ");
	col2=scanner.nextInt();

	if (col1!=row2)
	{
		System.out.println("invalid rowsize an column size");


	}
	int mat1[][]=new int[row1][col1];

	int mat2[][]=new int[row2][col2];

	int res[][]=new int[row1][col2];

	
	System.out.println("enter the elements for 1st matrix ");
	for (int i=0;i<row1;i++)
	{
		for (int j=0;j<col1;j++)
	
		{
			System.out.print("enter the value for : "+ i +j+" ");
			mat1[i][j]=scanner.nextInt();

		}
	}
	System.out.println("enetr the elements for 2nd matrix ");
	for (int i=0;i<row2;i++)
	{
		for (int j=0;j<col2;j++)
		{
			System.out.print("enter the value for :"+i+j+" ");
			mat2[i][j]=scanner.nextInt();
			
		}

	}

	
	for (int i=0;i<row1;i++)
	{
		for (int j=0;j<col2;j++)
		{
			for (int k=0;k<col1;k++)
			{
				res[i][j]+=mat1[i][k]*mat2[k][j];

			}


		}


	}


	System.out.println("the resultant matrix is ");
	for (int i=0;i<row1;i++)
	{
		for (int j=0;j<col2;j++)
		{
			System.out.print(res[i][j]+" ");


		}
		System.out.println();


	}



}
}