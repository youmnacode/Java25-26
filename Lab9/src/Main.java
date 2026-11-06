public class Main {
    public static void main(String[] args) {

        // Create array of patients (size 3)
        Patiente[] patients = new Patiente[3];

        // Initialize patients
//        patients[0] = new InPatient("Ali");     //Ali
//        patients[1] = new InPatient("Sara");    //Sara
//        patients[2] = new InPatient("Omar");    //Omar
        /// done this way for ex1

        /// ex2
        patients[0] = new InPatient("Ali", 1000);     //Ali
        patients[1] = new InPatient("Sara", 2000);    //Sara
        patients[2] = new InPatient("Omar", 1500);    //Omar


        // Loop through patients
        for (int i = 0; i < patients.length; i++) {

            // Display info
            patients[i].displayInfo();
            ///ex1

            // Admit patient
            ((Admittable) patients[i]).admit();
            ///ex1

            // Check vitals
            ((Monitorable) patients[i]).checkVitals();
            ///ex1
        }


        /// ex2
        double total = 0;   ///for total revenue later
        System.out.println();

        for (int i = 0; i < patients.length; i++)
        {

            double bill = patients[i].calculateBill();
            /// call calculateBill to see how much to be paid after insurance is applied
            /// define inside for loop so that it resets for each patient

            total = total + bill;

            ((Payable) patients[i]).payBill(bill);
            /// call payBill to show how much the patient paid
        }

        System.out.println("Total Revenue: " + total);
    }
}