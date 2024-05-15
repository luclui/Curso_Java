package exGenio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaGenio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGenio frame = new TelaGenio();
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
	public TelaGenio() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\lucas\\OneDrive\\Imagens\\1680377.png"));
		setResizable(false);
		setFont(new Font("Arial Black", Font.BOLD, 20));
		setTitle("Jogo do Gênio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 813, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel ImgGenio = new JLabel("");
		ImgGenio.setIcon(new ImageIcon("C:\\Users\\lucas\\OneDrive\\Imagens\\1680377.png"));
		ImgGenio.setBounds(31, 134, 248, 256);
		contentPane.add(ImgGenio);
		
		JLabel lblAcerto = new JLabel("<html>Escolha um número de 1 a 5</html>");
		lblAcerto.setFont(new Font("Javanese Text", Font.PLAIN, 20));
		lblAcerto.setBounds(320, 52, 181, 133);
		contentPane.add(lblAcerto);
		
		JLabel ImgBalao = new JLabel("");
		ImgBalao.setIcon(new ImageIcon("C:\\Users\\lucas\\OneDrive\\Imagens\\balaoo.png"));
		ImgBalao.setBounds(261, -11, 256, 256);
		contentPane.add(ImgBalao);
		
		JSpinner spNum = new JSpinner();
		spNum.setFont(new Font("Tahoma", Font.PLAIN, 18));
		spNum.setBounds(597, 79, 74, 45);
		contentPane.add(spNum);
		
		JButton bntConsul = new JButton("Adivinhe");
		bntConsul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num = 1 + Math.random() * (6-1);
				int valor = (int)num;
				//System.out.println(valor);
				int numAdivinha = (int) spNum.getValue();
				if (valor == numAdivinha) {
					lblAcerto.setText("<html>Você acertou o número era "+ valor+"</html>"); 
				}
				else {
					lblAcerto.setText("<html> Você errou o número era "+ valor+"</html>");
				}
			}
		});
		bntConsul.setBackground(new Color(0, 191, 255));
		bntConsul.setFont(new Font("Javanese Text", Font.PLAIN, 18));
		bntConsul.setBounds(569, 212, 137, 45);
		contentPane.add(bntConsul);
	}
}
