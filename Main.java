package s;


public class Main {
    public static void main(String[] args) {
        int rollNumber = 43; // Student roll number
        int dob = 12; // Date of birth

        TableThread dobTable = new TableThread(dob, "Date of Birth 12");
        TableThread rollNumberTable = new TableThread(rollNumber, "Roll Number 43");

        // Start the date of birth table thread first
        dobTable.start();
        try {
            // Ensure dobTable finishes before starting rollNumberTable
            dobTable.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Start the roll number table thread after dobTable completes
        rollNumberTable.start();
    }
}

