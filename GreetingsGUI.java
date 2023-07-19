
package za.ac.tut.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class GreetingsGUI extends JFrame
{
    //panel
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel nameAndSurnamePnl;
    private JPanel greetingsAreaPnl;
    private JPanel btnPnl;
    private JPanel mainPnl;
    private JPanel headingPnl;
    
    //labels
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    
    //textfields
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    
    //textarea
    private JTextArea greetingsTxtArea;
    
    //buttons
    private JButton greetBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    
     public GreetingsGUI() 
    {
        setLayout(new BorderLayout());
        setTitle("Greetings UI");
        setSize(600, 650);
        setBackground(Color.yellow);
        
        //create the panels
        namePnl = new JPanel(new FlowLayout());
        surnamePnl = new JPanel(new FlowLayout());
        
       nameAndSurnamePnl = new JPanel(new GridLayout(2,1));
       greetingsAreaPnl = new JPanel(new FlowLayout());
       greetingsAreaPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1), "Greetings"));
        
        btnPnl = new JPanel(new FlowLayout());
        mainPnl = new JPanel(new BorderLayout());
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        //Create labels
        headingLbl = new JLabel("Greetings App");
        nameLbl =  new JLabel     ("Name: "   );
        surnameLbl = new JLabel("Surname: ");
        
        //Create the texts fields
        nameTxtFld = new JTextField   (20);
        surnameTxtFld = new JTextField(20);
        
        
       //Create text area
       greetingsTxtArea = new JTextArea(40,50);
       greetingsTxtArea.setEditable(false);
       greetingsTxtArea.setText("Hello [name] [surname]");
       
       //Create the buttons
       greetBtn = new JButton("Greet");
       clearBtn = new JButton("Clear");
       exitBtn = new JButton("Exit");
       
       //Add name label and textfield to the name panel
       namePnl.add(nameLbl);
       namePnl.add(nameTxtFld);
       
       //Add surname label and textfield to the panel
       surnamePnl.add(surnameLbl);
       surnamePnl.add(surnameTxtFld);
       
       //Add name and surname panel to the panel that hold them both
       nameAndSurnamePnl.add(namePnl);
       nameAndSurnamePnl.add(surnamePnl);
       
       //Add greetings area to the its panel
       greetingsAreaPnl.add(greetingsTxtArea);
       
       //Add buttons to thier panels
       btnPnl.add(greetBtn);
       btnPnl.add(clearBtn);
       btnPnl.add(exitBtn);
       
       //Add all panels to the main panels
       mainPnl.add(nameAndSurnamePnl, BorderLayout.NORTH);
       mainPnl.add(greetingsAreaPnl, BorderLayout.CENTER);
       mainPnl.add(btnPnl, BorderLayout.SOUTH);
       
       //Add the main panel to the frame's panel
       add(headingPnl, BorderLayout.NORTH);
       add(mainPnl, BorderLayout.CENTER);
       
       //Make the frame visible
        setVisible(true);
        
        
    }
    
    
    
    
    

   
    
}
