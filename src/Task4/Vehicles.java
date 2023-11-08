package Task4;

public enum Vehicles {
    RENAULT(10000,"white"), CITROEN(15000,"black"), PEUGEOT(12000,"blue");
    int price;
    String color;

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    @Override
    public String toString() {
        return  "Car information: " + super.toString() + ", has price  " + this.price + " in color "+ getColor();
    }
}
