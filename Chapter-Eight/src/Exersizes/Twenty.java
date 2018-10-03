package Exersizes;

import java.util.Scanner;

public class Twenty {

	public static void main(String[] args) 
	{
        double[] TwentyNums = new double[20];
        
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < TwentyNums.length; i++)
        {
        System.out.println("Please input a number");
        TwentyNums[i] = input.nextDouble();
        }
        System.out.println(TwentyNums);
        
	}

}
