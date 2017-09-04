/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suinanAALabExer506;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author ASUS
 */
public class suinanAALabExer5063 extends Frame {
    Label statusLabel;
    public suinanAALabExer5063(String s) {
            super(s);
            statusLabel = new Label("Hello");
            add(statusLabel);
            setSize(200,200);
            MenuBar menu1 = new MenuBar();
            setMenuBar(menu1);
            //Main Menu
            Menu file_menu = new Menu("File");
            Menu edit_menu = new Menu("Edit");
            Menu help_menu = new Menu("Help");
            menu1.add(file_menu);
            menu1.add(edit_menu);
            menu1.add(help_menu);
            //File Sub-Menu
            MenuItem file1 = new MenuItem("New");
            MenuItem file2 = new MenuItem("Open");
            MenuItem file3 = new MenuItem("Save");
            MenuItem file4 = new MenuItem("Close");
            MenuItem file5 = new MenuItem("Exit");
            file_menu.add(file1);
            file_menu.add(file2);
            file_menu.add(file3);
            file_menu.add(file4);
            file_menu.addSeparator();
            file_menu.add(file5);
            //Edit Sub-Menu
            MenuItem edit1 = new MenuItem("Copy");
            MenuItem edit2 = new MenuItem("Cut");
            MenuItem edit3 = new MenuItem("Paste");
            MenuItem edit4 = new MenuItem("Undo");
            MenuItem edit5 = new MenuItem("Redo");
            Menu edit6 = new Menu("Clear");
            edit_menu.add(edit1);
            edit_menu.add(edit2);
            edit_menu.add(edit3);
            edit_menu.add(edit4);
            edit_menu.add(edit5);
            edit_menu.add(edit6);
            //Clear Sub-Menu
            MenuItem clear1 = new MenuItem("Contents");
            MenuItem clear2 = new MenuItem("Formats");
            edit6.add(clear1);
            edit6.add(clear2);
            //Help Sub-Menu
            MenuItem help1 = new MenuItem("Contents");
            MenuItem help2 = new MenuItem("Index");
            MenuItem help3 = new MenuItem("About");
            help_menu.add(help1);
            help_menu.add(help2);
            help_menu.addSeparator();
            help_menu.add(help3);
            show();
            addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e){
                    System.exit(0);
                }
            });
            MenuItemListener menuItemListener = new MenuItemListener();

            file_menu.addActionListener(menuItemListener);
            file_menu.setActionCommand("File");
            edit_menu.addActionListener(menuItemListener);
            edit_menu.setActionCommand("Edit");
            help_menu.addActionListener(menuItemListener);
            help_menu.setActionCommand("Help");
            edit6.addActionListener(menuItemListener);
            edit6.setActionCommand("File");
            
        }
    public static void main(String[] args) {
        suinanAALabExer5063 a = new suinanAALabExer5063("Sample Menu 1");
    }
    
    class MenuItemListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {            
            statusLabel.setText(e.getActionCommand() 
                + " MenuItem clicked.");
      }    
   }
}
