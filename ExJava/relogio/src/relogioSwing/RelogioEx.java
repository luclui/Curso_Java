package relogioSwing;

import java.awt.EventQueue;

import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RelogioEx extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RelogioEx frame = new RelogioEx();
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
	public RelogioEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel ImgLabel = new JLabel("");
		ImgLabel.setIcon(new ImageIcon("C:\\Users\\lucas\\Downloads\\telaRelogio.png"));
		ImgLabel.setBounds(0, 0, 428, 366);
		contentPane.add(ImgLabel);
		
		JLabel LabelData = new JLabel("Data e Hora do sistema");
		LabelData.setHorizontalAlignment(SwingConstants.CENTER);
		LabelData.setFont(new Font("Tahoma", Font.PLAIN, 18));
		LabelData.setBounds(406, 0, 211, 63);
		contentPane.add(LabelData);
		
		JLabel LabelClique = new JLabel("Clique no botão");
		LabelClique.setHorizontalAlignment(SwingConstants.CENTER);
		LabelClique.setFont(new Font("Tahoma", Font.PLAIN, 16));
		LabelClique.setBounds(406, 60, 211, 36);
		contentPane.add(LabelClique);
		
		JButton btnHora = new JButton("Clique aqui");
		btnHora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date relogio = new Date();
				LabelClique.setText(relogio.toString());
				
				
			}
		});
		btnHora.setForeground(Color.BLACK);
		btnHora.setBackground(Color.GREEN);
		btnHora.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnHora.setBounds(416, 255, 191, 63);
		contentPane.add(btnHora);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{LabelData, ImgLabel, LabelClique, btnHora}));
	}
}
