package teste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfResul;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora frame = new calculadora();
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
	public calculadora() {
		setBackground(new Color(255, 255, 255));
		setForeground(new Color(255, 255, 255));
		setFont(new Font("Arial Black", Font.PLAIN, 12));
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 271, 315);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Número 1:");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 29, 104, 39);
		contentPane.add(lblNewLabel);
		
		tfNum1 = new JTextField();
		tfNum1.setFont(new Font("Arial Black", Font.PLAIN, 16));
		tfNum1.setBounds(109, 39, 125, 19);
		contentPane.add(tfNum1);
		tfNum1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Número 2:");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 88, 96, 39);
		contentPane.add(lblNewLabel_1);
		
		tfNum2 = new JTextField();
		tfNum2.setFont(new Font("Arial Black", Font.PLAIN, 16));
		tfNum2.setBounds(109, 101, 125, 19);
		contentPane.add(tfNum2);
		tfNum2.setColumns(10);
		
		JButton btnConf = new JButton("Somar");
		btnConf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1;
				double num2;
				double resul;
				
				num1= Double.parseDouble(tfNum1.getText());
				num2 = Double.parseDouble(tfNum2.getText());
				
				resul = num1 + num2;
						
				tfResul.setText(""+resul);
			}
		});
		btnConf.setForeground(new Color(0, 0, 0));
		btnConf.setFont(new Font("Arial Black", Font.PLAIN, 16));
		btnConf.setBackground(new Color(0, 128, 192));
		btnConf.setBounds(66, 155, 110, 21);
		contentPane.add(btnConf);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 208, 104, 39);
		contentPane.add(lblNewLabel_2);
		
		tfResul = new JTextField();
		tfResul.setFont(new Font("Arial Black", Font.PLAIN, 16));
		tfResul.setBounds(109, 221, 125, 19);
		contentPane.add(tfResul);
		tfResul.setColumns(10);
	}
}
