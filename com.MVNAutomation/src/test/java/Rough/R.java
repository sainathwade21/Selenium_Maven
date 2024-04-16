package Rough;

import java.util.Random;


public class R {
	
	public static void main(String[] args) {
		
	String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	Random ram = new Random();
	StringBuffer word = new StringBuffer();

	for(int i=0; i<=5; i++)
	{
		int index = ram.nextInt(alphabet.length());
		char ch = alphabet.charAt(index);
		word.append(ch);
	}
	
	System.out.println(word);}

}
