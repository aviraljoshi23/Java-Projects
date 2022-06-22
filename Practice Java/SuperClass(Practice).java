class parents
{
    String name = "WhoCares?";
    void demp()
    {
        System.out.println("In Method");
    }
    parents()
    {
        System.out.println("In parents class constructor ");
    }
}
class child extends parents
{
    void demp()
    {
        System.out.println("In child class");
        super.demp();
    }
    child()
    {
        this.demp();
        System.out.println("In default constructor :-"+ super.name);
    }
    child(int num)
    {
        System.out.println("In parameterized constructor(INT)"+num);
        
    }
    child(String name)
    {
        
        //this(25);
        super();
        System.out.println("In parameterized constructor "+name);
    }
}
class Main
{
    public static void main(String [] args)
    {
        child t1 = new child("abhi");
    }
}