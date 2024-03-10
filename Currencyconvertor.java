import java.util.*;
import java.text.*;
class Convertor {

    static double result;
    static String[] currencies = {"Ruppee","Pound","Euro","Ruble","Dollar","Yuan","Yen"};
 
    public static void Ruppees_to_other(int amount,int target){
        DecimalFormat df = new DecimalFormat("#.##");

        result = switch(target){
                    case 2 -> amount*0.0096;
                    case 3 -> amount*0.011;
                    case 4 -> amount*1.10;
                    case 5 -> amount*0.012;
                    case 6 ->  amount*0.086;
                    default -> amount*1.81;
        };

        for(int i=1;i<=7;i++){
            if(i == target){
                System.out.println("\nThe value of "+amount+" Rupees in "+ currencies[i-1]+" is : "+df.format(result));//+" "+symbols[target-1]
            }
        }
    }

    public static void Pounds_to_other(int amount,int target){
        DecimalFormat df = new DecimalFormat("#.##");

        result = switch(target){
                    case 1 -> amount*104.42;
                    case 3 -> amount*1.17;
                    case 4 -> amount*115.02;
                    case 5 -> amount*1.26;
                    case 6 ->  amount*9.03;
                    default -> amount*188.93;
        };

        for(int i=1;i<=7;i++){
            if(i == target){
                System.out.println("\nThe value of "+amount+" pounds in "+ currencies[i-1]+" is : "+df.format(result));
            }
        }
    }

    public static void Euro_to_other(int amount,int target){
        DecimalFormat df = new DecimalFormat("#.##");

        result = switch(target){
                    case 1 -> amount*88.97;
                    case 2 -> amount*0.85;
                    case 4 -> amount*97.89;
                    case 5 -> amount*1.07;
                    case 6 ->  amount*7.69;
                    default -> amount*161.15;
        };

        for(int i=1;i<=7;i++){
            if(i == target){
                System.out.println("\nThe value of "+amount+" euro in "+ currencies[i-1]+" is : "+df.format(result));
            }
        }
    }

    public static void Ruble_to_other(int amount,int target){
        DecimalFormat df = new DecimalFormat("#.##");

        result = switch(target){
                    case 1 -> amount*0.91;
                    case 2 -> amount*0.0087;
                    case 3 -> amount*0.010;
                    case 5 -> amount*0.011;
                    case 6 ->  amount*0.079;
                    default -> amount*1.64;
        };

        for(int i=1;i<=7;i++){
            if(i == target){
                System.out.println("\nThe value of "+amount+" ruble in "+ currencies[i-1]+" is : "+df.format(result));
            }
        }
    }

    public static void Dollar_to_other(int amount,int target){
        DecimalFormat df = new DecimalFormat("#.##");

        result = switch(target){
                    case 1 -> amount*83.08;
                    case 2 -> amount*0.80;
                    case 3 -> amount*0.93;
                    case 4 -> amount*91.51;
                    case 6 ->  amount*7.18;
                    default -> amount*150.57;
        };

        for(int i=1;i<=7;i++){
            if(i == target){
                System.out.println("\nThe value of "+amount+" dollar in "+ currencies[i-1]+" is : "+df.format(result));
            }
        }
    }

    public static void Yuan_to_other(int amount,int target){
        DecimalFormat df = new DecimalFormat("#.##");

        result = switch(target){
                    case 1 -> amount*11.61;
                    case 2 -> amount*0.11;
                    case 3 -> amount*0.13;
                    case 4 -> amount*12.82;
                    case 5 -> amount*0.14;
                    default -> amount*20.96;
        };

        for(int i=1;i<=7;i++){
            if(i == target){
                System.out.println("\nThe value of"+amount+" yuan in "+ currencies[i-1]+" is : "+df.format(result));
            }
        }
    }

    public static void Yen_to_other(int amount,int target){
        DecimalFormat df = new DecimalFormat("#.##");

        result = switch(target){
                    case 1 -> amount*0.55;
                    case 2 -> amount*0.0053;
                    case 3 -> amount*0.0062;
                    case 4 -> amount*0.61;
                    case 5 -> amount*0.0066;
                    default -> amount*0.048;
        };

        for(int i=1;i<=7;i++){
            if((i) == target){
                System.out.println("\nThe value of "+amount+" yen in "+ currencies[i-1]+" is : "+df.format(result));
            }
        }
    }
}
public class Currencyconvertor {
    public static void main(String[] args) {

        int base,target,amount,choice;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
    do {

        System.err.println("\n\t\t\tWelcome to Currency convertor ");
        System.out.println("\nCurrencies : \n");
        System.out.println("1. Rupees $ ");
        System.out.println("2. Pounds ");
        System.out.println("3. Euro ");
        System.out.println("4. Ruble ");
        System.out.println("5. Dollar ");
        System.out.println("6. Yaun ");
        System.out.println("7. Yen ");

        System.out.print("\nEnter the base currency   : ");
        base = sc.nextInt();

        if((base<0) && (base>7)){
            System.out.print("Enter the valid option  : ");
            base = sc.nextInt();
            return;
        }
        System.out.print("\nEnter the target currency : ");
        target = sc.nextInt();
        if((target<0) && (target>7)){
            System.out.print("Enter the valid option : ");
            base = sc.nextInt();
            return;
        }

        if(base == 1){
            System.out.print("\nHow much rupee that you want to convert  : ");
            amount = sc.nextInt();
            Convertor.Ruppees_to_other(amount,target);
        }else if (base == 2){
            System.out.print("\nHow much pound that you want to convert  : ");
            amount = sc.nextInt();
            Convertor.Pounds_to_other(amount,target);
        }else if (base == 3){ 
            System.out.print("\nHow much euro that you want to convert   : ");
            amount = sc.nextInt();
            Convertor.Euro_to_other(amount,target);
        }else if (base == 4){ 
            System.out.print("\nHow much ruble that you want to convert  : ");
            amount = sc.nextInt();
            Convertor.Ruble_to_other(amount,target);
        }else if (base == 5){
            System.out.print("\nHow much dollar that you want to convert : ");
            amount = sc.nextInt();
            Convertor.Dollar_to_other(amount,target);
        }else if (base == 6){ 
            System.out.print("\nHow much yuan that you want to convert   : ");
            amount = sc.nextInt();
            Convertor.Yuan_to_other(amount,target);
        }else{
            System.out.print("\nHow much yen that you want to convert    : ");
            amount = sc.nextInt();
            Convertor.Yen_to_other(amount,target);
        }
        
        System.out.print("\nDo you want to continue (1/0) : ");
        choice = sc.nextInt();

    } while(choice!=0);
    System.out.print("\nThank you come again !\n");

    
    }
}