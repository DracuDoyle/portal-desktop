package com.portal.ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridLayout;



public class ConfigPanel extends JPanel {


    private JLabel folderLabel;
    private JTextField folderField;
    private JButton folderButton;
    private JLabel portLabel;
    private JTextField portField;


    public ConfigPanel() {
        setLayout( new GridLayout( 2, 3, 5, 5 ) );
        this.initComponents();
    }


    private void initComponents() {

        folderLabel = new JLabel( "Carpeta destino" );
        folderField = new JTextField( "Selecciona una carpeta destino" );
        folderField.setEditable( false );
        folderButton = new JButton("Cambiar");
        portLabel = new JLabel( "Puerto" );
        portField = new JTextField( "8080" );

        add( folderLabel );
        add( folderField );
        add( folderButton );
        add( portLabel );
        add( portField );
        add( new JLabel() );

    }


}
