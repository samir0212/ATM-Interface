import java.util.Scanner;

public class ATMInterface {
    private static Scanner scanner = new Scanner(System.in);
    private static int balance = 1000; 

    public static void main(String[] args) {
        System.out.print("Enter your user id: ");
        int userId = scanner.nextInt();

        System.out.print("Enter your user pin: ");
        int userPin = scanner.nextInt();

        if (checkLogin(userId, userPin)) {
            System.out.println("Login successful.");
            showMenu();
        } else {
            System.out.println("Invalid user id or pin.");
        }
    }

    private static boolean checkLogin(int userId, int userPin) {
        
        return true;
    }

    private static void showMenu() {
        int choice;
        do {
            System.out.println("1. View balance");
            System.out.println("2. Withdraw money");
            System.out.println("3. Deposit money");
            System.out.println("4. Transfer money");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    viewBalance();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                case 3:
                    depositMoney();
                    break;
                case 4:
                    transferMoney();
                    break;
                case 5:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private static void viewBalance() {
        System.out.println("Your current balance is: " + balance);
    }

    private static void withdrawMoney() {
        System.out.print("Enter amount to withdraw: ");
        int amount = scanner.nextInt();
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("" + amount + " withdrawn successfully. Your current balance is " + balance);
        }
    }

    private static void depositMoney() {
        System.out.print("Enter amount to deposit: ");
        int amount = scanner.nextInt();
        balance += amount;
        System.out.println("" + amount + " deposited successfully. Your current balance is " + balance);
    }

    private static void transferMoney() {
        System.out.print("Enter recipient's account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter amount to transfer: ");
        int amount = scanner.nextInt();
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("" + amount + " transferred successfully to account " + accountNumber + ". Your current balance is " + balance);
        }
    }
}






private static String selectAnswer() {
    System.out.println("A) Option A");
    System.out.println("B) Option B");
    System.out.println("C) Option C");
    System.out.println("D) Option D");
    System.out.print("Enter your answer (A/B/C/D): ");
    return scanner.nextLine().toUpperCase();
}