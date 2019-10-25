import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Window;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;


public class Task extends JFrame {
	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */ 
	public static AutoPark a = new AutoPark(20,100);
	public  AutoPark getA() {
		return a;
	}
	public static void main(String[] args) {
		  

		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Task frame = new Task();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public Task() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 603);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		JButton btnNewButton = new JButton("Add Vehicle");
		btnNewButton.setToolTipText("Add your vehicle");
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Add ad= new Add();
				dispose();
				ad.setVisible(true);
	
		
			}
		});
		JLabel lblWelcomeToAutopark = new JLabel("\t\t\t\t\t\t\t\t\t\t\t\tWelcome to Autopark");
		lblWelcomeToAutopark.setFont(new Font("Palatino Linotype", Font.PLAIN, 24));
		JButton btnNewButton_1 = new JButton("Is your car parked?");
		btnNewButton_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				isParked park = new isParked();
				dispose();
				park.setVisible(true);
			}
			
		});
		
		JButton btnNewButton_3 = new JButton("Vehicle enter");
		btnNewButton_3.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				Enter enter = new Enter();
				dispose();
				enter.setVisible(true);
				
			
			}
		});
		
		JButton btnVehicleExit = new JButton("Vehicle exit");
		btnVehicleExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exits exit = new Exits();
				dispose();
				exit.setVisible(true);
			
				
				
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(330)
					.addComponent(lblWelcomeToAutopark, GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
					.addGap(105))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(355)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnVehicleExit, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
						.addComponent(btnNewButton_3, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
					.addGap(343))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(115)
					.addComponent(lblWelcomeToAutopark, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(btnNewButton)
					.addGap(26)
					.addComponent(btnNewButton_1)
					.addGap(33)
					.addComponent(btnNewButton_3)
					.addGap(30)
					.addComponent(btnVehicleExit)
					.addContainerGap(134, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
}
