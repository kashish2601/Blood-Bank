package Project;
import java.util.*;
//abstract class
abstract class HealthConditions extends PersonalDetails
{
    abstract void healthIssue();
}
class Health_Issues extends HealthConditions 
{
    //variable declarations
    static int i;
     int n;
    String p;
    Scanner sc = new Scanner(System.in);
   
    @Override
    public void healthIssue() {
        System.out.println("\n**********************************************************\n");
        System.out.println("You should not have any of these");
        System.out.println("=> Donated blood in last 3 months");
        System.out.println("=> Pierced Body/ear or Tattoo in last 6 months");
        System.out.println("=> Had any Surgery in last 1 month ");
        System.out.println("=> Consumed Alcohol  in last 24 hours");
        System.out.println("=> Pregnant");
        System.out.println("=> Miscarriage in past 6 months");
        System.out.println("=> Have asthma with active symptoms");
        System.out.println("=> Had any disorder in the past");
        System.out.println("=> Covid positive  ");
        System.out.println("\n**********************************************************\n");
        healthIssue(i);
    }
    public void healthIssue(int x) {
        System.out.println("Do  you have any of these problems?? ");
        System.out.println("1.Yes");
        System.out.println("2.No");
        System.out.println("Enter your choice : ");
        i = sc.nextInt();
        switch (i) {
            case 1:
                System.out.println("Sorry! you cannot donate Blood.");
                break;
            case 2:
                System.out.println("Any other health issue you would like to mention???");
                System.out.println("1.Yes");
                System.out.println("2.No");
                System.out.println("Enter your choice : ");
                n = sc.nextInt();
                switch (n) {
                    case 1:
                        System.out.println("Please mention it here:");
                        sc.nextLine();
                        p = sc.nextLine();
                        break;
                    case 2:
                        System.out.println("Thank you! You can continue.");
                        break;
                    default: //wrong number pressed 
                        System.out.println("\n \u274C" + " Please enter valid choice " + "\u274C\n");
                        break;
                }
                break;
            default: //wrong number pressed 
                System.out.println("\n \u274C" + " Please enter valid choice " + "\u274C\n");
                break;
        }
    }
}