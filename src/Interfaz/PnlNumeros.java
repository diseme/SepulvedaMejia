/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Diana
 */
public class PnlNumeros extends JPanel implements ActionListener {

    private JButton btn0;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnPunto;
    private JButton btnSumar;
    private JButton btnRestar;
    private JButton btnMultiplicar;
    private JButton btnDividir;
    private JButton btnIgual;
    private JButton btnLimpiar;
    FrmPrincipal frmPrincipal;

    public PnlNumeros(FrmPrincipal frm) {
        frmPrincipal = frm;
        inicializarControles();
    }

    private void inicializarControles() {

        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn0 = new JButton("0");
        btnPunto = new JButton(".");
        btnSumar = new JButton("+");
        btnRestar = new JButton("-");
        btnMultiplicar = new JButton("*");
        btnDividir = new JButton("/");
        btnIgual = new JButton("=");
        btnLimpiar = new JButton("Limpiar Datos");

        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        setLayout(gridbag);

        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth = 4;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gridbag.setConstraints(btn7, gbc);
        add(btn7);
        gridbag.setConstraints(btn8, gbc);
        add(btn8);
        gridbag.setConstraints(btn9, gbc);
        add(btn9);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gridbag.setConstraints(btnDividir, gbc);
        add(btnDividir);

        gbc.gridwidth = 4;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gridbag.setConstraints(btn4, gbc);
        add(btn4);
        gridbag.setConstraints(btn5, gbc);
        add(btn5);
        gridbag.setConstraints(btn6, gbc);
        add(btn6);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gridbag.setConstraints(btnMultiplicar, gbc);
        add(btnMultiplicar);

        gbc.gridwidth = 4;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gridbag.setConstraints(btn1, gbc);
        add(btn1);
        gridbag.setConstraints(btn2, gbc);
        add(btn2);
        gridbag.setConstraints(btn3, gbc);
        add(btn3);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gridbag.setConstraints(btnRestar, gbc);
        add(btnRestar);

        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        gbc.weightx = 1.0;
        gbc.gridwidth = 8;
        gridbag.setConstraints(btn0, gbc);
        add(btn0);
        gridbag.setConstraints(btnPunto, gbc);
        add(btnPunto);
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gridbag.setConstraints(btnSumar, gbc);
        add(btnSumar);

        gridbag.setConstraints(btnIgual, gbc);
        add(btnIgual);

        gridbag.setConstraints(btnLimpiar, gbc);
        add(btnLimpiar);

        btn7.addActionListener(PnlNumeros.this);
        btn8.addActionListener(PnlNumeros.this);
        btn9.addActionListener(PnlNumeros.this);
        btn4.addActionListener(PnlNumeros.this);
        btn5.addActionListener(PnlNumeros.this);
        btn6.addActionListener(PnlNumeros.this);
        btn1.addActionListener(PnlNumeros.this);
        btn2.addActionListener(PnlNumeros.this);
        btn3.addActionListener(PnlNumeros.this);
        btn0.addActionListener(PnlNumeros.this);
        btnPunto.addActionListener(PnlNumeros.this);
        btnSumar.addActionListener(PnlNumeros.this);
        btnRestar.addActionListener(PnlNumeros.this);
        btnMultiplicar.addActionListener(PnlNumeros.this);
        btnDividir.addActionListener(PnlNumeros.this);
        btnIgual.addActionListener(PnlNumeros.this);
        btnLimpiar.addActionListener(PnlNumeros.this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        frmPrincipal.calcularDatos(e.getActionCommand());
    }
}
