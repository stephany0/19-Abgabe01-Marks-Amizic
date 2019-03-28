package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class CalculatorImpl implements Calculator {

	private List<Integer> numbers = new ArrayList<Integer>();
	
	@Override
	public int sum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaximum() {
		
		return Collections.max(numbers);
	}

	@Override
	public int getMinimum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addValue(int value) {
		numbers.add(value);
	}

}
