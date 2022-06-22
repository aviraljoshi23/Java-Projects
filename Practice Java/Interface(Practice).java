import java.util.*;
class details_input
{
    void method1 ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter the Name :-  ");
        String str = sc.nextLine ();
        System.out.print ("Enter the Roll number: - ");
        int roll = sc.nextInt ();
    }
}
interface need
{
    public void method2 ();
}
class Main extends details_input implements need
{
    int total;
    public void method2 ()
    {
        int marks[] = new int[5];
        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter the marks ");
        for (int i = 0; i < 5; i++)
        {
            marks[i] = sc.nextInt ();
	        if (marks[i] > 100 || marks[i] < 0)
	        {
	            System.out.println ("Invalid input");
	            break;
	        }
	        total = total + marks[i];
      }
      System.out.println ("total =" + total);
      double per = (total * 100) / 500;
      System.out.println ("Score  = " + per);
      if (per >= 75.0)
      {
          System.out.println ("Division I");
      }
      else if (per >= 50.0)
      {
          System.out.println ("Division II");
      }
  }
  public static void main (String[]args)
  {
      Main t1 = new Main ();
      for (int k = 0; k < 5; k++)
      {
          t1.method1 ();
	      t1.method2 ();
	      System.out.println ("Thank You");
      }
  }
}


