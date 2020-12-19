public class Demonstrator {

    public static void InitialiseOfTheModelsAndPrint(){
        Manager manager1 = new Manager();
        manager1.setAge(25);
        manager1.setName("Tom");
        manager1.setWorkExperience(3);
        int[] salaryForTheYear = {10,20,30,40,50,60,70,80,90,100,110,120};
        manager1.setSalaryFromLastYear(salaryForTheYear);

        Manager manager2 = new Manager();
        manager2.setAge(31);
        manager2.setName("Fred");
        manager2.setWorkExperience(7);
        salaryForTheYear = new int[]{33, 25, 13, 42, 51, 63, 73, 85, 93, 101, 134, 99};
        manager2.setSalaryFromLastYear(salaryForTheYear);

        Manager manager3 = new Manager();
        manager3.setAge(37);
        manager3.setName("Julia");
        manager3.setWorkExperience(11);
        salaryForTheYear = new int[]{88, 165, 134, 211, 54, 270, 99, 122, 93, 101, 111, 67};
        manager3.setSalaryFromLastYear(salaryForTheYear);

        try {
            System.out.println("first manager " + manager1.getName() + " " + manager1.getAge() + " years old " +
                    " have average salary: " +
                    SalaryCalculator.calculateSalaryForThePeriod(manager1.getSalaryFromLastYear(), 3, 7));
        }catch(IllegalArgumentException e){
            System.out.println("incorrect period of month for first manager...");
        }

        try {
            System.out.println("second manager " + manager2.getName() + " " + manager2.getAge() + " years old " +
                    " have average salary: " +
                    SalaryCalculator.calculateSalaryForThePeriod(manager2.getSalaryFromLastYear(), 1, 12));
        }catch(IllegalArgumentException e){
            System.out.println("incorrect period of month for second manager...");
        }
        try {
            System.out.println("third manager " + manager3.getName() + " " + manager3.getAge() + " years old " +
                    " have average salary: " +
                    SalaryCalculator.calculateSalaryForThePeriod(manager3.getSalaryFromLastYear(), 5, 3));
        }catch(IllegalArgumentException e){
            System.out.println("incorrect period of month for third manager...");
        }
    }
}
