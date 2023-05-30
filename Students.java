package Week5Day1;

 public class Students {

public void getStudentInfo(int ID) {
	 System.out.println(ID);
 }
 public void getStudentInfo(int ID, String name) {
	System.out.println(ID +" "+name);
 }	
public void getStudentInfo(String email,int Mobile) {
	System.out.println(email +" "+Mobile);
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Students stu =new Students();
	stu.getStudentInfo(17033);
	stu.getStudentInfo(17033, "Maya");
	stu.getStudentInfo("pooguzhali301@gmail.com", 967751723);
	}

}
