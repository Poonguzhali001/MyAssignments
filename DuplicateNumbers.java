package Week3day1;

public class DuplicateNumbers {

	public static void main(String[] args) {
		
				int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
			    int len =arr.length;
			    System.out.println("Array Length="+len);
			
			    int count=0;
			    for(int i= 0;i < arr .length;i++) {
			    count = 0;
			    for(int j=i+1; j < arr.length;j++) {
			    if(arr[i] == arr [j]) { 
			    System.out.println(arr[i]);
			    }
			    }
			    }
			

	}

}