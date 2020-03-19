package com.examples.ex12_ChannelIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ex12_ChannelIODemo {

	public static void main(String[] args) {
		String source = "./test_file1.txt", target = "./test3.txt";
		
		try(FileChannel in = new FileInputStream(source).getChannel();
				FileChannel out = new FileOutputStream(target).getChannel()){
			
			ByteBuffer byteBuffer = ByteBuffer.allocate((int)in.size());
			in.read(byteBuffer);
			byteBuffer.position(0);
			out.write(byteBuffer);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("program is finished...");
		
	}

}
