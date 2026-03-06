class CollegeAdmission{
  public static void main(String[] args){
    int marks=92;
    if(marks>=70){
      if(marks>=90){
        System.out.println("Eligible with Scholarship");
      }
      else{
        System.out.println("Eligible for Regular Admission");
      }
    }
    else{
      System.out.println("Admission Rejected");
    }
  }
}
