
public class Tester {
	
	public static void main(String[] args) {
		DynamicArray arr = new DynamicArray();
		try {
			arr.removeItem(0);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		try {
			arr.removeItem(100);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		try {
			arr.removeItem(-78);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		arr.addItem(1);
		arr.addItem(3);
		arr.addItem(4);
		arr.addItem(5);
		arr.addItem(1, 2);
		arr.addItem(arr.size(), 6);
		arr.display();
		System.out.println("array size: " + arr.size());
		arr.removeItem(0);
		arr.display();
		System.out.println("array size: " + arr.size());
		arr.removeItem(3);
		arr.display();
		System.out.println("item at index 2: " + arr.getItem(2));

	}
}
