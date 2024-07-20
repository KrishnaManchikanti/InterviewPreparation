package SingleResponsibilityPrinciple;
//A class should have one, and only one, reason to change.
//This means that a class must have only one responsibility.
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNumber(123);
        account.setFirstName("Vishrut");
        account.setTotalAmount(BigDecimal.valueOf(100000));
        System.out.println(account.getTotalAmount());

        AccountOperations accountOperations = new AccountOperations();
        accountOperations.addAccount(account);
        System.out.println(accountOperations.getAccount(123));

        TransactionOperations transactionOperations = new TransactionOperations();
        transactionOperations.deposit(BigDecimal.valueOf(123), 123);

    }
}