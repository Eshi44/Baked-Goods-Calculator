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
		
		JLabel lblNewLabel_1 = new JLabel("Lemon Drop Bar");
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(textField);
		textField.setColumns(12);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_2.setBounds(222, 224, 443, 47);
		frame.getContentPane().add(panel_2);
		
		JLabel lblCupcake = new JLabel("Vanilla Cupcake");
		lblCupcake.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_2.add(lblCupcake);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(12);
		panel_2.add(textField_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3.setBounds(222, 282, 443, 47);
		frame.getContentPane().add(panel_3);
		
		JLabel lblCake = new JLabel("Chocolate Cake");
		lblCake.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_3.add(lblCake);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(12);
		panel_3.add(textField_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_4.setBounds(222, 340, 443, 47);
		frame.getContentPane().add(panel_4);
		
		JLabel lblMintOreoCake = new JLabel("Mint Oreo Cake");
		lblMintOreoCake.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_4.add(lblMintOreoCake);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setColumns(12);
		panel_4.add(textField_3);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_5.setBounds(222, 398, 443, 47);
		frame.getContentPane().add(panel_5);
		
		JLabel lblGooeyBrownies = new JLabel("Gooey Brownies");
		lblGooeyBrownies.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_5.add(lblGooeyBrownies);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setColumns(12);
		panel_5.add(textField_4);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_6.setBounds(686, 166, 443, 47);
		frame.getContentPane().add(panel_6);
		
		JLabel lblBaguette = new JLabel("Banana Pudding");
		lblBaguette.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_6.add(lblBaguette);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_5.setColumns(12);
		panel_6.add(textField_5);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_7.setBounds(686, 398, 443, 47);
		frame.getContentPane().add(panel_7);
		
		JLabel lblCottagePudding = new JLabel("Cottage Pudding");
		lblCottagePudding.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_7.add(lblCottagePudding);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_6.setColumns(12);
		panel_7.add(textField_6);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_8.setBounds(686, 340, 443, 47);
		frame.getContentPane().add(panel_8);
		
		JLabel lblBostonCreamPie = new JLabel("Boston Cream Pie");
		lblBostonCreamPie.setFont(new Font("Times New Roman", Font.BOLD, 28));
		panel_8.add(lblBostonCreamPie);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_7.setColumns(12);
		panel_8.add(textField_7);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_9.setBounds(686, 282, 443, 47);
		frame.getContentPane().add(panel_9);
		
		JLabel lblCinnamonRoll = new JLabel("Cinnamon Rolls");
		lblCinnamonRoll.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_9.add(lblCinnamonRoll);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_8.setColumns(12);
		panel_9.add(textField_8);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_10.setBounds(686, 224, 443, 47);
		frame.getContentPane().add(panel_10);
		
		JLabel lblSourdough = new JLabel("Ice Cream Cake");
		lblSourdough.setFont(new Font("Times New Roman", Font.BOLD, 30));
		panel_10.add(lblSourdough);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_9.setColumns(12);
		panel_10.add(textField_9);
	}
}
