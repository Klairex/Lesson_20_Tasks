package Task3;
class InvalidRangeException extends Exception {
    public InvalidRangeException(String message) {
        super(message);
    }
}



public class Main {

   public int countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) throws InvalidRangeException{
        if (inferiorLimit > superiorLimit) {
            throw new InvalidRangeException("Limita inferioara nu poate fi mai mare ca limita superioara");
        }
        int c = 0;

        for (int i =inferiorLimit;i<=superiorLimit;i++)
        {
            if (i%7==0){c++;}
        }

        return c;

    }

    public static void main(String[] args) {

      int inferiorLimit = 55;
      int superiorLimit = 52;

        Main mainObject = new Main();

        try {

            int result = mainObject.countDivisibleBy7Numbers(inferiorLimit, superiorLimit);
            System.out.println("Intre numerele " + inferiorLimit + " si " + superiorLimit + " sunt " + result + " numere divizibile cu 7");
        } catch (InvalidRangeException e) {

            System.out.println(e.getMessage());
        }

    }
}
