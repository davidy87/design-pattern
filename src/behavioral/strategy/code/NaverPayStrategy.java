package behavioral.strategy.code;

public class NaverPayStrategy implements PaymentStrategy {

    private String email;

    private String password;

    public NaverPayStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Naver Pay.");
    }
}
