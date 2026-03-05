class StockAnalyzer{
  public static void main(String[] args){
    double price1=10.56;
    double price2=90.23;
    double price3=79.97;
    double maxPrice=Math.max(price1,Math.max(price2,price3));
    double minPrice=Math.min(price1,Math.max(price2,price3));
    double range=maxPrice-minPrice;
    System.out.println("Highest Price:"+maxPrice);
    System.out.println("Lowest Price:"+minPrice);
    System.out.println("Range:"+range);
  }
}
      
