package day1.app;

public class Laptop extends Computer implements BasicSoftware {
	
	boolean portable = true;
	String os = "windows";
	String browser = "chrome";
	String im = "skype";
	
	void changePortable(boolean newValue) {
		portable = newValue;
	}	
	public void changeOS(String newValue) {
		os = newValue;
	}
	public void changeBrowser(String newValue) {
		browser = newValue;
	}
	public void changeIM(String newValue) {
		im = newValue;
	}
	void printStates2() {
		System.out.println("Portable(Y/N)= " + portable);
		System.out.println("Operating System = " + os);
		System.out.println("Browser = " + browser);
		System.out.println("IM = " + im);
	}
		
}
