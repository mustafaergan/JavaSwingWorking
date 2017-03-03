package com.mustafaergan;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mustafa.ergan on 03.03.2017.
 */
public class GrdLAyout extends JFrame {


    public GrdLAyout(){
        GridLayout gridLayout = new GridLayout(4,2,10,10);

        setLayout(gridLayout);

        add(new JLabel("isim1"));
        add(new JLabel("soyisim1"));

        add(new JLabel("isim2"));
        add(new JLabel("soyisim2"));

        add(new JLabel("isim3"));
        add(new JLabel("soyisim3"));

        add(new JLabel("isim4"));
        add(new JLabel("soyisim4"));

    }
}
