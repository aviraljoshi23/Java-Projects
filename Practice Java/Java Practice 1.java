/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// public class Main
// {
//      public static void main(String[] args) {
//          int n=1;
//          float a=5,b=10;
//          if(a+b%2==0)
//          {
//              System.out.println("Hello World");
//          }
//          else if(a+b%2!=0){
//              System.out.println("SELECT ANY");
//              switch(n)
//              {
//                  case 1:
//                      System.out.println(a+b);
//                      break;
//                  case 2:
//                      System.out.println(a*b);
//                      break;
//                  case 3:
//                      System.out.println(a-b);
//                      break;
//                  default:
//                      System.out.println("Glat"+a+" hai be"+b);
//              }
//          }
//      }
// }
//*********2********///
// public class Main
// {
//   public static void main (String[] args)
//     {        
//       int[] arr;
//       arr = new int[5];
//       arr[0] = 10;
//       arr[1] = 20;
//       arr[2] = 30;
//       arr[3] = 40;
//       arr[4] = 50;
//       for (int i = 0; i < arr.length; i++)
//          System.out.println("Element at index " + i +
//                                       " : "+ arr[i]);
//         System.out.println("\n\nArray ki length "+ arr.length);
//     }
// } 
//**********************3**********
// 1
// 12
// 123
// 1234
// 12345
// public class Main
// {
//     public static void main(String[] args)
//     {
//         for(int i=1;i<=5;i++)
//         {
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
//***********************4*********//
//      1
//     12
//    123
//   1234
//  12345
// public class Main
// {
//     public static void main(String[] args)
//     {
//         for(int i=1;i<=5;i++)
//         {
//             for(int k=i;k<=5;k++)
//             {
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
//********************5************//
import java.util.*;
// 25*1=25
// 25*2=50
// 25*3=75
// 25*4=100
// 25*5=125
// 25*6=150
// 25*7=175
// 25*8=200
// 25*9=225
// 25*10=250
// public class Main
// {
//     public static void main(String[] args)
//     {Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Num:- ");
//         int n=sc.nextInt();
//         for(int i=1;i<=10;i++)
//         {
//             System.out.println(n+"*"+i+"="+n*i);
//         }
//     }
// }
//*******************************6*****************//
//       *                  
//   *   * *    *               
//     *  *  *                 
//     * * * *              
//   *         *            
//             *   * *      
//           *  *     *    
//          * **        *   
//              *      *    
//   *          *     *     
//     *      *     *       
//     * * * 
// public class Main
// {
//     public static void main(String[] args)
//     {
//     for(int i=1;i<=25;i++)
//     {
//         for(int j=1;j<=25;j++)
//         {
//             if(i==1&&j==8||i==2&&j==3||i==2&&j==3||i==3&&j==5||i==3&&j==7||i==3&&j==9||i==2&&j==6||
//             i==2&&j==11||i==2&&j==7)
//             {
//                 System.out.print("*");
//             }
//             if(i==5&&j==3||i==4&&j==5||i==4&&j==7||i==4&&j==9||i==4&&j==11||i==5&&j==13||
//             i==6&&j==13||i==7&&j==12||i==8&&j==10||i==8&&j==10||i==8&&j==12||i==9&&j==14||i==10&&j==14||i==11&&j==12||
//             i==12&&j==10||i==12&&j==8||i==12&&j==6||i==11&&j==5||i==10&&j==3||i==8&&j==13||i==7&&j==15||i==6&&j==17||
//             i==6&&j==19||i==7&&j==21||i==8&&j==22||i==9&&j==21||i==10&&j==20||i==11&&j==18)
//             {
//                 System.out.print("*");
//             }
//             else
//             {
//                 System.out.print(" ");
//             }
//         }
//         System.out.println();
//     }
//     }
// }
//*****************7*******************************//
// public class Main
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter First Term:- ");
//         int a=sc.nextInt();
//         System.out.print("Enter Difference:- ");
//         int d=sc.nextInt();
//         System.out.print("Enter Last Term:- ");
//         int n=sc.nextInt();
//         int sum=0,i,tn;
//         sum = (n*(2*a+(n-1)*d))/2;
//         tn = a+(n-1)*d;
//         for(i=a;i<=tn;i=i+d)
//         {
//             if(i!=tn)
//                 System.out.print(i+"+");
//             else
//                 System.out.print(i+"="+sum);
//         }
//     }
// }
//*****************8**********************//
// public class Main
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Ascii value :- ");
//         int ch1 = sc.next().charAt(0);
//         //int ch1 = sc.nextLine().charAt(10);
//         System.out.print("Ascii Number :- "+ch1);
//     }

// }

//--------------9--------------------------//
// public class Main
// {
//     public static void main(String[] args)
//     {
//         int sum=0;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Any No.:- ");
//         int n = sc.nextInt();

