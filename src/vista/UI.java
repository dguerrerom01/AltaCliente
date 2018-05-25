package vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class UI extends JFrame {

	protected JPanel contentPane;
	protected JTextField txtNombreAlta;
	protected JTextField txtDireccionAlta;
	protected JLabel lblMensajeAlta;
	protected JButton btnAgregarAlta;
	protected JButton btnBusqueda;
	protected JTextPane txtDireccionConsulta;
	protected JComboBox comboBoxNombreConsulta;
	protected JMenuItem mntmAlta;
	protected JMenuItem mntmConsulta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
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
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mntmAlta = new JMenuItem("Alta");
		menuBar.add(mntmAlta);

		mntmConsulta = new JMenuItem("Consulta");
		menuBar.add(mntmConsulta);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		JPanel Alta = new JPanel();
		contentPane.add(Alta, "name_33705153863404");
		GridBagLayout gbl_Alta = new GridBagLayout();
		gbl_Alta.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_Alta.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gbl_Alta.columnWeights = new double[] { 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_Alta.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		Alta.setLayout(gbl_Alta);

		JLabel lblNombreAlta = new JLabel("Nombre:");
		lblNombreAlta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNombreAlta = new GridBagConstraints();
		gbc_lblNombreAlta.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreAlta.gridx = 0;
		gbc_lblNombreAlta.gridy = 0;
		Alta.add(lblNombreAlta, gbc_lblNombreAlta);

		txtNombreAlta = new JTextField();
		txtNombreAlta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_txtNombreAlta = new GridBagConstraints();
		gbc_txtNombreAlta.insets = new Insets(0, 0, 5, 0);
		gbc_txtNombreAlta.gridwidth = 3;
		gbc_txtNombreAlta.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombreAlta.gridx = 0;
		gbc_txtNombreAlta.gridy = 1;
		Alta.add(txtNombreAlta, gbc_txtNombreAlta);
		txtNombreAlta.setColumns(10);

		JLabel lblDireccionAlta = new JLabel("Direcci\u00F3n:");
		lblDireccionAlta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblDireccionAlta = new GridBagConstraints();
		gbc_lblDireccionAlta.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccionAlta.gridx = 0;
		gbc_lblDireccionAlta.gridy = 2;
		Alta.add(lblDireccionAlta, gbc_lblDireccionAlta);

		txtDireccionAlta = new JTextField();
		txtDireccionAlta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_txtDireccionAlta = new GridBagConstraints();
		gbc_txtDireccionAlta.insets = new Insets(0, 0, 5, 0);
		gbc_txtDireccionAlta.gridwidth = 3;
		gbc_txtDireccionAlta.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDireccionAlta.gridx = 0;
		gbc_txtDireccionAlta.gridy = 3;
		Alta.add(txtDireccionAlta, gbc_txtDireccionAlta);
		txtDireccionAlta.setColumns(10);

		btnAgregarAlta = new JButton("Agregar");
		btnAgregarAlta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnAgregarAlta = new GridBagConstraints();
		gbc_btnAgregarAlta.insets = new Insets(0, 0, 5, 0);
		gbc_btnAgregarAlta.gridx = 2;
		gbc_btnAgregarAlta.gridy = 4;
		Alta.add(btnAgregarAlta, gbc_btnAgregarAlta);

		lblMensajeAlta = new JLabel(" ");
		GridBagConstraints gbc_lblMensajeAlta = new GridBagConstraints();
		gbc_lblMensajeAlta.gridwidth = 3;
		gbc_lblMensajeAlta.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblMensajeAlta.insets = new Insets(0, 0, 0, 5);
		gbc_lblMensajeAlta.gridx = 0;
		gbc_lblMensajeAlta.gridy = 5;
		Alta.add(lblMensajeAlta, gbc_lblMensajeAlta);

		JPanel Consulta = new JPanel();
		contentPane.add(Consulta, "name_33721800700703");
		GridBagLayout gbl_Consulta = new GridBagLayout();
		gbl_Consulta.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_Consulta.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gbl_Consulta.columnWeights = new double[] { 1.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_Consulta.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		Consulta.setLayout(gbl_Consulta);

		JLabel lblNombreConsulta = new JLabel("Nombre:");
		lblNombreConsulta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNombreConsulta = new GridBagConstraints();
		gbc_lblNombreConsulta.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreConsulta.gridx = 0;
		gbc_lblNombreConsulta.gridy = 0;
		Consulta.add(lblNombreConsulta, gbc_lblNombreConsulta);

		comboBoxNombreConsulta = new JComboBox();
		comboBoxNombreConsulta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_comboBoxNombreConsulta = new GridBagConstraints();
		gbc_comboBoxNombreConsulta.gridwidth = 2;
		gbc_comboBoxNombreConsulta.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxNombreConsulta.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxNombreConsulta.gridx = 0;
		gbc_comboBoxNombreConsulta.gridy = 1;
		Consulta.add(comboBoxNombreConsulta, gbc_comboBoxNombreConsulta);

		btnBusqueda = new JButton("B");
		btnBusqueda.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnBusqueda = new GridBagConstraints();
		gbc_btnBusqueda.insets = new Insets(0, 0, 5, 0);
		gbc_btnBusqueda.gridx = 2;
		gbc_btnBusqueda.gridy = 1;
		Consulta.add(btnBusqueda, gbc_btnBusqueda);

		JLabel lblDireccionConsulta = new JLabel("Direcci\u00F3n:");
		lblDireccionConsulta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblDireccionConsulta = new GridBagConstraints();
		gbc_lblDireccionConsulta.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccionConsulta.gridx = 0;
		gbc_lblDireccionConsulta.gridy = 2;
		Consulta.add(lblDireccionConsulta, gbc_lblDireccionConsulta);

		txtDireccionConsulta = new JTextPane();
		txtDireccionConsulta.setEditable(false);
		txtDireccionConsulta.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtDireccionConsulta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDireccionConsulta.setBackground(Color.WHITE);
		txtDireccionConsulta.setForeground(Color.BLACK);
		GridBagConstraints gbc_txtDireccionConsulta = new GridBagConstraints();
		gbc_txtDireccionConsulta.gridwidth = 3;
		gbc_txtDireccionConsulta.insets = new Insets(0, 0, 0, 5);
		gbc_txtDireccionConsulta.fill = GridBagConstraints.BOTH;
		gbc_txtDireccionConsulta.gridx = 0;
		gbc_txtDireccionConsulta.gridy = 3;
		Consulta.add(txtDireccionConsulta, gbc_txtDireccionConsulta);

	}

}
