
//Question 1
// Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call
// 1 - method of parent class by object of parent class
// 2 - method of child class by object of child class
// 3 - method of parent class by object of child class
class parents
{
    void m1()
    {
        System.out.println("This is parents class");
    }
}
class child extends parents
{
    void m2()
    {
        System.out.println("This is child class");
    }
}
class Main
{
    public static void main(String[] args)
    {
        child t1 = new child();
        // t1.m2();
        t1.m1();
        //parents p1 = new parents();
        // p1.m1();
    }
}


//Question 2
// 2.Create a class named 'Member' having the following members:
// Data members
// 1 - Name
// 2 - Age
// 3 - Phone number
// 4 - Address
// 5 - Salary
// It also has a method named 'printSalary' which prints the salary of the members.
// Two classes 'Employee' and 'Manager' inherits the 'Member' class. The
// 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. 
// Now, assign name, age, phone number, address and salary to an employee and a manager
// by making an object of both of these classes and print the same.
class Member 
{
    String name;
    int salary;
    int age;
    public Member(String name,int salary,int age)
    {
        this.name =  name;
        this.salary =  salary;
        this.age =  age;
    }
    void salary_dedo()
    {
        System.out.println("\t\t IN Member CLASS");
        System.out.println("Name:- "+name+" Salary:- "+salary);
    }
    
}
class Employee extends Member
{
    String specialization;
    public Employee(String name,int salary,int age,String specialization)
    {
        super(name,salary,age);
        this.specialization =  specialization;
    }
    void salary_de()
    {
        System.out.println("Name:- "+name+" Salary:- "+salary+"  Age:- "+age+" Specialization :- "+specialization);
    }
}
class Manager extends Member
{
    String department;
    Manager(String name,int salary,int age,String department)
    {
        super(name,salary,age);
        this.department =  department;
    }
    void salary_de()
    {
        System.out.println("Name:- "+name+  h bjbhjb"  Salary:- "+salary+" Age:- "+age+"  Department:- "+department);
    }
}
class Main
{
    public static void main(String args[])
    {
        Manager m = new Manager("Jay Shah",455000,25,"IT");
        Employee emp = new Employee("Satish Pal",15000,20,"Finance");
        m.salary_de();
        emp.salary_de();
        m.salary_dedo();
        emp.salary_dedo();
    }
}

//Question 3
//.Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods toprint the area and
// perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to initialize
// length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 'super(s,s)'.
// Print the area and perimeter of a rectangle and a square.
class Rectangle
{
    int lenght;
    int breadth;
    void print_Area(int lenght,int breadth)
    {
        System.out.println("Area of Rectangle "+lenght*breadth);
    }
    public Rectangle(int lenght,int breadth)
    {
      print_Area(lenght,breadth);
    }
}
class square extends Rectangle
{
    int a;
    public square(int a)
    {
        super(15,50);
        System.out.println("Area of square :- "+a*a);
    }
}
class Main
{
    public static void main(String args[])
    {
        square a = new square(10);
        
    }
}

