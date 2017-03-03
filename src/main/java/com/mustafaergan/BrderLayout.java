package com.mustafaergan;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mustafa.ergan on 03.03.2017.
 */
public class BrderLayout extends JFrame {

    public BrderLayout(){


        BorderLayout layout = new BorderLayout(100,100);

        setLayout(layout);

        add(new JLabel("bati"),BorderLayout.WEST);
        add(new JLabel("güney"),BorderLayout.SOUTH);

        add(new JLabel("kuzey"),BorderLayout.NORTH);
        add(new JLabel("dogu"),BorderLayout.EAST);

        add(new JLabel("center"),BorderLayout.CENTER);


    }



}
