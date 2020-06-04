import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Parent_Bakery {
	
	public double itemCost;
	
	public double Lemon_Drop_Bar;
	public double Vanilla_Cupcake;
	public double Chocolate_Cake;
	public double Gooey_Brownies;
	public double Banana_Pudding;
	public double Cottage_Pudding;
	public double Boston_Cream_Pie;
	public double Cinnamon_Rolls;
	public double Ice_Cream_Cake;

	
	
	public double pLemon_Drop_Bar = 3.25;
	public double pVanilla_Cupcake = 2.90;
	public double pChocolate_Cake = 9.35;
	public double pGooey_Brownies = 13.50;
	public double pBanana_Pudding = 3.25;
	public double pCottage_Pudding = 2.50;
	public double pBoston_Cream_Pie = 10.25;
	public double pCinnamon_Rolls = 3.75;
	public double pIce_Cream_Cake = 4.25;
	
	public double GetTotal()
	{
		itemCost=Lemon_Drop_Bar + Vanilla_Cupcake + Chocolate_Cake + Gooey_Brownies + Banana_Pudding + Cottage_Pudding + Boston_Cream_Pie + Cinnamon_Rolls + Ice_Cream_Cake;

		return itemCost;
	}
	
	
	private JFrame frame;
	
	
//	exit application method
	public void iExitManagementSystem() {
		frame = new JFrame();
		if (JOptionPane.showConfirmDialog(frame, "Confirm you wish to exit", "Bakery Management System",
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
	}
	
	public double mcTax = 0.85;
//	method to calculate tax
	public Double cFindTax(double cAmount) {
		double FindTax = cAmount -(cAmount* mcTax);
		return FindTax;
	}
	
	
	public void ClearNumbers(java.awt.event.KeyEvent evt) {
		char iNum =evt.getKeyChar();
		if(!(Character.isDigit(iNum))
				||(iNum == KeyEvent.VK_BACK_SPACE)
				|| (iNum == KeyEvent.VK_DELETE)) {
			evt.consume();
		}
	}
}




