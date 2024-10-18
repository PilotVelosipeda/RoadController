public class Camera {
    private static String[] numbers = {
            "A100МР123",
            "A101ВР123",
            "A102АА123",
            "Х103ХХ123",
            "Н104ТТ123",
            "Е105ТТ123",
            "A106РТ123",
            "A107УХ123",
            "A108ЕК123",
            "A109КК123",
    };

    public static Car getNextCar() {
        int startForNumber = 0;
        int endForNumber = 9;
        int randomIndexNumber = startForNumber +
                (int) (Math.random() * ((endForNumber + 1) - startForNumber));
        String randomNumber = numbers[randomIndexNumber];

        int startForHeightCar = 1000;
        int endForHeightCar = 2000;
        int randomHeightCar = startForHeightCar +
                (int) (Math.random() * ((endForHeightCar + 1) - startForHeightCar));

        int startForWeightCar = 1000;
        int endForWeightCar = 30_000;
        int randomWeightNumber = startForWeightCar +
                (int) (Math.random() * ((endForWeightCar + 1) - startForWeightCar));

        int startForVehicle = 0;
        int endForVehicle = 1;
        int randomVehicle = startForVehicle +
                (int) (Math.random() * ((endForVehicle + 1) - startForVehicle));
        boolean randomHasVehicle;
        if (randomVehicle == 0) {
            randomHasVehicle = false;
        } else {
            randomHasVehicle = true;
        }

        int startForSpecial = 0;
        int endForSpecial = 1;
        int randomSpecial = startForSpecial +
                (int) (Math.random() * ((endForSpecial + 1) - startForSpecial));
        boolean randomIsSpecial;
        if (randomSpecial == 0) {
            randomIsSpecial = false;
        } else {
            randomIsSpecial = true;
        }

        Car car = new Car(randomNumber, randomHeightCar, randomWeightNumber,
                randomHasVehicle, randomIsSpecial);

        return car;
    }
}
