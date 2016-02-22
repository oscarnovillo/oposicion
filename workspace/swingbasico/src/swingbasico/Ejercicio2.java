package swingbasico;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Ejercicio2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel resultado;
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
		rdbtnACelsius.setActionCommand("celsius");
		buttonGroup.add(rdbtnACelsius);
		rdbtnACelsius.setBounds(53, 97, 109, 23);
		contentPane.add(rdbtnACelsius);

		JRadioButton rdbtnAFarenheit = new JRadioButton("a farenheit");
		rdbtnAFarenheit.setActionCommand("farenheit");
		buttonGroup.add(rdbtnAFarenheit);
		rdbtnAFarenheit.setBounds(164, 97, 109, 23);
		contentPane.add(rdbtnAFarenheit);

		JLabel lblResultado = new JLabel("resultado");
		lblResultado.setBounds(143, 160, 46, 14);
		contentPane.add(lblResultado);

		resultado = new JLabel("");
		resultado.setBounds(201, 160, 70, 14);
		contentPane.add(resultado);

		JButton btnCalcular = new JButton("calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clickCalcular(arg0);
			}
		});
		btnCalcular.setBounds(117, 126, 89, 23);
		contentPane.add(btnCalcular);
	}

	public void clickCalcular(ActionEvent arg0)
	{
		double num = 0;
		try {
			num = Double.parseDouble(textField.getText());
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(contentPane, " no es un numero");
		}

		if (buttonGroup.getSelection() != null) {
			if (buttonGroup.getSelection().getActionCommand().equals("celsius")) {
				num = ((num - 32) / 1.8);
			} else {
				num = ((num * 1.8) + 32);
			}
		} else {
			JOptionPane.showMessageDialog(contentPane, " elige una opcion ");
		}

		resultado.setText(String.format("%.2f", num));

	}

}
