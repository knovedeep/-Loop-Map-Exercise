
public class Arrays {

		public static int[] toPower(int size, int power) {
			int[] returnArray=new int[size];
			for(int i=0; i<returnArray.length; ++i) {
				returnArray[i]=(int) Math.pow(i, power);
				
			}
			return returnArray;
		}
		public static void main(String[] args) {
			
			int[] result= toPower(4,2);
			for (int i=0; i<result.length; ++i) {
				System.out.println(result[i]);
			}
			
			
			
			
			
			
			/*  double[ ] exampleArray = {1,5,6,5,4,1};

          double maximum = examplesArray[0];

          int index = 0;

          for (int i = 1; i<exampleArray.length>; i++){

               if (exampleArray[ i ] > maximum) {

                    maximum = exampleArray[ i ];

                    index = i;

               }

          }

          System.out.println(index);
*/
	}

}
