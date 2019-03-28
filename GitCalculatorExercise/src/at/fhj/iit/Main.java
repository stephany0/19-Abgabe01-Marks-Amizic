package at.fhj.iit;

public class Main {

	public static void main(String[] args) {
		
		Calculator calc = new CalculatorImpl();
		
		calc.addValue(20);	// currently highest number
		calc.addValue(4);	// currently lowester number
		calc.addValue(16);


		// add other integers
		calc.addValue(30);
		calc.addValue(2);
		calc.addValue(23);
		
		// output lowest number 
		System.out.println("Lowest number: " + calc.getMinimum());
		// output highest number
		System.out.println("Highest number: " + calc.getMaximum());
		// output sum of all numbers
		System.out.println("Sum of all numbers: " + calc.sum());
	}

}
