class SmartFinanceAnalyzer {
  public static void main(String[] args) {
    double principle = 500000;
    double rate = 0.04;
    int time = 4;
    double compoundInterest = principle * Math.pow((1 + rate), time);
    double riskFactor = -12.56;
    double absoluteRisk = Math.abs(riskFactor);
    double planA = 9.0;
    double planB = 4.9;
    double bestPlan = Math.min(planA, planB);
    double emi = compoundInterest / (time * 12);
    long roundedEMI = Math.round(emi);
    int approvalId = (int)(Math.random() * 9000) + 1000;
    System.out.println("Total Amount after Interest: " + compoundInterest);
    System.out.println("Absolute Risk Score: " + absoluteRisk);
    System.out.println("Best Interest Plan: " + bestPlan + "%");
    System.out.println("Monthly EMI: " + roundedEMI);
    System.out.println("Approval ID: " + approvalId);
  }
}
