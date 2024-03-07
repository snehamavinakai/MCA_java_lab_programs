class checkingAccount
{
    private double balance;
    private int number;
    public checkingAccount(int number)
    {
        this.number = number;

    }
    public void deposite(Double amount)
    {
        balance += balance;
    }
    public void withdraw(Double amount)
    throws InsufficientResourceException{
        if(amount<=balance)
        {
            balance = amount;
        }
        else
        {
            Double needs = amount - balance;
            throw new InsufficientResourceException(needs);
        
        }
    }
    public Double getBalance()
    {
        return balance;
    }
    public int getNumber()
    {
        return number;
    }
}   
    class InsufficientResourceException extends Exception{
        private Double amount;
        public InsufficientResourceException(Double amount)
        {
            this.amount = amount;
        }
        public Double getAmount()
        {
            return amount;
        }

}
public class Lab7{
    public static void main(String args[])
    {
        //checkingAccount c = new checkingAccount(101);
        checkingAccount c = new checkingAccount(101);
        System.out.println("Deposting 600");
        c.deposite(600.00);

        try{
            System.out.println("Withdrawing 100");
            c.withdraw(100.00);
            System.out.println("Withdrawing 700");
            c.withdraw(700.00);
        }
        catch(InsufficientResourceException e)
        {
            System.out.println("Sorry you are short of "+e.getAmount());
        }
    }
}