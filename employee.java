import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class employee {
    //Variable Setup
    private String F_name;
    private String L_name;
    private int age; 
    private int dob_year;
    private String dob;
    private String Gender;
    private String department;
    private String job;
    private float weekly_wage;
    private float yearly_wage;
    private float tax_income;
    private float tax_rate = .05f;
    private float hours;
    private float pay;
    private float avg_rate;
    // DECLARTION 

    public employee() {

    }


    public employee(String F_name, String L_name, String dob, String Gender, String department, String job, float hours, float pay) {
        this.F_name = F_name;
        this.L_name = L_name;
        this.dob = dob;
        this.Gender = Gender;
        this.department = department;
        this.job = job;
        this.hours = hours;
        this.pay = pay;
    }
    
    //Display employee Data
    public void displayEmployeeInfo() {
        System.out.println("Employee Information:");
        System.out.println("====================");
        System.out.println("Name:          " + getF_name() + " " + getL_name());
        System.out.println("Date of Birth: " + getDob());
        System.out.println("AGE: " + get_age());
        System.out.println("Gender:        " + getGender());
        System.out.println("Department:    " + getDepartment());
        System.out.println("Job Title:     " + getJob());
        System.out.println("Weekly Hours:  " + getHours());
        System.out.println("Hourly Wage:   " + getPay());
        System.out.println("Weekly Pay:   " + get_weekly_wage());
        System.out.println("Yearly pay:   " + get_yearly_wage());
        System.out.println("Yearly Wage after taxes: " + get_tax_income());
    }

    public void displayEmployeeAvgRating(int rate1, int rate2, int rate3){
        System.out.println("Employee Rating Information:");
        System.out.println("====================");
        System.out.println("Name:          " + getF_name() + " " + getL_name());
    
        int temp = rate1 + rate2 + rate3 / 3;

        avg_rate = temp;

        System.out.println("Average Rating: " + temp);
    }

    // Collect Employee Data
    
    public void collectEmployeeDataFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter Employees first name");
        setF_name(scanner.nextLine()); 

        System.out.println("Please enter Employees Last name");
        setL_name(scanner.nextLine()); 

        System.out.println("Please enter Employees Gender");
        set_Gender(scanner.nextLine());

        System.out.println("Please enter Employees Date of birth ");
        set_Dob(scanner.nextLine());
        
        calculateAge();
        System.out.println("Please enter Employees department");
        set_Department();

        System.out.println("Please enter employyes job title ");
        set_Job();

        System.out.println("Please enter Employees weekly hours");
        set_Hours(scanner.nextInt()); 

        System.out.println("Please enter Employees hourly wage");
        set_pay(scanner.nextInt()); 

 


        
    }



    //SET FUNCTIONS 

    public void setF_name(String temp){
        this.F_name = temp;
    }
    public void setL_name(String temp){
        this.L_name = temp;
    }

    public void set_Dob(String temp){
        this.dob = temp;
    }
    
    public void set_Gender(String temp){
        this.Gender = temp;
    }
    
    public void set_Department() {
        Scanner scanner = new Scanner(System.in);
        String temp = "";
        
        System.out.println("Please select your department:");
        System.out.println("1. Medical");
        System.out.println("2. Emergency");
        System.out.println("3. HR");
        System.out.println("4. Admin");
    
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
    
        switch (choice) {
            case 1:
                temp = "Medical";
                break;
            case 2:
                temp = "Emergency";
                break;
            case 3:
                temp = "HR";
                break;
            case 4:
                temp = "Admin";
                break;
            default:
                System.out.println("Invalid choice. Setting department to 'Unknown'.");
                temp = "Unknown";
                break;
        }
    
        // Set the department
        this.department = temp;
        
        //scanner.close();
    }
    
    public void set_Job() {
        Scanner scanner = new Scanner(System.in);
        String temp;
        
        System.out.println("Please select your department:");
        System.out.println("1. Doctor");
        System.out.println("2. Nurse");
        System.out.println("3. Manager");
        System.out.println("4. Admin");
    
        // Repeat until a valid department is selected
        while (true) {
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
    
            switch (choice) {
                case 1:
                    temp = "Doctor";
                    break;
                case 2:
                    temp = "Nurse";
                    break;
                case 3:
                    temp = "Manager";
                    break;
                case 4:
                    temp = "Admin";
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid department.");
                    continue; // Prompt again for input
            }
    
            // Set the department and break out of the loop
            this.job = temp;
            break;
        }
        
   //     scanner.close();
    }

    public void set_Hours(int temp){
        this.hours = temp;
    }

    public void set_pay(int temp){
        this.pay = temp;
    }


    // RETURN FUNCTIONS  
    public String getF_name() {
        return F_name;
    }
    public void calculateAge() {
        // Extract the year from the date of birth
        String yearString = dob.substring(dob.length() - 4);
        int dob_year = Integer.parseInt(yearString);
        
        // Print out the extracted year for debugging
        System.out.println("Extracted year from DOB: " + dob_year);
    
        // Calculate the age
        age = 2024 - dob_year;
    }

    public int set_year() {

        String yearString = dob.substring(dob.length() - 4);

        int dob_year = Integer.parseInt(yearString);
        return dob_year;
    }



    public float get_weekly_wage(){
        float temp = pay * hours;

        weekly_wage = temp;

        return weekly_wage;
    }

    public float get_yearly_wage(){
        float temp = weekly_wage * 52;

        yearly_wage = temp;

        return yearly_wage;
    }

    public float get_tax_rate(){


        return tax_rate;
    }
    public float get_tax_income(){
        tax_income = yearly_wage *tax_rate;
        return tax_income;
    }
    public String getL_name() {
        return L_name;
    }
    
    public String getDob() {
        return dob;
    }
    public int get_age(){
        return age; 
    }
    public String getGender() {
        return Gender;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public String getJob() {
        return job;
    }

    public float getHours() {
        return hours;
    }
    
    public float getPay() {
        return pay;
    }

    public float return_avg_rae(){

        return avg_rate;
    }
}
