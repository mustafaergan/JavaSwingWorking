package com.mustafaergan;

import javax.swing.*;

/**
 * Created by mustafa.ergan on 03.03.2017.
 */
public class Ikonlar extends JFrame {

    public Ikonlar(){

        ImageIcon icon = new ImageIcon(getClass().getResource("/icon/icon.jpg"));
        add(new JButton(icon));


    }
}
