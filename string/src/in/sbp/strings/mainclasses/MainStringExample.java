package in.sbp.strings.mainclasses;

import java.util.Arrays;

import in.sbp.strings.classes.StringExample;

public class MainStringExample {

	public static void main(String[] args) {
		StringExample stringExample = new StringExample();
		// GC
//		String name="ABC";
//		StringBuilder stringBuilder = new StringBuilder();
//		stringBuilder.append(name);
//		stringBuilder.append(" BBC");
//		System.out.println(stringExample.getResult(stringBuilder.toString()));
//		byte[] bytes=stringBuilder.toString().getBytes();
//		for(byte val:bytes)
//			System.out.println(val);
		
		String name="ABCD EFGH";
		String name1="ABC";
		String name2=new String("ABC");
		
		System.out.println((name==name1));
		System.out.println((name==name2));
		
		System.out.println(name.equals(name2));
		
		char character=name.charAt(2);
		System.out.println(character);
		
		
		char[] charArray = name.toCharArray();
		
		int left=0;
		int right=charArray.length-1;
		while(left<=right) {
			char temp=charArray[left];
			charArray[left]=charArray[right];
			charArray[right]=temp;
			
			left++;
			right--;
		}
		
		System.out.println(Arrays.toString(charArray));
		
		
		System.out.println(name.matches("[A-Za-z0-9 ]{8,10}"));
		
		
	}
}
