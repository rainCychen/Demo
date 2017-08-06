package test;

import java.net.*;
import java.io.*;

public class UrlStream {
	public static void main(String[] args){
		String urlName  = "http://www.edu.cn";
		if (args.length>0) urlName = args[0];
		new UrlStream().display(urlName);
	}
	public void display(String urlName){
		try{
			URL url = new URL(urlName);
//			InputStreamReader in = new InputStreamReader(url.openStream());
//			BufferedReader br = new BufferedReader(in);
//			String aLine;
//			while((aLine = br.readLine())!= null)
//				System.out.println(aLine);
			DataInputStream dataInputStream = new DataInputStream(url.openStream());
			FileOutputStream fileOutputStream = new FileOutputStream(new File("E:\\file\\html", "test.html"));
			byte[] buffer = new byte[dataInputStream.available()];
			int length;
			while ((length = dataInputStream.read(buffer)) > 0) {
				fileOutputStream.write(buffer, 0, length);
			}
			fileOutputStream.close();
		}
		catch(MalformedURLException murle){
			System.out.println(murle);
		}
		catch(IOException ioe){
			System.out.println(ioe);
		}
	}
}
