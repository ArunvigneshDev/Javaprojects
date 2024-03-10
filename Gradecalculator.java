import java.text.*;
import java.util.*;
class student{
    
    void calculate(int total,int count) {
        float average = (float)total/count;
	DecimalFormat df = new DecimalFormat("#.00");
        System.out.printf("Student's Average mark : "+df.format(average));	

        if((average>90)&& (average<=100)){
            System.out.println("\nStudent's Grade        : O");
        }
        else if((average>80)&&(average<=90)){
            System.out.println("\nStudent's Grade        : A");
        }
        else if((average>70)&&(average<=80)){
            System.out.println("\nStudent's Grade        : A+");
        }
        else if((average>60)&&(average<=70)){
            System.out.println("\nStudent's Grade        : B");
        }
        else if((average>50)&&(average<=60)){
            System.out.println("\nStudent's Grade        : B+");
        }
        else if((average>45)&&(average<=50)){
            System.out.println("\nStudent's Grade        : C");
        }
        else{
            System.out.println("\nStudent's Grade        : Fail");
        }
    }
}
class Gradecalculator {
    public static void main(String args[]) {                    
            int choice;
            Scanner sc = new Scanner(System.in);
        do{
            System.out.println("\n\t\tWelcome to Student Grade Calculator");
            System.out.print("\nEnter your name      : ");
            String name = sc.nextLine();
            System.out.print("Enter your Roll no   : ");
            int roll_no= sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the number of subjects   : ");
            int count = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter your marks here  \n");
            int marks[] = new int [count];
            int total=0;
            for (int i=0; i<count; i++) {
                System.out.print("Enter subject "+(i+1)+" mark : ");
                marks [i]=sc.nextInt();
                if((marks[i]<0) || (marks[i]>100)){
                    System.out.println("\nEnter the valid mark !!! \n") ;
                    i--;
                    continue;
                }
                total = total + marks[i];
            }
            student obj = new student ();
	    System.out.println("\nStudent's Grade Details : \n");
            System.out.println("Student's Name         : "+name);
            System.out.println("Student's Roll no      : "+roll_no);
            System.out.println("Student's total marks  : "+total);
            obj.calculate(total,count);
            System.out.print("\nDo you want to continue (0/1) : ");
            choice = sc.nextInt();
            sc.nextLine();
        }while(choice!=0);
        System.out.println("\nThank you ! visit again !");
    }
}
