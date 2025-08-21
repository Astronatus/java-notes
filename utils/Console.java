package utils;

import java.util.Scanner;

public class Console implements AutoCloseable {
    private final Scanner scanner;
    private final boolean closeScannerOnClose;

    public Console() {
        this.scanner = new Scanner(System.in);
        this.closeScannerOnClose = true;
    }

    public void print (String prompt) {
        System.out.println(prompt);
    }

    public String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public int readInt(String prompt) {
        System.out.print(prompt);
        String line = scanner.nextLine();
        try {
            return Integer.parseInt(line.trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid number: " + line, e);
        }
    }

    @Override
    public void close() {
        if (closeScannerOnClose) {
            scanner.close();
        }
    }

}
