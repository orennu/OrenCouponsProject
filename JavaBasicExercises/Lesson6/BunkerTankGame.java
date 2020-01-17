import javax.swing.JOptionPane;

public class BunkerTankGame {
	public static void main(String[] args) {
		
		final int BUNKER_POWER = 500;
		final int SHELL_POWER = 600;
		final int LOSS_FACTOR = 30;
		
		String strTankToBunkerDistance = JOptionPane.showInputDialog("Enter tank to bunker distance");
		int tankToBunkerDistance = Integer.parseInt(strTankToBunkerDistance);
		
		String strTankToShellDistance = JOptionPane.showInputDialog("Enter tank to shell distance");
		int tankToShellDistance = Integer.parseInt(strTankToShellDistance);
		
		int shellToBunkerDistance = Math.abs(tankToBunkerDistance - tankToShellDistance);
		int shellLossOfDamage = LOSS_FACTOR * shellToBunkerDistance;
		
		int damage = SHELL_POWER - Math.min(SHELL_POWER, shellLossOfDamage);
		int bunkerStatus = Math.max(0, BUNKER_POWER - damage);
		
		if (bunkerStatus >= 400) {
			System.out.println("Bunker in excellent shape");
		}
		else if (bunkerStatus >= 250) {
			System.out.println("Bunker in medium shape");
		}
		else {
			System.out.println("Bunker is total loss");
		}
	}
}
