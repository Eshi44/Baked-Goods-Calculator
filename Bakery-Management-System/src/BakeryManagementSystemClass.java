import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class BakeryManagementSystemClass {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BakeryManagementSystemClass window = new BakeryManagementSystemClass();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BakeryManagementSystemClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1380, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(153, 51, 51), 10));
		panel.setBounds(193, 22, 975, 90);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Bakery Management System");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 55));
		panel.add(lblNewLabel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(193, 138, 975, 17);
		frame.getContentPane().add(separator_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(222, 166, 443, 47);
		frame.getContentPane().add(panel_1);
		
		JLabel Lemon_Drop_Bar = new JLabel("Lemon Drop Bar");
		panel_1.add(Lemon_Drop_Bar);
		Lemon_Drop_Bar.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Bakery iNum = new Child_Bakery();
				iNum.ClearNumbers(evt);
			}
		});
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(textField);
		textField.setColumns(12);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2.setBounds(222, 224, 443, 47);
		frame.getContentPane().add(panel_2);
		
		JLabel Vanilla_Cupcake = new JLabel("Vanilla Cupcake");
		Vanilla_Cupcake.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Bakery iNum = new Child_Bakery();
				iNum.ClearNumbers(evt);
			}
		});
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(12);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(6)
					.addComponent(Vanilla_Cupcake)
					.addGap(5)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(5)
					.addComponent(Vanilla_Cupcake))
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(7)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3.setBounds(222, 282, 443, 47);
		frame.getContentPane().add(panel_3);
		
		JLabel Chocolate_Cake = new JLabel("Chocolate Cake");
		Chocolate_Cake.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_3.add(Chocolate_Cake);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Bakery iNum = new Child_Bakery();
				iNum.ClearNumbers(evt);
			}
		});
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(12);
		panel_3.add(textField_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_4.setBounds(222, 340, 443, 47);
		frame.getContentPane().add(panel_4);
		
		JLabel Mint_Oreo_Cake = new JLabel("Mint Oreo Cake");
		Mint_Oreo_Cake.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_4.add(Mint_Oreo_Cake);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Bakery iNum = new Child_Bakery();
				iNum.ClearNumbers(evt);
			}
		});
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setColumns(12);
		panel_4.add(textField_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_5.setBounds(222, 398, 443, 47);
		frame.getContentPane().add(panel_5);
		
		JLabel Gooey_Brownies = new JLabel("Gooey Brownies");
		Gooey_Brownies.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_5.add(Gooey_Brownies);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setColumns(12);
		panel_5.add(textField_4);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_6.setBounds(686, 166, 443, 47);
		frame.getContentPane().add(panel_6);
		
		JLabel Banana_Pudding = new JLabel("Banana Pudding");
		Banana_Pudding.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_6.add(Banana_Pudding);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Bakery iNum = new Child_Bakery();
				iNum.ClearNumbers(evt);
			}
		});
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_5.setColumns(12);
		panel_6.add(textField_5);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_7.setBounds(686, 398, 443, 47);
		frame.getContentPane().add(panel_7);
		
		JLabel Cottage_Pudding = new JLabel("Cottage Pudding");
		Cottage_Pudding.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_7.add(Cottage_Pudding);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Bakery iNum = new Child_Bakery();
				iNum.ClearNumbers(evt);
			}
		});
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_6.setColumns(12);
		panel_7.add(textField_6);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_8.setBounds(686, 340, 443, 47);
		frame.getContentPane().add(panel_8);
		
		JLabel Boston_Cream_Pie = new JLabel("Boston Cream Pie");
		Boston_Cream_Pie.setFont(new Font("Times New Roman", Font.BOLD, 28));
		panel_8.add(Boston_Cream_Pie);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Bakery iNum = new Child_Bakery();
				iNum.ClearNumbers(evt);
			}
		});
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_7.setColumns(12);
		panel_8.add(textField_7);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_9.setBounds(686, 282, 443, 47);
		frame.getContentPane().add(panel_9);
		
		JLabel Cinnamon_Rolls = new JLabel("Cinnamon Rolls");
		Cinnamon_Rolls.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_9.add(Cinnamon_Rolls);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Bakery iNum = new Child_Bakery();
				iNum.ClearNumbers(evt);
			}
		});
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_8.setColumns(12);
		panel_9.add(textField_8);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_10.setBounds(686, 224, 443, 47);
		frame.getContentPane().add(panel_10);
		
		JLabel Ice_Cream_Cake = new JLabel("Ice Cream Cake");
		Ice_Cream_Cake.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_10.add(Ice_Cream_Cake);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Bakery iNum = new Child_Bakery();
				iNum.ClearNumbers(evt);
			}
		});
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_9.setColumns(12);
		panel_10.add(textField_9);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_11.setBounds(222, 520, 443, 47);
		frame.getContentPane().add(panel_11);
		
		JLabel lblCost = new JLabel("Total         ");
		lblCost.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_11.add(lblCost);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Bakery iNum = new Child_Bakery();
				iNum.ClearNumbers(evt);
			}
		});
		textField_10.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_10.setColumns(12);
		panel_11.add(textField_10);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_12.setBounds(222, 581, 443, 47);
		frame.getContentPane().add(panel_12);
		
		JLabel lblTax = new JLabel("Tax            ");
		lblTax.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_12.add(lblTax);
		
		textField_11 = new JTextField();
		textField_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Bakery iNum = new Child_Bakery();
				iNum.ClearNumbers(evt);
			}
		});
		textField_11.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_11.setColumns(12);
		panel_12.add(textField_11);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_13.setBounds(222, 639, 443, 47);
		frame.getContentPane().add(panel_13);
		
		JLabel label_1 = new JLabel("Total Cost");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_13.add(label_1);
		
		textField_12 = new JTextField();
		textField_12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				Child_Bakery iNum = new Child_Bakery();
				iNum.ClearNumbers(evt);
			}
		});
		textField_12.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_12.setColumns(12);
		panel_13.add(textField_12);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Child_Bakery ItemCost = new Child_Bakery();
				double iTax, iSubtotal, iTotal;
				
				ItemCost.Lemon_Drop_Bar = ItemCost.pLemon_Drop_Bar * Double.parseDouble(textField.getText());
				ItemCost.Vanilla_Cupcake = ItemCost.pVanilla_Cupcake * Double.parseDouble(textField_1.getText());
				ItemCost.Chocolate_Cake = ItemCost.pChocolate_Cake * Double.parseDouble(textField_2.getText());
				ItemCost.Mint_Oreo_Cake = ItemCost.pMint_Oreo_Cake * Double.parseDouble(textField_3.getText());
				ItemCost.Gooey_Brownies = ItemCost.pGooey_Brownies * Double.parseDouble(textField_4.getText());
				ItemCost.Banana_Pudding = ItemCost.pBanana_Pudding * Double.parseDouble(textField_5.getText());
				ItemCost.Cottage_Pudding = ItemCost.pCottage_Pudding * Double.parseDouble(textField_6.getText());
				ItemCost.Boston_Cream_Pie = ItemCost.pBoston_Cream_Pie * Double.parseDouble(textField_7.getText());
				ItemCost.Cinnamon_Rolls = ItemCost.pCinnamon_Rolls * Double.parseDouble(textField_8.getText());
				ItemCost.Ice_Cream_Cake = ItemCost.pIce_Cream_Cake * Double.parseDouble(textField_9.getText());
				
				iSubtotal = ItemCost.GetTotal();
				iTax = ItemCost.cFindTax(iSubtotal);
				iTotal = iSubtotal + iTax;
				
				
				String SubTotal = String.format("$%.2f", iSubtotal);
				textField_10.setText(SubTotal);
				
				String Tax = String.format("$%.2f", iTax);
				textField_11.setText(Tax);
				
				String Total = String.format("$%.2f", iTotal);
				textField_12.setText(Total);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(686, 602, 142, 84);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				clear input values and set value as "0"
				JTextField cleartext = null;
				for (java.awt.Component c:panel_1.getComponents()) {
					if (c.getClass().toString().contains("javax.swing.JTextField")) {
						cleartext=(JTextField)c;
						cleartext.setText("");
					}
				}
				for (java.awt.Component c:panel_2.getComponents()) {
					if (c.getClass().toString().contains("javax.swing.JTextField")) {
						cleartext=(JTextField)c;
						cleartext.setText("");
					}
				}
				for (java.awt.Component c:panel_3.getComponents()) {
					if (c.getClass().toString().contains("javax.swing.JTextField")) {
						cleartext=(JTextField)c;
						cleartext.setText("");
					}
				}
				for (java.awt.Component c:panel_4.getComponents()) {
					if (c.getClass().toString().contains("javax.swing.JTextField")) {
						cleartext=(JTextField)c;
						cleartext.setText("");
					}
				}
				for (java.awt.Component c:panel_5.getComponents()) {
					if (c.getClass().toString().contains("javax.swing.JTextField")) {
						cleartext=(JTextField)c;
						cleartext.setText("");
					}
				}
				for (java.awt.Component c:panel_6.getComponents()) {
					if (c.getClass().toString().contains("javax.swing.JTextField")) {
						cleartext=(JTextField)c;
						cleartext.setText("");
					}
				}
				for (java.awt.Component c:panel_7.getComponents()) {
					if (c.getClass().toString().contains("javax.swing.JTextField")) {
						cleartext=(JTextField)c;
						cleartext.setText("");
					}
				}
				for (java.awt.Component c:panel_8.getComponents()) {
					if (c.getClass().toString().contains("javax.swing.JTextField")) {
						cleartext=(JTextField)c;
						cleartext.setText("");
					}
				}
				for (java.awt.Component c:panel_9.getComponents()) {
					if (c.getClass().toString().contains("javax.swing.JTextField")) {
						cleartext=(JTextField)c;
						cleartext.setText("");
					}
				}
				for (java.awt.Component c:panel_10.getComponents()) {
					if (c.getClass().toString().contains("javax.swing.JTextField")) {
						cleartext=(JTextField)c;
						cleartext.setText("");
					}
				}
				for (java.awt.Component c:panel_11.getComponents()) {
					if (c.getClass().toString().contains("javax.swing.JTextField")) {
						cleartext=(JTextField)c;
						cleartext.setText("");
					}
				}
				for (java.awt.Component c:panel_12.getComponents()) {
					if (c.getClass().toString().contains("javax.swing.JTextField")) {
						cleartext=(JTextField)c;
						cleartext.setText("");
					}
				}
				for (java.awt.Component c:panel_13.getComponents()) {
					if (c.getClass().toString().contains("javax.swing.JTextField")) {
						cleartext=(JTextField)c;
						cleartext.setText("");
					}
				}
				
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnClear.setBounds(838, 602, 142, 84);
		frame.getContentPane().add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Child_Bakery iExit = new Child_Bakery();
				iExit.iExitManagementSystem();
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnExit.setBounds(987, 602, 142, 84);
		frame.getContentPane().add(btnExit);
	}
}
