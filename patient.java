import java.util.Scanner;

public class patient {
    private String F_name;
    private String L_name;
    private String dob;
    private float age; 
    private String Gender;
    private String Phone_number;
    private int weight;
    private int height;
    private float temp;
    private float pulse;
    private float resp_rate;
    private float Blood_pressure;
    private float upper_BP;
    private float lower_BP;
    private String allergies;
    private int staff_rating1;
    private int staff_rating2;
    private int staff_rating3;
    private int BMI;
    private int patient_rating_1;
    private int patient_rating_2;
    private int patient_rating_3;
    public patient(){

    }
    public patient(String F_name, String L_name, String dob, String Gender, String Phone_number, int weight, int height, float temp, float pulse, float resp_rate, float Blood_pressure, String allergies) {
        this.F_name = F_name;
        this.L_name = L_name;
        this.dob = dob;
        this.Gender = Gender;
        this.Phone_number = Phone_number;
        this.weight = weight;
        this.height = height;
        this.temp = temp;
        this.pulse = pulse;
        this.resp_rate = resp_rate;
        this.Blood_pressure = Blood_pressure;
        this.allergies = allergies;
    }

    // Display patients Information

    public void display_Data(){
        System.out.println("         PATIENT DATA         ");
        System.out.println("______________________________");
        System.out.print("Name: ");
        System.out.print(getF_name() + " " + getL_name());
        System.out.println();
        System.out.print("Date of birth : ");
        System.out.print(getDob());
        System.out.println();
        System.out.print("Age : ");
    
        System.out.print(get_age());
        System.out.println();
        System.out.print("Gender : ");
        System.out.print(getGender());
        System.out.println();
        System.out.print("Phone number : ");
        System.out.print(getPhone_number());
        System.out.println();
        System.out.print("Height(IN) : " );
        System.out.print(getHeight());
        System.out.println();
        System.out.print("Weight(LB) : " );
        System.out.print(getWeight());
        System.out.println();
        System.out.print("BMI : " );
        System.out.print(get_bmi());
        System.out.println();
        System.out.print("Temp(FT) : " );
        System.out.print(getTemp());
        System.out.println();
        System.out.print("Blood Pressure : " );
        display_BP();
        System.out.println();
        System.out.print("Pulse : " );
        System.out.print(getPulse());
        System.out.println();
        System.out.print("Respitory rate : ");
        System.out.print(getResp_rate());
        System.out.println();
        System.out.print("Allergies : ");
        System.out.print(getAllergies());
        System.out.println();
        System.out.println("_________________________________");
    }

    public void set_Patient_rating(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please rate the patient out of 5 stars");
        System.out.println("Staff member 1 rating");
        patient_rating_1= scan.nextInt();
        System.out.println("Please rate the patient out of 5 stars");
        System.out.println("Staff member 2 rating");
        patient_rating_2 = scan.nextInt();
        System.out.println("Please rate the patient out of 5 stars");
        System.out.println("Staff member 3 rating ");
        patient_rating_3 = scan.nextInt();
        scan.close();
    }
    
    //Patient rating 
    public void patient_rate_staff(String name, String name2, String name3){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please rate " + name + " Out of 5 stars ");
        staff_rating1 = scan.nextInt();
        System.out.println("Please rate " + name2 + " Out of 5 stars ");
        staff_rating2 = scan.nextInt();
        System.out.println("Please rate " + name3 + " Out of 5 stars ");
        staff_rating3 = scan.nextInt();
        System.out.print("_________________________________________");
        System.out.println();
  
    }

    public void display_pat_rating(){
        System.out.println(F_name +  " " + L_name + " Patient rating" );
        
        System.out.println("Staff membember 1 rates :" + patient_rating_1);
        System.out.println("_________________________________________");
        System.out.println("Staff membember 2 rates :" + patient_rating_2);
        System.out.println("_________________________________________");
        System.out.println("Staff membember 3 rates :" + patient_rating_3);
    }

