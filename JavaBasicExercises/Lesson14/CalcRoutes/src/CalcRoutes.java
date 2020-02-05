
public class CalcRoutes {
	
	public static void main(String[] args) {
		
		System.out.println("Found " + calcRoutes(3, 4) + " routes to destination");
		System.out.println("Found " + calcRoutesShorter(3, 4) + " routes to destination");
	}
	
	public static int calcRoutes(int destX, int destY) {
		
		return calcRoutes(0, 0, destX, destY);
	}

	private static int calcRoutes(int userX, int userY, int destX, int destY) {
		
		if (userX == destX) {
			return 1;
		}
		
		if (userY == destY) {
			return 1;
		}
		
		return calcRoutes(userX + 1, userY, destX, destY) + calcRoutes(userX, userY + 1, destX, destY);
	}
	
	public static int calcRoutesShorter(int destX, int destY) {
		
		if (destX == 0 || destY == 0) {
			return 1;
		}
		
		return calcRoutesShorter(destX - 1, destY) + calcRoutesShorter(destX, destY - 1); 
	}
}


