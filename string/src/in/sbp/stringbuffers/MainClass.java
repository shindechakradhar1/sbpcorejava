package in.sbp.stringbuffers;

public class MainClass {

	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("This is Solapur City");
		int occurence = stringBuffer.lastIndexOf("is");
		System.out.println(occurence);
		
		stringBuffer.insert(6, "Great");
		
		
		
		System.out.println(stringBuffer.toString());
		
		stringBuffer.delete(5, 13);
		
		System.out.println(stringBuffer.toString());
		
		stringBuffer.reverse();
		
		System.out.println(stringBuffer.toString());
		
		System.out.println(stringBuffer.capacity());
		
	}
}
