/*
-----------------------------------------------------------------
==>This problem is from hackerrank.com <==
https://www.hackerrank.com/challenges/halloween-party
-----------------------------------------------------------------
-----------
--->Problem
-----------
Alex is attending a Halloween party with his girlfriend Silvia. At the party, Silvia spots a giant chocolate bar. If the chocolate can be served as only 1 x 1 sized pieces and Alex can cut the chocolate bar exactly K times, what is the maximum number of chocolate pieces Alex can cut and give Silvia?

Input Format
The first line contains an integer T denoting the number of testcases. T lines follow.
Each line contains an integer K

Output Format
T lines. Each containing the output corresponding to the testcase.

Constraints
1<=T<=10
2<=K<=107

Note
Chocolate needed to be served in size of 1 x 1 size pieces.
Alex can’t relocate any of the pieces. Neither he can place any piece on top of other.

Sample Input #00

4
5
6
7
8
Sample Output #00

6
9
12
16

*/

import java.util.*;
public class Halloween{

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		long testCases = in.nextLong();
		for(long i = 0; i < testCases; i++){
			System.out.println(solve(in.nextLong()));
		}
	}
	public static long solve(long k){

		long pieces = 1;
		if(k < 2)
			return 0;
		if(k == 2)
			return pieces;

		long add = 1;
		
		for(long j = 3; j <= k; j++){
			if(j % 2 == 1){
				pieces += add;
			}else{
				pieces += ++add;
			}
		}
		return pieces;
	}	
}