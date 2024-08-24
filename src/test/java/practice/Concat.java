package practice;

public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="I am ";
		String str2= "Automation";
		String str3=" Selenium";
		String str4=" Tester";
		 
		
		String Str5= str1.concat(str2);
		
		String Str6=str1.concat(str2).concat(str3).concat(str4);
		
		System.out.println(Str5);
		System.out.println(Str6);

	}

}
