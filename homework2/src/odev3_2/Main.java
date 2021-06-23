package odev3_2;

public class Main {

	public static void main(String[] args) {
	
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setFirstName("engin");
		instructor.setProfession("c#");
		instructor.setLastName("demiroğ");
		instructor.seteMail("engin@demirog.com");
		
		Student student=new Student();
		student.setId(2);
		student.setFirstName("beyza");
		student.setLastName("atar");
		student.setSchool("düzce");
		student.seteMail("beyza@atar.com");
		
		User[] users=new User[] {
			
			instructor,
			student
				
		};
		
		
		UserManager manager=new UserManager();
		manager.multipleAdd(users);
		
		AuthManager authManager=new AuthManager();
		authManager.login(new StudentManager());
		
		

	}

}
