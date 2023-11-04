public class assignment{
    public static void main(String[] args) {
        double principal = 100000;  // Principal amount in Rwandan Francs
        double rate = 0.05; // Annual interest rate (5%)
        int years = 5;  // Number of years

        double simpleInterest = calculateSimpleInterest(principal, rate, years);

        System.out.println("Principal amount: " + principal + " RWF");
        System.out.println("Annual interest rate: " + (rate * 100) + "%");
        System.out.println("Number of years: " + years );
        System.out.println("Simple Interest: " + simpleInterest + " RWF");
    }
    
    public static double calculateSimpleInterest(double principal, double rate, int years) {
         // Simple Interest formula: I = P * R * T
        return principal * rate * years;
    }
}