package com.demo.app;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class Main {
	
	public static List<Package> availablePackageList;
	static {
		availablePackageList = new ArrayList<Package>(3) {{
			add(new Package("jdk", "1.8"));
			add(new Package("jre", "1.7.1"));
		}};
		
	}
	
	public static void main(String[] args) {
		
		StringBuilder outStr = new StringBuilder("Provided package");
		boolean isFound = Boolean.FALSE;
		
		Package checkPackage = new Package("jdsk", "1.8");
		
		for(Package currPackage: availablePackageList) {
			if(currPackage.equals(checkPackage)) {
				
				isFound = Boolean.TRUE;
				outStr.append(currPackage.getName());
				outStr.append(" is available and provided version");
				
				int compareTo = currPackage.getVersion().compareTo(checkPackage.getVersion());
				
				if(compareTo < 0) {
					outStr.append(" is greater than");
				} else if(compareTo == 0) {
					outStr.append(" is same as");
				} else {
					outStr.append(" is lesser than");
				}
				break;
			}
		}
		
		if(!isFound) {
			outStr.append(" is not");
		}
		outStr.append(" available");
		
		System.out.println(outStr.toString());
		
	}

}
