public class assignment2 {
    private double principal;
    private double rate;
    private int time;

    public assignment2(double principal, double rate, int time) {
        this.principal = principal;
        this.rate = rate / 100;  // Convert the rate from percentage to decimal
        this.time = time;
    }

    public double calculateTotalPayment() {
        double compoundInterest = principal * Math.pow(1 + rate, time) - principal;
        return principal + compoundInterest;
    }

    public static void main(String[] args) {
        double principal = 500000;// Principal amount in Rwandan Francs
        double rate = 18; // Annual interest rate (18%)
        int time = 3; // Number of years

        assignment2 loan = new assignment2(principal, rate, time);
        double totalPayment = loan.calculateTotalPayment();

        System.out.println("Compound interest after 3 years: $" + totalPayment);
    }
}