//         for(int i=0;i<=n;i++)
//         {
//             if(i%2==0)
//             {
//                 System.out.println(i);
//                 sum = sum+i;
//             }
//         }
//         System.out.println("Sum:-"+sum);
//     }
// }
//-------------------------10---------------//
// public class Main
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int temp,r,sum=0;
//         System.out.printf("Enter the Number :- ");
//         int n = sc.nextInt();
//         temp = n;
//         while(n>0)
//         {
//             r = n%10;
//             sum = (sum*10)+r;
//             n=n/10;
//         }
//         if(sum==temp)
//         {
//             System.out.printf("Palindrone Number "+sum);
//         }
//         else{
//             System.out.printf("Not Palindrone :- "+sum);
//         }
//     }
// }
//----------------------------11------------------------//
// class Main
// {
//   void mi ()
//   {
//     System.out.print ("This is mi method");
//   }

//   public static void main (String[]args)
//   {
//     Main s = new Main ();
//     s.mi ();
//   }
// }

//----------------------12-----------------//
// public class Main
// {
//   public static void main (String[]args)
//   {
//     Scanner sc = new Scanner (System.in);
//     int temp,r,sum=0,f=0;;
//     System.out.printf ("Enter the Number :- ");
//     int n = sc.nextInt();
//     temp=n;
//     while(n>0)
//     {
//         f=1;
//         for(int i=n%10;i>=1;i--)
//         {
//             f = f*i;
//         }
//             sum=sum+f;
//             n = n/10;
        
//     }
//     if(sum==temp)
//     {
//         System.out.printf("Strong NUmber ");
//     }
//     else
//     {
//         System.out.printf("Not Strong Number");
//     }
//   }
// }
//---------------------13----------------//
// public class Main
// {
//     public static void main (String[]args)
//     {
//         Scanner sc = new Scanner (System.in);
//         int temp,r,sum=0,f=0;;
//         System.out.printf ("Enter the First Range :- ");
//         int f1 = sc.nextInt();
//         System.out.printf("Enter the range two :- ");
//         int f2 = sc.nextInt();
//         for(int i=f1;i<=f2;i++)
//         {
//             temp = i;
//             while(i>0)
//             {
//                 f=1;
//                 for(int j = i%10;j>=1;j--)
//                 {
//                     f=f*j;
//                 }
//                 sum=sum+f;
//                 i = i/10;
//             }
//             if(sum==temp)
//             {
//                 System.out.println("Strong Number "+i);
//             }
//         }
//     }
// }
//------------------------14--------------------//
// public class Main
// {
//     public static void main (String[]args)
//     {
//         Scanner sc = new Scanner (System.in);
//         int r=0;
//         int n  = sc.nextInt();
//         while(n!=0)
//         {
//             r = (r*10)+n%10;
//             n = n/10;
//         }
//         System.out.print(r);
//     }
// }
// Sir Questions
// //1
// public class Main
// {
//     public static void main (String[]args)
//     {
//       System.out.println(-5+8*6);
//       System.out.println((50+9)%9);
//       System.out.println(20+-3*5/8);
//       System.out.println(5+15/3*2-8%3);
//     }
// }
// 8 
// public class Main
// {
//  public static void main(String[] args)
//  {
//      for(int i=1;i<=20;i++)
//      {
//          for(int j=i;j<=50;j++)
//          {
//              if(i==1&&j==5||i==2&&j==5||i==3&&j==5)
//              {
//                  System.out.print("*");
//              }
//              else{
//                  System.out.println(" ");
//              }
//          }
//          System.out.println();
//      }
//  }
// }

// public class Main
// {
//     public static void main (String[] args)
//     {
//         System.out.print(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
//     }
// }
// public class Main
// {
//     public static void main (String[] args)
//     {
//         System.out.print("\n\n\t\t\t\t* * * * * * ==================================");
//         System.out.print("\n\t\t\t\t* * * * *  ==================================");
//         System.out.print("\n\t\t\t\t* * * * * * ==================================");
//         System.out.print("\n\t\t\t\t * * * * *  ==================================");
//     }
// }
import java.util.*;
//32
// public class Main
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner (System.in);
//         int num = sc.nextInt();
//         int num2 = sc.nextInt();
//         if(num!=num2)
//         {
//             System.out.println(num+"!="+num2);
//         }
//         if(num<num2)
//         {
//             System.out.println(num+"<"+num2);
//         }
//         if(num<=num2)
//         {
//             System.out.println(num+"<="+num2);
//         }
//         if(num==num2)
//         {
//             System.out.println(num+"=="+num2);
//         }
//         if(num>=num2)
//         {
//             System.out.println(num+">="+num2);
//         }
//         if(num>num2)
//         {
//             System.out.println(num+">"+num2);
//         }
        
//     }
// }
//47
// import java.text.SimpleDateFormat;  
// import java.util.Date;  
// public class Main {  
// public static void main(String[] args) {  
//     SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
//     Date date = new Date();  
//     System.out.println(formatter.format(date));  
// }  
// } 
//50
// public class Main
// {
//     public static void main(String[] args)
//     {
//         for(int i =0;i<=100;i++)
//         {
//             if(i%3==0&&i%5==0)
//             {
//                 System.out.println(i+"");
//             }
//         }
        
