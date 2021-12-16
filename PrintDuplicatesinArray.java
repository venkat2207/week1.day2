package week1.day2.Assignments1;

public class PrintDuplicatesinArray {

	public static void main(String[] args) {

		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int length=arr.length;
		
		int count;
		
		for (int i=0;i<length;i++)
			
		{
			
			count=0;
			
			for (int j=0;j<length;j++)
				
			{
				
				if (arr[i]==arr[j])
					
				{
					count+=1;
					
				}
				
			  
			}

		if (count>1)
			
		{
			System.out.println(arr[i]);
		}
			
	
	}
		
		
		

	}

}
