class Student 
{
	String name;
	int rollno;
	int age;
	double marks;
	
	void reading()
	{
		System.out.println(name+" is reading.");
	}

	Student(String name,int rollno,int age,double marks)
	{
		this.name=name;
		this.rollno=rollno;
		this.age=age;
		this.marks=marks;
	}

	void display()
	{
		System.out.println("Name of student is: "+name);
		System.out.println("Rollno of student is: "+rollno);
		System.out.println("Age of student is: "+age);
		System.out.println("Marks of student is: "+marks);
	}
	
}