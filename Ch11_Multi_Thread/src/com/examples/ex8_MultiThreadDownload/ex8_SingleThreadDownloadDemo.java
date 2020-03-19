package com.examples.ex8_MultiThreadDownload;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

import com.MeasurementTimer;

public class ex8_SingleThreadDownloadDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		MeasurementTimer timer = new MeasurementTimer(ex8_SingleThreadDownloadDemo.class.getName());
		
		timer.start("all");
		URL[] urls = {
			new URL("https://openhome.cc/Gossip/Encoding/"),
			new URL("https://openhome.cc/Gossip/Scala/"),
			new URL("https://openhome.cc/Gossip/JavaScript/"),
			new URL("https://openhome.cc/Gossip/Python/")
		};
		String[] fileNames = {
			"Encoding.html",
			"Scala.html",
			"JavaScript.html",
			"Python.html"
		};
		String outputFileDir = System.getProperty("user.dir") + File.separator + "serial";
		File outputFile = new File(outputFileDir);
		
		if(!outputFile.exists())
			outputFile.mkdir();
		
		for(int i = 0; i<urls.length; i++) {
			// download each page, serially
			dump( urls[i].openStream(), new FileOutputStream(outputFileDir + File.separator + fileNames[i]) );
		}
		
		timer.stop();
		timer.show();
		
	}
	public static void dump(InputStream src, OutputStream dest) {
		try(InputStream is = src;
				OutputStream os = dest){
			byte[] data = new byte[1024];
			int lenOfData;
			
			while( (lenOfData = is.read(data)) != -1 ) {
				os.write(data, 0, lenOfData);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
