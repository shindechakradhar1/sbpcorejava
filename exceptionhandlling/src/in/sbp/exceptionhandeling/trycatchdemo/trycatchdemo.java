package in.sbp.exceptionhandeling.trycatchdemo;

public class trycatchdemo {

	public static void main(String[] args) {
	
		int[] arr = {1,2,3,4};
		
		try {
			for(int i=0;i<=arr.length;i++)
				System.out.println(arr[i]);
		}catch(Exception ex){
			System.out.println();
		}finally {
			System.out.println("this is finaly Block");
		}

		System.out.println("Bye...");
	}
}
