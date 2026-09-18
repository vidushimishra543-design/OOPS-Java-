public class InterThread {
    public static void main(String args[]) {
        BankAccount obj = new BankAccount();
        WithdrawalThread wd = new WithdrawalThread(obj);
        Thread thread1 = new Thread(wd, "Withdraw");
        DepositThread dp = new DepositThread(dp);
        Thread thread2 = new Thread(dp);
        thread2.setName("Deposit");
        thread1.start();
        thread2.start();
    }

    class BankAccount {
        int balance = 500;

        synchronized void withdraw(int amount) {
            while (amount < balance) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println(e);

                }
            }
            balance -= amount;
            System.out.println("Withdrawal Successful ith balance" + balance);

        }

        synchronized void deposit(int amount) {
            balance += amount;
            System.out.println("Balance is deposited new balance is" + balance);
            notify();
        }
    }

    class WithdrawalThread implements Runnable {
        BankAccount ba;

        public WithdrawalThread(InterThread.BankAccount obj) {
            // TODO Auto-generated constructor stub
        }

        @Override
        public void run() {
            ba.withdraw(700);
        }
    }

    class DepositThread implements Runnable {
        BankAccount ba;

        public DepositThread(InterThread.DepositThread dp) {
            // TODO Auto-generated constructor stub
        }

        @Override
        public void run() {
            ba.deposit(700);
        }
    }
}
