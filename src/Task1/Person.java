package Task1;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    Person(String firstName,String lastName, int age) throws InvalidNameException,InvalidAgeException {
        if((firstName == null) || (firstName.equals("")))
        {
            throw new InvalidNameException("Numele nu poate fi null sau gol");
        }
        if((lastName == null) || (lastName.equals("")))
        {
            throw new InvalidNameException("Prenumele nu poate fi null sau gol");
        }
        if((age <0) || (age>150))
        {
            throw new InvalidAgeException("Virsta nu poate fi mai mica de 0 ani sau mai mare de 150 ani");
        }


        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Task1.Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
