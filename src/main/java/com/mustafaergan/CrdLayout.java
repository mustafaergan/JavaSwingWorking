package com.mustafaergan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mustafa.ergan on 03.03.2017.
 */
public class CrdLayout extends JFrame{

    CardLayout cardLayout;
    JPanel merkeziPanel;

    public CrdLayout(){

        cardLayout = new CardLayout();


        JPanel panelButton = new JPanel();
        JButton buttonKart1 = new JButton("Kart1");
        panelButton.add(buttonKart1);
        buttonKart1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(merkeziPanel,"panel1");
            }
        });

        JButton buttonKart2 = new JButton("Kart2");
        panelButton.add(buttonKart2);
        buttonKart2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(merkeziPanel,"panel2");
            }
        });


        merkeziPanel = new JPanel();
        merkeziPanel.setLayout(cardLayout);
        JLabel jLabel = new JLabel("1 panel");
        merkeziPanel.add(jLabel,"panel1");

        JLabel jLabel2 = new JLabel("2 panel");
        merkeziPanel.add(jLabel2,"panel2");


        setLayout(new BorderLayout());
        add(panelButton,BorderLayout.NORTH);
        add(merkeziPanel,BorderLayout.CENTER);
    }


}
