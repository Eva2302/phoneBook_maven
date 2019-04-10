import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.UnsupportedEncodingException {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in, "Cp866");

        PrintStream printStream = new PrintStream(System.out, true, "Cp866");

        //System.out.println("Введите ФИО: ");
        printStream.println("Введите ФИО: ");
        String s = scanner.nextLine();

        phoneBook.printPhoneLst(s);


    }
}
