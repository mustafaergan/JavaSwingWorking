package com.mustafaergan;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mustafa.ergan on 03.03.2017.
 */
public class Karma extends JFrame {

    public Karma(){

        JPanel panelButton = new JPanel();
        panelButton.setLayout(new GridLayout(1,5));
        panelButton.add(new JLabel("1"));
        panelButton.add(new JLabel("2"));
        panelButton.add(new JLabel("3"));
        panelButton.add(new JLabel("4"));
        panelButton.add(new JLabel("5"));


        JPanel panelYorum = new JPanel();
        panelYorum.setLayout(new GridLayout(1,5));
        panelYorum.add(new JTextField(10));
        panelYorum.add(new JTextField(10));
        panelYorum.add(new JTextField(10));
        panelYorum.add(new JTextField(10));
        panelYorum.add(new JTextField(10));

        setLayout(new BorderLayout());


        add(panelButton,BorderLayout.NORTH);
        add(panelYorum,BorderLayout.CENTER);
    }
}
