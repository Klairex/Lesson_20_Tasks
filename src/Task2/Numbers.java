package Task2;

public class Numbers {
    private int number;

    Numbers(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean divideBy (int divider){

        if(divider == 0) {throw new IllegalArgumentException("Impartirea la zero este interzisa !!!");}

        return number % divider == 0;

    }
}
