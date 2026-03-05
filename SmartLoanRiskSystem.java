class SmartLoanRiskSystem{
  public static void main(String[] args){
    int creditScore=456;
    double salary=30000;
    double monthlyDebt=15000;
    int age=25;
    boolean blacklisted=false;
    double debtRatio=(monthlyDebt/salary)*100;
    boolean goodCredit=creditScore>=400;
    boolean goodSalary=salary>=10000;
    boolean acceptedDebt=debtRatio<40;
    boolean validAge=age>=21 && age<=60;
    boolean notBlacklisted=!blacklisted;
    boolean loanApproved=goodCredit && goodSalary && acceptedDebt && validAge && notBlacklisted;
    System.out.println("Credit Score OK:"+goodCredit);
    System.out.println("Salary OK:"+goodSalary);
    System.out.println("Debt Ratio:"+debtRatio+"%");
    System.out.println("Debt Acceptable:"+acceptedDebt);
    System.out.println("Valid Age:"+validAge);
    System.out.println("Not Blacklisted:"+notBlacklisted);
    System.out.println("Loan Approved:"+loanApproved);
  }
}
