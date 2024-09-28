package in.sbp.exceptionhandlling.trywithresourcesdemoclasses;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TryWithResources {

	public void sorted(int... intArray) {
		try(
				IntStream intStream = Arrays.stream(intArray);
			){
			
			intStream.sorted().forEach(e->System.out.println(e));
		
		}
		
	}
}
