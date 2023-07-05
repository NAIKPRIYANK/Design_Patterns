package bankaccountapplication;



public class InsufficientFundsException extends InsufficientResourcesException {

	public InsufficientFundsException() {
        super("Insufficient funds: minimum balance requirement not met");
    }
}
