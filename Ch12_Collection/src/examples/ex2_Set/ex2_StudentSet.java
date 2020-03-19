package examples.ex2_Set;

import java.util.HashSet;
import java.util.Set;

public class ex2_StudentSet {
	
	static class Student{
		private String name;
		private String id;
		
		public Student(String name, String id) {
			this.name = name;
			this.id = id;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		
		public String toString() {
			return String.format("(%s, %s)", this.name, this.id);	
		}
		
	}

	public static void main(String[] args) {
		Set<Student> students = new HashSet<>();
		
		students.add(new Student("Justin", "B835031"));
		students.add(new Student("Amy", "B835032"));
		students.add(new Student("Justin", "B835031"));
		
		System.out.println(students);
		
	}
	
}
