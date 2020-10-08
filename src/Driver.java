public class Driver 
{
	public static void main(String[] args)
	{
		int[] list = new int[5];
		
		//I forgot how to do the shortcut... oops :) 
		list[0] = 64;
		list[1] = 25;
		list[2] = 12;
		list[3] = 22;
		list[4] = 11;		
		
		for(int k = 0; k < list.length; k++)
		{
			System.out.println(list[k]);
		}
		
		System.out.println();

		for(int i = 0; i < list.length; i++)
		{
			int smallest = list[i];
			int largest = list[i];
			int counter = i;
			
			for(int j = i; j < list.length; j++)
			{	

				if(list[j] < smallest)
				{
					smallest = list[j];
					counter = j;
				}
			}
			
			list[counter] = largest;
			list[i] = smallest;
		}
		
		for(int m = 0; m < list.length; m++)
		{
			System.out.println(list[m]);
		}
	}
}
