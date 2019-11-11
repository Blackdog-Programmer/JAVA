package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2019";

	    int stringToNumber = Integer.parseInt(numberAsString);
        System.out.println("This Year " + stringToNumber);

        numberAsString += 1;
        stringToNumber += 1;
        System.out.println(numberAsString);
        System.out.println(stringToNumber);
    }
}