    public void display_pat_staff_rating(){
        System.out.println(F_name + L_name + " Staff Rating" );
        
        System.out.println("Patient rates staff 1  " + staff_rating1);
        System.out.println("_________________________________________");
        System.out.println("Patient rates staff 2  " + staff_rating2);
        System.out.println("_________________________________________");
        System.out.println("Patient rates staff 3  " + staff_rating3);
    }
    
    // Collect Patient information 
    public void patientCollectionData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter Patients first name");
        setF_name(scanner.nextLine()); 

        System.out.println("Please enter Patients Last name");
        setL_name(scanner.nextLine()); 

        System.out.println("Please enter Employees Gender");
        setGender(scanner.nextLine());
        
        System.out.println("Please enter Patients Phone Number");
        setPhone_number(scanner.nextLine()); 


        System.out.println("Please enter Patients Date of birth ");
        System.out.println("Please put it in xx/xx/xxx format please do not add (/)");
        setDob(scanner.nextLine()); 
        set_age();




        System.out.println("Please enter Patients Height in inches ");
        setHeight(scanner.nextInt()); 

        System.out.println("Please enter Patients weight in pounds ");
        setWeight(scanner.nextInt());

        setBMI();

        System.out.println("Please enter Patients temp in Farhenheit");
        setTemp(scanner.nextInt());

        System.out.println("Please enter Patients pulse Beats per minute ");
        setPulse(scanner.nextInt()); 


        setBlood_pressure(Blood_pressure);
        
        System.out.println("Please enter Patients respitory rate, Beats per minute");
        setResp_rate(scanner.nextInt()); 

        System.out.println("Please enter Patients allergies if any press 0 for none");
        setAllergies(scanner.nextLine()); 





      //  scanner.close();
        
    }
    // set object methods
    public void setF_name(String F_name) {
        this.F_name = F_name;
    }

    public void setL_name(String L_name) {
        this.L_name = L_name;
    }

    public void setDob(String dob) {

        this.dob = dob;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setPhone_number(String Phone_number) {
        this.Phone_number = Phone_number;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setBMI() {
        // Convert height from inches to meters
        float heightMeters = height * 0.0254f; // 1 inch = 0.0254 meters
        
        // Calculate BMI
        BMI = (int) (weight / (heightMeters * heightMeters)); 
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public void setPulse(float pulse) {
        this.pulse = pulse;
    }
    public void set_age() {
        // Extract the year from the date of birth
        String yearString = dob.substring(dob.length() - 4);
        int dob_year = Integer.parseInt(yearString);
        
        // Print out the extracted year for debugging
        System.out.println("Extracted year from DOB: " + dob_year);
    
        // Calculate the age
        age = 2024 - dob_year;
    }
    public void setResp_rate(float resp_rate) {
        this.resp_rate = resp_rate;
    }

    //Set BP needs two variables
    public void setBlood_pressure(float Blood_pressure) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("systolic blood pressure :");
        upper_BP = scnr.nextFloat();
        System.out.println("diastolic blood pressure :");
        lower_BP = scnr.nextFloat();
        

        Blood_pressure = upper_BP / lower_BP;

        this.Blood_pressure = Blood_pressure;
    }

    public void setAllergies(String allergies) {
        if(allergies.contains("0")){
            allergies = "NA";
        }

        this.allergies = allergies;
    }

    // return Functions 
    public void display_BP(){
        System.out.println( upper_BP + "/" + lower_BP);
    } 
    public String getF_name() {
        return F_name;
    }

    public String getL_name() {
        return L_name;
    }

    public String getDob() {
        return dob;
    }

    public String getGender() {
        return Gender;
    }
    public float get_age(){


        return age;
    }
    public String getPhone_number() {
        return Phone_number;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public float getTemp() {
        return temp;
    }

    public float getPulse() {
        return pulse;
    }

    public float getResp_rate() {
        return resp_rate;
    }
    public int get_bmi(){
        return BMI;
    }
    public float getBlood_pressure() {
        return Blood_pressure;
    }

    public String getAllergies() {
        return allergies;
    }

    public int getStaffRating1(){
        return staff_rating1;
    }
    public int getStaffRating2(){
        return staff_rating2;
    }
    public int getStaffRating3(){
        return staff_rating3;
    }

}