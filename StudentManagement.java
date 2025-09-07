import java.util.scanner;
class Students{
    String name,course;
    int roll_no;
    void students( String name,String course,int roll_no){
    this.name=name;
    this.course=course;
    this.roll_no=roll_no;
    }
    void setDetails(){
          System.out.println("Name: " + name);
           System.out.println("Course: " + course);
        System.out.println("Roll No: " + roll_no);
    }
    }
     class StudentAccount extends Students{
        double collegeFee;
        void setcollegeFee(double fee){
            this.collegeFee=fee;
        }
        void displayCollegeFee(){
            System.out.println("College Fee: " + collegeFee);
        }
     }
class Hostler extends StudentAccount{
    double hostelFee,messFee;
}
void displayHostellerDetails(double hostelFee,double messFee){
     this.hostelFee = hostelFee;
        this.messFee = messFee;
    }
      void displayHostellerDetails() {
        displayDetails();
        displayCollegeFee();
        System.out.println("Hostel Fee: " + hostelFee);
        System.out.println("Mess Fee: " + messFee);
        System.out.println("Total Fee: " + collegeFee + hostelFee + messFee);
      }
      class DayScholar extends StudentAccount{
        double busFee=busFee;
        void setBusFee(double busFee){
            this.busFee=busFee;
        }
void displayDayScholarDetails() {
        displayDetails();
        displayCollegeFee();
        System.out.println("Bus Fee: " + busFee);
        System.out.println("Total Fee: " + (collegeFee + busFee));
    }
}
    public class StudentManagement{
        public static void main(){
            Scanner sc= new Scanner(System.in);
             Hosteller hosteller = new Hosteller();
        System.out.println("Enter Hosteller Details:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Course: ");
        String course = sc.nextLine();
        System.out.print("College Fee: ");
        double collegeFee = sc.nextDouble();
        System.out.print("Hostel Fee: ");
        double hostelFee = sc.nextDouble();
        System.out.print("Mess Fee: ");
        double messFee = sc.nextDouble();

        hosteller.setDetails(name, rollNo, course);
        hosteller.setCollegeFee(collegeFee);
        hosteller.setHostelDetails(hostelFee, messFee);

        System.out.println("\n--- Hosteller Details ---");
        hosteller.displayHostellerDetails();

        sc.nextLine(); 
        DayScholar dayScholar = new DayScholar();
        System.out.println("\nEnter Day Scholar Details:");
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Course: ");
        course = sc.nextLine();
        System.out.print("College Fee: ");
        collegeFee = sc.nextDouble();
        System.out.print("Bus Fee: ");
        double busFee = sc.nextDouble();

        dayScholar.setDetails(name, rollNo, course);
         dayScholar.setCollegeFee(collegeFee);
        dayScholar.setBusFee(busFee);

        System.out.println("\n--- Day Scholar Details ---");
        dayScholar.displayDayScholarDetails();

        sc.close();
        }
    }

