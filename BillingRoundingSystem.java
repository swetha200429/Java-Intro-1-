class BillingRoundingSystem{
  public static void main(String[] args){
    double amount=1398.798;
    long roundedRate=Math.round(amount);
    double ceilValue=Math.ceil(amount);
    double floorValue=Math.floor(amount);
    System.out.println("Amount:"+amount);
    System.out.println("Rounded Value:"+roundedRate);
    System.out.println("Ceil Value:"+ceilValue);
    System.out.println("Floor Value:"+floorValue);
  }
}
