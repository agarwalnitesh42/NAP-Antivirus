
package napantivirus;
//*************************************** NAP Antivirus *****************************************************************************
//
//
//								Author-Pravin H. Rane
//********************************************************************************************************************************





import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FileDialog;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MenuBar;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JWindow;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;



class Scanner extends JFrame
{
BufferedReader br=null;
int ans=0,point=0;
String database[]=new String[1000];
int total=0,infected=0;
String strRoot2="";
FileWriter logFile;
JLabel jl,jl2,jl3,jl4,img,img2,jb;
Container bbb;
Date dd;
MenuBar mb;
JButton o1,o2,o3,o4,o5;
JButton jk1,jk2,jk3,jk4,jk5,b1,b2,b3,b4,b5,g1,g2,g3,max;
JToolBar tb;
JList jh;
Image panelImage;
private BufferedImage backgroundImg;
File autorun;
int jdk=1;
DefaultListModel mu,ku;
JInternalFrame jfq,jfq2,jfq3;
JFrame jfs,jf;
String drive;
JComboBox main,theme;
int alert,virname=0,vircount=0, dno=0, bno=0,mylen=0,win32=0;
String alert2[]=new String[23];
String drivecount[]=new String[23];
String alert3[]=new String[23];
int select=1;
ImageIcon image,image2;

JPanel jjp,hide;
JLabel hide1,hide2,hide3;
JWindow kl;
int files=0,vir=0,clean=0;
long start=-1,stop=-1;
int vx,hx;
private BufferedImage backgroundImg1;
   
Scanner(int visible)
{
try{
logFile=new FileWriter("Scan.log");
logFile.write("*************************** $NAP Antivirus$ ****************************************"+"\r\n");
logFile.write("                                           Author- Nitesh Agarwal"+"\r\n");
logFile.write("*********************************************************************************"+"\r\n");
logFile.write("User Computer File's And Folder's System"+"\r\n\n\n");





     

}catch(Exception gt){}


while(true)
{




try{
 UIManager.setLookAndFeel ("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
//UIManager.setLookAndFeel ("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
}catch(Exception de){}



try{
ans=0;
FileWriter we=new FileWriter("Command.cab");
we.write("0");
we.close();


  kl=new JWindow();
 hide=new JPanel(null,true);

 hide1=new JLabel();
 hide1.setBounds(10,10,400,50);
 hide.add(hide1);

 max=new JButton("");
 max.setBounds(380,0,30,30);
 hide.add(max);
	
 hide1.setBorder(
        BorderFactory.createCompoundBorder(
        BorderFactory.createTitledBorder("Scanning File"),
        BorderFactory.createEmptyBorder(1,1,1,1)));
 

 hide2=new JLabel();
 hide2.setBounds(10,70,400,50);
 hide.add(hide2);
	
 hide2.setBorder(
        BorderFactory.createCompoundBorder(
        BorderFactory.createTitledBorder("Infected  File"),
        BorderFactory.createEmptyBorder(1,1,1,1)));

 hide3=new JLabel();
 hide3.setBounds(10,120,400,50);
 hide.add(hide3);

 hide3.setBorder(
        BorderFactory.createCompoundBorder(
        BorderFactory.createTitledBorder("Scan Log"),
        BorderFactory.createEmptyBorder(1,1,1,1)));
 
 hide.setBounds(0,0,420,180);
 kl.add(hide);
 kl.setSize(420,180);
 kl.setLocation(150,180);
if(visible==0)
{

try{
 UIManager.setLookAndFeel ("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
}catch(Exception de){}
 kl.setVisible(true);


}
if(jdk==1 && visible==1)
{
kl.setVisible(false);
jdk++;


jf=new JFrame("NAP Antivirus 1.0.0.0");
jf.setLayout(null);
//jf.setIconImage(new ImageIcon("Image/map_systemsecurity.png"));
//URL backgroundImgUrl = this.getClass().getResource("/Image/map_systemsecurity.png");
//try {
//	backgroundImg = ImageIO.read(backgroundImgUrl);
//} catch (IOException e1) {
//	// TODO Auto-generated catch block
//	e1.printStackTrace();
//}	
//jf.setIconImages(new ImageIcon(backgroundImg));
jf.setLocation(50,50);
jf.setSize(730,670);
jf.setVisible(true);

jfq2=new JInternalFrame();
jfq2.setMaximizable(true);
jfq2.hide();
jfq2.setSelected(true);
jfq2.setClosable(true);
jfq2.setTitle("Setting");
jfq2.setLayout(null);
jfq2.setLocation(410,319);
jfq2.setSize(150,160);
jfq2.setVisible(true);


jjp=new JPanel(null,true);
jjp.setBounds(420,480,140,150);
jf.add(jjp);
URL backgroundImgUrl = this.getClass().getResource("/Image/ScanStart.gif");
URL backgroundImgUrl1 = this.getClass().getResource("/Image/Scan.gif");
try {
	backgroundImg = ImageIO.read(backgroundImgUrl);
	backgroundImg1 = ImageIO.read(backgroundImgUrl1);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}	


image=new ImageIcon(backgroundImg);
image2=new ImageIcon(backgroundImg1);

jfq=new JInternalFrame();
jfq.setMaximizable(true);
jfq.hide();
jfq.setSelected(true);
jfq.setClosable(true);
jfq.setResizable(true);
jfq.setTitle("User Choice");
jfq.setLayout(null);
jfq.setLocation(410,25);
jfq.setSize(150,290);
jfq.setVisible(true);

jfq3=new JInternalFrame();
jfq3.setMaximizable(true);
jfq3.hide();
jfq3.setSelected(true);
jfq3.setClosable(true);
jfq3.setResizable(true);
jfq3.setTitle("My Task");
jfq3.setLayout(null);
jfq3.setLocation(570,25);
jfq3.setSize(150,290);
jfq3.setVisible(true);


jf.add(jfq);
jf.add(jfq2);
jf.add(jfq3);


o1=new JButton("Drive Details");
o1.setBounds(10,10,120,30);
jfq3.add(o1);

o2=new JButton("Minimum Mode");
o2.setBounds(10,50,120,30);
jfq3.add(o2);
//o2.setEnabled(false);

o3=new JButton("Clean Computer");
o3.setBounds(10,90,120,30);
jfq3.add(o3);

o4=new JButton("Update");
o4.setBounds(10,130,120,30);
jfq3.add(o4);


o5=new JButton("Register");
o5.setBounds(10,170,120,30);
jfq3.add(o5);




tb=new JToolBar();
tb.setBounds(0,1,400,30);
jf.add(tb);


img=new JLabel(image);
img.setBounds(06,50,30,30);
img.setVisible(false);
jf.add(img);



img2=new JLabel(image2);
img2.setBounds(30,35,60,60);
img2.setVisible(false);
jjp.add(img2);


jl=new JLabel("Scan File:  ");
jl.setBounds(30,30,380,60);
jl.setVisible(true);
jf.add(jl);

jl2=new JLabel("Last Infected File:");
jl2.setBounds(30,90,380,60);
jl2.setVisible(true);
jf.add(jl2);


jb=new JLabel();
jb.setBounds(15,95,120,30);
jjp.add(jb);



	 hx=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
	  vx=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;




mu=new DefaultListModel();
jh=new JList(mu);


ku=new DefaultListModel();
main=new JComboBox();
main.addItem("Select Drive");

try{

         File f=new File("c:/'.'");
   
    	 File strRoot[]=f.listRoots();
     	

    	System.out.println("System Drive...");
	dno=strRoot.length;
     	for(int k=0;k<strRoot.length;k++)
	 {
	    drivecount[k]=strRoot[k]+"";	
	    main.addItem(strRoot[k]+"");
	    drivecount[dno]=strRoot+"";  
	    autorun=new File(strRoot[k]+"autorun.inf");	
					if(autorun.exists())
					{	
						
						
						
							
						//main.addItem(strRoot[vir]+"");
	 					autorunFound a=new autorunFound(strRoot[k]+"");	
	 					a.setVisible(true);
	 					a.setSize(400,200);
	 					a.setLocation(100,150);
						
						//alert2[]=strRoot[k]+"";
						
						
						 
					}	
	
	    //dno++;		
	 }	


}catch(Exception gt){}


jh.setForeground(Color.red);
JScrollPane df=new JScrollPane(jh,vx,hx);



b1=new JButton("View Log");
b1.setBounds(0,1,100,30);
tb.add(b1);


b2=new JButton("View File Log");
b2.setBounds(0,1,100,30);
tb.add(b2);

b4=new JButton("Change Themes");
b4.setBounds(0,1,100,30);
tb.add(b4);


b3=new JButton("About");
b3.setBounds(0,1,100,30);
tb.add(b3);






	df.setBorder(
        BorderFactory.createCompoundBorder(
        BorderFactory.createTitledBorder("Virus List"),
        BorderFactory.createEmptyBorder(1,1,1,1)));
	jjp.setBorder(
        BorderFactory.createCompoundBorder(
        BorderFactory.createTitledBorder("File Status"),
        BorderFactory.createEmptyBorder(1,1,1,1)));



df.setBounds(10,150,400,300);
jf.add(df);

jl3=new JLabel("Scan Log");
jl3.setBounds(10,450,400,60);
jf.add(jl3);


JPanel jk=new JPanel(null,true);
 
jl4=new JLabel("Software: NAP Antivirus");
jl4.setBounds(20,20,400,30);
jk.add(jl4);

JLabel jl5=new JLabel("Database Version: 12-4-2015");
jl5.setBounds(20,40,400,30);
jk.add(jl5);


JLabel jl6=new JLabel("Database By: Bm-housing.in");
jl6.setBounds(20,60,400,30);
jk.add(jl6);


JLabel jl7=new JLabel("Update: Not Required");
jl7.setBounds(20,80,150,30);
jk.add(jl7);

jk.setBounds(10,510,400,120);
jf.add(jk);

jk.setBorder(
        BorderFactory.createCompoundBorder(
        BorderFactory.createTitledBorder("Information"),
        BorderFactory.createEmptyBorder(1,1,1,1)));

//jf.setVisible(false);
//cp.add(jf);

jk1=new JButton("Scan All Drive");
jk1.setDefaultCapable(false);
//jk1.removeNotify();
jk1.setBounds(10,10,120,30);
jfq.add(jk1);


g1=new JButton("Task Manager");
g1.setDefaultCapable(false);
g1.removeNotify();
g1.setBounds(10,10,120,30);
jfq2.add(g1);


g2=new JButton("Empty Virus vault");
g2.setDefaultCapable(false);
g2.removeNotify();
g2.setBounds(10,50,120,30);
jfq2.add(g2);


g3=new JButton("Setting");
g3.setDefaultCapable(false);
g3.removeNotify();
g3.setBounds(10,90,120,30);
jfq2.add(g3);

jk2=new JButton("Scan System Drive");
jk2.setBounds(10,50,120,30);
jfq.add(jk2);


jk3=new JButton("Scan User Drive");
jk3.setBounds(10,90,120,30);
jfq.add(jk3);


main.setBounds(10,130,120,30);
jfq.add(main);



jk4=new JButton("Scan Folder");
jk4.setBounds(10,170,120,30);
jfq.add(jk4);

jk5=new JButton("Scan File");
jk5.setBounds(10,210,120,30);
jfq.add(jk5);



}


max.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
	kl.setVisible(false);
	jf.setVisible(true);
}
});


g1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
 new taskmgr();
//try{
//	
//
//Runtime r=Runtime.getRuntime();
////r.exec("AdapterClass.exe");
//r.exec("taskmgr.exe");
//ans=0;
//}catch(Exception fr){}
////taskmgr m=new taskmgr();
////m.setVisible(true);
////m.setSize(580,520);
////m.setLocation(30,30);
}
});


