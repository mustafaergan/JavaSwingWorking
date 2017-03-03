package com.mustafaergan;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mustafa.ergan on 03.03.2017.
 */
public class FlwLayout extends JFrame{

    public FlwLayout(){
        FlowLayout flowLayout = new FlowLayout(FlowLayout.RIGHT,25,50);

        setLayout(flowLayout);

        add(new JLabel("isim1"));
        add(new JLabel("soyisim1"));


        add(new JLabel("isim2"));
        add(new JLabel("soyisim2"));

    }

}
