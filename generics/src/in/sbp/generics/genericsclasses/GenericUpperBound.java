package in.sbp.generics.genericsclasses;

public class GenericUpperBound <T extends Number>{

	private T val;
	
	public void setVal(T val) {
		this.val=val;
	}
	
	public T getVal() {
		return val;
	}
}
