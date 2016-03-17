package day1.app;

public class ThinkPad {

	public static void main(String[] args) {
				
		Laptop thinkpad1 = new Laptop();
		
		thinkpad1.cpu = "INTEL";
		thinkpad1.monitor = "HD1080P";
		thinkpad1.numofcores = 4;
		thinkpad1.numofinputdevices = 2;
		thinkpad1.numofoutputdevices = 2;
		thinkpad1.portable = true;
		thinkpad1.os = "Windows10";
		thinkpad1.browser = "Chrome";
		thinkpad1.im = "Skype";
		thinkpad1.printStates1();
		thinkpad1.printStates2();
		
	}

}
