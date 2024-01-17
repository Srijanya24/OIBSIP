import java.util.Scanner;
public class OnlineExamination {
    public static void main(String[] args) {
        int curr=4;
        int choice;
        String stu_name;
        int id=0;
        Scanner sc = new Scanner(System.in);
      
          System.out.print("Enter student name:");
                stu_name = sc.next();
                System.out.print("Enter roll no:");
                id = sc.nextInt();
                int count = 0;
                 System.out.println("Welcome "+stu_name+" to Online Examination");
        
        do{
        System.out.println("1.Take Exam");
        System.out.println("2.View Marks");
        System.out.println("3.Exit");
            System.out.print("Enter your choice:");
        curr=sc.nextInt();
        if(curr==4)
        {
            System.out.println("Thanks for taking exam!!");
            break;
        }
        switch(curr)
        {
            case 1:
            {
               
                    
                System.out.println("There are five questions in the examination");
                
                    count=0;
                    System.out.println("Q1.Who is the founder Of JAVA?");
                
                System.out.println("1.James Gosling  2.Dennis Ritchie  3.Guido van Rossum  4.Bjarne Stroustrup");
                System.out.print("Enter answer:");
                choice=sc.nextInt();
                if(choice==1)
                {
                    ++count;
                }
                System.out.println("Q2.Which is the first coding language?");
                System.out.println("1.Java  2.C++  3.C  4.Python");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                if(choice==3)
                {
                    ++count;
                }
                  System.out.println("Q3. Is JVM complied or Intepreted?");
                System.out.println("1.Both compiled and interpreted  2.Only compiled  3.Only interpreted  4.None");
                 System.out.println("Enter answer:");
                choice=sc.nextInt();
                  if(choice==1)
                {
                    ++count;
                }
                  System.out.println("Q4.Which one of the following is not a java feature?");
                System.out.println("1.Object-oriented  2.Use of Pointers  3.Dynamic and Extensible  4.Portable");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                  if(choice==2)
                {
                    ++count;
                }
                  System.out.println("Q5.JDK stands for:");
                System.out.println("1.Java Development Kit  2.Java Deployment Kit  3.JavaScript Deployment Kit  4.None of these");
                 System.out.print("Enter answer:");
                choice=sc.nextInt();
                
                  if(choice==1)
                {
                    ++count;
                }
                         
                break;
            }
            case 2:
            {
                System.out.println("You scored "+count+" out of 5");
            }
        }    
    }while(true);
}
    public OnlineExamination() {
    }
}
