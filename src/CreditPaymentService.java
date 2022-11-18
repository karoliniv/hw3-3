public class CreditPaymentService {
    public double calculate(int loanAmount, int years, double interestRate) {
        double i = interestRate / 100 / 12;
        double n = years * 12;
        double k = (i * Math.pow((1 + i), n)) / (Math.pow((1 + i), n) - 1);
        double monthlyPayment = k * loanAmount;

        return monthlyPayment;
    }
}
