import java.util.*;
import java.io.*;

public class RopeIntranet{

	public static void main(String arg[])
	{
		BufferedReader br = null;
 
		try {
 			
 			BufferedWriter bw = new BufferedWriter(new FileWriter("F:/large-output.out"));

			String sCurrentLine;
 
			br = new BufferedReader(new FileReader("F:/large.in"));
		

			int testCases = Integer.parseInt(br.readLine());
			for(int i=0;i<testCases;i++){
				int numberOfWires = Integer.parseInt(br.readLine());
				int xCoordinates[] = new int[numberOfWires];
				int yCoordinates[] = new int[numberOfWires];
				int intersections = 0;
			
				for(int j=0;  j<numberOfWires; j++){
					String[] temp = br.readLine().split(" ");
					xCoordinates[j] = Integer.parseInt(temp[0]);
					yCoordinates[j] = Integer.parseInt(temp[1]);
				}//for

				for(int k=0; k<numberOfWires; k++){
					for(int l=k; l<numberOfWires; l++){
						
						if(xCoordinates[k]>xCoordinates[l] && yCoordinates[k]<yCoordinates[l]){
							intersections++;
						}//if
						if(xCoordinates[k]<xCoordinates[l] && yCoordinates[k]>yCoordinates[l]){
							intersections++;
						}//if
					}//for
				
				}//for

				bw.write("Case #"+(i+1)+": "+intersections+System.getProperty("line.separator"));
				System.out.println("Case #"+(i+1)+": "+intersections);		
			

		}//for
		bw.close();

		}//try
		catch (IOException e) {
			e.printStackTrace();
		}//catch
		finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}//finally
	
	}//main

}//class