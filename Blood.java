package Project;
import java.util.*;
//main class
class Blood extends Blood_Bank {
//main  method
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Blood b = new Blood();
        int age, weight, choice;
        StringBuffer detail=new StringBuffer("\n**Please enter your personal details**");
        System.out.println(detail);
        b.getData();
        HealthConditions h = new Health_Issues();
        h.healthIssue();
        PersonalDetails r = new PersonalDetails();
        //Thread
        System.out.println("..........................Processing please wait....................................");
        r.run();
        if (Health_Issues.i == 1) 
        {
            System.out.println("Thank you for visiting us!");
         } 
        else
        {
                 do {
                System.out.println("************************************************************************************");
                System.out.println("Please enter your choice:");
                System.out.println("1. Donate Blood");
                System.out.println("2. Receive Blood");
                System.out.println("3. Show your data");
                System.out.println("4. To exit");
                choice = sc.nextInt();
                switch (choice) {
                    case 1://Blood donor
                        //Exceptional Handling
                        if (b.age < 17 || b.age > 66) {
                            throw new ArithmeticException("Your age must be between 18 to 65 to donate blood.");
                        } else if (b.weight < 50) {
                            throw new ArrayIndexOutOfBoundsException("Your weight must be greater than 50 kg to donate blood.");
                        } else {
                            b.blood_donordata();
                        }
                        break;
                    case 2://Blood Reciever
                        b.blood_receiverdata();
                        break;
                    case 3://Details
                        System.out.println("Your Details are:");
                        b.showData();
                        break;
                    case 4: //Exit  
                        System.out.println("Thank you for visiting us!");
                        break;
                    default: //wrong number pressed 
                        System.out.println("\n \u274C" + " Please enter valid choice " + "\u274C\n");
                        break;
                }
            } while (choice != 4);
        }
    }
}
