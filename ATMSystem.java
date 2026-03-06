class ATMSystem{
  public static void main(string[] args){
    int enteredPIN=1234;
    int correctPIN=1234;
    double balance=10000;
    double withdrawAmount=2500;
    if(enteredPIN==correctPIN){
      if(withdrawAmount<=balance && withdrawAmount % 100=0){
        balance-=withdrawAmount;
        System.out.print("withdrawal Successful");
        System.out.print("Remaining Balance:"+balance);
      }
      else{
        System.out.println("Invalid amount or Insufficient Balance");
      }
    }
    else{
      System.out.println("Incorrect PIN");
    }
  }
}
