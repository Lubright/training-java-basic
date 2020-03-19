package JavaSE9TM.examples.ex2_Buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ex2_BufferedIO {

	public static void main(String[] args) {
		

	}
	
	public static void dump(InputStream src, OutputStream dest) throws IOException {
		int bufferSize = 1024;
		
		try(InputStream is = new BufferedInputStream(src);
				OutputStream os = new BufferedOutputStream(dest)){
			
			byte[] data = new byte[bufferSize];
			int lenOfData;
			
			while( (lenOfData = is.read(data)) != -1 ) {
				os.write(data, 0, lenOfData);
			}
			
		}
		
	}

}
