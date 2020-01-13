import java.util.Scanner;

public class HogwartsMurderMystery {

	public static void main(String[] args) {
		
/*
 96
 18 26 1 22 33 26 6 37 23 4 26 42 42 39 14 29 2 6 39 15 11 13 2 41 6 19 12 12 24 5 9 48 24 12 14 34 46 42 14 29 47 25 36 28 10 5 17 45 14 14 7 16 24 1 1 55 23 43 7 25 15 33 16 56 6 21 10 20 33 3 3 33 36 11 6 54 10 21 5 5 7 25 2 31 4 32 7 52 11 8 4 41 9 12 10 12

92
18 26 1 22 33 26 6 37 23 4 26 42 42 39 14 29 2 6 39 15 11 13 2 41 6 19 12 12 24 5 9 48 24 12 14 34 46 42 14 29 47 25 36 28 10 5 17 45 14 14 7 16 24 1 1 55 23 43 7 25 15 33 16 56 6 21 10 20 33 3 3 33 36 11 6 54 10 21 5 5 7 25 2 31 4 32 7 52 11 8 4 41

8
18 26 1 22 33 26 6 37

7
18 26 1 22 33 26 6

6
18 26 1 22 33 26

5
18 26 1 22 33

8
18 26 1 22 33 26 6 37

8
18 26 1 22 33 26 6 37

8
18 26 1 22 33 26 6 37
 */

//	

		Scanner console = new Scanner(System.in);
		
		int NumberofTerms = console.nextInt();
		int Numbers[] = new int[NumberofTerms];
		
		for (int i=0; i<NumberofTerms; i++) {
			int ListofNum = console.nextInt();
			Numbers[i] = ListofNum;

		}
		int numLength1 = Numbers.length;
		
	 if(numLength1%8 == 0) {
			for (int k=0; k<numLength1; k= k+8) {
				int firstVal = Numbers[k+1];
				int secondVal = Numbers[k+5];
				int thirdVal = Numbers[k+2];
				int fourthVal = Numbers[k+6];
				
				Numbers[k+1] = secondVal;
				Numbers[k+5] = firstVal;
				Numbers[k+2] = fourthVal;
				Numbers[k+6] = thirdVal;
				
			}
			
			String output = "";
			int numLength = Numbers.length;
			
			for (int l=0; l<numLength; l=l+4) {
				int sum = Numbers[l] + Numbers[l+1] + Numbers[l+2] +Numbers[l+3];
				//System.out.println(sum+"="+Numbers[l] +"+"+ Numbers[l+1] +"+"+ Numbers[l+2] +"+"+ Numbers[l+3]);
				output+=Character.toString((char)sum);
			}
			
			
			System.out.println(output);
	 }else if(numLength1%4 == 0) {
		 for (int k=0; k<numLength1-4; k= k+8) {
				int firstVal = Numbers[k+1];
				int secondVal = Numbers[k+5];
				int thirdVal = Numbers[k+2];
				int fourthVal = Numbers[k+6];
				
				Numbers[k+1] = secondVal;
				Numbers[k+5] = firstVal;
				Numbers[k+2] = fourthVal;
				Numbers[k+6] = thirdVal;
				
			}
			
			String output = "";
			int numLength = Numbers.length;
			int l = 0;
			for (l=0; l<numLength-4; l=l+4) {
				int sum = Numbers[l] + Numbers[l+1] + Numbers[l+2] +Numbers[l+3];
				//System.out.println(sum+"="+Numbers[l] +"+"+ Numbers[l+1] +"+"+ Numbers[l+2] +"+"+ Numbers[l+3]);
				output+=Character.toString((char)sum);
			}
			int sum2 = Numbers[l] + Numbers[l+1] + Numbers[l+2] +Numbers[l+3];
			output+=Character.toString((char)sum2);
			
			System.out.println(output);
	 }
		
		

	}
}
