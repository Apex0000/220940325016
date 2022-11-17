/* Develop a class BankAccount having following data members : (10 Marks)
int accno
double balance
Write appropriate constructors to initialize data members
Define the following functions :
withdraw : balance will reduce
deposit : balance will increase
show : display accno and balance
If user tries to withdraw more than the balance, use exception handling code. Demonstrate the concept of exception handling in main() function.
*/


class BankAccount{
    int accno;
    double balance;
    public BankAccount(int acn,double bal){
        accno=acn;
        balance=bal;
    }

    public void Withdraw(int acn,double wda){
        if(accno==acn){
            if (balance-wda>=0){
            balance=balance-wda;
        }
        else{
            System.out.println("Invalid entry- Withdrawal amount is more than balance.");}
        System.out.println("Available balance is- "+balance);
    }
else{
    System.out.println("Invalid account number provided, provide valid one.");
}}
    public void Deposit(int acn,double dsa){
        if (accno==acn){
            balance=balance+dsa;
        }
        System.out.println("Available balance is- "+balance);
    }
    public void Show (int acn){
        if (accno==acn){
        System.out.println("In account with account number- "+accno+", Available balance is- "+balance);}
    }
    public static void main(String[] args) {
        BankAccount a=new BankAccount(4652, 2000);
        a.Withdraw(4652, 3000);
        a.Withdraw(4652, 1500);
        a.Deposit(4652, 2500);
        a.Show(4652);
    }
}