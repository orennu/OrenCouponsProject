
public class Main {
	public static void main(String[] args) {
		
		Client client = new Client("John", "Snow", "johnsnow@gameofthrones.com", "000012345", "0534441234");
		
		System.out.println(client.getClientInfo());
	}
}
