import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя человека: ");
        String humName = sc.next();
        System.out.print("Введите фамилию человека: ");
        String humLastName = sc.next();
        System.out.print("Введите год рождения человека: ");
        int humYearBirth = sc.nextInt();
        Human h = new Human(humName, humLastName, humYearBirth);

        System.out.print("\nВведите марку машины: ");
        String carMark = sc.next();
        System.out.print("Введите год выпуска машины: ");
        int carYearRelease = sc.nextInt();
        System.out.print("Введите объём двигателя машины: ");
        double carCapacityVolume = sc.nextDouble();
        Car c = new Car(carMark, carYearRelease, carCapacityVolume);

        System.out.print("\nВведите название книги: ");
        String bookName=sc.next();
        System.out.print("Введите автора книги: ");
        String bookAuthor=sc.next();
        System.out.print("Введите год выпуска книги: ");
        int bookReleaseYear=sc.nextInt();
        Book b = new Book(bookName, bookAuthor, bookReleaseYear);
        System.out.print("\n\n");
        h.info(c, b);
    }
}