//     }
// }
//52
// import java.lang.*;
// public class Main
// {
//     public static  void main(String[] args)
//     {
//         Scanner sc = new Scanner (System.in);
//         int num = sc.nextInt();
//         int num2 = sc.nextInt();
//         int num3 = sc.nextInt();
//         if((num+num2)==num3)
//         {
//             System.out.println("True");
//         }
//         else{
//             System.out.println("False");
//         }
//     }
// }

//66

// public class Main
// {
//     public static void main(String[] args)
//     {
//         int sum=0;
//         for(int i=1;i<=10;i++)
//         {
//             for(int j=1;j<=10;j++)
//             {
//                 if(j%i==0)
//                 {
//                     sum=sum+j;
//                 }
//             }
//         }
//         System.out.println(sum);
//     }
// }
//55
//-------------------------------------
// public class Main
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner (System.in);
//         int ts = sc.nextInt();
        
//         float hr = ts/3600;
//         float min = (ts%3600)/60;
//         float sec=ts%10;
        
//         System.out.println((int)hr+":"+(int)min+":"+(int)sec);
//     }
// }
//39
//-------------------------------------
// public class Main
// {
//     public static void main(String[] args)
//     {
//         int amt=0;
//         for(int i=1;i<=4;i++)
//         {
//             for(int j=1;j<=4;j++)
//             {
//                 for(int k=1;k<=4;k++)
//                 {
//                     if(k!=i&&k!=j&&i!=j)
//                     {
//                         System.out.println(i+""+k+""+j);
//                         amt++;
//                     }
//                 }
//             }
//         }
//         System.out.print("\n\t"+amt);
//     }
    
// }
//43
// public class Main
// {
//     public static void main(String[] args)
//     {
//-------------------------------------------------
//49
// public class Main
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Any Numher :- ");
//         int num = sc.nextInt();
//         if(num%2==0)
//         {
//             System.out.println("1");
//         }
//         else{
//             System.out.println("0");
//         }
        
//     }
// }
//
//151 
// public class Main
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         //int arr[]={1,2,3,4,5};
//         int n = sc.nextInt();
//         int[] array = new int[n];
//         System.out.println("Enter the elements of the array: ");  
//         for(int i=0;i<n;i++)
//         {
//             array[i] = sc.nextInt();
//         }
//         for(int i=0;i<array.length;i++)
//         {
//             System.out.println(array[i]);
//         }
//         System.out.println("\t\t\tSum of Array");
//         sum(array);
//     }
//     public static void sum(int[] a)
//     {
//         int sum=0;
//         for(int i=0;i<a.length;i++)
//         {
//             sum+=a[i];
//         }
//         System.out.println("Sum of array values : " + sum);
//     }
// 152    
// }
// public class Main
// {
//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] array = new int[n];
//         System.out.println("Enter the elements of the array: ");  
//         for(int i=0;i<n;i++)
//         {
//             array[i] = sc.nextInt();
//         }
//         if(array[0]==array[n-1])
//         {
//             System.out.println("True");
//         }
//         else
//         {
//         System.out.println("False");
//         }
//     }
// }
//57
// public class Main
// {
//     public static void main(String[] args)
//     {
//         int sum=0;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the No. :- ");
//         int n = sc.nextInt();
//         for(int i =0;i<=10;i++)
//         {
//             if(n%i==0)
//             {
//                 sum++;
//             }
//         }
//         System.out.println(sum);
//     }
// }
//58
// public class Main
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         String str = " ";
//         System.out.println("Enter the String :- ");
//         str = sc.nextLine();
//         char ch[] = str.toCharArray();
//         System.out.print(Character.toUpperCase(ch[0]));
//         char k;
//         for(int i=1;i<ch.length;i++)
//         {
//             if(ch[i]==' ')
//             {
//             i++;
//             System.out.print(Character.toUpperCase(ch[i]));
//             }
//             else{
//             System.out.print(ch[i]);
//             }
//         }
//     }
// }
//69
// public class Main
// {
//     public static void main(String args[])
//     {
//         Scanner sc= new Scanner(System.in); 
//         System.out.print("Enter a string: ");  
//         String str= sc.nextLine();
//         System.out.println(str.substring(0,3));
//     }
// }
//70
// public class Main
// {
//     public static void main(String args[])
//     {
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter first string :- ");
//         String str1 = sc.nextLine();
//         System.out.print("Enter Second string :- ");
//         String str2 = sc.nextLine();
//         System.out.println(str1+str2+str1);
//     }
// }
//72
public class Main
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first string :- ");
        String str1 = sc.nextLine();
        if(str1.length()>3)
        {
            System.out.print(str1);
        }
        else if(str1.length()<3){
            System.out.print("###");
        
        }
    }
}



