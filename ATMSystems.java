import java.util.Scanner;
class ATMSystems{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice;
    double balance = 10000;
        double amount;

        do {

            System.out.println("\n------ ATM Menu ------");
            System.out.println("1. Withdraw");
            System.out.println("2. Check Balance");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount: ");
                    amount = sc.nextDouble();

                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case 2:
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 3:
                    System.out.println("Thank you for using ATM!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}
