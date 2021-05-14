package Project;
import java.util.*;
//interface
interface Blood_data {

    public void blood_donordata();

    public void blood_receiverdata();
}
class Blood_Bank extends PersonalDetails implements Blood_data {
    private int countAp;
    private int countOp ;
    private int countBp;
    private int countABp;
    private int countAn;
    private int countOn;
    private int countBn;
    private int countABn;
    //default constructor
    public Blood_Bank()
    {
        this(10, 15, 19, 20, 10, 20, 17, 12);
    }
    // parameterized constructor
    //Constructor overloading
    public Blood_Bank(int countAp , int countOp , int countBp , int countABp , int countAn , int countOn , int countBn , int countABn)
    {
        super();
        this.countAp=10;
        this.countOp=15;
        this.countBp=19;
        this.countABp=20;
        this.countAn=10;
        this.countOn=20;
        this.countBn=17;
        this.countABn=12;
    }
    @Override
    //Blood Donor 
    public void blood_donordata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Thank you for donating blood! \nRemember to eat a healthy meal  and drink plenty of fluids. \nYou can continue your normal routine, but avoid heavy lifting and strenuous exercise for 12 hours.");
        if ("A+".equals(super.BloodGroup)) {
            countAp = countAp + 1;
            System.out.println("We have  now " + countAp + " unit of  A+ blood  available with us.");
        } else if ("O+".equals(super.BloodGroup)) {
            countOp = countOp + 1;
            System.out.println("We have now  " + countOp + " unit of  O+ blood  available with us. ");
        } else if ("B+".equals(super.BloodGroup)) {
            countBp = countBp + 1;
            System.out.println("We have now  " + countBp + " unit of  B+ blood  available with us.");
        } else if ("AB+".equals(super.BloodGroup)) {
            countABp = countABp + 1;
            System.out.println("We have now " + countABp + " unit of  AB+ blood  available with us. ");
        } else if ("A-".equals(super.BloodGroup)) {
            countAn = countAn + 1;
            System.out.println("We have now " + countAn + " unit of  A- blood  available with us.");
        } else if ("O-".equals(super.BloodGroup)) {
            countOn = countOn + 1;
            System.out.println("We have now " + countOn + " unit of  O- blood  available with us.  ");
        } else if ("B-".equals(super.BloodGroup)) {
            countBn = countBn + 1;
            System.out.println("We have now " + countBn + " unit of  B- blood  available with us. ");
        } else if ("AB-".equals(super.BloodGroup)) {
            countABn = countABn + 1;
            System.out.println("We have now " + countABn + "unit of  AB- blood  available with us.  ");
        }
    }

    @Override
    //Blood reciever
    public void blood_receiverdata() {
        Scanner sc = new Scanner(System.in);
        int unitBlood; 
       String bloodType;
        System.out.println("How much units of blood do you need?");
        unitBlood = sc.nextInt();
        ArrayList<String> blood=new ArrayList<>();
        blood.add("A+");
        blood.add("A-");
        blood.add("O+");
        blood.add("O-");
        blood.add("B+");
        blood.add("B-");
         blood.add("AB+");
        blood.add("AB-");
        if ("A+".equals(BloodGroup)) {
            System.out.print("You can receive blood from " );
           blood.remove("B+");
           blood.remove("B-");
           blood.remove("AB+");
            blood.remove("AB-");
            System.out.println(blood);
            System.out.println("Please enter your choice:");
            bloodType = sc.next();
            switch (bloodType) {
                case "A+":
                    if (countAp != 0) {
                        countAp = countAp - unitBlood;
                        System.out.println("Now A+ has " + countAp + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case "A-":
                    if (countAn != 0) {
                        countAn = countAn - unitBlood;
                        System.out.println(" NowA- has " + countAn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case "O+" :
                    if (countOp != 0) {
                        countOp = countOp - unitBlood;
                        System.out.println("Now O+ has " + countOp + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case  "O-":
                    if (countOn != 0) {
                        countOn = countOn - unitBlood;
                        System.out.println("Now O- has " + countOn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                default: //wrong number pressed 
                    System.out.println("\n \u274C" + " Please enter valid choice " + "\u274C\n");
                    break;
            }
        } else if ("O+".equals(BloodGroup)) {
            System.out.print("You can receive blood from " );
            blood.remove("A+");
            blood.remove("A-");
            blood.remove("B+");
            blood.remove("B-");
            blood.remove("AB+");
            blood.remove("AB-");
            System.out.println(blood);
            System.out.println("Please enter your choice:");
            bloodType = sc.next();
            switch (bloodType) {
                case "O+":
                    if (countOp != 0) {
                        countOp = countOp - unitBlood;
                        System.out.println("Now O+ has " + countOp + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case "O-":
                    if (countOn != 0) {
                        countOn = countOn - unitBlood;
                        System.out.println("Now O- has " + countOn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                default: //wrong number pressed 
                    System.out.println("\n \u274C" + " Please enter valid choice " + "\u274C\n");
                    break;
            }
        } else if ("B+".equals(BloodGroup)) {
            System.out.print("You can receive blood from " );
            blood.remove("A+");
            blood.remove("A-");
            blood.remove("AB+");
            blood.remove("AB-");
            System.out.println(blood);
            System.out.println("Please enter your choice:");
            bloodType = sc.next();
            switch (bloodType) {
                case "O+":
                    if (countOp != 0) {
                        countOp = countOp - unitBlood;
                        System.out.println("Now O+ has " + countOp + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case "O-":
                    if (countOn != 0) {
                        countOn = countOn - unitBlood;
                        System.out.println("Now O- has " + countOn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case "B+":
                    if (countBp != 0) {
                        countBp = countBp - unitBlood;
                        System.out.println("Now B+ has " + countBp + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case "B-":
                    if (countBn != 0) {
                        countBn = countBn - unitBlood;
                        System.out.println("Now B- has " + countBn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                
                default: //wrong number pressed 
                    System.out.println("\n \u274C" + " Please enter valid choice " + "\u274C\n");
                    break;
            }
        } else if ("AB+".equals(BloodGroup)) {
            System.out.print("You can receive blood from " );
            System.out.println(blood);
            System.out.println("Please enter your choice:");
            bloodType = sc.next();
            switch (bloodType) {
                case"A+":
                    if (countAp != 0) {
                        countAp = countAp - unitBlood;
                        System.out.println("Now A+ has " + countAp + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case "A-":
                    if (countAn != 0) {
                        countAn = countAn - unitBlood;
                        System.out.println("Now A- has " + countAn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case "O+":
                    if (countOp != 0) {
                        countOp = countOp - unitBlood;
                        System.out.println("Now O+ has " + countOp + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case "O-":
                    if (countOn != 0) {
                        countOn = countOn - unitBlood;
                        System.out.println("Now O- has " + countOn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case "B+":
                    if (countBp != 0) {
                        countBp = countBp - unitBlood;
                        System.out.println("Now B+ has " + countBp + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case "B-":
                    if (countBn != 0) {
                        countBn = countBn - unitBlood;
                        System.out.println("Now B- has " + countBn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case "AB+":
                    if (countABp != 0) {
                        countABp = countABp - unitBlood;
                        System.out.println("Now AB+ has " + countABp + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case "AB-":
                    if (countABn != 0) {
                        countABn = countABn - unitBlood;
                        System.out.println("Now AB- has " + countABn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
               default: //wrong number pressed 
                    System.out.println("\n \u274C" + " Please enter valid choice " + "\u274C\n");
                    break;
            }
        } else if ("A-".equals(BloodGroup)) {
            System.out.print("You can receive blood from " );
            blood.remove("A+");
            blood.remove("O+");
            blood.remove("B+");
            blood.remove("B-");
            blood.remove("AB+");
            blood.remove("AB-");
            System.out.println(blood);
            System.out.println("Please enter your choice:");
            bloodType = sc.next();
            switch (bloodType) {
                case "A-":
                    if (countAn != 0) {
                        countAn = countAn - unitBlood;
                        System.out.println("Now A- has " + countAn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case "O-":
                    if (countOn != 0) {
                        countOn = countOn - unitBlood;
                        System.out.println("Now O- has " + countOn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                default: //wrong number pressed 
                    System.out.println("\n \u274C" + " Please enter valid choice " + "\u274C\n");
                    break;
            }
        } else if ("O-".equals(BloodGroup)) {
            System.out.print("You can receive blood from " );
            blood.remove("A+");
            blood.remove("O+");
            blood.remove("A-");
            blood.remove("B+");
            blood.remove("B-");
            blood.remove("AB+");
            blood.remove("AB-");
            System.out.println(blood);
                    if (countOn != 0) {
                        countOn = countOn - unitBlood;
                        System.out.println("Now O- has " + countAn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
        }else if ("B-".equals(BloodGroup)) {
            System.out.print("You can receive blood from " );
            blood.remove("A+");
            blood.remove("O+");
            blood.remove("B+");
            blood.remove("A-");
            blood.remove("AB+");
            blood.remove("AB-");
            System.out.println(blood);
            System.out.println("Please enter your choice:");
            bloodType = sc.next();
            switch (bloodType) {
                case "O-":
                    if (countOn != 0) {
                        countOn = countOn - unitBlood;
                        System.out.println("Now O- has " + countOn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case "B-":
                    if (countBn != 0) {
                        countBn = countBn - unitBlood;
                        System.out.println("Now B- has " + countBn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                default: //wrong number pressed 
                    System.out.println("\n \u274C" + " Please enter valid choice " + "\u274C\n");
                    break;
            }
        } else if ("AB-".equals(BloodGroup)) {
            System.out.print("You can receive blood from " );
            blood.remove("A+");
            blood.remove("O+");
            blood.remove("B+");
            blood.remove("AB+");
            System.out.println(blood);
            System.out.println("Please enter your choice:");
            bloodType = sc.next();
            switch (bloodType) {
                case "A-":
                    if (countAn != 0) {
                        countAn = countAn - unitBlood;
                        System.out.println("Now A- has " + countAn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case "O-":
                    if (countOn != 0) {
                        countOn = countOn - unitBlood;
                        System.out.println("Now O- has " + countOn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case "B-":
                    if (countBn != 0) {
                        countBn = countBn - unitBlood;
                        System.out.println("Now B- has " + countBn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case "AB-":
                    if (countABn != 0) {
                        countABn = countABn - unitBlood;
                        System.out.println("Now AB- has " + countABn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
               default: //wrong number pressed 
                    System.out.println("\n \u274C" + " Please enter valid choice " + "\u274C\n");
                    break;
            }
         }
      }
   }

