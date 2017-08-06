package test;

import java.io.*;

public class FileImgStream {
	public static void main(String[] args) throws IOException{
		FileInputStream fin = new FileInputStream("E:\\file\\img\\game.jpg");
		FileOutputStream fout = new FileOutputStream("E:\\file\\img\\game0.jpg");
		System.out.println("文件的大小="+fin.available());
		byte[] b = new byte[fin.available()];
		fin.read(b);
		fout.write(b);
		System.out.print("文件已被复制并被更名！");
		fin.close();
		fout.close();
	}
}
