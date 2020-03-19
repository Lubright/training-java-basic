package examples;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class ex1_UnZipFile {
	
	static void unZipFile(String zippedFileName) {
		InputStream inputStream = null;
		OutputStream outputStream = null;
		ByteArrayOutputStream byteArrayOutputStream = null;
		try {
			System.out.println("zippedFileName: " + zippedFileName);
			File file = new File(zippedFileName);
			File outputFile = null;
			ZipFile zipFile = new ZipFile(file);
			ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
			ZipEntry entry = null;
			
			String outputFileDir = zippedFileName.substring(0, zippedFileName.length()-4);
			
			while( (entry = zipInputStream.getNextEntry()) != null ) {
	            System.out.println("unzip " + entry.getName() + " doc");
	            outputFile = new File(outputFileDir+File.separator+entry.getName());

	            System.out.println("outputFile: " + outputFile);
	            System.out.println("getParentFile: " + outputFile.getParentFile().getName());
	            System.out.println("outputFile: " + outputFile.getName());
	            
	            
	            if(!outputFile.getParentFile().exists()) {
	            	outputFile.getParentFile().mkdir();
	            }
	            if(!outputFile.exists()) {
	            	outputFile.createNewFile();
	            }
	            
	            inputStream = zipFile.getInputStream(entry);
	            outputStream = new FileOutputStream(outputFile);
	            byteArrayOutputStream = new ByteArrayOutputStream();

	            int c = 0;
	            while( (c=inputStream.read()) != -1 ) {
	            	outputStream.write(c);
	                byteArrayOutputStream.write(c);

	            }
	            
	            System.out.println(new String(byteArrayOutputStream.toByteArray()));
	            System.out.println("---------------------------------------------------");
			}
			
			
		} catch (ZipException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				inputStream.close();
				outputStream.close();
				byteArrayOutputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		
	}

	public static void main(String[] args) {
		unZipFile(System.getProperty("user.dir") + File.separator + "data/test_burst1.pat");
		

	}

}
