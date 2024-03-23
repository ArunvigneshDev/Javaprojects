import java.util.*;

class Result{

          public static double calculatecgpa(int count){

              		double[] gpa = new double[count];
                        Scanner sc = new Scanner(System.in);
                        double total = 0;
			System.out.print("\n");
			for(int i=0;i<count;i++){

                                System.out.print("Enter GPA of semester "+(i+1)+" : ");
				gpa[i] = sc.nextDouble();
				total = total + gpa[i];
			}
			
			return (double)(total/count);

           }

}

class CGPA {

         public static void main(String args[]){

                        double result;
			int semester=0,choice;
			Scanner sc = new Scanner(System.in);
			System.out.println("\t\t\tWelcome to our CGPA calculator \n");
		do {
			System.out.print("\nEnter the number of semesters : ");
			semester = sc.nextInt();	
			switch(semester){

                               case 1:
				
					System.out.print("Enter the 1st semester's GPA : ");
					result = sc.nextDouble();
					System.out.println("Your CGPA is : "+result); 
					break;

                               case 2:

                               case 3:

                               case 4:

                               case 5:

                               case 6:

                               case 7:

                               case 8:

                                       result = Result.calculatecgpa(semester);
				       String r = String.format("%.2f", result);
				       System.out.println("Your CGPA is : "+r); 
                                       break;

                               default:
	
				       System.out.println("Enter the valid Semester !!!");
				       break;
                           }

			   System.out.print("\nWould you like to continue (1/0) : ");
			   choice = sc.nextInt();

		     } while(choice!=0);
		     System.out.println("Thank you ! come again !");
	     }

 }
