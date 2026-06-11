package com.portal.ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;



public class ServerPanel extends JPanel {


    private JLabel statusLabel;
    private JLabel ipLabel;
    private JButton toggleButton;


    public ServerPanel() {
        setLayout( new FlowLayout( FlowLayout.LEFT ) );
        this.initComponents();
    }


    private void initComponents() {

        statusLabel = new JLabel( "Servidor detenido" );
        ipLabel = new JLabel( "IP: --" );
        toggleButton = new JButton( "Iniciar" );

        add( statusLabel );
        add( ipLabel );
        add( toggleButton );

    }

}
