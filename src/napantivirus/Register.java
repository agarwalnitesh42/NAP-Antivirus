package napantivirus;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class Register
{
JLabel l1,l2,l3,l4,l5,l6;
JTextField name,email,t1,t2,t3,t4;
JButton reg,cancel;
JFrame jf;
int al=0;
Register()
{

File fg=new File("G://Key.html");
if( fg.exists() )
{
al=1;
}


jf=new JFrame();
jf.setTitle("Registration");
jf.setSize(350,300);
jf.setVisible(true);
jf.setLayout(null);
jf.setLocation(100,100);

if(al==0)
{
l1=new JLabel("Name");
l1.setBounds(10,10,100,30);
jf.add(l1);

name=new JTextField();
name.setBounds(110,10,200,30);
jf.add(name);

l2=new JLabel("Email Id");
l2.setBounds(10,50,100,30);
jf.add(l2);

email=new JTextField();
email.setBounds(110,50,200,30);
jf.add(email);


l2=new JLabel("Registration Code");
l2.setBounds(10,90,100,30);
jf.add(l2);

t1=new JTextField(4);
t1.setBounds(10,120,50,30);
jf.add(t1);

t2=new JTextField(4);
t2.setBounds(80,120,50,30);
jf.add(t2);



t3=new JTextField(4);
t3.setBounds(150,120,50,30);
jf.add(t3);


t4=new JTextField(4);
t4.setBounds(230,120,50,30);
jf.add(t4);


reg=new JButton("Register");
reg.setBounds(20,180,120,30);
jf.add(reg);

cancel=new JButton("Cancel");
cancel.setBounds(150,180,120,30);
jf.add(cancel);


reg.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
	try{

	int condition1=0,condition2=0;
	int key1=0,key2=0,key3=0,key4=0;
	String valid=email.getText();
	int len=valid.length();

	for(int i=0;i<valid.length();i++)
	{
		char ch=valid.charAt(i);
		if(ch=='@')
		{
			condition1=1;
		}
		if(ch=='.')
		{
			condition2=1;
		}
	}
	
	if( (condition1!=1 || condition2!=1))
	{
	 JOptionPane.showMessageDialog((Component)null," You entered invalid email id!"+"\r\n Please Enter Valid email id ","Email id error",JOptionPane.OK_OPTION);
	}

	
	if(name.getText().equals(""))
	{
	  JOptionPane.showMessageDialog((Component)null," You entered invalid name!"+"\r\n Please Enter Valid name "," error",JOptionPane.OK_OPTION);
	}

	if(t1.getText().charAt(0)=='K' || t1.getText().charAt(0)=='P')
	{
	 key1=1;
	}

	if(t2.getText().charAt(1)=='5' || t2.getText().charAt(1)=='0')
	{
	 key2=1;
	}

	if(t3.getText().charAt(2)=='X' || t3.getText().charAt(2)=='Z')
	{
	 key3=1;
	}

	if(t4.getText().charAt(3)=='$' || t4.getText().charAt(3)=='&')
	{
	 key4=1;
	}

	if(key1==1 && key2==1 && key3==1 && key4==1 && condition1==1 && condition2==1)
	{
	FileWriter ff=new FileWriter("G://key.html");
	ff.write("<html><head><body bgcolor=#0af1f2f><table  border=3><td bgcolor=#f1f7df></th><ol>Support Information</ol></td></th></table><br><table border=2><th>" + "Name="+name.getText()+"</br>\r\n"
		 +"</br>Email id="+email.getText()+"<br>\r\n"
		 +"</br>Key="+t1.getText()+"-"+t2.getText()+"-"+t3.getText()+"-"+t4.getText()+"\r\n"
		 +"</th></table></head><body>");
	ff.close();
	JOptionPane.showMessageDialog((Component)null," You have Registered Sucessfully!!! ","Registration Sucessfully!!!",1);
	jf.setVisible(false);
	}
	else{
	 JOptionPane.showMessageDialog((Component)null," You entered invalid License Key!"+"\r\n Please Enter Valid Licence Key","Key error",JOptionPane.OK_OPTION);
	}
}	
catch(Exception g){}
}
});

cancel.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
	jf.setVisible(false);
}
});

}
else{
try{
l1=new JLabel("Registered Version");
l1.setFont(new Font("Arial",Font.BOLD,18));
l1.setForeground( new Color(120,160,90));
l1.setBounds(30,10,200,30);
jf.add(l1);

FileReader rd=new FileReader("C:/Windows/Key.html");
JTextField jt=new JTextField();
jt.read(rd,null);
rd.close();

JEditorPane a1=new JEditorPane();
a1.setPage(new URL("file://localhost/C:/Windows/Key.html"));
a1.setBounds(30,40,250,180);
jf.add(a1);

JButton b1=new JButton("Confirme");
b1.setBounds(70,230,100,30);
jf.add(b1);

b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
 jf.setVisible(false);	
}
});

}catch(Exception fr){}
}

}

public static void main(String args[])
{
	Register r = new Register();
}

}
