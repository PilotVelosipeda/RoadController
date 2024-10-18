public class Car {

    public Car(String number, int height, int weight, boolean hasVehicle, boolean isSpecial) {
        this.number = number;
        this.height = height;
        this.weight = weight;
        this.hasVehicle = hasVehicle;
        this.isSpecial = isSpecial;
    }

    private String number;
    private int height;
    private int weight;
    private boolean hasVehicle;
    private boolean isSpecial;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isHasVehicle() {
        return hasVehicle;
    }

    public void setHasVehicle(boolean hasVehicle) {
        this.hasVehicle = hasVehicle;
    }

    public boolean isSpecial() {
        return isSpecial;
    }

    public void setSpecial(boolean special) {
        isSpecial = special;
    }
    @Override
    public String toString() {
        return "Car{" +
                "number='" + number + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", hasVehicle=" + hasVehicle +
                ", isSpecial=" + isSpecial +
                '}';
    }
}
