class OTPGenerator{
  public static void main(String[] args){
    int otp=(int)(Math.random()*200000)+100000;
    System.out.println("OTP is:"+otp);
  }
}
