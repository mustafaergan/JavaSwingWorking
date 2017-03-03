package com.mustafaergan;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mustafa.ergan on 03.03.2017.
 */
public class YardimciSiniflarFont extends JFrame {

    public YardimciSiniflarFont(){
        JButton button = new JButton("Center");
        Font font = new Font("Verdana",Font.ITALIC,24);
        button.setFont(font);
        add(button);

    }
}
