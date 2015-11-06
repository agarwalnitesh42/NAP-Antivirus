package napantivirus;
import java.io.*;
import java.net.*;             
import java.awt.*;
import javax.swing.JMenuItem;
import java.util.*;
import java.beans.*;
import javax.swing.*; 
import java.awt.event.*;
import javax.swing.undo.*;
import javax.swing.text.*;
import javax.swing.event.*;
import java.lang.reflect.*;
import javax.swing.border.*;
import javax.swing.plaf.basic.*;
import javax.swing.filechooser.FileView;


public class taskmgr extends JFrame
{
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
JLabel  l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
JTextArea a;
JTextField t1,t2;
public taskmgr(){

super(" .EXE MANAGER ");

Container cp=getContentPane();
cp.setLayout(null);
setSize(580,520);
//this.setSize(500,700);
setBackground(Color.white);

int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
a=new JTextArea();
a.setForeground(Color.red);
a.setBackground(Color.white);
a.setEditable(false);
JScrollPane jp=new JScrollPane(a,v,h);

jp.setBounds(20,20,400,400);
cp.add(jp);

b1=new JButton("Refresh");
b1.setBounds(430,40,100,30);
cp.add(b1);

l1=new JLabel("Enter Process Name or ID");
l1.setBounds(430,80,200,30);
cp.add(l1);

t1=new JTextField();
t1.setBounds(430,100,100,30);
cp.add(t1);

b2=new JButton("End Task");
b2.setBounds(430,130,100,30);
cp.add(b2);

l2=new JLabel("Enter the Command");
l2.setBounds(430,170,200,30);
cp.add(l2);

t2=new JTextField();
t2.setBounds(430,190,100,30);
cp.add(t2);

b3=new JButton("Command");
b3.setBounds(430,220,100,30);
cp.add(b3);

b4=new JButton("Copy to ClipBoard");
b4.setBounds(430,260,100,30);
cp.add(b4);
setVisible(true);

try{
String command1 = "tasklist.exe";
   Runtime p = Runtime.getRuntime();
    p.exec(command1);
    
    
   // DataInputStream in = new DataInputStream(new InputStreamReader(System.in));
 
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

 try {
		while ((command1 = br.readLine()) != null) { //readline from the bufferedReader
		 //   System.out.println(command1);

		a.setText(a.getText()+"\n"+command1);
		
	    }
	}catch(Exception de){}



}catch(Exception de){}

b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e){
setVisible(false);
taskmgr m=new taskmgr();
m.setVisible(true);
m.setSize(580,520);
m.setLocation(30,30);

}
});

b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e){

try{
String command2="tskill"+t1.getText();
 Runtime p = Runtime.getRuntime();
p.exec(command2);
a.setText(command2);
}catch(Exception fe){
	fe.printStackTrace();
}

}
});

b3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e){

try{
String command3=t2.getText();
a.setText(" @ #User Cammand :"+command3+"\n");
Runtime p = Runtime.getRuntime();p.exec(command3); 

//DataInputStream in = new DataInputStream(p.getInputStream()); //stream data input to show process
 
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

 try {

		if((command3 = br.readLine()) ==  "'"+command3+"'"+"is not recognized as an internal or external command,"+"\n"+"operable program or batch file.")
		{
		a.setText("Please check the COMMAND that you entered !!!");
		}
		else{
		while ((command3 = br.readLine()) != null) { //readline from the bufferedReader
		 //   System.out.println(command1);

		a.setText(a.getText()+"\n"+command3);
	    } }
	}catch(Exception de){}
	
}catch(Exception fe){}


}
});

b4.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e){

a.getText();

}
});

}
public static void main(String args[])
{
	taskmgr m=new taskmgr();
	m.setVisible(true);
	m.setSize(580,520);
	m.setLocation(130,130);


}
}
