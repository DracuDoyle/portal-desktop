package com.portal.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class MainWindow extends JFrame {
    
    public MainWindow() {
        setTitle( "Portal" );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setSize( 480, 600 );
        setResizable( false );
        setLocationRelativeTo( null );
        this.initUI();
    }

    private void initUI() {
        JPanel mainPanel = new JPanel( new BorderLayout() );
        setContentPane( mainPanel );
    }

    public void show() {
        setVisible( true );
    }

}
