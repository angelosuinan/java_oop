
package suinanAALabExer507;



import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

class ConvertTemperatures extends Frame implements ActionListener, WindowListener {
        Label directions;
        TextField fahrenheit;
        Label celsius;
        Button b1, b2, b3;
        
        ConvertTemperatures(String s) {
            super(s);
            setSize(250,300);
            setLayout(new GridLayout(6,1));
            addWindowListener(this);
            directions = new Label("Enter temperature in Fahrenheit: ");
            add(directions);
            fahrenheit = new TextField(2);
            add(fahrenheit);
            fahrenheit.addActionListener(this);
            celsius = new Label("");
            celsius.setFont(new Font("TimesRoman 12 point bold.",20,20));
            add(celsius);
            b1 = new Button("Clear");
            b2 = new Button("Exit");
            b3 = new Button("Convert");
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            add(b3);
            add(b1);
            add(b2);
            show();
        }
        
    public void windowClosed(WindowEvent event) {}
    public void windowDeiconified(WindowEvent event) {}
    public void windowIconified(WindowEvent event) {}
    public void windowActivated(WindowEvent event) {}
    public void windowDeactivated(WindowEvent event) {}
    public void windowOpened(WindowEvent event) {}
    
    public void windowClosing(WindowEvent event)
    {
        System.exit(0);
    }
    
    public void actionPerformed(ActionEvent event) {
        if(event.getActionCommand().equals("Convert")){
            try{
            int f = Integer.parseInt(fahrenheit.getText());
            long c = Math.round(5.0*(f-32)/9.0);
            celsius.setText("Celsius: "+c+"\u00B0C");
            }catch(NumberFormatException er){
                JOptionPane.showMessageDialog(null, "Enter numbers only! Do not leave it empty before pressing the convert button!");
                fahrenheit.setText("");
                celsius.setText("");
            }
        } else if(event.getActionCommand().equals("Clear")){
            fahrenheit.setText("");
            celsius.setText("");
        } else if(event.getActionCommand().equals("Exit")){
            int x = JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING", JOptionPane.OK_CANCEL_OPTION);
            if(x == 0){
                System.exit(0);
            }
        }
    }
}

public class suinanAALabExer50702 {
    public static void main(String[] args) {
        new ConvertTemperatures("Example");
    }
}
