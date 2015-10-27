/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Image;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

/**
 *
 * @author Diana
 */
public class FrmPrincipal extends JFrame implements ActionListener {

    PnlNumeros pnlNumeros = new PnlNumeros(this);
    PnlDatos pnlDatos = new PnlDatos(this);
    private JMenuBar barraMenu;
    private JMenu menu;

    public FrmPrincipal() {
        inicializarControles();
    }

    private void inicializarControles() {
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Recursos/calculator.png"));
        setIconImage(icono);

        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setSize(400, 230);
        setResizable(false);

        setLocationRelativeTo(null);

        barraMenu = new JMenuBar();
        menu = new JMenu("Opciones");
        JMenuItem menuBorrar = new JMenuItem("Borrar Datos");
        JMenuItem menuCerrar = new JMenuItem("Cerrar Aplicación");
        JMenuItem menuCreditos = new JMenuItem("Ver Créditos");
        menuBorrar.setActionCommand("Borrar");
        menuCerrar.setActionCommand("Cerrar");
        menuCreditos.setActionCommand("Creditos");
        menuBorrar.addActionListener(this);
        menuCerrar.addActionListener(this);
        menuCreditos.addActionListener(this);
        menu.add(menuBorrar);
        menu.add(menuCreditos);
        menu.add(menuCerrar);

        barraMenu.add(menu);
        setJMenuBar(barraMenu);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                cerrarAplicacion();
            }

        });

        setLayout(new BorderLayout());
        add(pnlDatos, BorderLayout.NORTH);
        add(pnlNumeros, BorderLayout.SOUTH);
    }

    public void cerrarAplicacion() {
        int respuesta = JOptionPane.showOptionDialog(this, "¿Está seguro de que desea cerrar la aplicación?", "Confirmación", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, new String[]{"si", "no"}, "default");

        if (respuesta == JOptionPane.OK_OPTION) {
            dispose();
        }
    }

    public void calcularDatos(String operacion) {

        try {
            switch (operacion) {
                case "0":
                    pnlDatos.insertarNumero("0");
                    break;
                case "1":
                    pnlDatos.insertarNumero("1");
                    break;
                case "2":
                    pnlDatos.insertarNumero("2");
                    break;
                case "3":
                    pnlDatos.insertarNumero("3");
                    break;
                case "4":
                    pnlDatos.insertarNumero("4");
                    break;
                case "5":
                    pnlDatos.insertarNumero("5");
                    break;
                case "6":
                    pnlDatos.insertarNumero("6");
                    break;
                case "7":
                    pnlDatos.insertarNumero("7");
                    break;
                case "8":
                    pnlDatos.insertarNumero("8");
                    break;
                case "9":
                    pnlDatos.insertarNumero("9");
                    break;
                case ".":
                    pnlDatos.insertarNumero(".");
                    break;
                case "+":
                    pnlDatos.insertarNumero("+");
                    break;
                case "-":
                    pnlDatos.insertarNumero("-");
                    break;
                case "*":
                    pnlDatos.insertarNumero("*");
                    break;
                case "/":
                    pnlDatos.insertarNumero("/");
                    break;
                case "=":
                    pnlDatos.evaluarExpresion();
                    break;
                case "Limpiar Datos":
                    pnlDatos.limpiarTexto();
                    break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error ejecutando la aplicación: " + e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Borrar":
                pnlDatos.limpiarTexto();
                break;
            case "Cerrar":
                cerrarAplicacion();
                break;
            case "Creditos":
                JOptionPane.showMessageDialog(this, "Proyecto de aula POO\nDiana Sepúlveda Mejía\nPolitécnico Grancolombiano\nVersión 1.0\n2015", "Créditos", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }
}
