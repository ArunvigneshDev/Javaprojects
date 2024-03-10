import java.util.*;
class calculation{
	double grade_points=0;
	
	double grade(String[] a,double[] cp){
		grade_points=0;
		for(int i=0;i<9;i++){
			switch(a[i]){
			   case "O":
				grade_points=grade_points+(10*cp[i]);
				break;
			   case "A+":
				grade_points=grade_points+(9*cp[i]);
				break;
			   case "A":
				grade_points=grade_points+(8*cp[i]);
				break;
			   case "B+":
				grade_points=grade_points+(7*cp[i]);
				break;
			   case "B":
				grade_points=grade_points+(6*cp[i]);
				break;
			   case "c":
				grade_points=grade_points+(5*cp[i]);
				break;
			}
		}
		return (double)grade_points;
	}
}
class sem1{
	//int grade_points=0;
	double cp[]={3,4,3,3,3,1,2,2,1};
	double calc(String[] c){
		//double cp[]={3,4,3,3,3,1,2,2,1};
		int tot_cp = 22;
		calculation obj = new calculation();
		double grade_points = obj.grade(c,cp);
		return (double)grade_points/tot_cp;
	}
}
class sem2{
    //int grade_points=0;
	double cp[]={2,4,3,3,4,3,1,2,2,2};
	double calc(String[] c){
		int tot_cp = 26;
		calculation obj = new calculation();
		double grade_points = obj.grade(c,cp);
		return (double)grade_points/tot_cp;
	}
}
class sem3{
    //double grade_points=0;
	double cp[]={4,4,3,3,3,1.5,1.5,2,1};
	double calc(String[] c){
		int tot_cp = 23;
		calculation obj = new calculation();
		double grade_points = obj.grade(c,cp);
		return (double)grade_points/tot_cp;
	}
}
class sem4{
    //double grade_points=0;
	double cp[]={3,4,3,4,3,2,1.5,1.5};
	double calc(String[] c){
		//double cp[]={3,4,3,4,3,2,1.5,1.5};
		int tot_cp = 22;
		calculation obj = new calculation();
		double grade_points = obj.grade(c,cp);
		return (double)grade_points/tot_cp;
	}
}
class Gpacalculator {
	
