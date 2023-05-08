package Week2.Day1;

public class Mobile {
	String mobileBrandname="Xiaomi";
	char mobileLogo='M';
	short noOfMobilePiece=123;
	int modelNumber=321;
	long mobileImeiNumber=8765432190L;
	float mobilePrice=1500.05F;
	boolean isDamaged=false;
	
	
	public static void main(String[] args) {
		Mobile Xiaomi=new Mobile();
		System.out.println(Xiaomi.mobileBrandname);
		System.out.println(Xiaomi.mobileLogo);
		System.out.println(Xiaomi.noOfMobilePiece);
		System.out.println(Xiaomi.modelNumber);
		System.out.println(Xiaomi.mobileImeiNumber);
		System.out.println(Xiaomi.mobilePrice);
        System.out.println(Xiaomi.isDamaged);
		
	}

}
