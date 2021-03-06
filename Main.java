import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Area area = new Area();
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the number of family: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("-----------------------------Family-----------------------------------");
            System.out.print("Enter number of persons in family: ");
            int numberOfPersonInFamily = scanner.nextInt();
            System.out.print("Enter apartment number: ");
            int apartmentNumber = scanner.nextInt();
            System.out.println("----------------------------Person--------------------------- ");
            List<Person> persons = new ArrayList<>();
            scanner.nextLine();
            for (int j = 0; j < numberOfPersonInFamily; j++){
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter age: ");
                String age = scanner.nextLine();
                System.out.print("Enter job: ");
                String job = scanner.nextLine();
                System.out.print("Enter identity card number: ");
                String identityCardNumber = scanner.nextLine();
                Person person = new Person(name, age, job, identityCardNumber);
                persons.add(person);
                System.out.println(person.toString());
            }
            System.out.println("---------------information of family members-----------------");
            Family family = new Family(numberOfPersonInFamily, apartmentNumber, persons);
            area.addFamily(family);
            System.out.println(family.toString());
            
        }
        scanner.close();
    }
}
