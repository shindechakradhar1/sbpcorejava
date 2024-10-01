package in.sbp.generics.genericsclasses;

public class GenericUpperBoundSorting<T extends Comparable<T>> {
	
	private T[] tArray;
	
	public void setTArray(T... tArray) {
		this.tArray=tArray;
	}
	
	public void sortTArray() {
		for(int i=0;i<tArray.length;i++) {
			for(int j=0;j<tArray.length-i-1;j++) {
				if(tArray[j].compareTo(tArray[j+1])>0) {
					T temp = tArray[j];
					tArray[j]=tArray[j+1];
					tArray[j+1]=temp;
//					a=a+b;
//					a=a-b;
//					b=a-b;
				}
			}
		}
	}	
	
	public void printTArray() {
		for(T element:tArray)
			System.out.println(element);
	}
}
