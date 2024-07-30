package WEEK_1.Algorithms_And_Data_Structure.Exercise7;

public class FinancialForecasting {
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        
        if (years == 0) {
            return presentValue;
        }
        
        double futureValue = calculateFutureValue(presentValue, growthRate, years - 1);
        return futureValue * (1 + growthRate);
    }

    public static void main(String[] args) {
        double presentValue = 1000; 
        double growthRate = 0.05;   
        int years = 10;            

        double futureValue = calculateFutureValue(presentValue, growthRate, years);
        System.out.println("Future Value after " + years + " years: " + futureValue);
    }
}
