package WrapperClasses;

public class CallByReference {
	
	int p; //non static variable
	int q; //non static variable
	//CallByReference Or PassByReference
	public static void main(String[] args) {
		
		CallByReference callByReference=new  CallByReference();
		callByReference.p=10;
		callByReference.q=20;
		
		callByReference.swap(callByReference);
		//after swap
		System.out.println(callByReference.p);
		System.out.println(callByReference.q);
	}
	
	//call by reference is possible in java by using object references
	//we are passing the value of object reference is called as CallByReference
	public void swap(CallByReference c)
	{
		int temp;
		temp=c.p;
		c.p=c.q;
		c.q=temp;
	}

}
