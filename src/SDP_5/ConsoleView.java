package SDP_5;

import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner;

    public ConsoleView() {
        this.scanner = new Scanner(System.in);
    }

    public void displayData(String data) {
        System.out.println("Current Data: " + data);
    }

    public String promptForData() {
        System.out.print("Enter new data: ");
        return scanner.nextLine();
    }

    public String promptForMoreData() {
        System.out.print("Enter another piece of data: ");
        return scanner.nextLine();
    }

    public void displayFinalData(String data) {
        System.out.println("Final combined data: " + data);
    }
}
