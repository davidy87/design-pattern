package behavioral.strategy.code;

public class KBCardStrategy implements PaymentStrategy {

    private String name;

    private String cardNumber;

    private String cvv;

    private String dateOfExpiry;

    public KBCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using KB Card.");
    }
}
