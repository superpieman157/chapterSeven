package Pract;

import java.util.Scanner;

public class ArrayPract {

	public static void main(String[] args) 
	{
        double[] ArrayNums = new double[5];
        
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < ArrayNums.length; i++)
        {
        	System.out.println("Input a Number Please");
        	ArrayNums[i] = input.nextDouble();
        }
        System.out.println("Output is" );
        for(int j = 4; j >= 0; j--)
        {
        	System.out.println(ArrayNums[j]);
        }
	}

}
