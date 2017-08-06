package test;

import java.io.*; 

public class FileStream {
	public static void main(String[] args){
		FileInputStream fin;
		FileOutputStream fout;
		char ch;
		int data;
		try{
			fin = new FileInputStream(FileDescriptor.in);
			fout = new FileOutputStream("D:\\Java\\Workspace\\Demo\\src\\test\\mytext.txt");
			System.out.println("请输入一个字符串，并以#结束：");
			while((ch = (char)fin.read())!='#'){
				fout.write(ch);
			}
			fin.close();
			fout.close();
			System.out.println();
			fin = new FileInputStream("D:\\Java\\Workspace\\Demo\\src\\test\\mytext.txt");
			fout = new FileOutputStream(FileDescriptor.out);
			while(fin.available()>0){
				data = fin.read();
				fout.write(data);
			}
			fin.close();
			fout.close();
		}
		catch(FileNotFoundException e){
			System.out.println("文件没有找到！");
		}
		catch(IOException e){}
	}
}
