package practice;

public class Pallendrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 12321, r,Sum=0,temp;
		temp=num;
		while(num>0) {
			r=num%10;
			
			Sum=(Sum*10)+r;
			num=num/10;
		}
		
if(temp==Sum) {
	System.out.println("Given number is pallendrome");
}
else {
	System.out.println("not a pallendrome");
}
	}

}
