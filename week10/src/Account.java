
public class Account {

    protected double balance;
    protected String name;

    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public void deposit(double a) {
        if (a > 0) {
            this.balance = this.balance + a;
            System.out.println(a + " baht is deposited to " + this.name + ".");
        } else {
            System.out.println("Input number must be a positive integer.");
        }
    }

    public void withdraw(double amount) throws WithdrawException {
        if (amount > 0 && this.balance - amount > 0) {
            this.balance = this.balance - amount;
            System.out.println(amount + " baht is withdrawn from " + this.name + ".");
        } else if (amount < 0) {
            System.out.println("Input number must be a positive integer.");
        } else if (balance - amount < 0) {
//            System.out.println("Not enough money!");
            throw new WithdrawException("Account " + this.name + " has not enough money.");
        }
    }

//    public void withdraw(double amount) throws WithdrawException {
//        if (this.balance < amount){
//            throw new WithdrawException("Account " + this.name + " has not enough money.");
//        }
//    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void showAccount() {
        System.out.println(this.name + " account has " + this.balance + " baht.");
    }
}
