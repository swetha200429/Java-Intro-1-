import java.util.Scanner;
class RestaurantOrderSystem{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int choice;
    double price=0;
    String item="";
    System.out.println("----- Welcome to Smart Restaurant -----");
    System.out.println("1.Burger-$5");
    System.out.println("2.Pizza-$8");
    System.out.println("3.Pasta-$7");
    System.out.println("4.Sandwich-$4");
    System.out.println("5.Coffee-$3");
    System.out.println("Enter your choice:");
    choice=sc.nextInt();
    switch(choice){
        case1:
        item="Burger";
        price=5;
        break;
        case2:
        item="Pizza";
        price=8;
        break;
        case3:
        item="Pasta";
        price=7;
        break;
        case4:
        item="Sandwich";
        price=4;
        break;
        case5:
        item="Coffee";
        price=3;
        break;
      default:
        System.out.println("Invalid choice!");
        return;
    }
    System.out.println("You ordered:"+item);
    System.out.println("Price:$"+price);
  }
}
