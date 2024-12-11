public class Main {
    public static void main(String[] args) {
//        Elevator elevator = new Elevator(-3, 26);
//        while (true) {
//            System.out.print("Введите номер этажа: ");
//            int floor = new Scanner(System.in).nextInt();
//            elevator.move(floor);
//        }

        Dimensions dimensions = new Dimensions(10.0, 15.5, 30.3);
        CargoInformation information = new CargoInformation(dimensions, 10.0,
                "Penza", true, "N1305", false);

        CargoInformation changedInformation = information
                .setDimensions(dimensions
                        .setWidth(11.8)
                        .setHeight(16.5)
                        .setLength(31.5))
                .setAddress("Moscow")
                .setWeight(12.2);

        System.out.println(information);
        System.out.println(changedInformation);
    }
}