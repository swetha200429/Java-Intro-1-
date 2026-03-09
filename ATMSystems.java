import java.util.Scanner;
class ATMSystems{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int choice;
    double balance=10000;
    double amount;
    do{
      System.out.println("-----ATM Menu ------");
      System.out.println("1.Withdraw");
      System.out.println("2.Check Balance");
      System.out.println("3.Exit");
      System.out.println("Enter choice:");
      choice=sc.nextInt();
      switch(choice){
          case1:
          System.out.println("enter amount:");
          amount=sc.nextDouble();
          if(amount<=balance){
            balance-=amount;
            System.out.println("Withdrawal successful!");
          }
          else{
            system.out.println("Insufficient balance!");
          }
          break;
          case2:
          System.out.printlnm
          caes:
