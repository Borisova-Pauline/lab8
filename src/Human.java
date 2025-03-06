public class Human {
    private String name;
    private String lastName;
    private int yearBirth;

    public Human(String name, String lastName, int yearBirth) {
        this.name = name;
        this.lastName = lastName;
        this.yearBirth = yearBirth;
    }

    public void info(Car c, Book b){
        System.out.printf("%s читает книгу \"%s\" про машину %s", this.name, b.getName(), c.getMark());
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearBirth() {
        return yearBirth;
    }
}
