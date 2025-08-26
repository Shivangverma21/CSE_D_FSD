// class up extends Thread{

// }
// public class synchronize {
//     public static void main(String args[]){
//         up u=new up();
//         System.out.println(u.getPriority());
//     }
// }

import java.util.Scanner;

class Account {
    private int bal;

    public Account(int bal) {
        this.bal = bal;
    }

    public Boolean issufficientBalance(int w) {
        if (bal > w)
            return (true);
        else
            return (false);
    }

    public void withdraw(int amt) {
        bal = bal - amt;
        System.out.println("withdraw money is :" + amt);
        System.out.println("your current balance is :" + bal);
    }
}

class Customer implements Runnable {
    private String name;
    private Account account;

    public Customer(Account account, String n) {
        this.account = account;
        name = n;
    }

    public void run() {
        Scanner kb = new Scanner(System.in);
        synchronized(account){
            System.out.println(name + "Enter the amount to withdraw");
            int amt = kb.nextInt();
            if (account.issufficientBalance(amt)) {
                System.out.println(name);
                account.withdraw(amt);
                System.out.println();
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }
}

public class example2 {
    public static void main(String[] args) {
        Account a = new Account(1000);
        Customer o1 = new Customer(a, "Shivang");
        Customer o2 = new Customer(a, "David");
        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);
        t1.start();
        t2.start();
    }
}
