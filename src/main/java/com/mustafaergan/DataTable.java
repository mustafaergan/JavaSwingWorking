package com.mustafaergan;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mustafa.ergan on 03.03.2017.
 */
public class DataTable {

    public static void main(String args[]) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Object rowData[][] = { { "Row1-Column1", "Row1-Column2", "Row1-Column3" },
                { "Row2-Column1", "Row2-Column2", "Row2-Column3" } };
        Object columnNames[] = { "Column One", "Column Two", "Column Three" };
        JTable table = new JTable(rowData, columnNames);

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(300, 150);
        frame.setVisible(true);

    }

}
