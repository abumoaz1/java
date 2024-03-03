package myPack1.WEEK6;

class Account{
    String name;
    int accNum;
    String accountType;
    double balanceAmt;
    Account(String name, int accNum, String accountType, double balanceAmt){
        this.name = name;
        this.accNum = accNum;
        this.accountType = accountType;
        this.balanceAmt = balanceAmt;
    }

    void deposit(double amt){
        balanceAmt += amt;
    }

    void withdraw(double amount){
        if(amount <= balanceAmt){
            System.out.println("The money is credited from your account ");
            System.out.println(amount);
            balanceAmt -= amount;
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }

    void detail(){
        System.out.println("Your name is: "+name+"\nTotal Balance is; "+balanceAmt);
    }
}
public class Q3 {
    public static void main(String[] args) {
        Account a1 = new Account("Abu Moaz",123456,"Saving",145000.00);
        a1.deposit(1200);
        a1.withdraw(10000);
        a1.detail();
    }
}
