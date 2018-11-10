class Student {
	int id;
	String name;
	String gender;
	
	
	boolean updateProfile (String name) {
		this.name = name;
		return true;
	}
	
	public static void main (String args[]) {
		Student student = new Student();
		student.id = 1001;
		student.name = "Ankush";
		student.gender = "yes";
		
		student.updateProfile("Tushi");
		System.out.println(student.name);
	}
	
}
