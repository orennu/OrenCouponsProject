
public class DynamicArray {

	private int array[];
	private int arraySize;

	public DynamicArray() {
		this.array = new int[0];
		this.arraySize = 0;
	}

	public void addItem(int item) {
		int temp[] = copyArray();

		temp[arraySize] = item;
		array = temp;
		arraySize++;
	}

	public void addItem(int index, int item) {
		int temp[] = copyArray(index);

		temp[index] = item;
		array = temp;
		arraySize++;

	}
	
	public void removeItem(int index) throws ArrayIndexOutOfBoundsException{
		if (isEmpty() || index < 0 || index >= arraySize) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		int temp[] = new int[arraySize - 1];
		
		for (int i = 0; i < temp.length; i++) {
			if (i < index) {
				temp[i] = array[i];
			}
			
			if (i >= index) {
				temp[i] = array[i+1];
			}
		}
		
		array = temp;
		arraySize--;
		System.out.println("removed item from index " + index);
	}

	public int size() {
		return arraySize;
	}

	public int getItem(int index) {
		return array[index];
	}
	
	public void display() {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1) {
				System.out.print(array[i] + ", ");
			}
			else {
				System.out.print(array[i]);
			}
		}
		System.out.println("]");
	}

	private int[] copyArray(int index) {
		int arr[] = new int[arraySize + 1];

		for (int i = 0; i < arr.length; i++) {
			if (i < index) {
				arr[i] = array[i];
			}

			if (i == index) {
				arr[i] = 0;
			}

			if (i > index) {
				arr[i] = array[i - 1];
			}
		}

		return arr;
	}

	private int[] copyArray() {
		int arr[] = new int[arraySize + 1];

		for (int i = 0; i < array.length; i++) {
			arr[i] = array[i];
		}

		return arr;
	}
	
	private boolean isEmpty() {
		return arraySize == 0;
	}
}
