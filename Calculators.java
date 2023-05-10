package Week2Day3;

public class Calculators {

	public void addTwoNumber(int a, int b){
		 int c=a+b ;
	System.out.println(c);
	}

	public void subTwoNumber(int e, int f){
		 int g=e-f ;
	System.out.println(g);
	}	 
	
	public void multipleTwoNumber(double i, double j){
		 double k=i*j ;
	System.out.println(k);
	}	 
		 
	public void divideTwoNumber(float x, float y){
		 float z=x/y;
	System.out.println(z);
	}
	
	public static void main(String[] args) {
		Calculators calc =new Calculators();
		calc.addTwoNumber(20, 40);
		calc.subTwoNumber(70, 40);
		calc.multipleTwoNumber(876.56,765.31);
		calc.divideTwoNumber(2456.795f,8764.214f);
	}

}
