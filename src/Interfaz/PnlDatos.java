/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.swing.JOptionPane;

/**
 *
 * @author Diana
 */
public class PnlDatos extends JPanel implements ActionListener {

    private JTextField txtDatos;
    FrmPrincipal frmPrincipal;

    public PnlDatos(FrmPrincipal frm) {
        frmPrincipal = frm;
        inicializarControles();
    }

    private void inicializarControles() {
        setLayout(new GridLayout(1, 4));

        txtDatos = new JTextField();
        txtDatos.setColumns(3);

        add(txtDatos);

    }

    public void insertarNumero(String num) {
        txtDatos.setText(txtDatos.getText() + num);
    }

    public void limpiarTexto() {
        txtDatos.setText("");
    }

    public void evaluarExpresion() {
        try {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("js");
            if (!txtDatos.getText().isEmpty()) {
                Object resultado = engine.eval(txtDatos.getText());
                txtDatos.setText(String.valueOf(resultado));
            } else {
                JOptionPane.showMessageDialog(frmPrincipal, "Ingrese datos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frmPrincipal, "Ocurrió un error ejecutando la aplicación " + e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frmPrincipal.calcularDatos(e.getActionCommand());
    }
}
