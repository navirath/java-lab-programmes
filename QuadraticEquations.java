import java.util.Scanner;
class QuadraticEquations{
public static void main(String args[])
{
 	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the value of a : ");
	double a=scanner.nextDouble();
	System.out.println("enter the value of b : ");
	double b=scanner.nextDouble();
	System.out.println("enter the value of c: ");
	double c= scanner.nextDouble();

	double disc=b*b-(4*a*c);
	

	if (disc>0)
	{
		double root1=(-b+Math.sqrt(disc))/2*a;
		double root2=(b+Math.sqrt(disc))/2*a;
		
		System.out.println("the roots of the equation are real and distinct "+"root1"+ root1 +" "+"root2"+root2);
		
		
	}
	else if (disc<0)
	{

		double real_root=-b/(2*a);
		double img_root=Math.sqrt(-disc)/(2*a);

		System.out.println("the roots are complex and imaginary  real part : "+real_root+" "+ "imaginary part :"+"-"+img_root);


	}
	else
	{
		double root= -b/(2*a);
		
		System.out.println("the root is real and equal : " +root);



	}


}
}