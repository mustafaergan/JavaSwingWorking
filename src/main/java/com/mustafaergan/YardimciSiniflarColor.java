package com.mustafaergan;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mustafa.ergan on 03.03.2017.
 */
public class YardimciSiniflarColor extends JFrame {

    public YardimciSiniflarColor(){
        JButton button = new JButton("Center");
        Color renk = new Color(150,100,150);
        button.setBackground(renk);
        add(button);

    }
}
