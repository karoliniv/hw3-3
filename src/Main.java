public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double monthlyPaymentFirst = service.calculate(1_000_000, 1, 9.99);
        System.out.printf("\n Ежемесячный платеж: %.0f \n", monthlyPaymentFirst);

        double monthlyPaymentSecond = service.calculate(1_000_000, 2, 9.99);
        System.out.printf("\n Ежемесячный платеж: %.0f \n", monthlyPaymentSecond);

        double monthlyPaymentThird = service.calculate(1_000_000, 3, 9.99);
        System.out.printf("\n Ежемесячный платеж: %.0f \n", monthlyPaymentThird);
    }
}
