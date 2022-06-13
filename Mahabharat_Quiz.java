// Team Tech Titans
// Project Contributor
// Aviral Joshi
// Naimat Ansari
// Premlata Ahir
// Mayuri Bhange

import java.util.*;
class project  // Class  with the name  of project
{
    int wrong = 0,right = 0;
    String name;
    //creating consturctor 
    project()
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\tWelcome to MAHABHARAT QUIZ");
        System.out.println("\t\t--------------------------");
        System.out.print("Enter the Name : - ");
        name = sc.nextLine();
        // Question's adding
        String[] quiz = {" ","1)Who killed Ashwathama?\nA. Bhim\nB. Krishna\nC. Parshuram\nD. Non of the Above","2)Who was the son of Bhima and Hidimba?\nA.Jarasandha\nB. Abhimanyu\nC. Ghatochkach\nD. Barbik","3)Who wrote Mahabharat?\nA. Lord Ganesh\nB. Vedavyasa\nC. Valmiki\nD. Rig ved","4)Who was the First Commander in Chief of the Kaurava Army?\nA. PithaMaha\nB. Karn\nC. Dushashan\nD. Ashvthama","5)What was the name of Bhishm's father?\nA. Kashyap\nB. Shalv\nC. Parashuram\nD. None","6)Who seized Draupadi by her hair and dragged her into the court?\nA. Dushashan\nB. Vidhur\nC. Drushtadyumna\nD.Karn","7)Place where the Mahabharata War take place -\nA.Panipat\nB.Kurukshetra\nC.Indraprasth\nD.Hastinapur","8)Who's father of Draupadi -\nA.Bhishma\nB.Drupad\nC.Raja Salw\nD.vichitravirya","9)Who is the son of Ambika and vichitravirya -\nA.Karna \nB.Vidhur\nC.Dhritarashtra\nD.Pandu","10)What is the name of Nakul and Sahdev Mother? -\nA.Ambalika\nB.Satyavati\nC.Kunti\nD.Madri"};
        char[] Ans = {' ','D','C','A','A','A','B','B','C','D','D'};  // mcq Answer's String Array
        int[] Arr = new int[11];
        
        for(int i = 0;i<Arr.length;i++)
        {
            Arr[i]=0;
        }
        for(int i = 1;i<quiz.length;i++)              // Required loop to run over at question 
        {
            System.out.println("Question [1]  [2]  [3]  [4]  [5]\n\t\n\t[6]  [7]  [8]  [9]  [10]");
            System.out.println("-----------------------------------------------------------");
            System.out.println("GIVE INPUT IN INTEGER (PLEASE!!)");
            System.out.print("Select Any;- ");
            int get = sc.nextInt();
            if(get>10||get<0)
            {
                System.out.println("Invalid Input \n Please Give Attempt Again");
                i--;
                continue;
            }
            if(Arr[get]==0)
            {
                System.out.println(quiz[get]);
                System.out.print(">>> ");
                char input = sc.next().charAt(0);
                System.out.println("-----------------------------------------");
                if(input==Ans[get])
                {
                    right++;
                }
                else
                {
                    wrong++;
                }
                Arr[get]=1;
            }
            else{
                System.out.println("You Already Attempt this Question");
                i--;
            }
        }
        for(int i=1;i<quiz.length;i++)
        {
            System.out.println(quiz[i]+"\nCorrect Answer :- "+Ans[i]);
            System.out.println("-----------------------------------------------");
        }
        sc.close();
    }
}
class Main
{
    public static void main(String[] args)
    {
       // Main t1 = new Main();
        project p = new project();
       // t1.quiz_project();
       System.out.println("\t\t-------------------------");
       System.out.println("\t\tCompetitor Name :- " +p.name);
       System.out.println ("\t\tRight Answer " + p.right);
       System.out.println ("\t\tWrong Answer " + p.wrong);
       System.out.println("\t\t--------------------------");
    }
}
