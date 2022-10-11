package LAB1;

public class Customer extends CheckingAccount {

    private String firstName;
    private String lastName;
    private Account []acct;
    private int numOfAccount;
    
    public Customer() {
        this("", "");
    }

    public Customer(String firstName, String lastName) {
        acct = new Account[5];
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return this.firstName + this.lastName + " has " + numOfAccount + "accounts.";
    }

    public boolean equals(Customer c) {
        return firstName.equals(c.firstName) && lastName.equals(c.lastName);
    }
    
    public Account getAccount(int index){
        return acct[index];
    }
    public void addAccount(Account acct){
        this.acct[numOfAccount] = acct;
        numOfAccount++;
    }
    public int getNumOfAccount(){
        return numOfAccount;
    }
    
}
