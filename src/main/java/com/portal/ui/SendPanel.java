package com.portal.ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridLayout;



public class SendPanel extends JPanel {


    private JLabel ipLabel;
    private JTextField ipField;
    private JLabel fileLabel;
    private JButton chooseButton;
    private JButton sendButton;


    public SendPanel() {
        setLayout( new GridLayout( 2, 3, 5, 5 ) );
        this.initComponents();
    }


    private void initComponents() {

        ipLabel = new JLabel( "IP del celular" );
        ipField = new JTextField( "192.168.100.X" );
        fileLabel = new JLabel( "Ningún archivo seleccionado" );
        chooseButton = new JButton( "Elegir archivo" );
        sendButton = new JButton( "Enviar" );

        add( ipLabel );
        add( ipField );
        add( new JLabel() );
        add( fileLabel );
        add( chooseButton );
        add( sendButton );
    
    }


}