b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
try{
//logFile.close();
FileWriter ww=new FileWriter("1.bat");
ww.write("@echo off"+"\n\r"
	+"start Scan.log \r\n"
	+"exit");
ww.close();

FileWriter ww1=new FileWriter("2.bat");
ww1.write("@echo off"+"\n\r"
	+"start 1.bat \n\r"
	+"exit");

ww1.close();
 
Runtime qq=Runtime.getRuntime();
qq.exec("2.bat");

Thread.sleep(1000);

File fv=new File("2.bat");
fv.delete();

File fv1=new File("1.bat");
fv1.delete();


}catch(Exception gt){}

}
});




b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
try{

FileWriter ww=new FileWriter("1.bat");
ww.write("@echo off"+"\n\r"
	+"start Total_Files.log \r\n"
	+"exit");
ww.close();

FileWriter ww1=new FileWriter("2.bat");
ww1.write("@echo off"+"\n\r"
	+"start 1.bat \n\r"
	+"exit");

ww1.close();
 
Runtime qq=Runtime.getRuntime();
qq.exec("2.bat");

Thread.sleep(1000);

File fv=new File("2.bat");
fv.delete();

File fv1=new File("1.bat");
fv1.delete();


}catch(Exception gt){}

}
});


b4.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
	try{
	
		//main.add(comp)
		 UIManager.setLookAndFeel ("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	}catch(Exception gt){}
}
});



b3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
try{
JFrame jfc=new JFrame("About Us");
jfc.setVisible(true);
jfc.setLocation(100,100);
jfc.setSize(400,470);
jfc.setLayout(null);


ImageIcon gh=new ImageIcon("/Image/final.png");

URL backgroundImgUrl = this.getClass().getResource("/Image/final.png");
try {
	panelImage = ImageIO.read(backgroundImgUrl);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}	
     //  panelImage = backgroundImg;
		 //  panelImage=Toolkit.getDefaultToolkit().getImage("/Image/logofn.jpg");
			JPanel panel=new JPanel()
		        {
			public void paintComponent(Graphics g)
			{
				super.paintComponent(g);
				g.drawImage(panelImage, 0,0, 400, 170,this);
			}
		     };	
	panel.setLayout(null);
	panel.setBounds(0,0,400,170);

JLabel jl=new JLabel(gh);
jl.setBounds(60,20,160,140);
jfc.add(panel);

JTextArea rr=new JTextArea("About Us");
rr.setBackground(Color.black);
rr.setForeground(Color.red);
rr.setBounds(00,170,400,280);
rr.setEditable(false);

JScrollPane hhq=new JScrollPane(rr,vx,hx);

jfc.add(rr);




		rr.setText(rr.getText()+"\n\rSoftware Name:NAP Antivirus \n");
		//try{Thread.sleep(2000);}catch(Exception hy){}
		rr.setText(rr.getText()+"Version Info: 1.0.0.0.0 \n");
		//Thread.sleep(2000);
		rr.setText(rr.getText()+"Author: Nitesh Agarwal \n");
		//Thread.sleep(2000);
		rr.setText(rr.getText()+"Tester: Nitesh Agarwal \n");
		//Thread.sleep(2000);
		//rr.setText(rr.getText()+"Beta Version Tester: Sameer Gaware \n");
		//Thread.sleep(2000);
		rr.setText(rr.getText()+"DFD Concept: Shekhar Parulekar \n");
		//Thread.sleep(2000);
		rr.setText(rr.getText()+"Database By: BMHousing.in \n");
		//Thread.sleep(2000);
		rr.setText(rr.getText()+"Releasing Date: 17 AUG 2015 \n");
		//Thread.sleep(2000);
		rr.setText(rr.getText()+"Test Start: 18 OCT 2015 \n");
		//Thread.sleep(2000);
		rr.setText(rr.getText()+"Test Complete: 20 OCT 2015 \n");
		//Thread.sleep(2000);
		rr.setText(rr.getText()+"Requirement: JDK 1.7 \n");
		//Thread.sleep(2000);
		rr.setText(rr.getText()+"Feedback on: \n");
		rr.setText(rr.getText()+"           1.agarwalnitesh42@gmail.com \n");
		rr.setText(rr.getText()+"           2.www.bmhousing.in   \n");
		//Thread.sleep(4000);
		
}catch(Exception gt){}

}
});


o1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
							driveDetail d=new driveDetail("c:/");
							  d.setVisible(true);
							  d.setSize(400,235);
							  d.setLocation(150,100);

}
});

o2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
  kl.setVisible(true);
  jf.setVisible(false);	

}
});
o3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
splash sp=new splash();
sp.setVisible(true);
	sp.setSize(297,280);
	sp.setLocation(150,100);
	sp.setVisible(false);
}
});
o4.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{


}
});

o5.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
Register reg=new Register();
///\reg.setVisible(true);
//reg.setSize(350,350);
//reg.setLocation(100,100);
}
});


jk1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
try{
FileWriter we=new FileWriter("Command.cab");
we.write("1");
we.close();
}catch(Exception fr){}
}
});

jk2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
try{
FileWriter we=new FileWriter("Command.cab");
we.write("2");
we.close();
}catch(Exception fr){}
}
});

main.addItemListener(new ItemListener()
{
public void itemStateChanged(ItemEvent e)
{
try{
String str=(String)main.getSelectedItem();
System.out.println(str);

//File ff=new File("");

}catch(Exception de){ System.out.println(de); }
}
});



jk3.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
try{
File ffh=new File("drive.cab");
if( ffh.exists() )
{
FileReader fr=new FileReader("drive.cab");
JTextField hj=new JTextField();
hj.read(fr,null);
fr.close();
drive=(String)hj.getText();

kl.setVisible(true);
jf.setVisible(false);

main.setSelectedItem(hj);
File ffhw=new File("drive.cab");
ffhw.delete();
}
else{
String str=(String)main.getSelectedItem();
drive=str;
}

if(drive.equals("Select Drive"))
{
JOptionPane.showMessageDialog((Component)null,"Please Select drive from Drive list","Drive Loading error",JOptionPane.OK_OPTION);
}
else{
System.out.println(drive);
FileWriter we=new FileWriter("Command.cab");
we.write("3");
we.close();
}
}catch(Exception fr){System.out.println(fr);}
}
});


jk4.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
try{
FileWriter we=new FileWriter("Command.cab");
we.write("4");
we.close();
}catch(Exception fr){}
}
});

	jl.setBorder(
        BorderFactory.createCompoundBorder(
        BorderFactory.createTitledBorder("File"),
        BorderFactory.createEmptyBorder(1,1,1,1)));

	
	jl2.setBorder(
        BorderFactory.createCompoundBorder(
        BorderFactory.createTitledBorder("Infection"),
        BorderFactory.createEmptyBorder(1,1,1,1)));

	
	jl3.setBorder(
        BorderFactory.createCompoundBorder(
        BorderFactory.createTitledBorder("Status"),
        BorderFactory.createEmptyBorder(1,1,1,1)));




}catch(Exception fr){}






