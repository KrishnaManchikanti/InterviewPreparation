package SingleResponsibilityPrinciple;

import java.math.BigDecimal;

public class TransactionOperations {
    // Now deposit is in transactions and at right place.
    public void deposit(BigDecimal amount, int accountNumber) {
//Getting account details it is job of account operations
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().add(amount));
    }

    public void withdraw(BigDecimal amount, int accountNumber) {
        AccountOperations accountOperations = new AccountOperations();
        Account account = accountOperations.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount());
    }
}