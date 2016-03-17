package day1.app;

public class Computer {
	
	String cpu = "intel";
	String monitor = "HD1080P";
	int numofcores = 2;
	int numofinputdevices = 1;
	int numofoutputdevices = 1;
	
	void changeCPU(String newValue) {
		cpu = "newValue";
	}
	void changeMonitor(String newValue) {
		monitor = "newValue";
	}
	void changeCores(int newValue) {
		numofcores = newValue;
	}
	void changeNumOfIOdevices(int newValue) {
		numofinputdevices = newValue;
	}
	void changeNumOfOPdevices(int newValue) {
		numofoutputdevices = newValue;
	}
	void printStates1() {
		System.out.println("CPU = " + cpu);
		System.out.println("Display Monitor Resolution = " + monitor);
		System.out.println("No. of Cores = " + numofcores );
		System.out.println("No. of Input Devices = " + numofinputdevices );
		System.out.println("No. of Output Devices = " + numofoutputdevices );	
	}
}
