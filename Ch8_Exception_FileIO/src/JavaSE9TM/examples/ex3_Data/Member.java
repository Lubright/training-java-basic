package JavaSE9TM.examples.ex3_Data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Member {

	private String id;
	private String name;
	private int age;
	private static final String fileParentPath_src;
	static {
		System.out.println(Member.class.getName() + " static block is initialized...");
		fileParentPath_src = System.getProperty("user.dir") + File.separator + "ex3_Data";
		File fileParentPath = new File(fileParentPath_src);
		if(!fileParentPath.exists())
		{
			fileParentPath.mkdir();
		}
	}
	
	public Member(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	public void save() throws FileNotFoundException, IOException {
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileParentPath_src + File.separator + id + ".dat"))){
			dos.writeUTF(id);
			dos.writeUTF(name);
			dos.writeInt(age);
		}
	}
	
	public static Member load(String id) throws FileNotFoundException, IOException {
		Member member;
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream(fileParentPath_src + File.separator + id + ".dat"))){
			member = new Member(dis.readUTF(), dis.readUTF(), dis.readInt());
		}
		
		return member;
	}
	

}
