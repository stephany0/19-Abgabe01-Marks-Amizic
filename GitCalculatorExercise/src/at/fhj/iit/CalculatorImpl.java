package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class CalculatorImpl implements Calculator {

	private List<Integer> numbers = new ArrayList<Integer>();
	
	@Override
	public int sum() {
		
		
		
		int sum = 0;
	    for (int i: numbers) {
	        sum += i;
	    }
	    return sum;
	
		
	}

	@Override
	public int getMaximum() {
		
		return Collections.max(numbers);
	}

	@Override
	public int getMinimum() {
		int min = numbers.get(0);
		for(int i = 1; i < numbers.size(); i++) {
			if(numbers.get(i) < min) {
				min = numbers.get(i);
			}
		}
		return min;
	}

	@Override
	public void addValue(int value) {
		numbers.add(value);
	}

}
