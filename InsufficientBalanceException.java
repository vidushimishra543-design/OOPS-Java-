public class ATMtest{
    public static void main(String[] args) {
        double balance=5000.0;
        double withdraw =7500.0;
        withdraw(balance,withdraw);
        try{
            withdraw(balance,withdraw);
        }
        catch(InsufficientBalanceException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Transaction completed");
        }
    }
    static void withdraw(double balance,double withdraw) throws InsufficientBalanceException{
        if(withdraw>balance){
            throw new InsufficientBalanceException("Insufficient Balance");
            System.out.println("Withdraw unsuccessful. Insufficient balance.");
        }
        else{
            System.out.println("Withdraw successful. New balance: "+(balance-withdraw));
        }
    }

}
class InsufficientBalanceException extends Exception //checked exception
{
    InsufficientBalanceException(String msg)//parameterised constructor
    {
        super(msg);//SUPER keyword is used to call the constructor of parent class
    }
}
