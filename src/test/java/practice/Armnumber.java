package practice;



public class Armnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=135,a, temp, arm=0;
		temp=num;
		while(temp!=0) {
			a=temp%10;
			arm=arm+a*a*a;
			temp=temp/10;
		}
		System.out.println("result"+temp);
		
		

	}

}
