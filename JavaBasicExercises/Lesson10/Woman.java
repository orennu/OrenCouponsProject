
public class Woman {
	
	public String name;
	public int age;
	public int realAge;
	
	public Woman(String name, int age) {
		
		this.name = name;
		this.age = age;

		if (age >= 30) {
			this.realAge = age + 5;
		}
		else {
			this.realAge = age;
		}
	}
}
