package napantivirus;
//*************************************** $E-Security$ *****************************************************************************
//
//
//								Author-Pravin H. Rane
//********************************************************************************************************************************





import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.applet.AppletContext.*;
import java.util.*;
import javax.swing.event.*;
import java.lang.reflect.*;
import javax.swing.border.*;
import javax.swing.plaf.basic.*;
import  java.awt.image.ImageConsumer ;
import java.awt.image.ImageObserver; 
import   java.applet.AudioClip;
import javax.swing.filechooser.FileView;
import java.net.*;
import javax.swing.plaf.*; 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.applet.AppletContext.*;
import java.util.*;
import javax.swing.event.*;
import java.lang.reflect.*;
import javax.swing.border.*;
import javax.swing.plaf.basic.*;
import  java.awt.image.ImageConsumer ;
import java.awt.image.ImageObserver; 
import   java.applet.AudioClip;
import javax.swing.filechooser.FileView;
import java.net.*;
import java.util.zip.*; 



class autorunFound extends JWindow
{
Container cp;
autorunFound(String root)
{
		
		File ff=new File(root+"autorun.inf");
		File ff2=new File(root+"Autorun.inf");

		try{
		
	 	ff.renameTo(new File(root+"Autorun.inf.block"));
		ff2.renameTo(new File(root+"Autorun.inf.block"));
	 	}catch(Exception ft){ JOptionPane.showMessageDialog((Component)null,"Unable to Bloack the File \r\n"+"Your System is Badly Infected By [Win32-Sality] Virus.","Unable to acess the File",JOptionPane.OK_OPTION); }

		//if(  ( ff.exists() ) || ( ff2.exists() )  )
		{		
		setVisible(true);
		setLocation(400,150);

		cp=getContentPane();
		cp.setLayout(null);
		
		JPanel jf=new JPanel(null,true);
		jf.setBackground(Color.red);
		jf.setLayout(null);

		JLabel lkk=new JLabel(new ImageIcon("Image/alert.gif"));
		lkk.setBounds(20,04,30,30);
		lkk.setBackground(Color.red);
		jf.add(lkk);

		JLabel l1=new JLabel("DNA SCAN WARNING");
		l1.setBackground(Color.red);
		l1.setForeground(Color.white);	
		l1.setBounds(60,04,250,30);
		 l1.setFont(new Font("Arial",Font.BOLD,16));
		jf.add(l1);

		
		JPanel jfa=new JPanel(null,true);
		jfa.setBackground(Color.white);
		jfa.setLayout(null);

		setFont(new Font("DigiFaceWide",Font.ITALIC,15));
		
		JLabel lk=new JLabel(new ImageIcon("Image/vir.gif"));
		lk.setBounds(10,10,60,60);
		jfa.add(lk);

		JLabel lk2=new JLabel("File : "+root+"autorun.inf [Autorun.exe]");
		lk2.setBounds(100,10,180,30);
		jfa.add(lk2);

		JLabel lk3=new JLabel("Virus :  Win32-Sality");
		lk3.setBounds(100,30,150,30);
		jfa.add(lk3);

		JLabel lk4=new JLabel("Action : File Modified");
		lk4.setBounds(100,50,150,30);
		jfa.add(lk4);

		JButton bbk=new JButton("Ok");
		bbk.setBounds(150,110,100,30);
		jfa.add(bbk);
		
		jfa.setBounds(03,30,394,167);
		jf.add(jfa);

		jf.setVisible(true);
		jf.setSize(400,200);
		jf.setLocation(0,0);	
		cp.add(jf);

		bbk.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{

		setVisible(false);
		}
		});
	
		}
		//else
		{
		setVisible(false);       
		}

	}
	}