//Scan All Drives

	
	
	img.setVisible(false);img2.setVisible(false);jb.setText("");
	while(ans==0)
	{
	try{
	FileReader rd=new FileReader("Command.cab");
	JTextField jt=new JTextField();
	jt.read(rd,null);
	rd.close();
	ans=Integer.parseInt(jt.getText());
	
	if(select==1)
	{
	jfq.setSelected(true);
	jfq3.setSelected(true);          
	jfq2.setSelected(true);
	select++;
	}
		try{
			 	
      			   File f=new File("c:/'.'");
   
    			   File strRoot[]=f.listRoots();
     			   win32=0;	
			  //System.out.println("Current1..."+dno);
    			  //System.out.println("Current2..."+mylen);
			  		win32=0;	
			   		mylen=strRoot.length;	
					for(int k=0;k<strRoot.length;k++)
	 				{
					  if(mylen>dno)
					  {      mu.removeAllElements();
					       if(win32==0)
					       {		
					       JOptionPane.showMessageDialog((Component)null,"New Removable Drive is Connected to Computer...\r\n"+"Please wait while drive loading...\r\n"+"It may take a Minute...","Removable Drive Loading",1);
					       Thread.sleep(10000); win32=1;
					        }
						for(int j=0;j<mylen;j++)
						{
							if(j==mylen-1)
							{
							 	
						          main.addItem(strRoot[j]+"");	
							  System.out.println("Drive Detail"+strRoot[j]);
							  driveDetail d=new driveDetail(strRoot[j]+"");
							  d.setVisible(true);
							  d.setSize(400,235);
							  d.setLocation(150,100);		
							}

						}					
					       for(int j=0;j<mylen;j++)
						{
						  autorun=new File(strRoot[j]+"autorun.inf");
						  //System.out.println("Checking: "+strRoot[j]+"autorun.inf");	
						  Thread.sleep(1000); 
						  k=mylen;
						  dno=mylen;
						  	
						  if( autorun.exists() )
						  {	
						  try{  
						  win32=j;
						  
	 					  
						  //System.out.println("Found Checking: "+strRoot[j]+"autorun.inf");
						  autorunFound a2=new autorunFound(strRoot[j]+"");			
	 					  a2.setVisible(true);
	 					  a2.setSize(400,200);
	 					  a2.setLocation(100,150);
						   System.out.println("Warning");
						  
						  }catch(Exception d){System.out.println(d);}
						} 
					       		
						  	
					      } 	
					     // System.out.println("New Drive added");
					      
					      //System.out.println("New Drive Volume"+strRoot[win32]);		
					  }
					      if(mylen<dno)
					       { 	
						    JOptionPane.showMessageDialog((Component)null,"The Removable Drive Disconnected...","Removable Drive Disconnected",1);
						    for(int j2=0;j2<mylen;j2++)
						    {
						    mu.removeAllElements();	
						    main.addItem(strRoot[j2]+"");
						    dno=mylen;	
					            }	
					       }	
						
					}
     			  
	    			
	    			        
					
								
	 				

		
			}catch(Exception gt){System.out.println(gt);}
			
			
			


	
	
	}catch(Exception hy){System.out.println(hy);}
	
	}

   if(ans==1)
   {	
   try{	
   mu.removeAllElements();
 	
   jf.setVisible(true);
   img.setVisible(true); img2.setVisible(true); 
   o2.setEnabled(true);		
   start=System.currentTimeMillis();
   	
  try{
   FileReader rd=new FileReader("//virus_database//point.dat") ;
   JTextField jt=new JTextField();
   jt.read(rd,null);
   point=Integer.parseInt(jt.getText());
   rd.close();
  }catch(Exception e)
  {
	  e.printStackTrace();
  }
  
 
   //System.out.print("Please wait Loading Database");
  	
   jl.setText(""); 	
   jl.setText("Please wait Loading Database");	
   hide1.setText("Please wait Loading Database");	
   for(int z=0;z<point;z++)	
   {
	FileReader r=new FileReader("//virus_database//malware"+z+".res");
	JTextField jt2=new JTextField();
	jt2.read(r,null);
	database[z]=jt2.getText();
	r.close();

	int per=(z*100)/point;
	//System.out.println(database[z]+" "+"["+per +"%]");
	
   }
   for(int x=0;x<4;x++)
   {
    for(int y=0;y<3;y++)
    System.out.print(jl.getText()+". ");
   	
    jl.setText(".");	
    try{Thread.sleep(500);}catch(Exception gta){}	
   }		

    System.out.println("Database Load Sucessfully!");

   	 File f=new File("c:/'.'");
   
    	 File strRoot[]=f.listRoots();
     	

     System.out.println("System Drive...");	
     	for(int k=0;k<strRoot.length;k++)
	 {
	  System.out.println(" |_"+strRoot[k]);
	 }			

	System.out.println("Start Scan...");
	jl.setText(""); 	
        jl.setText("Please wait Start Scan");
	

	logFile.write("Start Scan:"+new Date()+"\r\n");

	for(int iq=0;iq<strRoot.length;iq++)
	{
	System.out.println("\n\n\n"+strRoot[iq]+" Drive");
	logFile.write("\n\n\n"+strRoot[iq]+" Drive"+"\r\n");

	File ff2=new File(strRoot[iq]+"/*.*");
	String ff1=ff2.getParent();
	File ff=new File(ff1);
	String str22[]=ff.list();
	int len=str22.length;
	
	for(int i=0;i<len;i++)
	{

	 if(i==len-1)
	 {
	   jl.setText("Scan Completed !!!");
	 }
	
	 File fg=new File(strRoot[iq]+"/"+str22[i]);
	 jl.setText(""); 	
         jl.setText("Scanning File: "+strRoot[iq]+"/"+str22[i]);jb.setText(str22[i]);
  	 hide1.setText("Scanning File: "+strRoot[iq]+"/"+str22[i]);jb.setText(str22[i]);
	 files++;
	 clean++;
	 jl3.setText("Scan File's: "+files+"\n\r"+"  Clean Files: "+clean+"\n\r"+"  Infected File: "+vir+"\n\r");
  	 hide3.setText("Scan File's: "+files+"\n\r"+"  Clean Files: "+clean+"\n\r"+"  Infected File: "+vir+"\n\r");
	

	 System.out.println(" |_ "+str22[i]);

	 
	   
	 logFile.write(" |_ "+str22[i]+"\r\n");
	 try{Thread.sleep(100);}catch(Exception hy){}
	
	 total=total+1;
	 for(int io=0;io<point;io++)
	 {	//System.out.println("List "+database[io]);

	 	if(  database[io].equals( str22[i] ) )
		{
		  
		  
		  virus v=new virus(strRoot[iq]+str22[i]);
		  jl.setText("");
		  jl.setForeground(Color.red); 	
	          jl.setText("Scanning File: "+strRoot[iq]+"/"+str22[i]);jb.setText(str22[i]);
		  hide1.setText("Scanning File: "+strRoot[iq]+"/"+str22[i]);jb.setText(str22[i]);
	          mu.addElement(strRoot[iq]+str22[i]+"({Trojan Horse}) Action:(File Modified)");
		  infected=infected+1;	
		} 
			
         }

	 int iz = str22[i].lastIndexOf('.');
	 if( fg.isHidden() && str22[i].substring(iz+1).toLowerCase().equals("exe") || str22[i].substring(iz+1).toLowerCase().equals("msi") || str22[i].substring(iz+1).toLowerCase().equals("pif") )
	 {
              		jl.setText("");
		  jl.setForeground(Color.red); 	
	           jl2.setForeground(Color.red);	
		   jl2.setText("Last Infected File:"+strRoot[iq]+str22[i]+"(Suspecious File)");
		   hide2.setText("Last Infected File:"+strRoot[iq]+str22[i]+"(Suspecious File)");	

		System.out.println("\n\n************* $Virus Found$ ***********");
		System.out.println("Possibility a new Virus");
		virus v=new virus(strRoot[iq]+str22[i]);
		 mu.addElement(strRoot[iq]+str22[i]+"(Suspecious File) Action:(File Modified)");
		vir++;  
		
	 } 	

	 String dir=fg.getParent();
	 File fy=new File(dir);
	 String name=fy.getName();
	 if(str22[i].equals(name+".exe"))
	 {
		jl.setText("");
		  jl.setForeground(Color.red); 	
	          jl.setText("Scanning File:  "+strRoot[iq]+"/"+str22[i]);jb.setText(str22[i]);
		   hide1.setText("Scanning File:  "+strRoot[iq]+"/"+str22[i]);jb.setText(str22[i]);
		   jl2.setForeground(Color.red);	
		   jl2.setText("Last Infected File:"+strRoot[iq]+str22[i]+"(Win32-sality[troj])");
		   hide2.setText("Last Infected File:"+strRoot[iq]+str22[i]+"(Win32-sality[troj])");
	

		System.out.println("\n\n****************** $Virus Found$ ****************");
		System.out.println("                       Virus Name: Win32-Sality[Troj]");
		virus v=new virus(strRoot[iq]+str22[i]);
		infected=infected+1;
		 mu.addElement(strRoot[iq]+str22[i]+"(Win32-sality[troj]) Action:(File Modified)");
		vir++;  
	 }

	 if( fg.isDirectory() )
	  {
		try{
		File ff21=new File(strRoot[iq]+str22[i]+"/*.*");
		

		String ff11=ff21.getParent();
		//System.out.println("Directory Name:"+ff11);
		File ff1a=new File(ff11);
		String str221[]=ff1a.list();
		int len1=str221.length;

		        for(int i1=0;i1<len1;i1++)
			{	
			files++;clean++;
	 		System.out.println(" |   |_ "+str221[i1]);
			 jl.setText("");
			  jl.setForeground(Color.black);
	         	 jl.setText("Scanning File:  "+strRoot[iq]+"/"+str22[i]+"/"+str221[i1]);jb.setText(str221[i1]);
			 hide1.setText("Scanning File:  "+strRoot[iq]+"/"+str22[i]+"/"+str221[i1]);jb.setText(str221[i1]);

			 jl3.setText("Scan File's: "+files+"\n\r"+"  Clean Files: "+clean+"\n\r"+"  Infected File: "+vir+"\n\r");
			 hide3.setText("Scan File's: "+files+"\n\r"+"  Clean Files: "+clean+"\n\r"+"  Infected File: "+vir+"\n\r");

			logFile.write(" |   |_ "+str221[i1]+"\r\n");
			try{Thread.sleep(100);}catch(Exception hy){}
			 total=total+1;
			 for(int io=0;io<point;io++)
	 		{	
				if(  database[io].equals( str221[i1] ) )
				{
					 jl2.setForeground(Color.red);	
		  			 jl2.setText("Last Infected File:"+str221[i1]+"([trojen-gender])");
					  hide2.setText("Last Infected File:"+str221[i1]+"([trojen-gender])");
		  
				        System.out.println("\n\n************* $Virus Found$ ***********");
			  		virus v=new virus(strRoot[iq]+str22[i]+"/"+str221[i1]);
					System.out.println("2."+strRoot[iq]+str22[i]+"/"+str221[i1]);
					vir++;
					infected=infected+1;	
					 mu.addElement(str221[i1]+"([trojen-gender]) Action:(File Modified)");	
				}
			
			 }
				File fh=new File(strRoot[iq]+str22[i]+"/"+str221[i1]);
				//System.out.println("File="+strRoot[iq]+str22[i]+"/"+str221[i1]);

				int iz1 = str221[i1].lastIndexOf('.');
				if( fh.isHidden() && str221[i1].substring(iz1+1).toLowerCase().equals("exe") || str221[i1].substring(iz1+1).toLowerCase().equals("msi") || str221[i1].substring(iz1+1).toLowerCase().equals("pif") )
				 {
					jl.setText("");
			                jl.setForeground(Color.red);
	         			 jl.setText("Scanning File:  "+strRoot[iq]+str22[i]+"/"+str221[i1]);jb.setText(str22[i]);
					 hide1.setText("Scanning File:  "+strRoot[iq]+str22[i]+"/"+str221[i1]);jb.setText(str22[i]);
					 jl2.setForeground(Color.red);	
		  			 jl2.setText("Last Infected File:"+str221[i1]+"([trojen-gender])");
					 hide2.setText("Last Infected File:"+str221[i1]+"([trojen-gender])");

					vir++;

					System.out.println("\n\n************* $Virus Found$ ***********");
					System.out.println("Possibility a new Virus");
					virus v=new virus(strRoot[iq]+str22[i]+"/"+str221[i1]);
					mu.addElement(str221[i1]+"([trojen-gender]) Action:(File Modified)");
					
		
	 			} 	

				 String dir1=fh.getParent();
				 File fy1=new File(dir1);
				 String name1=fy1.getName();
				 if(str221[i1].equals(name1+".exe"))
		
				 {
					jl.setText("");
			                jl.setForeground(Color.red);
	         			 jl.setText("Scanning File:  "+strRoot[iq]+str22[i]+"/"+str221[i1]);jb.setText(str22[i]);
					 hide1.setText("Scanning File:  "+strRoot[iq]+str22[i]+"/"+str221[i1]);jb.setText(str22[i]);

					 jl2.setForeground(Color.red);	
		  			 jl2.setText("Last Infected File:"+str22[i]+"([win32-sality])");
					 hide2.setText("Last Infected File:"+str22[i]+"([win32-sality])");
	
					vir++;

					System.out.println("\n\n****************** $Virus Found$ ****************");
					System.out.println("                       Virus Name: Win32-Sality[Troj]");
					virus v=new virus(strRoot[iq]+str22[i]+"/"+str221[i1]);
					infected=infected+1;
					mu.addElement(str22[i]+"([win32-sality]) Action:(File Modified)");
	 			}

			 	if( fh.isDirectory() )
	  		 	 {
				File ff21a=new File(strRoot[iq]+str22[i]+"/"+str221[i1]+"/*.*");
				//System.out.println("Checking File"+(String)ff21a.getName());

				String ff11a=ff21a.getParent();
				//System.out.println("Directory Name:"+ff11);
				File ff1az=new File(ff11a);
				String str221a[]=ff1az.list();
				int len1a=str221a.length;

		     	  	 for(int i1a=0;i1a<len1a;i1a++)
				{	
					files++;clean++;
	 				System.out.println(" |   |   |_"+str221a[i1a]);
					jl.setText("");
			                jl.setForeground(Color.black);
	         			 jl.setText("Scanning File:  "+strRoot[iq]+str22[i]+"/"+str221a[i1a]);jb.setText(str221a[i1a]);
					 hide1.setText("Scanning File:  "+strRoot[iq]+str22[i]+"/"+str221a[i1a]);jb.setText(str221a[i1a]);

					jl3.setText("Scan File's: "+files+"\n\r"+"  Clean Files: "+clean+"\n\r"+"  Infected File: "+vir+"\n\r");
					hide3.setText("Scan File's: "+files+"\n\r"+"  Clean Files: "+clean+"\n\r"+"  Infected File: "+vir+"\n\r");


					logFile.write(" |   |   |_"+str221a[i1a]+"\r\n");try{Thread.sleep(50);}catch(Exception hy){}
					total=total+1;

				 	for(int ioa=0;ioa<point;ioa++)
	 				{	
					if(  database[ioa].equals( str221a[i1a] ) )
					{
					jl.setText("");
			                jl.setForeground(Color.red);
	         			 jl.setText("Scanning File:  "+strRoot[iq]+str22[i]+"/"+str221a[i1a]);jb.setText(str221a[i1a]);
		  			  hide1.setText("Scanning File:  "+strRoot[iq]+str22[i]+"/"+str221a[i1a]);jb.setText(str221a[i1a]);
					
					 jl2.setForeground(Color.red);	
		  			 jl2.setText("Last Infected File:"+str22[i]+"([trojen-gender])");
					 hide2.setText("Last Infected File:"+str22[i]+"([trojen-gender])");

					 vir++;
				        System.out.println("\n\n************* $Virus Found$ ***********");
			  		virus v=new virus(strRoot[iq]+str22[i]+"/"+str221[i1]+"/"+str221a[i1a]);
					//System.out.println("3."+strRoot[iq]+str22[i]+"/"+str221[i1]+"/"+str221a[i1a]);
					mu.addElement(str22[i]+"([trojen-gender]) Action:(File Modified)");
					infected=infected+1;	
					}

					}

					File ffg=new File(strRoot[iq]+str22[i]+"/"+str221[i1]+"/"+str221a[i1a]);

					int iz11 = str221a[i1a].lastIndexOf('.');
					if( ffg.isHidden() && str221a[i1a].substring(iz11+1).toLowerCase().equals("exe") || str221a[i1a].substring(iz11+1).toLowerCase().equals("msi") || str221a[i1a].substring(iz11+1).toLowerCase().equals("pif") )
				 	{
					jl.setText("");
			                jl.setForeground(Color.red);
	         			jl.setText("Scaiing File:  "+strRoot[iq]+str22[i]+"/"+str221a[i1a]);jb.setText(str221a[i1a]);

					hide1.setText("Scaiing File:  "+strRoot[iq]+str22[i]+"/"+str221a[i1a]);jb.setText(str221a[i1a]);

					 jl2.setForeground(Color.red);	
		  			 jl2.setText("Last Infected File:"+str221a[i1a]+"([Suspecious File])");
					hide2.setText("Last Infected File:"+str221a[i1a]+"([Suspecious File])");

					System.out.println("\n\n************* $Virus Found$ ***********");
					System.out.println("Possibility a new Virus");
					virus v=new virus(strRoot[iq]+str22[i]+"/"+str221a[i1a]);
					vir++;
					mu.addElement(str221a[i1a]+"([Suspecious File]) Action:(File Modified)");

	 				} 

					 String dir2=ffg.getParent();
					 File fy2=new File(dir2);
					 String name2=fy2.getName();
					 if(str221a[i1a].equals(name2+".exe"))
				 		{
							jl.setText("");
			               			jl.setForeground(Color.red);
	         			 		jl.setText("Scanning File:  "+strRoot[iq]+str22[i]+"/"+str221a[i1a]);jb.setText(str221a[i1a]);
							hide1.setText("Scanning File:  "+strRoot[iq]+str22[i]+"/"+str221a[i1a]);jb.setText(str221a[i1a]);

							 jl2.setForeground(Color.red);	
		  					 jl2.setText("Last Infected File:"+str221a[i1a]+"([Win32-sality])");
	 						 hide2.setText("Last Infected File:"+str221a[i1a]+"([Win32-sality])");

							System.out.println("\n\n****************** $Virus Found$ ****************");
							System.out.println("                       Virus Name: Win32-Sality[Troj]");
							virus v=new virus(strRoot[iq]+str22[i]+"/"+str221[i1]+"/"+str221a[i1a]);
							infected=infected+1;vir++;mu.addElement(str221a[i1a]+"([Malware]) Action:(File Modified)");
	 					}


					if( ffg.isDirectory() )	
					{

					File ff21a1=new File(strRoot[iq]+str22[i]+"/"+str221[i1]+"/*.*");
					//System.out.println("Checking File"+(String)ff21a1.getName());

					String f11=ff21a1.getParent();
					System.out.println("Directory Name:"+f11);
					File f111=new File(f11);
					String str1z[]=f111.list();
					int l1=str1z.length;

					 for(int z=0;z<l1;z++)
						{	
						files++;clean++;
	 					System.out.println(" |   |   |  |_"+str1z[z]);try{Thread.sleep(50);}catch(Exception hy){}
						jl.setText("");
			                	jl.setForeground(Color.black);
	         				 jl.setText("Scanning File:  "+strRoot[iq]+str22[i]+"/"+str221[i1]+"/"+str1z[z]);jb.setText(str1z[z]);
						  hide1.setText("Scanning File:  "+strRoot[iq]+str22[i]+"/"+str221[i1]+"/"+str1z[z]);jb.setText(str1z[z]);
	
						 jl3.setText("Scan File's: "+files+"\n\r"+"  Clean Files: "+clean+"\n\r"+"  Infected File: "+vir+"\n\r");
						 hide3.setText("Scan File's: "+files+"\n\r"+"  Clean Files: "+clean+"\n\r"+"  Infected File: "+vir+"\n\r");


	
						logFile.write(" |   |   |  |_"+str1z[z]+"\r\n");
						total=total+1;

				 		for(int za=0;za<point;za++)
	 					{	
								if(  database[za].equals( str1z[z] ) )
								{
		  						jl.setText("");
			                			jl.setForeground(Color.red);
	         						jl.setText("Scanning File:  "+strRoot[iq]+str22[i]+"/"+str1z[z]);jb.setText(str1z[z]);
								 jl2.setForeground(Color.red);	
		  			 			jl2.setText("Last Infected File:"+str1z[z]+"([Suspecious File])");
								hide2.setText("Last Infected File:"+str1z[z]+"([Suspecious File])");

								mu.addElement(str1z[z]+"([Suspecious File]) Action:(File Modified)");	

							        System.out.println("\n\n************* $Virus Found$ ***********");
			  					virus v=new virus(strRoot[iq]+str22[i]+"/"+str221[i1]+"/"+str221a[i1a]+"/"+str1z[z]);
								System.out.println("3."+strRoot[iq]+str22[i]+"/"+str221[i1]+"/"+str221a[i1a]+"/"+str1z[z] );
								vir++;
								infected=infected+1;
									
								}
					
						}
						

					}	

				



			  }	
			

			}
	  		 	 }
			}

		}catch(Exception h){System.out.println(h);}

		
          }  	
	      	


	}



       }
	
    }catch(Exception gt){ System.out.println(gt);}

   } 	
 	



