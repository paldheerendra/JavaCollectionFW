package java8.features.streams.flatmap;

import java.util.HashSet;
import java.util.Set;

public class Employee {

	String name;
	Set<String> devices;
	
	/*
	 * public Employee(String name, Set<String> devices) { this.name = name;
	 * this.devices = devices; }
	 */
	public void addDevices(String deviceName) {
		if(this.devices == null)
			this.devices = new HashSet<String>();
		
		this.devices.add(deviceName);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getDevices() {
		return devices;
	}

	public void setDevices(Set<String> devices) {
		this.devices = devices;
	}

		
	

}
