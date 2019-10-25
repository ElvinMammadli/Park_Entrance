import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class isParked extends JFrame {

	private JPanel contentPane;
	private JTextField Parked;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					isParked frame = new isParked();
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
	public isParked() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Parked = new JTextField();
		Parked.setToolTipText("Add your plate ...");
		Parked.setColumns(10);
		Parked.setBounds(301, 243, 252, 44);
		contentPane.add(Parked);
		
		JLabel label = new JLabel("Please enter your plate:");
		label.setBounds(301, 214, 151, 16);
		contentPane.add(label);
		
		JLabel lblIsParked = new JLabel("Is Parked\r\n");
		lblIsParked.setFont(new Font("Palatino Linotype", Font.PLAIN, 24));
		lblIsParked.setBounds(350, 134, 181, 44);
		contentPane.add(lblIsParked); 
		
		JButton button = new JButton("Ok");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Task b= new Task();
				if(b.a.isParked(Parked.getText())==true) {
					JOptionPane.showMessageDialog(null,"Bu plakada araç  park edilmiştir "," Is Parked", JOptionPane.INFORMATION_MESSAGE);

		}else
				JOptionPane.showMessageDialog(null,"Bu plakada araç  park edilmemiştir "," Is Parked", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		button.setBounds(421, 311, 59, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Back\r\n");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Task ad= new Task();
				dispose();
				ad.setVisible(true);
				
			}
		});
		button_1.setBounds(494, 311, 74, 25);
		contentPane.add(button_1);
	}

}