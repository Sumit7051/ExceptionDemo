import org.example.entity.BankAccount;
import org.example.exception.InsuffBal;
import org.example.exception.UnsufficientBalanceException;
import org.example.service.BankAccountService;
import org.example.service.BankAccountServiceImpl;

public class Main {

    public static void main(String[] args) throws InsuffBal {
     Division div = new Division();
        System.out.println(div.divide(60,0));
        div.arr();

        BankAccount account = new BankAccount(102,"Sunil Gode",100000,100);

        BankAccountService service = new BankAccountServiceImpl();
        System.out.println("Balance: " +service.checkbal(account));
        try {
            System.out.println("Balance after withdrawl: " +service.withdrawlAmt(account,800000));
        } catch (UnsufficientBalanceException e) {
            throw new RuntimeException(e);
        }
        System.out.println("helllloooooo");
        System.out.println("Deposit: " +service.despositAmt(account,60000));


    }
}
