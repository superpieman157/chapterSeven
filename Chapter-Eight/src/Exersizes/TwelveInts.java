package Exersizes;

public class TwelveInts {

	public static void main(String[] args) 
	{
		double total = 0;
		String[] stringArray = {"This", "Is", "An", "Array"};
        int[] NumArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println("Print First to last ");
        for(int i = 0; i < NumArray.length; i++)
        {
		System.out.println("Numbers are " + NumArray[i]);
		total = total + NumArray[i];
        }
        for(int j = 11; j >= 0; j--)
        {
        	System.out.println(NumArray[j]);
        }
        System.out.println(total);
        for(int z = 0; z < stringArray.length; z++)
        {
        	System.out.println(stringArray);
        }
	}

}
