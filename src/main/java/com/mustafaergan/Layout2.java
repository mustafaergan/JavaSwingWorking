package com.mustafaergan;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mustafa.ergan on 03.03.2017.
 */
public class Layout2 extends JFrame {



    public Layout2(Person person) {

        add(new JLabel(person.getName()));



    }
}
