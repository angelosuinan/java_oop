/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suinanAALabExer506;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class suinanAALabExer5062 extends Frame implements ActionListener{
    Button b1,b2;
    Choice entree, dessert;
    List beverage;
        
    public suinanAALabExer5062() {
        entree = new Choice();
        entree.addItem("Golden Fried Shrimp");
        entree.addItem("Beef with Oyster Sauce");
        entree.addItem("Calamares");
        entree.addItem("Chicken Curry");
         entree.addItem("Lengua");
        dessert = new Choice();
        dessert.addItem("Blueberry Cheesecake");
        dessert.addItem("Apple Pie");
        dessert.addItem("Sansrival");
        dessert.addItem("Leche Flan");
        dessert.addItem("Chocolate Mousse");
        beverage = new List(0,false);
        beverage.addItem("Beers");
        beverage.addItem("Rhum");
        beverage.addItem("Wines");
        beverage.addItem("Coffee/Tea");
        beverage.addItem("Juices");
        beverage.addItem("Vodka");
        beverage.addItem("Zombie");
        beverage.addItem("Mineral Water");
        b1 = new Button("Done");
        b2 = new Button("Exit");
        Panel p = new Panel();
        p.setLayout(new GridLayout(4,1));
        p.add(entree);
        p.add(dessert);
        p.add(b1);
        p.add(b2);
        add("West",p);
        add("Center",beverage);
        pack();
        show();
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        b1.addActionListener(this);
        b2.addActionListener(this);
     }
    
    public static void main(String[] args) {
        new suinanAALabExer5062();
    }
    
    public void actionPerformed (ActionEvent e) {
        if(e.getSource() == b1){
            try{
                String msg = "You have selected " + entree.getItem(entree.getSelectedIndex())
                + ", " + dessert.getItem(dessert.getSelectedIndex()) + " and " 
                + beverage.getItem(beverage.getSelectedIndex());
                JOptionPane.showMessageDialog(null, msg);
            }catch(ArrayIndexOutOfBoundsException er){
                JOptionPane.showMessageDialog(null, "Select your beverage");
            }
        } else if(e.getSource() == b2){
            int x = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?","WARNING", JOptionPane.OK_CANCEL_OPTION);
            if( x == 0){
                System.exit(0);
            }
        } 
    }
}
