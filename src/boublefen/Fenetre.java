package boublefen;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.EventListener;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.*;

public class Fenetre implements KeyListener,ActionListener
{
	JTextArea text=new JTextArea();
    JTextArea text1=new JTextArea();
    JButton button=new JButton();
    JLabel label;
    JLabel label1;

     //Constructeur
	 Fenetre(String nomFenetre)
	 {		
			    JFrame frame = new JFrame(nomFenetre);	    
			    label=new JLabel ("FRANCAIS");
			    label1=new JLabel ("MORSE CODE");
			    //JLabel label3=new JLabel("entrez les mots");
			    JLabel label4=new JLabel("traduction");
			    button=new JButton("<>");
			    text=new JTextArea();
			    Container contenu=frame.getContentPane();
	 
			    frame.setResizable(false);//ne pas agrandir
			    frame.setSize(800,550);			    
			    contenu.setLayout(null);
			    
			    label.setBounds(15, 50, 100, 20);
			    //label3.setBounds(20, 70, 200, 20);
			    text.setBounds(15, 70, 350, 350);
			    text.setFont(new Font("Arial", Font.BOLD, 20));
			    text.setBackground(Color.LIGHT_GRAY);
			    text.addKeyListener(this);
			    
			    text.setEnabled(true);
			    text.setEditable(true);
			    text.setLineWrap(true);//Retour à la ligne automatique.
			    
			    label1.setBounds(420, 50, 100, 20);
			    label4.setBounds(430, 70, 100, 20);
			    text1.setBounds(420, 70, 350, 350);
			    text1.setFont(new Font("Arial", Font.BOLD, 20));
			    text1.setBackground(Color.LIGHT_GRAY);
			    text1.setLineWrap(true);//Ajouter ligne automatique sur le JTextArea
			    text1.setEditable(false);//Ne pas autoriser à modifier le contenue de JTextArea
			    button.setBounds(373, 70, 40, 20);
			    button.setBackground(Color.LIGHT_GRAY);
			    button.addActionListener(this);
			    
			    contenu.add(button);
			    contenu.add(label);
			    //contenu.add(label3);
			    contenu.add(label4);
			    contenu.add(label1);
			    contenu.add(text);
			    contenu.add(text1);
			    frame.setVisible(true);
	 }
					//METHODE ABSTRAITE OBLIGATOIRE IMPLEMENTATION BY KEYLISTENER
				 	public void keyPressed(KeyEvent e){}
					public void keyTyped(KeyEvent e) {}
					public void keyReleased(KeyEvent e) 					
					{
						if(label.getText()=="FRANCAIS" && label1.getText()=="MORSE CODE")
						{
							text1.setText(Configuration.getCodeMorse(text.getText()));
						}
						else
						{
							text1.setText(Configuration.morseToEnglish(text.getText()));
						}

					}
				 	
					//METHODE ABSTRAITE BY ACTIONLISTENER
					public void actionPerformed(ActionEvent e) 
					{
						if(e.getSource()==button)
						{	
							if(label.getText()=="FRANCAIS"&&label1.getText()=="MORSE CODE")
							{
								label.setText("MORSE CODE");
								label1.setText("FRANCAIS");
								text.setText("");
								text1.setText("");
							}
							else
							{
								label.setText("FRANCAIS");
								label1.setText("MORSE CODE");
								text.setText("");
								text1.setText("");
							}
						}	
					}
}
	
	

	
