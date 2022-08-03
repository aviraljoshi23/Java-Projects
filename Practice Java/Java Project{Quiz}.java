import java.util.*;
class project
{
    int wrong = 0,right = 0;
    void quiz_project()
    {Scanner sc=new Scanner(System.in); 
        String[] quiz = {"1)Who killed Ashwathama?\nA. Bhim\nB. Krishna\nC. Parshuram\nD. Non of the Above","2)Who was the son of Bhima and Hidimba?\nA.Jarasandha\nB. Abhimanyu\nC. Ghatochkach\nD. Barbik","3)Who wrote Mahabharat?\nA. Lord Ganesh\nB. Vedavyasa\nC. Valmiki\nD. Rig ved","4)Who was the First Commander in Chief of the Kaurava Army?\nA. PithaMaha\nB. Karn\nC. Dushashan\nD. Ashvthama","5)What was the name of Bhishm's father?\nA. Kashyap\nB. Shalv\nC. Parashuram\nD. None","Who seized Draupadi by her hair and dragged her into the court?\nA. Dushashan\nB. Vidhur\nC. Drushtadyumna\nD.Karn"};
        String[] Ans = {"D","C","B","A","A"};
        int[] Arr = new int[5];
        for(int i = 0;i<Arr.length;i++)
        {
            Arr[i]=0;
        }
        for(int i = 0;i<quiz.length;i++)
        {
            System.out.println("Question [1]  [2]  [3]  [4]  [5]");
            System.out.println("Select Any;- ");
            int get = sc.nextInt();
            if(Arr[get]==0)
            {
                System.out.println(quiz[get]);
                Character input = sc.next().charAt(0);
                if(input.equals(Arr[get]))
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
            }
        }
    }
}
class Main extends project
{
    public static void main(String[] args)
    {
        Main t1 = new Main();
        t1.quiz_project();
        System.out.println ("Right Answer " + t1.wrong);
        System.out.println ("Wrong Answer " + t1.right);
    }
}
