# Day 01
## Problem 1
```
Print Pattern
*
**
***
****
*****
```
Code
```java
import java.util.Scanner;
public class Pattern1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:- ");
        int rows = sc.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```
## Problem 2
```
Print Pattern
    * 
   * *
  * * *
 * * * *
* * * * *
```
Code
```java
import java.util.Scanner;
public class Pattern2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:- ");
        int rows = sc.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=rows-i; j>1; j--){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
```
## Problem 3
```
Tax Calculation
// Enter Basic Salary 
// add HRA :- @15 of Basic
// add DA :- 60% of Basic 
// tax : below 500k :- 0%'
// 500,001 - 10,00,000 :- 20%
// 10,00,001 - anything :- 30%
```
Code
```java
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
```
