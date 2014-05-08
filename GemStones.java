/*
--------------------------------------------------
==> This problem is from hackerrank.com <==
https://www.hackerrank.com/challenges/gem-stones
--------------------------------------------------

-------------
-->Problem
-------------
John has discovered various rocks. Each rock has a composition consisting of various elements, where each element is represented by small latin letter (‘a’-‘z’). An element can be present multiple times in a rock. An element is called gem-element if it has at least one occurence in all of the rocks.

Given the list of rocks with their compositions, you have to print how many different kinds of gems-elements he has.

Input Format
The first line consists of N, the number of rocks.
Each of the next N lines contain rocks’ composition. Each composition consists of small alphabets of English language.

Output Format
Print the number of different kinds of gem-elements he has.

Constraints
1 ≤ N ≤ 100 
Each composition consists of only small latin letters (‘a’-‘z’).
1 ≤ Length of each composition ≤ 100

Sample Input

3
abcdde
baccd
eeabg

Sample Output

2

*/

import java.util.*;

public class GemStones{
	
	static int[] count = new int[26];
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int gems = 0;
		int t = in.nextInt();

		for(int j = 0; j <= t;j++){
			String temp = getUnique1( in.nextLine());
			getUnique(temp);
		}
		
		for(int i = 0; i<count.length; i++){			
			if(count[i]==t){
				gems++;
			}
		}
		System.out.println(gems);
	}

	private static String getUnique1(String str){
		boolean[] strSet = new boolean[256];
		char[] charArr = new char[str.length()];
		int ind = 0;
		for(int i = 0; i<str.length(); i++){

			int val = str.charAt(i);
			if(strSet[val]){ 			
				continue; 
			}
			strSet[val] = true;
			charArr[ind++] = str.charAt(i);

		}
		String ret = new String(charArr);
		return ret.trim();	
	
	}

	private static void getUnique(String a){		

		for(int i = 97; i< 97+26; i++){			
			int present = 0;
			for(int x = 0; x<a.length(); x++){
				if(i == a.charAt(x)){
					count[i-97]++;					
				}
			}
			
		}
		
	}
}