	public static void main(String[] args) {
		int choice;
		System.out.println("\t\t\tWelcome to our gpa calculator : " ) ;
	do {
		System.out.print("\nEnter the semester (1-4) : ");
		Scanner sc = new Scanner(System.in);
		int sem = sc.nextInt();
		System.out.println("\n");
		switch(sem){
		    case 1:
			String grade1[] = new String[9];
			String code1[]  = {"HS3152-PE 1","MA3151-MAC","PH3151-EP","CY3151-EC","GE3151-PSPP","GE3152-HT","GE3171-PSPP LAB","BS3171-PH & CH LAB","GE3172-ENG LAB"};
			sc.nextLine();
			for(int i=0;i<9;i++){
			System.out.print(String.format("Enter the grade of %-15s : ", code1[i]));
			String s = sc.nextLine().toUpperCase();
			if((s.equals("O"))||(s.equals("A+")||(s.equals("A"))||(s.equals("B+"))||(s.equals("B"))||(s.equals("C")||(s.equals("RA"))||(s.equals("W"))))){
				if(s.equals("RA") || s.equals("W")){
					System.out.println("Sorry ! you can't calculate your GPA because of "+s+" !!!");
					return;
				}
				else{
					grade1[i]=s;
				}
			
			}
			else{
				do{
					System.out.print("Enter a valid grade of "+code1[i]+" : ");
					s = sc.nextLine().toUpperCase();
					//grade[i]=s;
				}while(!((s.equals("O"))||(s.equals("A+")||(s.equals("A"))||(s.equals("B+"))||(s.equals("B"))||(s.equals("C")||(s.equals("RA"))||(s.equals("W"))))));
				grade1[i]=s;
			}
		}
			sem1 obj1 = new sem1();
			double result=obj1.calc(grade1);
			String finalresult = String.format("%.2f", result);
			System.out.println("\nYour GPA for 1st semester is : "+finalresult);
			break;
		    case 2:
		    	String grade2[] = new String[10];
			String code2[] = {"HS3252-PE 2","MA3251-SNM","PH3256-PIS","BE3251-BEEE","GE3251-EG","CS3251-PC","GE3252-TT","GE3271-EP LAB","CS3271-PC LAB","GE3272-COMN LAB"};
			sc.nextLine();
			for(int i=0;i<10;i++){
			System.out.print(String.format("Enter the grade of %-15s : ", code2[i]));
			String s = sc.nextLine().toUpperCase();
			if((s.equals("O"))||(s.equals("A+")||(s.equals("A"))||(s.equals("B+"))||(s.equals("B"))||(s.equals("C")||(s.equals("RA"))||(s.equals("W"))))){
				if(s.equals("RA") || s.equals("W")){
					System.out.println("Sorry ! you can't calculate your GPA because of "+s+" !!!");
					return;
				}
				else{
					grade2[i]=s;
				}
						}
			else{
				do{
					System.out.print("Enter a valid grade of "+code2[i]+" : ");
					s = sc.nextLine().toUpperCase();
					//grade[i]=s;
				}while(!((s.equals("O"))||(s.equals("A+")||(s.equals("A"))||(s.equals("B+"))||(s.equals("B"))||(s.equals("C")||(s.equals("RA"))||(s.equals("W"))))));
				grade2[i]=s;
			}
		}
			sem2 obj2 = new sem2();
		        result=obj2.calc(grade2);
			finalresult = String.format("%.2f", result);
			System.out.println("\nYour GPA for 2nd semester is : "+finalresult);
		        break;
		    case 3:
		    	String grade3[] = new String[9];
			String code3[] = {"MA3354-DM","CS3351-DPCO","CS3352-FDS","CS3301-DS","CS3391-OPP","CS3311-DS LAB","CS3381-OOP LAB","CS3361-Data science Lab","GE3361-PD LAB"};
			sc.nextLine();
			for(int i=0;i<9;i++){
			System.out.print(String.format("Enter the grade of %-15s : ", code3[i]));
			String s = sc.nextLine().toUpperCase();
			if((s.equals("O"))||(s.equals("A+")||(s.equals("A"))||(s.equals("B+"))||(s.equals("B"))||(s.equals("C")||(s.equals("RA"))||(s.equals("W"))))){
				if(s.equals("RA") || s.equals("W")){
					System.out.println("Sorry ! you can't calculate your GPA because of "+s+" !!!");
					return;
				}
				else{
					grade3[i]=s;
				}
				
			}
			else{
				do{
					System.out.print("Enter a valid grade of "+code3[i]+" : ");
					s = sc.nextLine().toUpperCase();
					//grade3[i]=s;
				}while(!((s.equals("O"))||(s.equals("A+")||(s.equals("A"))||(s.equals("B+"))||(s.equals("B"))||(s.equals("C")||(s.equals("RA"))||(s.equals("W"))))));
				grade3[i]=s;
			}
		}
			sem3 obj3 = new sem3();
			result=obj3.calc(grade3);
			finalresult = String.format("%.2f", result);
			System.out.println("\nYour GPA for 3rd semester is : "+finalresult);
		        break;
		    case 4:
			String grade4[] = new String[8];
			String code4[] = {"CS3452-TC","CS3491-ALML","CS3492-DBMS","CS3401-ALGO","CS3451-OS","GE3451-ESS","CS3461-OS LAB","CS3481-DBMS LAB"};
			sc.nextLine();
		    	for(int i=0;i<9;i++){
			System.out.print(String.format("Enter the grade of %-15s : ", code4[i]));
			String s = sc.nextLine().toUpperCase();
			if((s.equals("O"))||(s.equals("A+")||(s.equals("A"))||(s.equals("B+"))||(s.equals("B"))||(s.equals("C")||(s.equals("RA"))||(s.equals("W"))))){
				if(s.equals("RA") || s.equals("W")){
					System.out.println("Sorry ! you can't calculate your GPA because of "+s+" !!!");
					return;
				}
				else{
					grade4[i]=s;
				}
			}
			else{
				do{
					System.out.print("Enter a valid grade of "+code4[i]+" : ");
					s = sc.nextLine().toUpperCase();
					//grade[i]=s;
				}while(!((s.equals("O"))||(s.equals("A+")||(s.equals("A"))||(s.equals("B+"))||(s.equals("B"))||(s.equals("C")||(s.equals("RA"))||(s.equals("W"))))));
				grade4[i]=s;
			}
		}
			sem4 obj4 = new sem4();
			result=obj4.calc(grade4);
			finalresult = String.format("%.2f", result);
			System.out.println("\nYour GPA for 4th semester is : "+finalresult);
		        break;
		  
		}
		System.out.print("\nDo you like to continue ? (1/0) : ");
		choice = sc.nextInt();
	    }while(choice!=0);
	System.out.print("\nThank you ! come again !!");
	}
}
