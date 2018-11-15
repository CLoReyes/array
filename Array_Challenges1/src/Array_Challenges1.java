import java.sql.Array;
import java.util.Arrays;

public class Array_Challenges1
	{

		public static void main(String[] args)
			{


		//	challengeOne();
		//	challengeTwo();
			challengeidk();
			//challengeThree();
		//	challengeFour();
				
			}

		private static void challengeidk()
			{
				int [] number = { 0, 2, 4, 6, 8 };
				 
				int largest = Arrays.stream(number).max().getAsInt();
				
				System.out.println(largest);
			}

		private static void challengeOne()
			{
				//prints 3rd element
				String [ ] element = new String [5];
				element [0] = "Water";
				element [1] = "Earth";
				element [2] = "Fire";
				element [3] = "Air";
				
				System.out.println(element [2]);
				
				
			}

		private static void challengeTwo()
			{
				//prints the last digit
				int [ ] number = { 0, 2, 4, 6, 8 };
				int fifthNum = number.length;
				System.out.println(number [fifthNum - 1]);
				
		
			}

		private static void challengeThree()
			{
				//print in a vertical column
				int [ ] numbers = { 68, 32, 17, 3, 190, 67, 22, 565, 36381 };
				int verticalColumn = numbers.length;
				for (int i = 0; i < verticalColumn; i++)
					{
						
						System.out.println(numbers [i]);
					}
			}

		private static void challengeFour()
			{
				//finds the average of numbers
				double average = 0;
				int [ ] dumbNums = { 3736, 264674, 19364, 1354, 11, 1091, 34545 };
				int addEmUp = dumbNums.length;
				for (int i = 0; i < addEmUp; i++)
					{
						average += dumbNums [i];
						
					}
				
				System.out.println(average / dumbNums.length);
			}

		

	}
