package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Vector;

public class Gui {
    private String data[][];
    private Formula1ChampionshipManager obj;
    private JFrame frame;
    private JTable table;
    private JButton sort_by_points, sort_by_first_position, generate_random_race, generate_random_race_advance, sort_by_race_date, search_by_driver_name;
    private JTextField search_text;
    private JPanel panel;

    Gui(String data[][], Formula1ChampionshipManager obj){
        this.obj = obj;
        this.data = data;

    }

    public void initComponents(){
        frame = new JFrame();

        sort_by_points = new JButton("Sort By Points");
        sort_by_first_position = new JButton("Sort By First Position");
        generate_random_race = new JButton("Generate Random Race");
        generate_random_race_advance = new JButton("Generate Random Race Advance");
        sort_by_race_date = new JButton("Sort By Race Date");
        search_by_driver_name = new JButton("Search By Driver Name");

        sort_by_points.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){ sort_by_points_btn_action();}
        });

        sort_by_first_position.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sort_by_first_position_btn_action();
            }
        });

        generate_random_race.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generate_random_race_btn_action();
            }
        });

        generate_random_race_advance.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generate_random_race_advance_btn_action();
            }
        });

        sort_by_race_date.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sort_by_race_date_btn_action();
            }
        });

        search_by_driver_name.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                search_by_driver_name_btn_action();
            }
        });

        search_text = new JTextField(35);
        panel = new JPanel();



        table = new JTable();
        table.setBounds(40, 40, 400, 500);
        table.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Name", "Location", "Team", "First Position", "Second Position", "Third Position", "Points", "Races"
                }
        ));
        JScrollPane sp = new JScrollPane(table);

        panel.add(sort_by_points);
        panel.add(sort_by_first_position);
        panel.add(generate_random_race);
        panel.add(generate_random_race_advance);
        panel.add(sort_by_race_date);
        panel.add(search_by_driver_name);
        panel.add(search_text);
        panel.add(sp);
        panel.setSize(new Dimension(530, 600));

        frame.add(panel);
        frame.setSize(530, 600);

        frame.setResizable(false);
        frame.setVisible(true);

        loadTable();
    }

    private void loadTable() {
        DefaultTableModel dtm = (DefaultTableModel) this.table.getModel();
        dtm.setRowCount(0);

        for (int i = 0; i < data.length; i++) {
            Vector vector = new Vector();
            vector.add(data[i][0]);
            vector.add(data[i][1]);
            vector.add(data[i][2]);
            vector.add(data[i][3]);
            vector.add(data[i][4]);
            vector.add(data[i][5]);
            vector.add(data[i][6]);
            vector.add(data[i][7]);

            dtm.addRow(vector);
        }
    }

    private void sort_by_points_btn_action() {
        this.obj.sort_list_ascending();
        this.data = this.obj.get_data_to_gui();
        loadTable();
    }

    private void sort_by_first_position_btn_action() {
        this.obj.sort_list_ascending_by_position();
        this.data = this.obj.get_data_to_gui();
        loadTable();
    }

    private void generate_random_race_btn_action() {
        this.obj.generate_random_race();
        this.data = this.obj.get_data_to_gui();
        loadTable();
    }

    private void generate_random_race_advance_btn_action() {
        this.obj.generate_random_race();
        this.data = this.obj.get_data_to_gui();
        loadTable();
    }

    private void sort_by_race_date_btn_action() {
        this.obj.sort_list_ascending_by_date();
        this.data = this.obj.get_data_to_gui();
        loadTable();
    }

    private void search_by_driver_name_btn_action() {
        this.data = this.obj.display_driver_by_name(search_text.getText());
        loadTable();
    }

}

