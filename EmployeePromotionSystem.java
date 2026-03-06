class EmployeePromotionSystem{
  public static void main(String[] args){
    int experience=6;
    int performanceRating=9;
    int age=35;
    boolean disciplinaryAction=false;
    if(experience>=5 && performanceRating>=8 && !disciplinaryAction && age<=60){
      System.out.println("Promotion Approved");
      if(performanceRating>=9){
        System.out.println("Eligible for Special Bonus");
      }
    }
    else{
      System.out.println("Promotion Not Approved");
    }
  }
}
