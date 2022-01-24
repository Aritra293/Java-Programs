package assgn;

public class MainDemoClass {

	public static void main(String[] args) {
		person p1=new person("Aritra",21);
		student s=new student(5,"Computer science");
		s.display();
		staff st=new staff("3rd Jan");
		employee e=new employee("Kamlesh",41);
		faculty f=new faculty("Technical");
		st.display();
		System.out.println("Designation:"+ f.designation);
		employee e1=new employee("HC Verma",19);
		staff st1=new staff("23rd Feb");
		faculty f1=new faculty("Assistant Professor");
		st1.display();
		System.out.println("Designation:"+ f1.designation);
	}

}
