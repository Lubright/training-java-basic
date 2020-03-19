package examples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ex2_ReduceCollectDemo {

	enum Gender{
		FEMALE, MALE;
	}
	
	static class Employee{
		private String name;
		private int age;
		private Gender gender;
		
		public Employee(String name, int age, Gender gender) {
			this.name = name;
			this.age = age;
			this.gender = gender;
		}
		
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public Gender getGender() {
			return gender;
		}
		
		@Override
		public String toString() {
			return "Employee [name=" + name + ", age=" + age + ", gender=" + gender + "]";
		}
	}
	
	public static <I, R> R mapFunction( I params, Function<I, R> mapper ) {
		return mapper.apply(params);
	}
	
	
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			new Employee("Justin", 39, Gender.MALE),
			new Employee("Amy", 30, Gender.FEMALE),
			new Employee("Irene", 15, Gender.FEMALE)
		);
		
		System.out.println("employees: ");
		employees.stream().forEach( (employee) -> System.out.println(employee) );
		
		long numOfData = employees.stream().map(Employee::getAge).count();
		System.out.println("numOfData: " + numOfData);
		
		int sumOfAge = employees.stream().map(Employee::getAge)
									   .reduce( (total, age)-> total+age )
									   .get();
		System.out.println("sumOfAge: " + sumOfAge);
		
		int sumOfAge2 = employees.stream().map(Employee::getAge)
				   .reduce( (total, age)-> {
					   total += age;
					   return total;
				   })
				   .get();
		
		System.out.println("sumOfAge2: " + sumOfAge2);
		
		List<Integer> aveAge_stream = employees.stream().map(Employee::getAge).collect(Collectors.toList());
		double aveAge = mapFunction(aveAge_stream, (list)->{
			double result = 0;
			for(int i = 0; i<list.size(); i++) {
				result += list.get(i);
			}
			return result/list.size();
		});
		System.out.println("aveAge: " + aveAge);
		
	}

}
