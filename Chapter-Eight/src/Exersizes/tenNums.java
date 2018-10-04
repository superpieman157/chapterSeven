package Exersizes;

import java.util.Scanner;

public class tenNums {

	public static void main(String[] args) 
	{
        double[] TenNums = new double[10];
        double Avg = 0;
        double total = 0;
        double quit = 0;
        while(quit != 99999)
        {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < TenNums.length; i++)
        {
        System.out.println("Please enter your nums");
        TenNums[i] = input.nextDouble();
        total = total + TenNums[i];
        Avg = total / TenNums.length;
		System.out.println("The numbers in order are " + TenNums[i]);
        }
        System.out.println("The Total of all numbers is " + total);
        System.out.println("The average of the numbers is " + Avg);
        System.out.println("Want to go again? If not input 99999");
        quit = input.nextDouble();
        }
	}

}
