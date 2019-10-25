import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JSeparator;

public class Enter extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField enter;
	private JCheckBox jCheckboxOfficial;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Enter frame = new Enter();
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
	public Enter() {
		setBackground(SystemColor.textHighlight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Enter your plate :");
		label.setBounds(292, 173, 100, 16);
		contentPane.add(label);
		
		JLabel lblEnterVehicle = new JLabel("Enter Vehicle\r\n");
		lblEnterVehicle.setFont(new Font("Palatino Linotype", Font.PLAIN, 24));
		lblEnterVehicle.setBounds(324, 122, 179, 38);
		contentPane.add(lblEnterVehicle);
		
		JButton button = new JButton("Ok");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Calendar calendar = Calendar.getInstance();
				Task b= new Task();
				
				boolean official = jCheckboxOfficial.isSelected();
				
				if(b.a.isParked(enter.getText())==true) {
					JOptionPane.showMessageDialog(null,"Girmiş olduğunuz plaka zaten otoparkta bulunmaktadır "," Giriş bilgisi", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					Time now = new Time(calendar.get(Calendar.HOUR_OF_DAY),calendar.get(Calendar.MINUTE));	
					ParkRecord record = new ParkRecord(now,null,false);

					if(official==true) { 
						record.setIssub(true);
					}
					//Hata aldım ve zamanım yetmedi
			/*	if(b.a.search(enter.getText()).getSubstruction().isValid()!=true){
					JOptionPane.showMessageDialog(null,"Üyeliğiniz sona ermiştir.Giriş yapıldı. "," Giriş bilgisi", JOptionPane.INFORMATION_MESSAGE);

				}*/
					
						record.setPlate(enter.getText());
						b.a.addRecord(record);
				JOptionPane.showMessageDialog(null,"Giriş yapıldı "," Giriş bilgisi", JOptionPane.INFORMATION_MESSAGE);
			}}
		});
		button.setBounds(448, 259, 69, 25);
		contentPane.add(button);
		
		JButton btnBack = new JButton("Back\r\n");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Task ad= new Task();
				dispose();
				ad.setVisible(true);

			}
		});
		btnBack.setBounds(448, 297, 71, 25);
		contentPane.add(btnBack);
		
		enter = new JTextField();
		enter.setToolTipText("Add your plate ...");
		enter.setColumns(10);
		enter.setBounds(292, 202, 225, 44);
		contentPane.add(enter);
		
		jCheckboxOfficial = new JCheckBox("Official");
		jCheckboxOfficial.setBounds(292, 277, 113, 25);
		contentPane.add(jCheckboxOfficial);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(89, 350, -31, -18);
		contentPane.add(separator);
	}
	
}
