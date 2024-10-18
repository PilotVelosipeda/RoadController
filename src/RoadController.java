import java.util.Scanner;

public class RoadController {
    private static int passengerCarMaxWeight = 3500; //kg
    private static int cargoCarMaxWeight = 30_000;
    private static int passengerCarMaxHeight = 2000; //mm
    private static int controllerMaxHeight = 4000; //mm
    private static int passengerCarPrice = 1000; //rub
    private static int cargoCarPrice = 2000; //rub
    private static int vehicleAdditionalPrice = 2000; //kg

    public static void main(String[] args) {
        System.out.println("Сколько автомобилей сгенерировать?");
        int carsCount = new Scanner(System.in).nextInt();

        for (int i = 0; i <= carsCount; i++) {
            Car car = Camera.getNextCar();
            System.out.println("Текущая машина имеет параметры: " + car.toString());

            if (car.isSpecial()) {
                System.out.println("Шлагбаум открывается..... Счастливого пути!");
                continue;
            }

            int endPrice = calculatePrice(car);
            if (endPrice == -1) {
                System.out.println("Параметры данного транспортного средства не потходят для пропуска!");
                continue;
            }
            System.out.println("Цена текущего автомобиля равна: " + endPrice);
        }
    }

    public static int calculatePrice(Car car) {
        int currentHeight = car.getHeight();
        int currentPrice = 0;
        int currentWeight = car.getWeight();

        if (currentHeight > controllerMaxHeight) {
            currentPrice = -1;
            return currentPrice;
        } else if (currentWeight > passengerCarMaxWeight) {
            currentPrice = cargoCarPrice;
            if (car.isHasVehicle()) {
                currentPrice += vehicleAdditionalPrice;
            }
        } else {
            currentPrice =
            currentPrice = passengerCarPrice;
        }
        return currentPrice;
    }
}