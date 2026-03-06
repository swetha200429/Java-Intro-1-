class CourseCertification{
  public static void main(String[] args){
    int attendance=80;
    boolean projectSubmitted=true;
    boolean examPassed=true;
    if(attendance>=75 && projectSubmitted && examPassed){
      System.out.println("Certificate Issued");
    }
    else{
      System.out.println("Certificate not Issued");
    }
  }
}
