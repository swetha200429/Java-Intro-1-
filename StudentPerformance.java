class StudentPerformance{
  public static void main(String[] args){
    int math=78;
    int english=90;
    int science=88;
    boolean passedMath=math>=40;
    boolean passedEnglish=english>=40;
    boolean passedScience=science>=40;
    boolean passedAll=passedMath && passedEnglish && passedScience;
    boolean distinction=math>=75 && english>=75 && science>=75;
    System.out.println("Passed Math:"+passedMath);
    System.out.println("Passed English:"+passedEnglish);
    System.out.println("Passed Science:"+passedScience);
    System.out.println("Passed All Subjects:"+passedAll);
    System.out.println("Passed Distinction:"+distinction);
  }
}
