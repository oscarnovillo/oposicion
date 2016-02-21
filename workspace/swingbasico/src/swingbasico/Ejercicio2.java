package swingbasico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 frame = new Ejercicio2();
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
	public Ejercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(65, 44, 253, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnACelsius = new JRadioButton("a celsius");
		buttonGroup.add(rdbtnACelsius);
		rdbtnACelsius.setBounds(53, 97, 109, 23);
		contentPane.add(rdbtnACelsius);
		
		JRadioButton rdbtnAFarenheit = new JRadioButton("a farenheit");
		buttonGroup.add(rdbtnAFarenheit);
		rdbtnAFarenheit.setBounds(164, 97, 109, 23);
		contentPane.add(rdbtnAFarenheit);
		
		JLabel lblResultado = new JLabel("resultado");
		lblResultado.setBounds(143, 160, 46, 14);
		contentPane.add(lblResultado);
		
		JLabel resultado = new JLabel("");
		resultado.setBounds(201, 160, 46, 14);
		contentPane.add(resultado);
		
		JButton btnCalcular = new JButton("calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnCalcular.setBounds(117, 126, 89, 23);
		contentPane.add(btnCalcular);
	}
}
