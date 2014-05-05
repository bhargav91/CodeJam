/*

------------------------------------------------------------------------------------
-> This problem is from hackerrank.com

-> for problem statement go to: https://www.hackerrank.com/challenges/service-lane

-Bhargav Kaneria
-----------------------------------------------------------------------------------

NOTE: This solution is for better understanding. The solution that hackerrank accepts is written in file name ServiceLaneSubmit.java

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

import java.io.*;

public class ServiceLane{
	
	public static void main(String[] args) {
		BufferedReader br = null;
		BufferedWriter bw = null;
		String inputPath = "yourpath/ServiceLaneInput.txt";
		String outputPath = "yourpath/ServiceLaneOutput.txt";

		String[] vehicle = {"bike", "car", "truck"};
		try{

			br = new BufferedReader(new FileReader(inputPath));
			bw = new BufferedWriter(new FileWriter(outputPath));

			String[] temp = br.readLine().split(" ");
			int lengthOfFreeway = Integer.parseInt(temp[0]);
			int numberOfTestCases = Integer.parseInt(temp[1]);

			String[] tempWidth = br.readLine().split(" ");
			int[] width = new int[tempWidth.length];

			for (int i =0; i<width.length ;i++ ) {
				width[i] = Integer.parseInt(tempWidth[i]);				
			}

			for (int i = 0; i < numberOfTestCases ;i++ ) {

				String[] tempTestCase = br.readLine().split(" ");
				int enter = Integer.parseInt(tempTestCase[0]);
				int exit = Integer.parseInt(tempTestCase[1]);

				int canPass = 3; // this vehicle can pass currently


				for(int j = enter; j <=exit; j++){					

					
					if(width[j] < canPass)
						canPass = width[j]; // if width is less than 
					
				}//for

				System.out.println("canPass:    " + vehicle[canPass-1]);
				bw.write(canPass + System.getProperty("line.separator"));
				
			}//for	
			
		}//try
		catch(IOException e){

			e.printStackTrace();

		}//catch
		finally{
			try{
				if(bw != null) bw.close();
				if(br != null) br.close();

			}//try
			catch(IOException ex){
				ex.printStackTrace();
			}//catch
		}//finally


	}//main

}//class