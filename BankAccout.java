import java.util.*;
public class BankAccout
{
   
       
       static String bankName ="Saurav's Bank " ; 
       static String bankAddress ="My Cozy Room ";
       static String bankCode = "01234";
       long acNumber;
       String custName;
       String custAddress;
       String custCitizenship;
       //here we will have the constructor.
       BankAccout()
       {
       }
       
       //here we will have the methods.
       static void welcomeToAll()
       {
           System.out.println("\t\tWelcome To " + bankName );
           System.out.println("\t\tWe Owns Your Money");
       }
       
       //openaccount
       void openAccount()
       {
           Scanner input = new Scanner(System.in);
           System.out.println("Enter Your Name");
           custName= input.nextLine();
           System.out.println("Enter your Citizenship Number " );
           custCitizenship =input.next();
           System.out.println("Enter Your Address");
           custAddress = input.nextLine();
           Random rand = new Random();
           int rand_int1 = rand.nextInt(100);
           System.out.println("Your Account No is " + (bankCode+rand_int1));
           
       }
       static void switchCase()
       {
       System.out.println(" 1:Opening Account \t 2:Check Balance \n 3:Deposit \t 4:Withdraw \n 5:Apply For Credit card\t"
       + "6:POS \n 7:Pay Bills \t 8:Loan");     
       }
       
       
       
       public static void main(String[]args)
       {
           //this is the main Function;
           Scanner input = new Scanner(System.in);
           int x=0;
           switchCase();
           int choice = input.nextInt();
           switch(choice)
           {
               case 1://opening account;
               BankAccout acc = new BankAccout();
               acc.openAccount();
               
               
               break;
               case 2://Check Balance;
               break;
               case 3://Deposit 
               break;
               case 4://Withdraw
               break;
               
               case 5://Apply For Credit.
               break;
               case 6://POS
               break;
               case 7://payBills.
               break;
               case 8://loan
               
           }
           while(x<1)
           {          
               welcomeToAll();
               
               System.out.println("Enter q to quit  " );
               char quit = input.next().charAt(0);
               
               
               
               
           }
       }
}

       