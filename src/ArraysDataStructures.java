
public class ArraysDataStructures {

	public static void main(String[] args) {
		double [] numberArray= {1,354,64,3,2};
		int index=0;
		double max = numberArray[0];
		for (int i=0; i<numberArray.length;i++) {
			if(numberArray[i]> max)
				max=numberArray[i];
			index=i;
		}
	
		System.out.println(max);
		
		
		int sum1 = 1;
		for(int i=0;i<numberArray.length; i++) {
			
		sum1+= numberArray[i];
		}	
		System.out.println("The total sum of the given numbers is " + sum1);
	}
}

