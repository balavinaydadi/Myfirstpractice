package practice;
import java.util.*;

public class StringReverse {

	public static void main(String[] args) {
		String word= "Accenture" , revword="";
		StringBuilder input = new StringBuilder();
		input.append(word);
		input.reverse();
		System.out.println(input);
		char ch;
		for(int i=0; i<word.length();i++) {
			ch= word.charAt(i);
			revword=ch+revword;
			
			
		}
		
			
		System.out.println("reverse of the string is"+revword);	
	
	}
	

}
