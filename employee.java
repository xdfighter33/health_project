import java.util.Scanner;

public class employee {
    private String F_name;
    private String L_name;
    private int dob;
    private String Gender;
    private String department;
    private String job;
    private float hours;
    private float pay;
    
    // DECLARTION 

    public employee() {

    }


    public employee(String F_name, String L_name, int dob, String Gender, String department, String job, float hours, float pay) {
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
        System.out.println("Gender:        " + getGender());
        System.out.println("Department:    " + getDepartment());
        System.out.println("Job Title:     " + getJob());
        System.out.println("Weekly Hours:  " + getHours());
        System.out.println("Hourly Wage:   " + getPay());
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
        set_Dob(scanner.nextInt()); 


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

    public void set_Dob(int temp){
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
            this.department = temp;
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
    
    public String getL_name() {
        return L_name;
    }
    
    public int getDob() {
        return dob;
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
}
