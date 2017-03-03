package com.mustafaergan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mustafa.ergan on 03.03.2017.
 */

public class DemoJFileChooser extends JPanel
        implements ActionListener {
    JButton go;

    JFileChooser chooser;
    String choosertitle;

    public DemoJFileChooser() {
        go = new JButton("Seç");
        go.addActionListener(this);
        add(go);
    }

    public void actionPerformed(ActionEvent e) {
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle(choosertitle);
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooser.setAcceptAllFileFilterUsed(false);


        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            System.out.println("anaDizin: "
                    +  chooser.getCurrentDirectory());
            System.out.println("Seçilen : "
                    +  chooser.getSelectedFile());
        }
        else {
            System.out.println("seçim yok ");
        }
    }

    public Dimension getPreferredSize(){
        return new Dimension(200, 200);
    }
}