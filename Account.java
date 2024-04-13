class Dollar {
    
    int emp_id;
    String emp_name;
    float rate_of_interest;
    int balance; // 1 Dollar = 100 cents

    Dollar(int emp_id, String emp_name, float rate_of_interest) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.rate_of_interest = rate_of_interest;
        balance = 0;
    }

    int get_balance() {
        return balance;
    }

    void deposit(int x) {
        balance += x;
        System.out.println("Deposit of $" + (float) x / 100 + " is successful.");
    }

    void withdraw(int x) {
        if (balance >= x) {

            balance -= x;
            System.out.println("Withdrawal of $" + (float) x / 100 + " is successful.");
        } 
        else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    void display() {
        float dollar = (float) balance / 100;
        System.out.printf("Current balance: $%.2f%n", dollar);
    }
}

class Account {
    public static void main(String args[]) {
        Dollar obj = new Dollar(123, "John Doe", 5.0f); 
        obj.deposit(5000); 
        obj.withdraw(2500); 
        obj.display();
    }
}

