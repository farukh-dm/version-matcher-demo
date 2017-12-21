package com.demo.app;

import java.util.ArrayList;
import java.util.List;

public class Version implements Comparable<Version> {
	
	private List<Integer> numberList;

	Version() {
		numberList = new ArrayList<Integer>(3);
	}
	
	public List<Integer> getNumberList() {
		return numberList;
	}
	
	public void addNumber(Integer number) {
		numberList.add(number);
	}

	@Override
	public int compareTo(Version otherVersion) {
		
		List<Integer> otherVersionNumberList = otherVersion.getNumberList();
		
		int compareToValue = 0,
			thisVersionSize = this.numberList.size(),
			otherVersionSize = otherVersionNumberList.size(),
			size = (thisVersionSize > otherVersionSize) ? thisVersionSize : otherVersionSize;
			
		for(int i=0; i<size; i++) {
			
			// example: this = 1.7, other = 1.7.5
			if(thisVersionSize < (i+1)) {
				break;
			}
			
			if(otherVersionSize < (i+1)) {
				compareToValue = 1;
				break;
			}
			
			if(this.numberList.get(i) > otherVersionNumberList.get(i)) {
				compareToValue = 1;
				break;
			}
		}
		
		return compareToValue;
	}
}
