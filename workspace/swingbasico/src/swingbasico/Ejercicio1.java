package swingbasico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Ejercicio1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 frame = new Ejercicio1();
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
	public Ejercicio1() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setContentPane(contentPane);
		contentPane.setLayout(null);
		btnNewButton = new JButton("New button");
		
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String text = "";
				try {
					int num = Integer.parseInt(textField.getText());

					text = (num % 2) == 0 ? "par" : "impar";

				/*	if ((num % 2) == 0) {
						text = "par";
					} else {
						text = "impar";
					}*/

					JOptionPane.showMessageDialog(rootPane, text);
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, " no es un numero");
				}

			}
		});

		btnNewButton.setBounds(93, 45, 89, 54);

		contentPane.add(btnNewButton);

		textField = new JTextField();
		textField.setBounds(78, 11, 104, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(202, 166, 46, 14);
		contentPane.add(lblNewLabel);
	}
}
