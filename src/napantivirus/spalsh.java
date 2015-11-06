package napantivirus;

import java.awt.Color;
import java.awt.Container;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

class splash extends JWindow
{
Container cp;
JPanel p1;
JLabel l3;
JProgressBar jb;
private BufferedImage backgroundImg;

splash()
{
try{
try{
 UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
}catch(Exception de){}


cp=getContentPane();
cp.setLayout(null);


setVisible(true);
setSize(297,280);
setLocation(150,100);




p1=new JPanel(null,true);
p1.setBounds(0,0,297,280);
cp.add(p1);

l3=new JLabel();
l3.setBounds(05,220,297,20);
p1.add(l3);
URL backgroundImgUrl = this.getClass().getResource("/Image/final.png");
try {
	backgroundImg = ImageIO.read(backgroundImgUrl);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}	

JLabel l=new JLabel(new ImageIcon(backgroundImg));
l.setBounds(05,05,291,215);
p1.add(l);
l.setBorder( new LineBorder( new Color(115,176,188), 5 ) );

jb=new JProgressBar();
jb.setBounds(05,250,291,30);
p1.add(jb);


try{ Thread.sleep(1000); }catch(Exception gt){} 

	File f=new File("c:/'.'");
   
    	 File strRoot[]=f.listRoots();
     	

    	//System.out.println("System Drive...");
	
     	for(int k=0;k<strRoot.length;k++)
	 {

	  l3.setText("	Checking Recycle Bin...");
	  File fh=new File(strRoot[k]+"RECYCLER");	
	  if(fh.exists())
	  {
		
		 
		  Runtime r=Runtime.getRuntime();
		  r.exec("Utilities/emptyRecycle.bat");

		fh.delete();
	  }	 
	  
	  jb.setValue(8*k);
	  try{ Thread.sleep(100); }catch(Exception gt){}	
         }

        try{ Thread.sleep(4000); }catch(Exception ft){}
 		 
	for(int k=0;k<strRoot.length;k++)
	 {
	  try{
	  l3.setText("	Checking System Restore Point...");
	  //System.out.println("Cleaning System Restore");
	  File fh2=new File(strRoot[k]+"System Volume Information/'.'");
	  //System.out.println(strRoot[k]+"System Volume Information/'.'");	
	  String str= fh2.getParent();
	  //System.out.println(str+"");	
	  File fgv=new File(str+"");	
	  String strRoot2[]=fgv.list();

	  //int leng=strRoot2.length;
	  for(int y=0;y<strRoot2.length;y++)
	  {
	  File df=new File(strRoot[k]+"System Volume Information/"+strRoot2[y]);
	  //System.out.println(strRoot2[y]);			
	  if(df.exists())
	  {
		  Runtime r=Runtime.getRuntime();
		  r.exec("Utilities/emptySysRes.bat");

		df.delete();
	  }	 
	  }
	  
	  jb.setValue(9*k);
	  try{ Thread.sleep(100); }catch(Exception gt){}
	  }catch(Exception gg){k++;}	
         }

	 try{ Thread.sleep(4000); }catch(Exception ft){}
		
	 l3.setText("	Checking Windows Temp Folder...");
	 try{
	 File fi,fi1,fi2,fi3,fic;
	
	 

 	 for(int j=0;j<3;j++)
	 {
	
	  jb.setValue(19*j);
	  try{ Thread.sleep(100); }catch(Exception gt){}	
	 }

	
	try{
         Runtime r=Runtime.getRuntime();
         r.exec("Utilities/emptyTmp.bat");
  	  
	 try{ Thread.sleep(4000); }catch(Exception ft){}
	 l3.setText("	Checking User Temp Folder...");
	 
	
	 fic=new File("c:/'.'");
	 
	 //System.out.println(fic.getParent()+"");
	 String hhb=fic.getParent();
	 File fjb=new File(hhb+"");
         String hjb[]=fjb.list();

 	 for(int jbb=0;jbb<hjb.length;jbb++)
	 {
	 File ffbb=new File(hjb[jbb]+"");
	 ffbb.delete();
	  jb.setValue(10*jbb);
	  try{ Thread.sleep(100); }catch(Exception gt){}	
	 }

		
	 Runtime rb=Runtime.getRuntime();
         rb.exec("Utilities/emptyTemp.bat");
	
	 l3.setText("	Start Cleaning computer...");

  	 Runtime rb1=Runtime.getRuntime();
         rb1.exec("start_clean.bat");
	 
	 jb.setValue(jb.getMaximum());
	 
	 try{ Thread.sleep(2000); }catch(Exception gt){}
	}catch(Exception fr){}

	 p1.setVisible(false);
	
	setVisible(false);
	setSize(0,0);

      }catch(Exception ghj){}
  }catch(Exception ghj){}	
}

}
