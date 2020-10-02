import java.util.Scanner;
class Question2 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String name;
    System.out.println("Hi there.What is your name?" + name );
    
    name= scan.nextLine();

    System.out.println("Hi" + name + "How old are you?");

    int age; 

    age= scan.nextInt();

    System.out.println(name +"is" + age + "years old");



    }
}