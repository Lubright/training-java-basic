package JavaSE9TM.examples.ex1_GeneralDumpMethod;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ex1_GeneralDumpMethod {

	public static void main(String[] args) {
		byte[] inputData; // src
		ByteArrayOutputStream bos; // dest
		
		try {
			inputData = "test111\ntest222".getBytes("UTF-8"); // String to byte[]
			bos = new ByteArrayOutputStream();
			
			dumpToFile(new ByteArrayInputStream(inputData), bos); // byte[] to byteArrayInputStream
			
			String outputData = new String(bos.toByteArray()); // bytes[] to String 
			
			System.out.println("outputData: " + outputData);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public static void dumpToFile(InputStream src, OutputStream dest) throws IOException {
		int bufferSize = 1024;
		
		try(InputStream is = src;
				OutputStream os = dest){
			
			byte[] data = new byte[bufferSize];
			int lenOfData;
			
			while( (lenOfData = is.read(data)) != -1 ) { // readData
				os.write(data, 0, lenOfData); // writeData
			}
			
		}
		
	}

}
