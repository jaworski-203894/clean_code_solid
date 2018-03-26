package pl.ttpsc.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class WeightedAverageCalculator {
	private Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	private int min = Integer.MIN_VALUE;
	private int max = Integer.MAX_VALUE;
	
	public WeightedAverageCalculator(List<Integer> list) {
		add(list);
	}
	
	public WeightedAverageCalculator() {

	}
	
	public void add(List<Integer> list) {
		int i = 0;for (; i < list.size(); i++) {
			add(list.get(i));
		}
	}

	private void updateMinValue(Integer i) {
		if (i < min || map.isEmpty()) {
			min = i;
		}
	}
	private void updateMaxValue(Integer i) {
		if (i > max || map.isEmpty()) {
			max = i;
		}
	}

	public void add(Integer i) {
		updateMinValue(i);
		updateMaxValue(i);
		if (map.containsKey(i)) {
			Integer k = map.get(i);
			map.remove(k);
			map.put(i, k + 1);
		} else {
			map.put(i, 1);
		}
	}
	
	public int getCount(int i) {
		if (map.containsKey(i)) {
			return map.get(i);
		}
		else {
			throw new IndexOutOfBoundsException("No such number");
		}
	}
	
	public double calculateAverage() {
		double keyValue = 0;
		double values = 0;
		for (Entry<Integer, Integer> u : map.entrySet()) {
			values += u.getValue();
			keyValue += u.getKey() * u.getValue();
		}
		return keyValue / values;
	}
	
	public int getMin() {
		return min;
	}
	
	public int getMax() {
		return max;
	}

	public String getCountAsString(int number) {
		if(map.containsKey(number)) {
			return map.get(number).toString();
		}
		return "";
	}
}