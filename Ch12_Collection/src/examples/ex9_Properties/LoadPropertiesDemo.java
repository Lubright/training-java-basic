package examples.ex9_Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadPropertiesDemo {

	public static void main(String[] args) {
		String fileName = System.getProperty("user.dir") + File.separator + "ex9_properties.txt";
		Properties property = new Properties();
		
		try(FileInputStream fis = new FileInputStream(fileName)){
			property.load(fis);
			
			System.out.println("property: " + property);
			
			System.out.println(property.getProperty("a"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
