package Week2.Day1;

public class TwoWheeler {
	
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=9876542L;
	boolean ispunctured=true;
	String BikeName="Yezdi";
	double runningKM=65.5;

	public static void main(String[] args) {
		TwoWheeler Yezdi= new TwoWheeler();
		System.out.println(Yezdi.noOfWheels);
		System.out.println(Yezdi.noOfMirrors);		
		System.out.println(Yezdi.chassisNumber);		
	    System.out.println(Yezdi.ispunctured);
		System.out.println(Yezdi.BikeName);
		System.out.println(Yezdi.runningKM);
	
	}

}
