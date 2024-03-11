public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;

    public Account() {
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String email, String phone) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phone;

    }

    public void depositFunds(double depositAmount) {
        balance += depositAmount;
        System.out.println(customerName + customerPhone + "Deposit amount = " + depositAmount + " Your new balance is " + balance);
    }

    public void withdrawFunds(double withdrawAmount) {
        if (withdrawAmount < 0) {
            System.out.println("Insufficient funds! You only have $" + balance);
        } else {
            balance -= withdrawAmount;
            System.out.println("Withdrawal amount made" + withdrawAmount + "Your new balance is " + balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    private String customerPhone;

}
