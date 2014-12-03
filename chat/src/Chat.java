import java.net.*;
import java.io.*;

class Chat extends Thread
	{
	 static DataInputStream in;
	 static PrintWriter pr;
	 static DataInputStream dis;
	 static Thread t1=new Thread();
	 static Thread t2=new Thread();		 
	 static String str,name;
	 static Boolean b=true;	 
	 public static void main(String args[]) throws Exception
		{
		 try
			{
			 ServerSocket ss=new ServerSocket(7000);
			 System.out.print("Enter IP of computer to be connected:");
			 in=new DataInputStream(System.in);
			 String ip=in.readLine();
			 Socket s=new Socket(ip,7001);
			 Socket s1=ss.accept();
			 System.out.println("Connected!!");
			 //System.out.println(InetAddress.getLocalHost().getHostAddress());
			 OutputStream os=s.getOutputStream();
		 	 pr=new PrintWriter(os);
			 pr.println(InetAddress.getLocalHost().getHostAddress());
			 pr.flush();
			 //System.out.println(InetAddress.getLocalHost().getHostAddress());
			 InputStream is=s1.getInputStream();
			 dis=new DataInputStream(is);
			 System.out.println(InetAddress.getLocalHost().getHostAddress());
			 String cip=dis.readLine();
			 System.out.println(InetAddress.getLocalHost().getHostAddress());
			 System.out.println(cip);
			 if(!(ip.equals(cip))) System.exit(0);
			 System.out.println("Successfully connected to "+ip);
			 //else System.exit(0);
			 System.out.println("Enter user name: ");
			 pr.println(in.readLine());
			 pr.flush();
			 name=dis.readLine();
			 while(b)
				{
				 t1.run();
				 t2.run();
				 /*System.out.print("You: ");
				 pr.println(in.readLine());
				 pr.flush();
				 str=dis.readLine();
				 if(str.equals("qqq"))
					{
					 b=false;
					 System.exit(0);
					 }
				 System.out.println(name+": "+str);
				 //System.out.println(str);
				 (I fckd this part up tryin 2 get rid of errors, nd nvr really botherd aftr sum time)
				 ie. this is where my problem lies*/}
			 System.out.println("Chat has ended.");
			 System.exit(0);
			 }
		 catch(Exception e) {System.out.println("ERROR!!!!\n"+e);}
		 }
	  public void run()
		{
		 try
			{
			 //while(b)                        //I don't really remember wat i did here
				{
				 System.out.print("You: ");
				 pr.println(in.readLine());
				 pr.flush();
				 str=dis.readLine();
				 if(str.equals("qqq"))
					{
					 b=false;
					 System.exit(0);
					 }
				 System.out.println(name+": "+str);
				 Thread.sleep(50);
				 }
			 }
		 catch(Exception e) {System.out.println("ERROR!!!!\n"+e);}
		 }
	 }