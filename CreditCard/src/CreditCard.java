public class CreditCard {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    public CreditCard(String cust, String bk, String acnt, int lim, double initialBal){
        customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initialBal;

    }

    public CreditCard(String cust, String bk, String acnt, int lim){
        this(cust,bk,acnt,lim,0.0);
    }

    public String getCustomer(){return customer;}
    public String getBank(){return bank;}
    public String getaccount() {return account;}
    public int getLimit(){return limit;}
    public double getBalance(){return balance;}

    public boolean charge(double price){
        if (price + balance > limit)
            return false;
        balance += price;
        return true;

    }
    public void makePayment(double amount){
        balance -= amount;
    }

    public static void printSummary(CreditCard card){
        System.out.println("Customer = " +card.customer);
        System.out.println("Bank =" + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println ("Balance = " + card.balance);
        System.out.println("Limit = " + card.limit);

    }

    public static void main(String[] args) {
        CreditCard[] wallet = new CreditCard[3];
        wallet[0] = new CreditCard("John Bowman", "California Savings", "5391 2983 9938 3828 3848", 5000);
        wallet[1] = new CreditCard("John Bowman", "Califorinia Federal", "3423 3949 2737 1990 8474", 3500);
        wallet[2] = new CreditCard("John Bowman", "California Finance", "3329 4859 9284 3758 0000", 3000);

        for (int val = 1; val <=16; val++){
            wallet[0].charge(3*val);
            wallet[1].charge(2*val);
            wallet[2].charge(val);
        }

        for (CreditCard card: wallet){
            CreditCard.printSummary(card);
            while(card.getBalance() > 200.0){
                card.makePayment(200);
                System.out.println("New balance = " + card.getBalance());
            }
        }
    }
}
