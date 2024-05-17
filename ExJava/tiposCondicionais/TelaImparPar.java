package tiposCondicionais;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaImparPar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaImparPar frame = new TelaImparPar();
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
	public TelaImparPar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 295, 223);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Coloque o número");
		lblTitulo.setFont(new Font("Arial", Font.PLAIN, 17));
		lblTitulo.setBounds(10, 19, 147, 41);
		contentPane.add(lblTitulo);
		
		txtNum = new JTextField();
		txtNum.setFont(new Font("Arial", Font.PLAIN, 17));
		txtNum.setBounds(167, 30, 92, 21);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		JLabel lblResul = new JLabel("Resultado");
		lblResul.setFont(new Font("Arial", Font.PLAIN, 17));
		lblResul.setBounds(102, 131, 78, 41);
		contentPane.add(lblResul);
		
		JButton btnCalcule = new JButton("Calcule");
		btnCalcule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(txtNum.getText());
				if (num%2 == 0) {
					lblResul.setText("Par")	;	
				}
				else {
					lblResul.setText("Ímpar");
				}
			}
		});
		btnCalcule.setFont(new Font("Arial", Font.PLAIN, 17));
		btnCalcule.setBounds(85, 84, 105, 21);
		contentPane.add(btnCalcule);
	}
}
