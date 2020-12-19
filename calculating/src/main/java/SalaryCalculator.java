public class SalaryCalculator {

    public static double calculateSalaryForThePeriod(int[] salaryHistory, int firstMonthOfPeriod, int lastMonthOfPeriod){
        if(firstMonthOfPeriod < 1 || firstMonthOfPeriod > 12 || lastMonthOfPeriod < 1 || lastMonthOfPeriod > 12 || firstMonthOfPeriod >= lastMonthOfPeriod){
            throw new IllegalArgumentException("wrong month numbers...");
        } else {
            double averageSalaryOfThePeriod =0;
            for(int i = firstMonthOfPeriod-1; i < lastMonthOfPeriod-1; i++){
                averageSalaryOfThePeriod += salaryHistory[i];
            }
            averageSalaryOfThePeriod = averageSalaryOfThePeriod / (lastMonthOfPeriod-firstMonthOfPeriod + 1);
            return averageSalaryOfThePeriod;
        }
    }
}
