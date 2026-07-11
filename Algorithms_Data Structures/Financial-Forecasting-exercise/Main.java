public class Main {

    public static void main(String[] args) {

        double currentValue = 10000;
        double growthRate = 0.08; 
        int years = 5;

        double result = Forecast.futureValue(currentValue, growthRate, years);

        System.out.println("Future Value after " + years + " years: " + result);
    }
}