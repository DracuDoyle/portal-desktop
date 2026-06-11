package com.portal.ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.FlowLayout;



public class ReceivePanel extends JPanel {


    private JLabel statusLabel;
    private JLabel subLabel;
    private JButton acceptButton;
    private JButton rejectButton;


    public ReceivePanel() {
        setLayout( new BorderLayout() );
        this.initComponents();
    }


    private void initComponents() {

        statusLabel = new JLabel( "Esperando transferencia...", SwingConstants.CENTER );
        subLabel = new JLabel( "El celular debe conectarse a esta IP", SwingConstants.CENTER );

        acceptButton = new JButton( "Aceptar" );
        rejectButton = new JButton( "Rechazar" );
        acceptButton.setEnabled( false );
        rejectButton.setEnabled( false );

        JPanel buttonPanel = new JPanel( new FlowLayout( FlowLayout.CENTER ) );
        buttonPanel.add( acceptButton );
        buttonPanel.add( rejectButton );

        add( statusLabel, BorderLayout.NORTH );
        add( subLabel, BorderLayout.CENTER );
        add( buttonPanel, BorderLayout.SOUTH );

    }


}
