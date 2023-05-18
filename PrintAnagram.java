package Week3day1;

import java.util.Arrays;

public class PrintAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String name1 = "stops";
     String name2 = "potss";
     int length1 = name1.length();
     System.out.println("L1="+length1);
     int length2 = name2.length();
     System.out.println("L2="+length2);
	 if(name1.length()==name2.length()) {
     
     char[] charArray = name1.toCharArray();
     char[] charArray1 = name2.toCharArray();
	 
     Arrays.sort(charArray);
	 Arrays.sort(charArray1);
	
	if(Arrays.equals(charArray, charArray1)) {
    System.out.println("Given is an Anagram");
	}else {
	System.out.println("Given is not an Anagram");	
	}
	
	
	}
}

}