import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int age;
        String firstName;
        String favouriteFood;
        System.out.println("Please input your age:");
        age=scanner.nextInt();
        System.out.println("Please enter your first name:");
        firstName=scanner.nextLine();
        firstName=scanner.nextLine();
        System.out.println("Please enter your favourite food:");
        favouriteFood=scanner.nextLine();
        System.out.println("First name: "+firstName+"\nAge: "+age+"\nFavourite Food: "+favouriteFood);




    }

}