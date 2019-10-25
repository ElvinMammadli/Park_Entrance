import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class Exits extends JFrame {

	private JPanel contentPane;
	private JTextField exitd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exits frame = new Exits();
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
	public Exits() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 897, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(SystemColor.textHighlight);
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel label = new JLabel("Enter your plate :");
		label.setBounds(292, 195, 100, 16);
		panel.add(label);
		
		JLabel lblExit = new JLabel("Exit \r\n");
		lblExit.setFont(new Font("Palatino Linotype", Font.PLAIN, 24));
		lblExit.setBounds(324, 122, 179, 38);
		panel.add(lblExit);
		
		JButton button = new JButton("Ok");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Task b= new Task();
				Calendar calendar = Calendar.getInstance();
				Time now = new Time(calendar.get(Calendar.HOUR_OF_DAY),calendar.get(Calendar.MINUTE));

				if(b.a.searchParked(exitd.getText())==null){
					JOptionPane.showMessageDialog(null, "Girdiğiniz plakada olan araç otoparkda bulunamamaktadır", "Çıkış bilgisi", JOptionPane.INFORMATION_MESSAGE);
					}
				else  {
				if(	b.a.searchParked(exitd.getText()).isIssub()==true) {
					b.a.searchParked(exitd.getText()).setExitTime(now);
					JOptionPane.showMessageDialog(null,"Çıkış yapıldı "," Çıkış bilgisi", JOptionPane.INFORMATION_MESSAGE);

				}
				else	if(b.a.search(exitd.getText())==null) {
					
												
				
						int g=0;
						g=b.a.searchParked(exitd.getText()).getDifference(b.a.searchParked(exitd.getText()).getEnterTime());
						g/=60;
						if(g!=0) {
							g=1;
							}
						b.a.searchParked(exitd.getText()).setExitTime(now);

						JOptionPane.showMessageDialog(null,  g*20 +"  tl para vermeniz gerekli", "Çıkış bilgisi", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null,"Çıkış yapıldı "," Çıkış bilgisi", JOptionPane.INFORMATION_MESSAGE);

										
				}
				else {
					b.a.searchParked(exitd.getText()).setExitTime(now);

					JOptionPane.showMessageDialog(null,"Çıkış yapıldı "," Çıkış bilgisi", JOptionPane.INFORMATION_MESSAGE);
				}
				
				}
		}});
		button.setBounds(402, 290, 59, 25);
		panel.add(button);
		
		JButton button_1 = new JButton("Back\r\n");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Task ad= new Task();
				dispose();
				ad.setVisible(true);

				
			}
		});
		button_1.setBounds(473, 290, 71, 25);
		panel.add(button_1);
		
		exitd = new JTextField();
		exitd.setToolTipText("Add your plate ...");
		exitd.setColumns(10); 
		exitd.setBounds(292, 224, 252, 44);
		panel.add(exitd);
	}

	
		
		
		
	
	}
			