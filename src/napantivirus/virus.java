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


class virus{
BufferedReader br=null;
public String fname="";
int count=0;
int ans=0;
int flag=0;
JButton b1,b2,b3,b4,b5;
JFrame jf;
String name;
File ee;
virus(String str)
{

/// To Block the Virus Infected FIle..
// you can modify this as per your requirement..
//..............................................................................................

File ff=new File(str);
File rr=new File(str+".block");
ff.renameTo(rr);


}

}

