import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Add extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField Plate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add frame = new Add();
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
	public Add() {
		getContentPane().setBackground(SystemColor.textHighlight);
		getContentPane().setForeground(Color.BLUE);
		
		Plate = new JTextField();
		Plate.setToolTipText("Add your plate ...");
		Plate.setColumns(10);
		
		JLabel lblAddDevice = new JLabel("Add Vehicle");
		lblAddDevice.setFont(new Font("Palatino Linotype", Font.PLAIN, 24));
		
		JLabel lblPleaseEnterYour = new JLabel("Please enter your plate:");
		
		JButton button = new JButton("Back\r\n");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Task nw = new Task();
				dispose();
				nw.setVisible(true);
				
				
			}
		});
		
		
		
		JButton button_1 = new JButton("Ok");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Task b= new Task(); 
				
				if(b.a.search(Plate.getText())==null) {
					SubscribedVehicle yeni = new SubscribedVehicle(Plate.getText());
					b.a.addVehicle(yeni);
					JOptionPane.showMessageDialog(null,"Bu plakada araç eklenmiştir  "," Add", JOptionPane.INFORMATION_MESSAGE);

					
			}else
				JOptionPane.showMessageDialog(null,"Bu plakada araç zaten bulunmaktadır "," Add", JOptionPane.INFORMATION_MESSAGE);


			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(352)
					.addComponent(lblAddDevice, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(423)
					.addComponent(button_1, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
					.addGap(14)
					.addComponent(button, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
					.addGap(312))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(303)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(Plate, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
						.addComponent(lblPleaseEnterYour, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE))
					.addGap(327))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(106)
					.addComponent(lblAddDevice, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(lblPleaseEnterYour)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(Plate, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button_1)
						.addComponent(button)))
		);
		getContentPane().setLayout(groupLayout);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
	}


}

