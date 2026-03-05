class PhysicsCalculator{
  public static void main(String[] args){
    double velocity1=50;
    double velocity2=26;
    double square1=Math.pow(velocity1,2);
    double square2=Math.pow(velocity2,2);
    double result=Math.sqrt(square1+square2);
    System.out.println("Square1:"+square1);
    System.out.println("Square2:"+square2);
    System.out.println("Result:"+result);
  }
}   
