package com.demo.app;

public class Package {
	
	private String name;
	private Version version;
	
	Package(String name, String versionStr) {
		this.name = name;
		this.version = new Version();
		
		String[] numbers = versionStr.split("\\.");
		for(int i=0; i < numbers.length; i++ ) {
			this.version.addNumber(Integer.parseInt(numbers[i]));
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Version getVersion() {
		return version;
	}
	
	public void setVersion(Version version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		
		if(obj == null){
			return false;
		}
		
		if(getClass() != obj.getClass()) {
			return false;
		}
		
		Package otherPackage = (Package) obj;
		
		if(this.name.equals(otherPackage.name)) {
			return true;
		}
		
		return false;
	}
	
}
