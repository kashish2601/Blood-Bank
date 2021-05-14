package Project;
import java.util.*;
//for Personal detail
class PersonalDetails {                                                                      
   //Variable Decalarations 
    int age, Cno, Ano;
    String contactNo = Integer.toString(Cno);
    String aadhaarNo = Integer.toString(Ano);
    double weight;
    String name, BloodGroup, email_id;

    //Method for Thread
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
//Method to get data from user
    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Full Name : ");
        name = sc.nextLine();
        System.out.println("Enter your Age : ");
        age = sc.nextInt();
        System.out.println("Enter your Contact Number:");
        sc.nextLine();
        do {
            try {
                contactNo = sc.nextLine();
                if (String.valueOf(contactNo).length() != 10) {
                    throw new ArrayIndexOutOfBoundsException("\u274CInvalid  \nYour Contact number  must contain 10 digits\nTry Again \nEnter the contact number");
                }
            } catch (ArrayIndexOutOfBoundsException aiob) {
                System.out.println(aiob);
            }
        } while (String.valueOf(contactNo).length() != 10);
        System.out.println("Enter your Aadhaar Number:");
        do {
            try {
                aadhaarNo = sc.nextLine();
                if (String.valueOf(aadhaarNo).length() != 12) {
                    throw new ArrayIndexOutOfBoundsException(" \u274CInvalid  \nYour Aadhaar number must contain  12 digits\nTry Again \nEnter the aadhaar number");
                }
            } catch (ArrayIndexOutOfBoundsException aiob) {
                System.out.println(aiob);
            }
        } while (String.valueOf(aadhaarNo).length() != 12);
        System.out.println("Enter your Email'id:");
        email_id = sc.nextLine();
        System.out.println("Enter your Blood Group:");
        BloodGroup = sc.nextLine();
        System.out.println("Enter your Weight in kg's : ");
        weight = sc.nextDouble();
    }
//Method to show data of user
    void showData() {
        System.out.println("Name : " + name);
         //use of Wrapper class
        Integer a=Integer.valueOf(age);
        System.out.println("Age : " + age);
        System.out.println("Contact Number : " + contactNo);
        System.out.println("Aadhaar number  : " + aadhaarNo);
        System.out.println("Email id : " + email_id);
        System.out.println("Blood Group : " + BloodGroup);
        System.out.println("Weight:" + weight + "kg");
    }
}