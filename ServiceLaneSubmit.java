/*
------------------------------------------------------------------------------------
-> This problem is from hackerrank.com

-> for problem statement go to: https://www.hackerrank.com/challenges/service-lane

-Bhargav Kaneria
-----------------------------------------------------------------------------------

NOTE: This is the actuall solution that I submitted was accepted by hacerrank.com. You can also find another version of this solution in ServiceLane.java File, 
which accepts inputs from a txt file and writes output to another text file.

------------
Sample Input #00

8 5
2 3 1 2 3 2 3 3
0 2
0 1
6 7
3 5
0 7

Sample Output #00

1
2
3
2
1

*/

import java.util.*;

public class ServiceLaneSubmit{
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int lengthOfFreeway = in.nextInt();
		int numberOfTestCases = in.nextInt();

		int[] width = new int[lengthOfFreeway];

		for (int i =0; i<lengthOfFreeway ;i++ ) {
			width[i] = in.nextInt();
		}

		for (int i = 0; i < numberOfTestCases ;i++ ) {
		
			int enter = in.nextInt();
			int exit = in.nextInt();
			int canPass = 3;

			for(int j = enter; j <=exit; j++){
				
				if(width[j] < canPass)
					canPass = width[j];
				
			}//for

			System.out.println(canPass);

		}//for			
	}//main
}//class