//Start



 if(ans==4)
 {
 try{
	 img.setVisible(true);img2.setVisible(true); 
	vir=0;
	clean=0;
	 mu.removeAllElements();
	files=0;
 	FileDialog fd=new FileDialog(jf,"Select Folder to Scan");
 	fd.setVisible(true);
	String dir=fd.getDirectory();
	String path=fd.getName();
	o2.setEnabled(true);
	try{
	FileWriter wed=new FileWriter("Command.cab");
	wed.write("0");
	wed.close();
	}catch(Exception fr){}


	jl.setText(""); 	
        jl.setText("Please wait Loading Database");	
	
   for(int z=0;z<point;z++)	
   {
	FileReader r=new FileReader("//virus_database//malware"+z+".res");
	JTextField jt2=new JTextField();
	jt2.read(r,null);
	database[z]=jt2.getText();
	r.close();

	
   }

   for(int x=0;x<4;x++)
   {
    for(int y=0;y<3;y++)
    System.out.print(". ");
   	
    jl.setText(jl.getText()+".");	
    try{Thread.sleep(500);}catch(Exception gta){}	
   }



	
	File ff=new File(dir);
	String str22[]=ff.list();

	int len=str22.length;
	
	for(int i=0;i<len;i++)
	{

	if(i==len-1)
	 {
	   jl.setText("Scan Completed !!!");
	 }
	
	 File fg=new File(dir+"/"+str22[i]);
	 jl.setText(""); 	
         jl.setText("Scanning File: "+dir+"/"+str22[i]);jb.setText(str22[i]);
	 files++;
	 clean++;
	 jl3.setText("Scan File's: "+files+"\n\r"+"  Clean Files: "+clean+"\n\r"+"  Infected File: "+vir+"\n\r");
	
	for(int io=0;io<point;io++)
	 {	//System.out.println("List "+database[io]);

	 	if(  database[io].equals( str22[i] ) )
		{
		  
		  
		  virus v=new virus(dir+str22[i]);
		  jl.setText("");
		  jl.setForeground(Color.red); 	
	          jl.setText("Scanning File: "+dir+"/"+str22[i]);jb.setText(str22[i]);

	          mu.addElement(dir+str22[i]+"({Trojan Horse}) Action:(File Modified)");
		  infected=infected+1;	
		} 
			
         }

	 int iz = str22[i].lastIndexOf('.');
	 if( fg.isHidden() && str22[i].substring(iz+1).toLowerCase().equals("exe") || str22[i].substring(iz+1).toLowerCase().equals("msi") || str22[i].substring(iz+1).toLowerCase().equals("pif") )
	 {
              		jl.setText("");
		 	jl.setForeground(Color.red); 	
	           	jl2.setForeground(Color.red);	
		   	jl2.setText("Last Infected File:"+dir+str22[i]+"(Suspecious File)");
	

		System.out.println("\n\n************* $Virus Found$ ***********");
		System.out.println("Possibility a new Virus");
		virus v=new virus(dir+str22[i]);
		 mu.addElement(dir+str22[i]+"(Suspecious File) Action:(File Modified)");
		vir++;  
		
	 } 	

	 String dir1=fg.getParent();
	 File fy=new File(dir1);
	 String name=fy.getName();
	 if(str22[i].equals(name+".exe"))
	 {
		jl.setText("");
		  jl.setForeground(Color.red); 	
	          jl.setText("Scanning File:  "+dir+str22[i]);jb.setText(str22[i]);
		   jl2.setForeground(Color.red);	
		   jl2.setText("Last Infected File:"+dir+str22[i]+"(Win32-sality[troj])");	

		System.out.println("\n\n****************** $Virus Found$ ****************");
		System.out.println("                       Virus Name: Win32-Sality[Troj]");
		virus v=new virus(dir+str22[i]);
		infected=infected+1;
		 mu.addElement(dir+str22[i]+"(Win32-sality[troj]) Action:(File Modified)");
		vir++;  
	 }

	


	}

 
	
  }catch(Exception ft){}	
 }


 if(ans==5)
 {
 try{
 	FileDialog fd=new FileDialog(jf,"Select File to Scan");
 	fd.setVisible(true);


  }catch(Exception ft){}	
 }






	

 if(ans==2)
   {
    files=0;
    vir=0;
    clean=0;		
   try{	
	 mu.removeAllElements();
    img.setVisible(true);img2.setVisible(true); 	
   jf.setVisible(true);
	o2.setEnabled(true);
   start=System.currentTimeMillis();	
   FileReader rd=new FileReader("//virus_database//point.dat") ;
   JTextField jt=new JTextField();
   jt.read(rd,null);
   point=Integer.parseInt(jt.getText());
   rd.close();
 
   System.out.print("Please wait Loading Database");
   hide1.setText("Please wait Loading Database ");	
   for(int z=0;z<point;z++)	
   {
	FileReader r=new FileReader("//virus_database//malware"+z+".res");
	JTextField jt2=new JTextField();
	jt2.read(r,null);
	database[z]=jt2.getText();
	r.close();

	int per=(z*100)/point;
	//System.out.println(database[z]+" "+"["+per +"%]");
	
   }
   for(int x=0;x<4;x++)
   {
    for(int y=0;y<3;y++)
    System.out.print(jl.getText()+". ");
    try{Thread.sleep(500);}catch(Exception gta){}	
   }		

    System.out.println("Database Load Sucessfully!");

    File f=new File("c:/'.'");
   
     String strRoot[]={"C:/"};
     	

     System.out.println("C: Drive...");	
     for(int k=0;k<1;k++)
	 {
	  System.out.println(" |_ C: Drive");
	 }			

	System.out.println("Start Scan...");
	logFile.write("Start Scan:"+new Date()+"\r\n");
	
	for(int iq=0;iq<1;iq++)
	{
	System.out.println("C:/ Drive");
	logFile.write("\n\n\n"+"C:/"+" Drive"+"\r\n");

	File ff2=new File("C:/"+"*.*");
	String ff1=ff2.getParent();
	File ff=new File(ff1);
	String str22[]=ff.list();
	int len=str22.length;
	
	for(int i=0;i<len;i++)
	{

	 if(i==len-1)
	 {
	   jl.setText("Scan Completed !!!");
	 }
	
	 File fg=new File("C:"+"/"+str22[i]);

	 System.out.println(" |_ "+str22[i]);
	 files++;
	 clean++;
	
			              
	 					System.out.println(" |   |   |  |_"+str22[i]);try{Thread.sleep(50);}catch(Exception hy){}
						jl.setText("");
			                	jl.setForeground(Color.black);
	         				 jl.setText("Scanning File:  "+"C:"+"/"+str22[i]);jb.setText(str22[i]);
						  hide1.setText("Scanning File:  "+"C:"+"/"+str22[i]);jb.setText(str22[i]);

						 jl3.setText("Scan File's: "+files+"\n\r"+"  Clean Files: "+clean+"\n\r"+"  Infected File: "+vir+"\n\r");
						  hide3.setText("Scan File's: "+files+"\n\r"+"  Clean Files: "+clean+"\n\r"+"  Infected File: "+vir+"\n\r");



	 logFile.write(" |_ "+str22[i]+"\r\n");try{Thread.sleep(50);}catch(Exception hy){}
	
	 total=total+1;
	 for(int io=0;io<point;io++)
	 {	//System.out.println("List "+database[io]);

	 	if(  database[io].equals( str22[i] ) )
		{
								 jl.setText("");
								 clean--;
			                			jl.setForeground(Color.red);
	         						jl.setText("Scanning File:  "+"C:"+"/"+str22[i]);jb.setText(str22[i]);
								 hide1.setText("Scanning File:  "+"C:"+"/"+str22[i]);jb.setText(str22[i]);

								 jl2.setForeground(Color.red);	
		  			 			jl2.setText("Last Infected File:"+str22[i]+"([Trojan Infected File])");
								hide2.setText("Last Infected File:"+str22[i]+"([Trojan Infected File])");

								mu.addElement(str22[i]+"([Suspecious File]) Action:(File Modified)");	

		  
		  System.out.println("\n\n************* $Virus Found$ ***********");
		  virus v=new virus("C:/"+str22[i]);
		  infected=infected+1;	
		   vir++;	
		} 
			
         }

	 int iz = str22[i].lastIndexOf('.');
	 if( fg.isHidden() && str22[i].substring(iz+1).toLowerCase().equals("exe") || str22[i].substring(iz+1).toLowerCase().equals("msi") || str22[i].substring(iz+1).toLowerCase().equals("pif") || str22[i].substring(iz+1).toLowerCase().equals("int"))
	 {

		 jl.setText("");
								clean--;
			                			jl.setForeground(Color.red);
	         						jl.setText("Scanning File:  "+"C:"+"/"+str22[i]);jb.setText(str22[i]);
								hide1.setText("Scanning File:  "+"C:"+"/"+str22[i]);jb.setText(str22[i]);

								 jl2.setForeground(Color.red);	
		  			 			jl2.setText("Last Infected File:"+str22[i]+"([Suspecious File])");
								hide2.setText("Last Infected File:"+str22[i]+"([Suspecious File])");

								mu.addElement(str22[i]+"([Suspecious File]) Action:(File Modified)");	
		vir++;
		System.out.println("\n\n************* $Virus Found$ ***********");
		System.out.println("Possibility a new Virus");
		virus v=new virus("C:/"+str22[i]);

		 jl.setText("");
	
		
	 } 	
	 String dir=fg.getParent();
	 File fy=new File(dir);
	 String name=fy.getName();
	 if(str22[i].equals(name+".exe"))
	 {	 vir++;
		 jl.setText("");clean--;
			                			jl.setForeground(Color.red);
	         						jl.setText("Scanning File:  "+"C:"+"/"+str22[i]);jb.setText(str22[i]);
								hide1.setText("Scanning File:  "+"C:"+"/"+str22[i]);jb.setText(str22[i]);

								 jl2.setForeground(Color.red);	
		  			 			jl2.setText("Last Infected File:"+str22[i]+"(Win32-Sality[Troj])");
								hide2.setText("Last Infected File:"+str22[i]+"(Win32-Sality[Troj])");

								mu.addElement(str22[i]+"([Suspecious File]) Action:(File Modified)");	

		System.out.println("\n\n****************** $Virus Found$ ****************");
		System.out.println("                       Virus Name: Win32-Sality[Troj]");
		virus v=new virus("C:/"+str22[i]);
		infected=infected+1;
	

	 }

	 if( fg.isDirectory() )
	  {
		try{
		File ff21=new File("C:/"+str22[i]+"/*.*");
		

		String ff11=ff21.getParent();
		System.out.println("Directory Name:"+ff11);
		File ff1a=new File(ff11);
		String str221[]=ff1a.list();
		int len1=str221.length;

		        for(int i1=0;i1<len1;i1++)
			{	

						files++;
						clean++;
	 					
						jl.setText("");
			                	jl.setForeground(Color.black);
						 hide1.setText("Scanning File:  "+"C:/"+str22[i]+"/"+str221[i1]);

	         				 jl.setText("Scanning File:  "+"C:/"+str22[i]+"/"+str221[i1]);jb.setText(str221[i1]);
						 jl3.setText("Scan File's: "+files+"\n\r"+"  Clean Files: "+clean+"\n\r"+"  Infected File: "+vir+"\n\r");
						 hide3.setText("Scan File's: "+files+"\n\r"+"  Clean Files: "+clean+"\n\r"+"  Infected File: "+vir+"\n\r");



	 		System.out.println(" |   |_ "+str221[i1]);try{Thread.sleep(50);}catch(Exception hy){}
			logFile.write(" |   |_ "+str221[i1]+"\r\n");
			 total=total+1;
			 for(int io=0;io<point;io++)
	 		{	
				if(  database[io].equals( str221[i1] ) )
				{
		  			clean--;
					

					 jl.setText("");
			                			jl.setForeground(Color.red);
	         						jl.setText("Scanning File:  "+"C:/"+str22[i]+str221[i1]);jb.setText(str221[i1]);
								 jl2.setForeground(Color.red);	
		  			 			jl2.setText("Last Infected File:"+str221[i1]+"([Trojan Infected File])");
								hide2.setText("Last Infected File:"+str221[i1]+"([Trojan Infected File])");

								mu.addElement(str22[i]+"([Suspecious File]) Action:(File Modified)");	
					vir++;
	
				        System.out.println("\n\n************* $Virus Found$ ***********");
			  		virus v=new virus("C:/"+str22[i]+"/"+str221[i1]);
					System.out.println("2."+strRoot[iq]+str22[i]+"/"+str221[i1]);
					
					infected=infected+1;	
				}
			
			 }
				File fh=new File("C:/"+str22[i]+"/"+str221[i1]);
				int iz1 = str221[i1].lastIndexOf('.');
				if( fh.isHidden() && str221[i1].substring(iz1+1).toLowerCase().equals("exe") || str221[i1].substring(iz1+1).toLowerCase().equals("msi") || str221[i1].substring(iz1+1).toLowerCase().equals("pif") || str221[i1].substring(iz1+1).toLowerCase().equals("ini"))
				 {
					clean--;

					 jl.setText("");
			                			jl.setForeground(Color.red);
	         						jl.setText("Scanning File:  "+"C:/"+str22[i]+str221[i1]);jb.setText(str221[i1]);
								 jl2.setForeground(Color.red);	
		  			 			jl2.setText("Last Infected File:"+str221[i1]+"([Suspecious File])");
								hide2.setText("Last Infected File:"+str221[i1]+"([Suspecious File])");

								mu.addElement(str22[i]+"([Suspecious File]) Action:(File Modified)");	
					vir++;

					System.out.println("\n\n************* $Virus Found$ ***********");
					System.out.println("Possibility a new Virus");
					virus v=new virus("C:/"+str22[i]+"/"+str221[i1]);
		
	 			} 	

				System.out.println("File="+strRoot[iq]+str22[i]+"/"+str221[i1]);


				String dir1=fh.getParent();
				 File fy1=new File(dir1);
				 String name1=fy1.getName();
				
				 System.out.println("Check "+name1+" with "+str221[i1] );
				 if(str221[i1].equals(name1+".exe"))
	
				 {	clean--;
					 vir++;
					 jl.setText("");
			                			jl.setForeground(Color.red);
	         						jl.setText("Scanning File:  "+"C:/"+str22[i]+str221[i1]);jb.setText(str221[i1]);
								 jl2.setForeground(Color.red);	
		  			 			jl2.setText("Last Infected File:"+str221[i1]+"( Win32-Sality[Troj])");
								hide2.setText("Last Infected File:"+str221[i1]+"( Win32-Sality[Troj])");

								mu.addElement(str22[i]+"([Suspecious File]) Action:(File Modified)");	
					
					System.out.println("\n\n****************** $Virus Found$ ****************");
					System.out.println("                       Virus Name: Win32-Sality[Troj]");
					virus v=new virus("C:/"+str22[i]+"/"+str221[i1]);
					infected=infected+1;
	 			}



			 	if( fh.isDirectory() )
	  		 	 {
				File ff21a=new File("C:/"+str22[i]+"/"+str221[i1]+"/*.*");
				System.out.println("Checking File"+"C:/"+str22[i]+"/"+str221[i1]+"/*.*");

				String ff11a=ff21a.getParent();
				System.out.println("Directory Name:"+ff11a);
				File ff1az=new File(ff11a);
				String str221a[]=ff1az.list();
				int len13=str221a.length;

		     	  	 for(int i1a=0;i1a<len13;i1a++)
				{	
	 				System.out.println(" |   |   |_"+str221a[i1a]);

					files++;
						clean++;
	 					
						jl.setText("");
			                	jl.setForeground(Color.black);
	         				 jl.setText("Scanning File:  "+"C:/"+str22[i]+"/"+str221[i1]+str221a[i1a]);jb.setText(str221a[i1a]);
						  hide1.setText("Scanning File:  "+"C:/"+str22[i]+"/"+str221[i1]+str221a[i1a]);jb.setText(str221a[i1a]);

						 jl3.setText("Scan File's: "+files+"\n\r"+"  Clean Files: "+clean+"\n\r"+"  Infected File: "+vir+"\n\r");
						 hide3.setText("Scan File's: "+files+"\n\r"+"  Clean Files: "+clean+"\n\r"+"  Infected File: "+vir+"\n\r");


					logFile.write(" |   |   |_"+str221a[i1a]+"\r\n");try{Thread.sleep(50);}catch(Exception hy){}
					total=total+1;

				 	for(int ioa=0;ioa<point;ioa++)
	 				{	
					if(  database[ioa].equals( str221a[i1a] ) )
					{clean--;
		  			jl.setForeground(Color.red);
	         						jl.setText("Scanning File:  "+"C:/"+str22[i]+"/"+str221[i1]+str221a[i1a]);jb.setText(str221a[i1a]);
								 jl2.setForeground(Color.red);	
		  			 			jl2.setText("Last Infected File:"+str221a[i1a]+"([Win32-sality])");
								hide2.setText("Last Infected File:"+str221a[i1a]+"([Win32-sality])");

								mu.addElement(str221a[i1a]+"([Suspecious File]) Action:(File Modified)");	
					vir++;
	
				        System.out.println("\n\n************* $Virus Found$ ***********");
			  		virus v=new virus("C:/"+str22[i]+"/"+str221[i1]+"/"+str221a[i1a]);
					//System.out.println("3."+strRoot[iq]+str22[i]+"/"+str221[i1]+"/"+str221a[i1a]);
					
					infected=infected+1;	
					}

					}

					File ffg=new File("C:/"+str22[i]+"/"+str221[i1]+"/"+str221a[i1a]);

					int iz11 = str221a[i1a].lastIndexOf('.');
					if( ffg.isHidden() && str221a[i1a].substring(iz11+1).toLowerCase().equals("exe") || str221a[i1a].substring(iz11+1).toLowerCase().equals("msi") || str221a[i1a].substring(iz11+1).toLowerCase().equals("pif") || str221a[i1a].substring(iz11+1).toLowerCase().equals("ini"))
				 	{clean--;		vir++;

								jl.setForeground(Color.red);
	         						jl.setText("Scanning File:  "+"C:/"+str22[i]+"/"+str221[i1]+str221a[i1a]);jb.setText(str221a[i1a]);
								 jl2.setForeground(Color.red);	
		  			 			jl2.setText("Last Infected File:"+str221a[i1a]+"([Suspecious File])");
								hide2.setText("Last Infected File:"+str221a[i1a]+"([Suspecious File])");

								mu.addElement(str221a[i1a]+"([Suspecious File])  Action:(File Modified)");	

					System.out.println("\n\n************* $Virus Found$ ***********");
					System.out.println("Possibility a new Virus");
					virus v=new virus("C:/"+str22[i]+"/"+str221[i1]+"/"+str221a[i1a]);
		
	 				} 

					String dir2=ffg.getParent();
					 File fy2=new File(dir2);
					 String name2=fy2.getName();
					 if(str221a[i1a].equals(name2+".exe"))
						 {
							clean--;
								jl.setForeground(Color.red);
	         						jl.setText("Scanning File:  "+"C:/"+str22[i]+"/"+str221[i1]+str221a[i1a]);jb.setText(str221a[i1a]);
								 jl2.setForeground(Color.red);	
		  			 			jl2.setText("Last Infected File:"+str221a[i1a]+"([Win32 Sality[Troj]])");
								hide2.setText("Last Infected File:"+str221a[i1a]+"([Win32 Sality[Troj]])");

								mu.addElement(str221a[i1a]+"([Suspecious File])  Action:(File Modified)");	
								vir++;
							System.out.println("\n\n****************** $Virus Found$ ****************");
							System.out.println("                       Virus Name: Win32-Sality[Troj]");
							virus v=new virus("C:/"+str22[i]+"/"+str221[i1]+"/"+str221a[i1a]);
							
					                infected=infected+1;

	 					}

					if( ffg.isDirectory() )	
					{

					File ff21a1=new File("c:/"+str22[i]+"/"+str221[i1]+"/*.*");
					//System.out.println("Checking File"+(String)ff21a1.getName());

					String f11=ff21a1.getParent();
					System.out.println("Directory Name:"+f11);
					File f111=new File(f11);
					String str1z[]=f111.list();
					int l1=str1z.length;

					 for(int z=0;z<l1;z++)
						{	
	 					System.out.println(" |   |   |  |_"+str1z[z]);
						files++;
						clean++;
	 					
						jl.setText("");
			                	jl.setForeground(Color.black);
	         				 jl.setText("Scanning File:  "+"c:/"+str22[i]+"/"+str221[i1]+str1z[z]);jb.setText(str1z[z]);
						 hide1.setText("Scanning File:  "+"c:/"+str22[i]+"/"+str221[i1]+str1z[z]);jb.setText(str1z[z]);

						 jl3.setText("Scan File's: "+files+"\n\r"+"  Clean Files: "+clean+"\n\r"+"  Infected File: "+vir+"\n\r");
						 hide3.setText("Scan File's: "+files+"\n\r"+"  Clean Files: "+clean+"\n\r"+"  Infected File: "+vir+"\n\r");


						logFile.write(" |   |   |  |_"+str1z[z]+"\r\n");
						total=total+1;

				 		for(int za=0;za<point;za++)
	 					{	
								if(  database[za].equals( str1z[z] ) )
								{
								clean--;

								 jl.setText("");
			                			jl.setForeground(Color.red);
	         						jl.setText("Scanning File:  "+"c:/"+str22[i]+"/"+str221[i1]+str1z[z]);jb.setText(str1z[z]);
								 jl2.setForeground(Color.red);	
		  			 			jl2.setText("Last Infected File:"+str1z[z]+"([Suspecious File])");
								hide2.setText("Last Infected File:"+str1z[z]+"([Suspecious File])");

								mu.addElement(str1z[z]+"([Suspecious File])  Action:(File Modified)");	
								vir++;

		  
							        System.out.println("\n\n************* $Virus Found$ ***********");
			  					virus v=new virus("C:/"+str22[i]+"/"+str221[i1]+"/"+str221a[i1a]+"/"+str1z[z]);
								System.out.println("3."+strRoot[iq]+str22[i]+"/"+str221[i1]+"/"+str221a[i1a]+"/"+str1z[z] );
								
								infected=infected+1;	
								}
					
						}
						

					}	

				



			  }	
			

			}
	  		 	 }
			}

		}catch(Exception h){ System.out.println(h); }

		
          }  	
	      	


	}



       }
	//logFile.close();
    }catch(Exception gt){ System.out.println(gt);}
   } 	









