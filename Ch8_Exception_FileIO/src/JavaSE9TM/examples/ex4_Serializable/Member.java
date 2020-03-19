package JavaSE9TM.examples.ex4_Serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Member implements Serializable {
	private String id;
	private String name;
	private int age;
	private static final String fileParentPath_src;
	
	static {
		System.out.println(Member.class.getName() + " static block is initialized...");
		
		String[] packageNames = Member.class.getPackage().getName().split("\\.");
		String packageName = packageNames[packageNames.length - 1];
		
		fileParentPath_src = System.getProperty("user.dir") + File.separator + packageName;
		File fileParentPath = new File(fileParentPath_src);
		if(!fileParentPath.exists()) {
			fileParentPath.mkdir();
		}
	}

	public Member(String id, String name, int age) {
		super();
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
		try(ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream(fileParentPath_src + File.separator + id + ".dat") )){
			oos.writeObject(this);
		}
	}
	
	public static Member load(String id) throws FileNotFoundException, IOException, ClassNotFoundException {
		Member member;
		
		try(ObjectInputStream ois = new ObjectInputStream( new FileInputStream(fileParentPath_src + File.separator + id + ".dat") )){
			member = (Member) ois.readObject();
		}
		
		
		return member;
	}
	
}
