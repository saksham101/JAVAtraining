import java.util.Scanner;
public class TaxCalculation
{
   public static void main(String xyz[])
   {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Salary :- ");
	int salary = sc.nextInt();
    float tax = 1;
	int taxRate = 0;
    float DA = (float)(0.60*salary);
    float HRA = (float)(0.15*(salary+DA));
	if(salary<50000)
	{
		tax = 0;
	}
    else if(salary<1000000 && salary>50000)
	{
		taxRate = 20;
		tax = (float)(salary * 0.20);
	}
    else{
        taxRate = 30;
        tax = (float)(salary * 0.30);
    }
    System.out.println("For Salary "+salary+", DA would be @ 60% amount is "+DA+"Rs.");
    System.out.println("For Salary "+salary+", HRA would be @ 15% amount is "+HRA+"Rs.");
	System.out.println("For Salary "+salary+", Tax would be @ "+taxRate+"% amount "+tax+"Rs.");
   }
}