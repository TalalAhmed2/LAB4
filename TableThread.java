package s;


class TableThread extends Thread {
    private int number;
    private String label;

    public TableThread(int number, String label) {
        this.number = number;
        this.label = label;
    }

    public void run() {
        System.out.println("Table of " + label + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(label + " * " + i + " = " + (number * i));
        }
        System.out.println(); // Line break after each table for readability
    }
}
	


