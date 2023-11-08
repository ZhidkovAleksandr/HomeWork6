package Task2;

public enum Animals {
    DOG(15), CAT(20), TURTLE(50);
    int value;

    Animals(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        //return  "Our animal: " + super.toString() + ", in general can live  " + getValue() + " years";
        return  "Our animal: " + super.toString() + ", in general can live  " + this.value + " years";
    }
}
