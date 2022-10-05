package comb.pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Aliproperty {

	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		
		FileInputStream fis=new FileInputStream ("C:\\Users\\SD ALI\\workspace\\sampProject\\config.properties");
		
		p.load(fis);
		
		String un=p.getProperty("username");
		System.out.println(un);
		
		String url=p.getProperty("url");
		System.out.println(url);
		
		p.setProperty("friendname2", "Rohan");
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\SD ALI\\workspace\\sampProject\\config.properties");
		p.store(fos, "comment kar Diya");
		
		String pnme=p.getProperty("friendname2");
		System.out.println(pnme);
	}

}
