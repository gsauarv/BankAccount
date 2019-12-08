import java.util.Scanner;
public class BankAccout
{
    Scanner input = new Scanner(System.in);
    static String bankName ="Saurav's Bank ";
    static String bankAddress ="My Cozy Room ";
    static String bankCode = "01234";
    long acNumber;
    String custName;
    String custAddress;
    String phoneNo;    
    boolean status;
    int balance;
    //here we will have the constructor.
    BankAccout()
    {
        this.custName = "";
        this.custAddress="";
        this.phoneNo="";
        this.acNumber=1;
        this.status = true;
        this.balance = 0;
    }
    //here we will have the methods.
    static void welcomeToAll()
    {
        System.out.println("\t\tWelcome To " + bankName );
        System.out.println("\t\tWe Owns Your Money");
    }
    void account()
    {
        this.custName =input.nextLine();
        this.custAddress = input.nextLine();
        this.phoneNo = input.nextLine();
    }
    int deposit()
    {
        System.out.println("Enter Amount to be Deposited");
        int depositedAmt=input.nextInt();
        this.balance = this.balance+depositedAmt;
        System.out.println("Your Total Balance is " + this.balance );
        return depositedAmt;
    }
    int paybill()
    {
        System.out.println("Select Your Choice");
        int amount=0;
        System.out.println("1:Internet\t2:Electricity Bill");
        int choice = input.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("Enter The Amount of Internet Bill" );
            amount = input.nextInt();
            break;
            case 2:
            System.out.println("Enter the Amount of Electricity Bill ");
            amount = input.nextInt();
        }
        return amount;
        
    }
    void creditCard()
    {
        System.out.println("Before Applying For Credit Card Please Accept our T & C " );
        System.out.println("Enter Y or N " );
        char choice = input.next().charAt(0);
        if(choice == 'y' || choice == 'Y')
        {
            System.out.println("Your Request Has Been Sent Successfully");
        }
        else
        {
            System.out.println("Please Contact us For More Details About our T & C,Thank You");
        }
    }
    static void switchCase()
    {
        System.out.println(" 1:Opening Account \t 2:Check Balance \n 3:Deposit \t 4:Withdraw \n 5:Apply For Credit card\t"
        + "6:POS \n 7:Pay Bills \t 8:Loan");
    }
    public static void main(String[]args)
    {
        //this is the main Function;
        boolean flag =true;
        BankAccout acc = new BankAccout();
        Scanner input = new Scanner(System.in);
        while(flag){
            welcomeToAll();
            System.out.println("Enter Your Choice");
            switchCase();
            int choice = input.nextInt();
            switch(choice)
            {
                case 1://opening account;
                System.out.println("Enter Your Name ,address ,phoneNo");
                acc.account();
                System.out.println(acc.custName + " " +"Welcome to the  " + bankName);
                System.out.println(acc.custName + "\t" + acc.custAddress + " \t " + acc.phoneNo); 
                acc.account();
                break;   
                case 2://Check Balance;
                if(acc.status)
                {
                    System.out.println("Your Total Balance is  " + acc.balance);
                }
                else
                {
                    System.out.println("You Dont have the bank Account ");
                }
                break;
                case 3://Deposit
                if(acc.status)
                {
                    int d = acc.deposit();
                    System.out.println("you deposited" + d);
                }
                else
                {
                    System.out.println("the account is not active");
                }
                break;
                case 4://Withdraw
                if(acc.status)
                {
                    System.out.println("Enter Withdrawl Amount " );
                    int withdrawl = input.nextInt();
                    if(acc.balance>withdrawl)
                    {
                        acc.balance = acc.balance-withdrawl;
                        System.out.println("You Withdraw " + withdrawl);
                        System.out.println("Your Remaining Balance is : " + acc.balance);
                    }
                    else
                    {
                        System.out.println("You Don't Have Enough Balance " );
                    }
                }
                else
                {
                    System.out.println("Your Account is not active");
                }
                break;
                case 5://Apply For Credit.
                if(acc.status)
                {
                    acc.creditCard();
                }
                else
                {
                    System.out.println("Your Account is not active ");
                }
                break;
                case 6://POS
                break;
                
                case 7://payBills
                int billAmt=acc.paybill();    
                if(acc.balance>billAmt)
                {
                    acc.balance = acc.balance-billAmt;
                    System.out.println("Payment Confirmed");
                    System.out.println("Your Remaining Balance is : " + acc.balance );
                }
                else
                {
                    System.out.println("Payment Declined");
                    System.out.println("You Don't Have Enough Balance");
                } 
                break;
                case 8://loan
            }
           }
           
         
       }
}

       