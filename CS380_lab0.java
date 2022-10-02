package packagetest;

public class CS380_lab0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//given number 1234 and another integer variable to store the reversed number
		int givenNum = 1234, reversedNum = 0;
		
		//while loop that checks if givenNum is not 0
		while(givenNum != 0) {
			//if true, it will get the rightmost digit and append it to reversedNum
			reversedNum = (reversedNum * 10) + givenNum%10;
			//pops rightmost digit of the given number, 1234
			givenNum /= 10;
		}
		//prints the reversed number to the console
		System.out.print(reversedNum);
	}

}
