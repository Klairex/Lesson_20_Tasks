package Task1;

public class Main {
    public static void main(String[] args) {

        try {
           // Task1.Person person1 = new Task1.Person(null, "Ceban", 20);
           // Task1.Person person2 = new Task1.Person("Ion", "", 20);
           // Task1.Person person3 = new Task1.Person("Ion", "Ceban", -20);
           // Task1.Person person4 = new Task1.Person("Ion","Ceban", 170);
            Person person5 = new Person("", null, -20);

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        catch (InvalidNameException e){
            System.out.println(e.getMessage());

        }




    }
}
