import java.util.ArrayList;
import java.util.Scanner;
public class LoopEx {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please provide 5 numbers");
		int numbers=input.nextInt();
		int numbers2=input.nextInt();
		int numbers3=input.nextInt();
		int numbers4=input.nextInt();
		int numbers5=input.nextInt();
		
		ArrayList<Integer> numberList= new ArrayList<Integer>(5);
		numberList.add(numbers);
		numberList.add(numbers2);
		numberList.add(numbers3);
		numberList.add(numbers4);
		numberList.add(numbers5);
		System.out.println(numberList.size());
		Integer sum = numberList.stream()
				  .mapToInt(Integer::intValue)
				  .sum();
		System.out.println("The total sum of the numbers provided is: "+ sum);
		
		Integer[] numberArray= numberList.toArray(new Integer[0]);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		int sum1 = 1;
			for(int i=0;i<numberList.size(); i++) {
				
			sum1*= numberList.get(i);
			}	
			System.out.println("The total product of the given numbers is " + sum1);
			
			
			
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		int max = numberArray[0];
			for (int i=0; i<numberArray.length;i++) {
				if(numberArray[i]>max)
					max=numberArray[i];
			}
		
			System.out.println("The largest of the given numbers is " + max);
			
		int min = numberArray[0];
			for (int i=0; i<numberArray.length;i++) {
				if(numberArray[i]<min)
					min=numberArray[i];
			}
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("The smallest of the given numbers is " + min);	
	
	}
			
	}

