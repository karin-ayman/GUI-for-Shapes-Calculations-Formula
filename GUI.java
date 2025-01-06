package oop_project;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import oop_project.Drawable;
import oop_project.Circle;
import oop_project.Cube;
import oop_project.Oop_project;
import oop_project.GUI;
import oop_project.Circle;
import oop_project.Cube;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class GUI extends JFrame {
    
	   private static final long serialVersionUID = 1L;
	    private JPanel contentPane;
	    private JTextField total_area;
	    private JLabel lblNewLabel_1;
	    private JTextField total_perimeter;
	    private JLabel lblNewLabel_3;
	    private JTextField circle_area;
	    private JTextField cube_area;
	    private JTextField circle_per;
	    private JTextField cube_per;
	    private JTextField cube_volum;
	    private JLabel lblNewLabel_4;
	    private JLabel lblNewLabel_5;
	    private JLabel lblNewLabel_6;
	    private JLabel lblNewLabel_7;
	    private JLabel lblNewLabel_8;

	    /**
	     * Launch the application.
	     */
	    public static void main(String[] args) {
	        EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                try {
	                    GUI frame = new GUI();
	                    frame.setVisible(true);
	                } catch (Exception e) {
	                    e.printStackTrace();
	                }
	            }
	        });
	        //new GUI_Project().show();
	    }

	    /**
	     * Create the frame.
	     */
	    public GUI() {
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 790, 378);
	        contentPane = new JPanel();
	        contentPane.setFont(new Font("Tahoma", Font.PLAIN, 12));
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);
	        
	        lblNewLabel_1 = new JLabel("How many shapes do you want to calculate the area and perimeter for?");
	        lblNewLabel_1.setFont(new Font("Traditional Arabic", Font.BOLD, 23));
	        lblNewLabel_1.setBackground(new Color(51, 102, 102));
	        lblNewLabel_1.setForeground(new Color(0, 0, 0));
	        lblNewLabel_1.setBounds(10, 52, 766, 50);
	        contentPane.add(lblNewLabel_1);
	        
	        JLabel lblNewLabel = new JLabel("The shaps");
	        lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 29));
	        lblNewLabel.setBounds(309, 3, 169, 39);
	        lblNewLabel.setToolTipText("");
	        contentPane.add(lblNewLabel);
	        
	        JTextArea textArea = new JTextArea();
	        textArea.setBounds(209, 88, 94, 39);
	        contentPane.add(textArea);
	        
	        JButton btnNewButton = new JButton("next..");
	        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
	        btnNewButton.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		double CircleAreaSum = 0;
	                double CubeAreaSum = 0;
	                double CirclePerimeterSum = 0;
	                double CubePerimeterSum = 0;
	                double CubeVolumSum = 0;
	                
	                Drawable[] arr;
	                
					String input = textArea.getText();
					int n = Integer.parseInt(input);
	                arr = new Drawable[n];
	                if (n < 2) {
	                	JOptionPane.showMessageDialog(null, "Size must be greater than 2.");
	                } else {
	                    for (int i = 0; i < arr.length; i++) {
	                        String type = JOptionPane.showInputDialog(null, "enter type");
	                        String S_dim = JOptionPane.showInputDialog(null, "enter dim");
	                        double dim = Double.parseDouble(S_dim);
	                        switch (type.toLowerCase()) {
	                            case "circle":
	                                arr[i] = new Circle(dim);
	                                CircleAreaSum += ((Circle) arr[i]).getArea();
	                                CirclePerimeterSum += ((Circle) arr[i]).getPerimeter();
	                                break;
	                            case "cube":
	                                arr[i] = new Cube(dim);
	                                CubeAreaSum += ((Cube) arr[i]).getArea();
	                                CubePerimeterSum += ((Cube) arr[i]).getPerimeter();
	                                CubeVolumSum += ((Cube) arr[i]).getVolum();
	                                break;
	                            default: {
	                            	JOptionPane.showMessageDialog(null, "Size must be greater than 2.");
	                            }
	                        }
	                    }
	                    double totalArea=CircleAreaSum+CubeAreaSum;
	                    total_area.setText(Double.toString(totalArea));
	                    
	                    double totalPerameter=CirclePerimeterSum+CubePerimeterSum;
	                    total_perimeter.setText(Double.toString(totalPerameter));
	                    
	                    circle_area.setText(Double.toString(CircleAreaSum));
	                    cube_area.setText(Double.toString(CubeAreaSum));
	                    circle_per.setText(Double.toString(CirclePerimeterSum));
	                    cube_per.setText(Double.toString(CubePerimeterSum));
	                    cube_volum.setText(Double.toString(CubeVolumSum));
	                    
	                    
	                    
	                    
	                    
	                    
	                }
	        	}
	        });
	        btnNewButton.setBounds(402, 88, 149, 39);
	        JButton jButton = new JButton();
	        contentPane.add(btnNewButton);
			jButton.addActionListener(new ActionListener() {
	            

	            public void actionPerformed(ActionEvent e) {
	                
	            }
	        });
	        contentPane.add(btnNewButton);
	        
	        total_area = new JTextField();
	        total_area.setBounds(140, 285, 169, 39);
	        contentPane.add(total_area);
	        total_area.setColumns(10);
	        
	        JLabel lblNewLabel_2 = new JLabel("Total Area");
	        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
	        lblNewLabel_2.setBounds(10, 286, 156, 27);
	        contentPane.add(lblNewLabel_2);
	        
	        total_perimeter = new JTextField();
	        total_perimeter.setBounds(543, 285, 202, 39);
	        contentPane.add(total_perimeter);
	        total_perimeter.setColumns(10);
	        
	        lblNewLabel_3 = new JLabel("Total perimeter");
	        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
	        lblNewLabel_3.setBounds(364, 273, 169, 50);
	        contentPane.add(lblNewLabel_3);
	        
	        circle_area = new JTextField();
	        circle_area.setBounds(10, 226, 134, 19);
	        contentPane.add(circle_area);
	        circle_area.setColumns(10);
	        
	        cube_area = new JTextField();
	        cube_area.setBounds(178, 226, 96, 19);
	        contentPane.add(cube_area);
	        cube_area.setColumns(10);
	        
	        circle_per = new JTextField();
	        circle_per.setBounds(346, 226, 132, 19);
	        contentPane.add(circle_per);
	        circle_per.setColumns(10);
	        
	        cube_per = new JTextField();
	        cube_per.setBounds(516, 226, 96, 19);
	        contentPane.add(cube_per);
	        cube_per.setColumns(10);
	        
	        cube_volum = new JTextField();
	        cube_volum.setBounds(670, 226, 96, 19);
	        contentPane.add(cube_volum);
	        cube_volum.setColumns(10);
	        
	        lblNewLabel_4 = new JLabel("Area of circles");
	        lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
	        lblNewLabel_4.setBounds(0, 189, 106, 27);
	        contentPane.add(lblNewLabel_4);
	        
	        lblNewLabel_5 = new JLabel("Area of cubes");
	        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
	        lblNewLabel_5.setBounds(178, 196, 106, 13);
	        contentPane.add(lblNewLabel_5);
	        
	        lblNewLabel_6 = new JLabel("perimeter of circles");
	        lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
	        lblNewLabel_6.setBounds(324, 192, 145, 20);
	        contentPane.add(lblNewLabel_6);
	        
	        lblNewLabel_7 = new JLabel("perimeter of cubes");
	        lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 17));
	        lblNewLabel_7.setBounds(494, 197, 148, 19);
	        contentPane.add(lblNewLabel_7);
	        
	        lblNewLabel_8 = new JLabel("Volum of cubes");
	        lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 17));
	        lblNewLabel_8.setBounds(652, 199, 124, 13);
	        contentPane.add(lblNewLabel_8);
	        //contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel, textArea, btnNewButton, lblNewLabel_1, total_area, lblNewLabel_2, total_perimeter, lblNewLabel_3, circle_area, cube_area, circle_per, cube_per, cube_volum, lblNewLabel_4, lblNewLabel_5, lblNewLabel_6, lblNewLabel_7, lblNewLabel_8}));
	    }
	}
