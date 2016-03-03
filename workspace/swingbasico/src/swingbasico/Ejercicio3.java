package swingbasico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Dimension;

public class Ejercicio3 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldApellidos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 frame = new Ejercicio3();
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
	public Ejercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {100, 50, 50, 50, 50};
		gbl_panel.rowHeights = new int[] {50, 0, 30, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		panel.setLayout(gbl_panel);

		JLabel lblNewLabel_1 = new JLabel("Nombre");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);

		textFieldNombre = new JTextField();
		textFieldNombre.setMinimumSize(new Dimension(100, 20));
		textFieldNombre.setPreferredSize(new Dimension(100, 20));
		textFieldNombre.setSize(new Dimension(120, 50));
		GridBagConstraints gbc_textFieldNombre = new GridBagConstraints();
		gbc_textFieldNombre.anchor = GridBagConstraints.WEST;
		gbc_textFieldNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldNombre.gridx = 1;
		gbc_textFieldNombre.gridy = 0;
		panel.add(textFieldNombre, gbc_textFieldNombre);
		textFieldNombre.setColumns(10);

		JLabel lblSexo = new JLabel("sexo");
		GridBagConstraints gbc_lblSexo = new GridBagConstraints();
		gbc_lblSexo.anchor = GridBagConstraints.EAST;
		gbc_lblSexo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSexo.gridx = 2;
		gbc_lblSexo.gridy = 0;
		panel.add(lblSexo, gbc_lblSexo);

		JComboBox<String> comboBoxSexo = new JComboBox<String>();
		comboBoxSexo.setPreferredSize(new Dimension(100, 20));
		comboBoxSexo.setMinimumSize(new Dimension(100, 20));
		comboBoxSexo.setModel(new DefaultComboBoxModel<String>(new String[] {"Hombre", "Mujer"}));
		((DefaultComboBoxModel<String>)comboBoxSexo.getModel()).addElement("text");
		GridBagConstraints gbc_comboBoxSexo = new GridBagConstraints();
		gbc_comboBoxSexo.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxSexo.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxSexo.gridx = 3;
		gbc_comboBoxSexo.gridy = 0;
		panel.add(comboBoxSexo, gbc_comboBoxSexo);

		JLabel lblNewLabel = new JLabel("Apellidos");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		panel.add(lblNewLabel, gbc_lblNewLabel);

		textFieldApellidos = new JTextField();
		textFieldApellidos.setMinimumSize(new Dimension(100, 20));
		GridBagConstraints gbc_textFieldApellidos = new GridBagConstraints();
		gbc_textFieldApellidos.anchor = GridBagConstraints.WEST;
		gbc_textFieldApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldApellidos.gridx = 1;
		gbc_textFieldApellidos.gridy = 1;
		panel.add(textFieldApellidos, gbc_textFieldApellidos);
		textFieldApellidos.setColumns(10);

		JCheckBox chckbxRecibirPublicidad = new JCheckBox("recibir publicidad");
		GridBagConstraints gbc_chckbxRecibirPublicidad = new GridBagConstraints();
		gbc_chckbxRecibirPublicidad.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxRecibirPublicidad.gridwidth = 2;
		gbc_chckbxRecibirPublicidad.gridx = 1;
		gbc_chckbxRecibirPublicidad.gridy = 3;
		panel.add(chckbxRecibirPublicidad, gbc_chckbxRecibirPublicidad);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);

		JButton btnNewButton_3 = new JButton("Anterior");
		panel_1.add(btnNewButton_3);

		JButton btnNewButton_2 = new JButton("Actualizar");
		panel_1.add(btnNewButton_2);

		JButton btnNewButton_1 = new JButton("Insertar");
		panel_1.add(btnNewButton_1);

		JButton btnNewButton = new JButton("Siguiente");
		panel_1.add(btnNewButton);
	}

}
