public class Account {
    private String accHolder;
    private double balance;

    public Account(String accHolder, double balance) {
        this.accHolder = accHolder;
        this.balance = balance;
    }

    public String getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }
}
