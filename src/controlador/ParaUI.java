package controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Almacen;
import modelo.Cliente;
import vista.UI;

public class ParaUI extends UI {
	Cliente cliente = null;
	Almacen almacen = new Almacen("Cliente.data");

	public ParaUI() {
		mntmAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout) contentPane.getLayout()).show(contentPane, "name_33705153863404");
			}
		});

		btnAgregarAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtNombreAlta.getText().isEmpty() || !txtDireccionAlta.getText().isEmpty()) {
					String nombre = txtNombreAlta.getText();
					Almacen almacen = new Almacen("cliente.data");
					Cliente cliente = new Cliente(txtNombreAlta.getText(), txtDireccionAlta.getText());
					almacen.almacena(cliente);
					lblMensajeAlta.setText(txtNombreAlta.getText() + " ha sido agregado");
					txtNombreAlta.setText(null);
					txtDireccionAlta.setText(null);
					;
				} else {
					lblMensajeAlta.setText("Rellene los campos para agregar");
				}
			}
		});

		mntmConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBoxNombreConsulta.getItemCount() > 0) {
					comboBoxNombreConsulta.removeAllItems();
				}
				System.out.println(comboBoxNombreConsulta.getItemCount());
				int i = 0;
				cliente = (Cliente) almacen.recuperar(i);
				while (cliente != null) {
					comboBoxNombreConsulta.addItem(cliente.getNombre());
					comboBoxNombreConsulta.setSelectedItem(i);
					comboBoxNombreConsulta.getSelectedIndex();
					i++;
					cliente = (Cliente) almacen.recuperar(i);
				}
				((CardLayout) contentPane.getLayout()).show(contentPane, "name_33721800700703");
			}
		});

		comboBoxNombreConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Verificar que el JComboBox no este vacio para evitar un NullPointerException
				if (comboBoxNombreConsulta.getItemCount() > 0) {
					comboBoxNombreConsulta.getSelectedItem();
					cliente = (Cliente) almacen.recuperar(comboBoxNombreConsulta.getSelectedIndex());
					txtDireccionConsulta.setText(cliente.getDireccion());
				}
			}
		});

	}
}
