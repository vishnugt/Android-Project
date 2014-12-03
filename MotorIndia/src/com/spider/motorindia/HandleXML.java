package com.spider.motorindia;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import android.util.Log;

public class HandleXML {
	private String title = "title";
	   private String link = "link";
	   private String description = "description";
	   private String article = "article";
	   private int counter=0,n;

	   private String urlString = null;
	   private XmlPullParserFactory xmlFactoryObject;
	   public volatile boolean parsingComplete = true;
	   private XmlPullParser myparser;
	   Thread thread;
	   
	   public HandleXML(String url, int till){
	      this.urlString = url;
	      this.n=till;
	   }
	   //methods to give the info out
	   public String getTitle(){
	      return title;
	   }
	   public String getLink(){
	      return link;
	   }
	   public String getDescription(){
	      return description;
	   }
	   public String getarticle(){
		      return article;
		   }
	   public XmlPullParser getparse(){
		      return myparser;
		   }
	   
	   
	   public void parseXMLAndStoreIt(XmlPullParser myParser, int n) {
		   Log.i("debug", "start of parsing");
		   // this is where the parsing takes place
	      int event;
	      String text=null;
	      try {
	         event = myParser.getEventType();
	         // traverse till the end
	         counter=0;
	         while (event != XmlPullParser.END_DOCUMENT || counter!=8) {
	        	 Log.i("debug", "loop running");
	         String name=myParser.getName();
	         switch (event){
	            case XmlPullParser.START_TAG:
		        break;
	            case XmlPullParser.TEXT:
			       text = myParser.getText();
	            break;
	            case XmlPullParser.END_TAG:
		           if(name.equals("title")){
	                  title = text;
	               }
	               else if(name.equals("link")){ 	
	                  link = text;
	               }
	               else if(name.equals("description")){
	                  description = text;
	               }
	               else if(name.equals("content:encoded")){
	            	   article = text;
	               }
	               else{
	            	   
	               }
		           
	               break;
	         }
	         counter++;
	         event = myParser.next(); 
	       }
	         Log.i("debug", "loop done");
	       parsingComplete = false;
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	   }
	   public void fetchXML(){
		   Log.i("debug", "start of fetchxml");
	   thread = new Thread(new Runnable(){
	   @Override
	   public void run() {
	      try {
	         URL url = new URL(urlString);
	         HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	         conn.setReadTimeout(10000 /* milliseconds */);
	         conn.setConnectTimeout(15000 /* milliseconds */);
	         conn.setRequestMethod("GET");
	         conn.setDoInput(true);
	         // Starts the query
	         conn.connect();
	         InputStream stream = conn.getInputStream();
	         xmlFactoryObject = XmlPullParserFactory.newInstance();
	         myparser = xmlFactoryObject.newPullParser();
	         myparser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
	         myparser.setInput(stream, null);
	         //sends the xml to the "parser function"
	         parseXMLAndStoreIt(myparser,n);
	         stream.close();
	      } catch (Exception e) {
	      }
	      }
	      });
	   
	  // 	TAIHENDA!!! This thread is never stopped!!!
	      //thread.start(); 
	   }
	}


