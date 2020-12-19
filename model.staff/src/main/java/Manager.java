public class Manager {

    private String name;
    private int age;
    private int workExperience;
    private int[] salaryFromLastYear = new int[12]; //bad idea, but simple

    public Manager(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public int[] getSalaryFromLastYear() {
        return salaryFromLastYear;
    }

    public void setSalaryFromLastYear(int[] salaryFromLastYear) {
        this.salaryFromLastYear = salaryFromLastYear;
    }
}
