import java.util.Scanner;

 //Print multiple lines 

public class  main{
   public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    //variables
    int userInput;
    //Employees 
    employee num1 = new employee();
    employee num2 = new employee();
    employee num3 = new employee();
    //patients 

    patient pat1 = new patient();
    patient pat2 = new patient();
    patient pat3 = new patient();
    // Read the input from the user
  


    System.out.println("Welcome to Isac's Health Project ");
    System.out.println("Please Press 1 to continue");
    userInput = scanner.nextInt();


    if (userInput == 1) {
       System.out.println("Please be ready with employee information");
       System.out.println("___________________________________________");
       System.out.println("Please enter employee #1 information" );
       System.out.println("___________________________________________");
       System.out.println();
       num1.collectEmployeeDataFromUser();
       System.out.println("Please enter employee #2 information" );
       System.out.println("___________________________________________");
       System.out.println();
       num2.collectEmployeeDataFromUser();
       System.out.println("Please enter employee #3 information" );
       System.out.println("___________________________________________");
       System.out.println();
       num3.collectEmployeeDataFromUser();
        
       System.out.println();
       num1.displayEmployeeInfo();
       num2.displayEmployeeInfo();
       num3.displayEmployeeInfo();


       
       System.out.println("Please be ready to enter the patients information");
       System.out.println();
       System.out.println("___________________________________________");
       System.out.println("Please enter patient #1 information" );
       System.out.println("___________________________________________");
       pat1.patientCollectionData();

       System.out.println("___________________________________________");
       System.out.println("Please enter patient #2 information" );
       System.out.println("___________________________________________");
       pat2.patientCollectionData();
    
       System.out.println("___________________________________________");
       System.out.println("Please enter patient #3 information" );
       System.out.println("___________________________________________");
       pat3.patientCollectionData();
        

       System.out.println("___________________________________________");
    


      num1.displayEmployeeAvgRating(pat1.getStaffRating1(), pat2.getStaffRating1(), pat1.getStaffRating1());

      num2.displayEmployeeAvgRating(pat1.getStaffRating2(), pat2.getStaffRating2(), pat1.getStaffRating2());

      num3.displayEmployeeAvgRating(pat3.getStaffRating3(), pat2.getStaffRating3(), pat1.getStaffRating3());


//      pat1.set_Patient_rating();
//      pat2.set_Patient_rating();
//      pat3.set_Patient_rating();


      
      System.out.println("_______________________");
      pat1.display_Data();
      pat2.display_Data();
      pat3.display_Data();



      System.out.println("_______________________");
      pat1.patient_rate_staff(num1.getF_name(),num2.getF_name(), num3.getF_name());
      pat2.patient_rate_staff(num1.getF_name(),num2.getF_name(), num3.getF_name());
      pat3.patient_rate_staff(num1.getF_name(),num2.getF_name(), num3.getF_name());
      
      System.out.println("_______________________");
      pat1.display_pat_staff_rating();
      pat2.display_pat_staff_rating();
      pat3.display_pat_staff_rating();

      System.out.println("_______________________");
      num1.displayEmployeeAvgRating(pat1.getStaffRating1(), pat2.getStaffRating1(), pat1.getStaffRating1());

      num2.displayEmployeeAvgRating(pat1.getStaffRating2(), pat2.getStaffRating2(), pat1.getStaffRating2());

      num3.displayEmployeeAvgRating(pat3.getStaffRating3(), pat2.getStaffRating3(), pat1.getStaffRating3());


      System.out.println("_______________________");
      int h = pat1.getHeight() + pat2.getHeight() + pat3.getHeight() / 3;
      int w = pat1.getWeight() + pat2.getWeight() + pat3.getWeight() / 3;
      System.out.println("_______________________");
      System.out.println("Average Weight of the patients " + w);
      System.out.println("Average Height of the patients " + h);

      System.out.println("_______________________");
      float temp = num1.get_yearly_wage() + num2.get_yearly_wage() + num3.get_yearly_wage();
      System.out.println("Expected yearly expenses in salary $: " + temp);

    } else {
        System.out.println("Invalid input. Exiting...");
        System.out.println("Expected yearly expenses in salary $: " +  "900,593");
    }

    // Close the Scanner to prevent resource leak
    scanner.close();
}
}