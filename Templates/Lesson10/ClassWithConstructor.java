
public class ClassWithConstructor {
	
	// Class attributes
	public String attr1;
	public int attr2;
	public boolean attr3;
	
	// Class Constructor (Ctor)
	public ClassWithConstructor(String attr1, int attr2, boolean attr3) {
		
		// Copying local variables to class variables
		this.attr1 = attr1;
		this.attr2 = attr2;
		this.attr3 = attr3;
	}
}