//End




		if(ans==8)
		{
		try{
		System.out.println("\n\n\n\n\n");
		System.out.println("Software Name: NAP Antivirus");
		try{Thread.sleep(2000);}catch(Exception hy){}
		System.out.println("Version Info: 1.0.0.0");
		Thread.sleep(2000);
		System.out.println("Author: Nitesh Agarwal");
		Thread.sleep(2000);
		System.out.println("Tester: Nitesh Agarwal");
		Thread.sleep(2000);
		System.out.println("DFD Concept: Shekhar Parulekar");
		Thread.sleep(2000);
		System.out.println("Database By: Bmhousing.in");
		Thread.sleep(2000);
		System.out.println("Releasing Date: 17 AUG 2015");
		Thread.sleep(2000);
		System.out.println("Test Start: 18 AUG 2015");
		Thread.sleep(2000);
		System.out.println("Test Complete: 20 AUG 2015");
		Thread.sleep(2000);
		System.out.println("Requirement: JDK 1.7");
		Thread.sleep(2000);
		System.out.println("Feedback on:");
		System.out.println("           1.agarwalnitesh42@gmail.com");
		System.out.println("           2.www.bmhousing.in   ");
		Thread.sleep(4000);
		}catch(Exception e){}
		}

		if(ans==9)
		{
			System.exit(0);
		}

		if(ans==6)
		{
		System.out.println("\n\nVirus vault");
				File ff2=new File("Virus Vault/*.*");
				String ff1=ff2.getParent();
				File ff=new File(ff1);
				String str22[]=ff.list();
				int len=str22.length;
				if(len==0)
				{
					System.out.println(" |_ Virus vault is empty");
				}
				else{
				for(int y=0;y<len;y++)
				System.out.println(" |_"+str22[y]);
				}
				System.out.println("\n"+len+" File Found");
				
		}

	
		if(ans==3)
		{
		//System.out.println("Entered Two");
		
		try{	
		         clean=0;vir=0;files=0;	 mu.removeAllElements();
			 img.setVisible(true);img2.setVisible(true);
 			File ffh=new File("drive.cab");
			if( ffh.exists() )
			{
				FileReader fr=new FileReader("drive.cab");
				JTextField hj=new JTextField();
				hj.read(fr,null);
				fr.close();
				drive=(String)hj.getText();
				o2.setEnabled(true);
				kl.setVisible(true);
			        jf.setVisible(false);

				main.setSelectedItem(hj.getText());

				File ffhw=new File("drive.cab");
				ffhw.delete();
			}
			
			strRoot2=drive;
			System.out.println("Drive "+drive);
			start=System.currentTimeMillis();

   			FileReader rd=new FileReader("virus_database/point.dat") ;
   			JTextField jt=new JTextField();
   			jt.read(rd,null);
  			 point=Integer.parseInt(jt.getText());
  			 rd.close();
 
  			 System.out.print("Please wait Loading Database");
			 hide1.setText("Please wait Loading Database");	
 			  for(int z=0;z<point;z++)	
 			  {
				FileReader r=new FileReader("virus_database/malware"+z+".res");
				JTextField jt2=new JTextField();
				jt2.read(r,null);
				database[z]=jt2.getText();
				r.close();

				int per=(z*100)/point;
	                                     //System.out.println(database[z]+" "+"["+per +"%]");
	
  			 }
				        for(int x=0;x<4;x++)
   					{
   					 for(int y=0;y<3;y++)
   					 System.out.print(jl.getText()+". ");
   					 try{Thread.sleep(500);}catch(Exception gta){}	
   					}
					System.out.println("Database Load Sucessfully!");

  					  File f=new File(strRoot2+"/'.'");
   					  logFile.write(strRoot2+"\r\n");	
     					  File strRoot[]=f.listRoots();
     	

    					 System.out.println("System Drive...");	
    					 for(int k=0;k<1;k++)
	 				{
	 					 System.out.println(" |_"+strRoot[k]);
						 logFile.write(" |_"+strRoot[k]+"\r\n");try{Thread.sleep(100);}catch(Exception hy){}
	 				}			

					System.out.println("Start Scan...");
					for(int iq=0;iq<1;iq++)
				{
				System.out.println("\n\n\n"+"System "+" Drive");
				File ff2=new File(strRoot2+"/*.*");
				String ff1=ff2.getParent();
				File ff=new File(ff1);
				String str22[]=ff.list();
				int len=str22.length;
	
				for(int i=0;i<len;i++)
	
					{
						if(i==len-1)
						 {
	   					jl.setText("Scan Completed !!!");
	 					}
	
							 File fg=new File(strRoot2+"/"+str22[i]);
								
 							files++;
						   clean++;
	 					
						jl.setText("");
			                	jl.setForeground(Color.black);
	         				 jl.setText("Scanning File:  "+strRoot2+"/"+str22[i]);jb.setText(str22[i]);
						hide1.setText("Scanning File:  "+strRoot2+"/"+str22[i]);jb.setText(str22[i]);

						 jl3.setText("Scan File's: "+files+"\n\r"+"  Clean Files: "+clean+"\n\r"+"  Infected File: "+vir+"\n\r");
						 hide3.setText("Scan File's: "+files+"\n\r"+"  Clean Files: "+clean+"\n\r"+"  Infected File: "+vir+"\n\r");




	 						System.out.println(" |_ "+str22[i]);
							 logFile.write(" |_ "+str22[i]+"\r\n");
							   	
	
							 total=total+1;
								 for(int io=0;io<point;io++)
									 {	//System.out.println("List "+database[io]);

										 	if(  database[io].equals( str22[i] ) )
												{
		  
		  										  hide2.setText("Last Infected : "+ str22[i]);
												  jl2.setText("Last Infected : "+ str22[i]);
		
												  virus v=new virus(strRoot2+"/"+str22[i]);
												  infected=infected+1;	
												} 
			
       									  }

									 int iz = str22[i].lastIndexOf('.');
									 if( fg.isHidden() && str22[i].substring(iz+1).toLowerCase().equals("exe") || str22[i].substring(iz+1).toLowerCase().equals("msi") || str22[i].substring(iz+1).toLowerCase().equals("pif") || str22[i].substring(iz+1).toLowerCase().equals("inf"))
									 {
										clean--;

								         jl.setText("");
			                			            jl.setForeground(Color.red);
	         						              jl.setText("Scanning File:  "+strRoot2+"/"+str22[i]);jb.setText(str22[i]);
										hide1.setText("Scanning File:  "+strRoot2+"/"+str22[i]);jb.setText(str22[i]);

								             jl2.setForeground(Color.red);	
		  			 			              jl2.setText("Last Infected File:"+str22[i]+"([[Trojan Horese]])");
									      hide2.setText("Last Infected File:"+str22[i]+"([[Trojan Horese]])");
	
								                mu.addElement(str22[i]+"([Trojan Horese])  Action:(File Modified)");	
								                   vir++;

									System.out.println("\n\n************* $Virus Found$ ***********");
									System.out.println("Possibility a new Virus");
									virus v=new virus(strRoot2+"/"+str22[i]);
		
									 } 	
	 String dirg=fg.getParent();								 String dir=fg.getParent();
	 File fy=new File(dirg);
	 String name=fy.getName();
	 //System.out.println("Check "+name+" with "+str22[i] );
	 if(str22[i].equals(name+".exe"))
	 {

									clean--;

								         jl.setText("");
			                			            jl.setForeground(Color.red);
	         						              jl.setText("Scanning File:  "+strRoot2+"/"+str22[i]);jb.setText(str22[i]);
								             jl2.setForeground(Color.red);	
		  			 			              jl2.setText("Last Infected File:"+str22[i]+"(Win32-Sality[Troj])");
										hide2.setText("Last Infected File:"+str22[i]+"(Win32-Sality[Troj])");

								                mu.addElement(str22[i]+"(Win32-Sality[Troj])  Action:(File Modified)");	
								                   vir++;

		System.out.println("\n\n****************** $Virus Found$ ****************");
		System.out.println("                       Virus Name: Win32-Sality[Troj]");
		virus v=new virus(strRoot2+"/"+str22[i]);
		infected=infected+1;

	 }
									
	if( fg.isDirectory() )
	  {
		try{
		File ff21=new File(strRoot2+"/"+str22[i]+"/*.*");
		

		String ff11=ff21.getParent();
		//System.out.println("Directory Name:"+ff11);
		File ff1a=new File(ff11);
		String str221[]=ff1a.list();
		int len1=str221.length;

		        for(int i1=0;i1<len1;i1++)
			{	
	 		System.out.println(" |   |_ "+str221[i1]);try{Thread.sleep(100);}catch(Exception hy){}
			logFile.write(" |   |_ "+str221[i1]+"\r\n");
			 total=total+1;

			files++;
						clean++;
	 					
						jl.setText("");
			                	jl.setForeground(Color.black);
	         				 jl.setText("Scanning File:  "+strRoot2+"/"+str22[i]+"/"+str221[i1]);jb.setText(str221[i1]);
						 hide1.setText("Scanning File:  "+strRoot2+"/"+str22[i]+"/"+str221[i1]);jb.setText(str221[i1]);

						 jl3.setText("Scan File's: "+files+"\n\r"+"  Clean Files: "+clean+"\n\r"+"  Infected File: "+vir+"\n\r");

						 hide3.setText("Scan File's: "+files+"\n\r"+"  Clean Files: "+clean+"\n\r"+"  Infected File: "+vir+"\n\r");

			 for(int io=0;io<point;io++)
	 		{	
				if(  database[io].equals( str221[i1] ) )
				{

									clean--;

								         jl.setText("");
			                			            jl.setForeground(Color.red);
	         						              jl.setText("Scanning File:  "+strRoot2+"/"+str22[i]+"/"+str221[i1]);jb.setText(str221[i1]);
								             jl2.setForeground(Color.red);	
		  			 			              jl2.setText("Last Infected File:"+str221[i1]+"([Suspecious File])");
									      hide2.setText("Last Infected File:"+str221[i1]+"([Suspecious File])");
	
								                mu.addElement(str221[i1]+"([Suspecious File])  Action:(File Modified)");	
								                   vir++;
		
		  
				        System.out.println("\n\n************* $Virus Found$ ***********");
			  		virus v=new virus(strRoot2+"/"+str22[i]+"/"+str221[i1]);
					System.out.println("2."+strRoot2+"/"+str22[i]+"/"+str221[i1]);
					
					infected=infected+1;	
				}
			
			 }
				File fh=new File(strRoot2+"/"+str22[i]+"/"+str221[i1]);
				//System.out.println("File="+strRoot2+"/"+str22[i]+"/"+str221[i1]);


									int iz2 = str221[i1].lastIndexOf('.');
									if( fh.isHidden() && str221[i1].substring(iz2+1).toLowerCase().equals("exe") || str221[i1].substring(iz2+1).toLowerCase().equals("msi") || str221[i1].substring(iz2+1).toLowerCase().equals("pif") || str221[i1].substring(iz2+1).toLowerCase().equals("ini"))
				 					{
									clean--;

								         jl.setText("");
			                			            jl.setForeground(Color.red);
	         						              jl.setText("Scanning File:  "+strRoot2+"/"+str22[i]+"/"+str221[i1]);jb.setText(str221[i1]);
								             jl2.setForeground(Color.red);	
		  			 			              jl2.setText("Last Infected File:"+str221[i1]+"([win32 FileInfector])");
										 hide2.setText("Last Infected File:"+str221[i1]+"([win32 FileInfector])");

								                mu.addElement(str221[i1]+"([win32 FileInfector])  Action:(File Modified)");	
								                   vir++;
										System.out.println("\n\n************* $Virus Found$ ***********");
										System.out.println("Possibility a new Virus");
										virus v=new virus(strRoot2+"/"+str22[i]+"/"+str221[i1]);
		
	 								} 
						 String dir11=fh.getParent();								
						 File fy1=new File(dir11);
						 String name1=fy1.getName();
						 //System.out.println("Check "+name1+" with "+str221[i1] );
						 if(str221[i1].equals(name1+".exe"))
						 {
									clean--;

								         jl.setText("");
			                			            jl.setForeground(Color.red);
	         						              jl.setText("Scanning File:  "+strRoot2+"/"+str22[i]+"/"+str221[i1]);jb.setText(str221[i1]);
								             jl2.setForeground(Color.red);	
		  			 			              jl2.setText("Last Infected File:"+str221[i1]+"([Win32-Sality[Troj]])");
									      hide2.setText("Last Infected File:"+str221[i1]+"([Win32-Sality[Troj]])");

								                mu.addElement(str221[i1]+"([Win32-Sality[Troj]])  Action:(File Modified)");	
								                   vir++;

							System.out.println("\n\n****************** $Virus Found$ ****************");
							System.out.println("                       Virus Name: Win32-Sality[Troj]");
							virus v=new virus(strRoot2+"/"+str22[i]+"/"+str221[i1]);
							infected=infected+1;

						 }

			 	if( fh.isDirectory() )
	  		 	 {
				File ff21a=new File(strRoot2+"/"+str22[i]+"/"+str221[i1]+"/*.*");
				//System.out.println("Checking File"+(String)ff21a.getName());

				String ff11a=ff21a.getParent();
				System.out.println("Directory Name:"+ff11a);
				File ff1az=new File(ff11a);
				String str221a[]=ff1az.list();
				int l2=str221a.length;


		     	  	 for(int i2=0;i2<l2;i2++)
				{	
	 				System.out.println(" |   |   |_"+str221a[i2]);
					logFile.write(" |   |   |_"+str221a[i2]+"\r\n");try{Thread.sleep(100);}catch(Exception hy){}
					total=total+1;

 
					        files++;
						clean++;
	 					
						jl.setText("");
			                	jl.setForeground(Color.black);
	         				 jl.setText("Scanning File:  "+strRoot2+"/"+str22[i]+"/"+str221[i1]+"/"+str221a[i2]);jb.setText(str221a[i2]);
					         hide1.setText("Scanning File:  "+strRoot2+"/"+str22[i]+"/"+str221[i1]+"/"+str221a[i2]);jb.setText(str221a[i2]);

						 jl3.setText("Scan File's: "+files+"\n\r"+"  Clean Files: "+clean+"\n\r"+"  Infected File: "+vir+"\n\r");
						  hide3.setText("Scan File's: "+files+"\n\r"+"  Clean Files: "+clean+"\n\r"+"  Infected File: "+vir+"\n\r");
	



				 	for(int ioa=0;ioa<point;ioa++)
	 				{	
					if(  database[ioa].equals( str221a[i2] ) )
					{
		  							clean--;

								         jl.setText("");
			                			            jl.setForeground(Color.red);
	         						              jl.setText("Scanning File:  "+strRoot2+"/"+str22[i]+"/"+str221[i1]+"/"+str221a[i2]);jb.setText(str221a[i2]);
								             jl2.setForeground(Color.red);	
		  			 			              jl2.setText("Last Infected File:"+str221a[i2]+"([Win32 FileInfector File])");
										hide2.setText("Last Infected File:"+str221a[i2]+"([Win32 FileInfector File])");

								                mu.addElement(str221a[i2]+"([Suspecious File])  Action:(File Modified)");	
								                   vir++;
				        System.out.println("\n\n************* $Virus Found$ ***********");
			  		virus v=new virus(strRoot2+"/"+str22[i]+"/"+str221[i1]+"/"+str221a[i2]);
					System.out.println("3."+strRoot2+"/"+str22[i]+"/"+str221[i1]+"/"+str221a[i2]);
					
					infected=infected+1;	
					}
					}
					File ffg=new File(strRoot2+"/"+str22[i]+"/"+str221[i1]+"/"+str221a[i2]);

									int iz1 = str221[i2].lastIndexOf('.');
									if( ffg.isHidden() && str221[i2].substring(iz1+1).toLowerCase().equals("exe") || str221[i2].substring(iz1+1).toLowerCase().equals("msi") || str221[i2].substring(iz1+1).toLowerCase().equals("pif") || str221[i2].substring(iz1+1).toLowerCase().equals("inh"))
				 					{

										clean--;

								         jl.setText("");
			                			            jl.setForeground(Color.red);
	         						              jl.setText("Scanning File:  "+strRoot2+"/"+str22[i]+"/"+str221[i1]+"/"+str221a[i2]);jb.setText(str221a[i2]);
								             jl2.setForeground(Color.red);	
		  			 			              hide2.setText("Last Infected File:"+str221a[i2]+"([Suspecious File])");
										 jl2.setText("Last Infected File:"+str221a[i2]+"([Suspecious File])");

								                mu.addElement(str221a[i2]+"([Suspecious File])  Action:(File Modified)");	
								                   vir++;
										System.out.println("\n\n************* $Virus Found$ ***********");
										System.out.println("Possibility a new Virus");
										virus v=new virus(strRoot2+"/"+str22[i]+"/"+str221[i1]+"/"+str221a[i2]);
		
	 								} 
						 String dir12v=ffg.getParent();								 
						 File fy12=new File(dir12v);
						 String name12=fy12.getName();
						 //System.out.println("Check "+name12+" with "+str221a[i2] );	
						 if(str221a[i2].equals(name12+".exe"))
						 {

							clean--;

								         jl.setText("");
			                			            jl.setForeground(Color.red);
	         						              jl.setText("Scanning File:  "+strRoot2+"/"+str22[i]+"/"+str221[i1]+"/"+str221a[i2]);jb.setText(str221a[i2]);
								             jl2.setForeground(Color.red);	
		  			 			              jl2.setText("Last Infected File:"+str221a[i2]+"([Win32-Sality[Troj]])");
										hide2.setText("Last Infected File:"+str221a[i2]+"([Win32-Sality[Troj]])");

								                mu.addElement(str221a[i2]+"(Win32-Sality[Troj])  Action:(File Modified)");	
								                   vir++;
							System.out.println("\n\n****************** $Virus Found$ ****************");
							System.out.println("                       Virus Name: Win32-Sality[Troj]");
							virus v=new virus(strRoot2+"/"+str22[i]+"/"+str221[i1]+"/"+str221a[i2]);
							infected=infected+1;

						 }


					if( ffg.isDirectory() )	
					{

					File ff21a1=new File(strRoot2+"/"+str22[i]+"/"+str221[i1]+"/"+str221a[i2]+"/*.*");
					//System.out.println("Checking File"+(String)ff21a.getName());
					

					String f11=ff21a1.getParent();
					//System.out.println("Directory Name:"+f11);

					try{Thread.sleep(100);}catch(Exception h){}
					File f111=new File(f11);
					String str1c[]=f111.list();
					int l1=str1c.length;

					 for(int z=0;z<l1;z++)
						{	
	 					System.out.println(" |   |   |  |_"+str1c[z]);
						logFile.write(" |   |   |  |_"+str1c[z]+"\r\n");try{Thread.sleep(100);}catch(Exception hy){}
						total=total+1;

						files++;
						clean++;
	 					
						jl.setText("");
			                	jl.setForeground(Color.black);
	         				 jl.setText("Scanning File:  "+strRoot2+"/"+str22[i]+"/"+str221[i1]+"/"+str221a[i2]+"/"+str1c[z]);jb.setText(str1c[z]);
						hide1.setText("Scanning File:  "+strRoot2+"/"+str22[i]+"/"+str221[i1]+"/"+str221a[i2]+"/"+str1c[z]);jb.setText(str1c[z]);

						 jl3.setText("Scan File's: "+files+"\n\r"+"  Clean Files: "+clean+"\n\r"+"  Infected File: "+vir+"\n\r");
						  hide3.setText("Scan File's: "+files+"\n\r"+"  Clean Files: "+clean+"\n\r"+"  Infected File: "+vir+"\n\r");



				 		for(int za=0;za<point;za++)
	 					{	
								if(  database[za].equals( str1c[z] ) )
								{
		  
								clean--;

								         jl.setText("");
			                			            jl.setForeground(Color.red);
	         						              jl.setText("Scanning File:  "+strRoot2+"/"+str22[i]+"/"+str221[i1]+"/"+str221a[i2]+"/"+str1c[z]);jb.setText(str1c[z]);
								             jl2.setForeground(Color.red);	
		  			 			              jl2.setText("Last Infected File:"+str1c[z]+"([Suspecious File])");
										 hide2.setText("Last Infected File:"+str1c[z]+"([Suspecious File])");

								                mu.addElement(str1c[z]+"([Suspecious File])  Action:(File Modified)");	
								                   vir++;

							        System.out.println("\n\n************* $Virus Found$ ***********");
			  					virus v=new virus(strRoot2+"/"+str22[i]+"/"+str221[i1]+"/"+str221a[i2]+"/"+str1c[z]);
								System.out.println("3."+strRoot2+"/"+str22[i]+"/"+str221[i1]+"/"+str221a[i2]+"/"+str1c[z] );
								
								infected=infected+1;	
								}
					
						}
						

						

				}



			  }	
			

			}
	  		 	 }
			}
		}catch(Exception fgq){}
	  }
					
	

		// Start 
		

		if( fg.isDirectory() )
	  {
		try{
		File ff21=new File(strRoot2+"/"+str22[i]+"/*.*");
		

		String ff11=ff21.getParent();
		//System.out.println("Directory Name:"+ff11);
		File ff1a=new File(ff11);
		String str221[]=ff1a.list();
		int len1=str221.length;

		        for(int i1=0;i1<len1;i1++)
			{	
	 		System.out.println(" |   |_ "+str221[i1]);
			logFile.write(" |   |_ "+str221[i1]+"\r\n");
			 total=total+1;
			 for(int io=0;io<point;io++)
	 		{	
				if(  database[io].equals( str221[i1] ) )
				{
		  
				        System.out.println("\n\n************* $Virus Found$ ***********");
			  		virus v=new virus(strRoot2+"/"+str22[i]+"/"+str221[i1]);
					System.out.println("2."+strRoot2+"/"+str22[i]+"/"+str221[i1]);
					
					infected=infected+1;	
				}
			
			 }
				File fh=new File(strRoot2+"/"+str22[i]+"/"+str221[i1]);
				//System.out.println("File="+"C:/"+str22[i]+"/"+str221[i1]);

									int izz = str221[i1].lastIndexOf('.');
									if( fh.isHidden() && str221[i1].substring(izz+1).toLowerCase().equals("exe") || str221[i1].substring(izz+1).toLowerCase().equals("msi") || str221[i1].substring(izz+1).toLowerCase().equals("pif") || str221[i1].substring(izz+1).toLowerCase().equals("int"))
				 					{
										System.out.println("\n\n************* $Virus Found$ ***********");
										System.out.println("Possibility a new Virus");
										virus v=new virus(strRoot2+"/"+str22[i]+"/"+str221[i1]);
		
	 								} 


			 	if( fh.isDirectory() )
	  		 	 {
				File ff21a=new File(strRoot2+"/"+str22[i]+"/"+str221[i1]+"/*.*");
				//System.out.println("Checking File"+(String)ff21a.getName());

				String ff11a=ff21a.getParent();
				System.out.println("Directory Name:"+ff11a);
				File ff1az=new File(ff11a);
				String str221a[]=ff1az.list();
				int l2=str221a.length;


		     	  	 for(int i2=0;i2<l2;i2++)
				{	
	 				System.out.println(" |   |   |_"+str221a[i2]);
					logFile.write(" |   |   |_"+str221a[i2]+"\r\n");
					total=total+1;

				 	for(int ioa=0;ioa<point;ioa++)
	 				{	
					if(  database[ioa].equals( str221a[i2] ) )
					{
		  
				        System.out.println("\n\n************* $Virus Found$ ***********");
			  		virus v=new virus(strRoot2+"/"+str22[i]+"/"+str221[i1]+"/"+str221a[i2]);
					System.out.println("3."+"C:/"+str22[i]+"/"+str221[i1]+"/"+str221a[i2]);
					
					infected=infected+1;	
					}
					}
					File ffg=new File(strRoot2+"/"+str22[i]+"/"+str221[i1]+"/"+str221a[i2]);
					
									int iz11a = str221a[i2].lastIndexOf('.');
									if( fh.isHidden() && str221a[i2].substring(iz11a+1).toLowerCase().equals("exe") || str221a[i2].substring(iz11a+1).toLowerCase().equals("msi") || str221a[i2].substring(iz11a+1).toLowerCase().equals("pif") )
				 					{
										System.out.println("\n\n************* $Virus Found$ ***********");
										System.out.println("Possibility a new Virus");
										virus v=new virus(strRoot2+"/"+str22[i]+"/"+str221[i1]+"/"+str221a[i2]);
		
	 								} 


					if( ffg.isDirectory() )	
					{

					File ff21a1=new File(strRoot2+"/"+str22[i]+"/"+str221[i1]+"/"+str221a[i2]+"/*.*");
					System.out.println("Checking File"+(String)ff21a.getName());
					

					String f11=ff21a1.getParent();
					System.out.println("Directory Name:"+f11);

					try{Thread.sleep(100);}catch(Exception h){}
					File f111=new File(f11);
					String str1c[]=f111.list();
					int l1=str1c.length;

					 for(int z=0;z<l1;z++)
						{	
	 					System.out.println(" |   |   |  |_"+str1c[z]);
						total=total+1;
						logFile.write(" |   |   |  |_"+str1c[z]+"\r\n");

				 		for(int za=0;za<point;za++)
	 					{	
								if(  database[za].equals( str1c[z] ) )
								{
		  
							        System.out.println("\n\n************* $Virus Found$ ***********");
			  					virus v=new virus(strRoot2+"/"+str22[i]+"/"+str221[i1]+"/"+str221a[i2]+"/"+str1c[z]);
								System.out.println("3."+"C:/"+str22[i]+"/"+str221[i1]+"/"+str221a[i2]+"/"+str1c[z] );
								
								infected=infected+1;	
								}
					
						}
						

						

				}



			  }	
			

			}
	  		 	 }
			}
		}catch(Exception fgq){}
	  }








		// End

		

		}
	}
		}catch(Exception fg){}
		}

		//End
		
		 

		if(ans==1)
		{	
                File fw=new File("c:/'.'");
		
   
		stop = System.currentTimeMillis() - start;
		long lg = stop/1000;
		long sec=lg;
		
		

     		File strRoot1[]=fw.listRoots();
		System.out.print("\n\n\nScan Drives :");
		for(int p=0;p<strRoot1.length;p++)
		{
		System.out.print(strRoot1[p]+"  ");
		}
		System.out.println("\nTotal  Files="+ total+" File's");
		System.out.println("Total Scan Files="+ total+" File's");
		System.out.println("Total Infected Files="+ infected+" File's");
		System.out.println("Time Taken For Scan: "+sec+" Sec");	
		}
		  
		
		if(ans==2)
		{	
               
		System.out.print("\n\n\nC: Drives :");

		stop = System.currentTimeMillis() - start;
		long lg = stop/1000;
		long sec=lg;
		

		
		System.out.println("\nTotal  Files="+ total+" File's");
		System.out.println("Total Scan Files="+ total+" File's");
		System.out.println("Total Infected Files="+ infected+" File's");
		  System.out.println("Time Taken For Scan: "+sec+" Sec");
		}	

		if(ans==3)
		{	

		stop = System.currentTimeMillis() - start;
		long lg = stop/1000;
		long sec=lg;
		
		System.out.print("\n\n\n"+strRoot2+" Drives :");
		
		System.out.println("\nTotal  Files="+ total+" File's");
		System.out.println("Total Scan Files="+ total+" File's");
		System.out.println("Total Infected Files="+ infected+" File's");
		  System.out.println("Time Taken For Scan: "+sec+" Sec");
		
		}	
		try{
		FileWriter w=new FileWriter("Total_Files.log");
		w.write("************************* $ NAP-Antivirus $ **********************"+"\r\n");
		w.write("                                       Nitesh Agarwal"+"\r\n");
		w.write("*************************************************************"+"\r\n");
		w.write("Total  Files="+ total+" File's"+"\r\n");	
		w.write("Total Scan Files="+ total+" File's"+"\r\n");
		w.write("Virus Infected Files="+ infected +" File's"+"\r\n");
		w.write("*************************************************************"+"\r\n");
		w.write("Date :"+new Date());
		w.close();
		}catch(Exception gt){}
// End

}
}	
	


public static void main(String args[])
{

	splash sp=new splash();
	sp.setVisible(true);
	sp.setSize(297,280);
	sp.setLocation(150,100);
	sp.setVisible(false);
	System.out.println("************** $NAP Antivirus $ ***************\n\n");
	System.out.println("				  Nitesh Agarwal   \n");
	System.out.println(new Date());
	System.out.println("\n\n*********************************************");
	Scanner s=new Scanner(1);
		
	

	
}	
	
} 














