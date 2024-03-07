import java.util.*;

class Bank{
    void Transfer()
    {}
}

public class Lab5 extends Bank{
    Scanner in = new Scanner(System.in);
    int count=0,balance=30000;
    String name,ifsc;
    int amt;
    long acc;

    void Transfer()
    {
        System.out.println("Select the payment option");
        System.out.println("1.RTGS\n2.NEFT\n3.Instant");
        int a = in.nextInt();
        switch(a)
        {
            case 1:
                System.out.print("Enter the beneficiary account number :");
                acc = in.nextLong();
                long acc1 = acc;

                while(acc1!=0)
                {
                    acc1 = acc1/10;
                    ++count;
                }
                System.out.println(""+count);

                if((count<10)||(count>17))
                {
                    System.out.println("Invalid Account Number");
                    break;
                }
                System.out.print("Enter the beneficiary name :");
                name = in.next();

                System.out.print("Enter the IFSC code :");
                ifsc = in.next();

                System.out.print("Enter the Amount to be transfered :");
                amt = in.nextInt();
                display();

                if(amt>balance)
                {
                    System.out.println("Insufficient Balance");
                    break;
                }
                else
                balance = balance-amt;
                System.out.println("Amount transfered successfully");
                System.out.println("Your current balance is :"+balance);
                break;

            case 2:
                System.out.println("*******NEFT*******");
                System.out.print("Enter the beneficiery account number :");        
                acc = in.nextLong();
                long acc2 = acc;
                while (acc2!=0)
                {
                    acc2 = acc2 / 10;
                    ++count;
                }
                System.out.println(""+count);

                if((count<10)||(count>17))
                {
                    System.out.println("Invalid Account number");
                    break;
                }
                System.out.print("Enter the beneficiary name:");
                name = in.next();

                System.out.print("Enter the IFSC code:");
                ifsc = in.next();

                System.out.print("Enter the Amount to be transfered: ");
                amt = in.nextInt();
                display();
                if(amt>balance)
                {
                    System.out.println("Insufficient Balance");
                    break;
                }
                else
                balance = balance-amt;
                System.out.println("Amount transfered successfully");
                System.out.println("Your current Balance is : "+balance);
                break;
            case 3:
                System.out.print("Enter the beneficiery account number :");
                acc = in.nextLong();
                long acc3 = acc;
                while(acc3!=0)
                {
                    acc3 = acc3/10;
                    ++count;
                }
                System.out.println(""+count);
                if((count<10)||(count>17))
                {
                    System.out.println("Invalid Account number");
                    break;
                }
                System.out.println("Enter the Amount to be transfered :");
                amt = in.nextInt();
                display();
                if(amt>balance)
                {
                    System.out.println("Insufficient Balance");
                    break;
                }
                else
                 balance = balance-amt;
                System.out.println("Amount transfered successfully");
                System.out.println("Your current balance is :"+balance);
                break;

        }
    }

    void display()
    {
        System.out.println("*****Please confirm the enterd details********");
        System.out.println("Beneficiary Name : "+name);
        System.out.println("Beneficiary account number: "+acc);
        System.out.println("Beneficiary IFSC code: "+ifsc);
        System.out.println("Amount to be transfered:  "+amt);
        System.out.println("Do you wish to contine with the above details(y/n):");
        String a = in.next();

        if(a.equals("n"))
        {
            Transfer();
        }
    }

    public static void main(String[] args)
    {
        Lab5 obj = new Lab5();
        obj.Transfer();
    }
}