public class CargoInformation {
    private final Dimensions dimensions;
    private final double weight;
    private final String address;
    private final boolean isRotatable;
    private final String number;
    private final boolean isFragile;

    public CargoInformation(Dimensions dimensions, double weight, String address,
                            boolean isRotatable, String number, boolean isFragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.isRotatable = isRotatable;
        this.number = number;
        this.isFragile = isFragile;
    }

    public CargoInformation setAddress(String address) {
        return new CargoInformation(dimensions, weight, address, isRotatable, number, isFragile);
    }

    public CargoInformation setWeight(Double weight) {
        return new CargoInformation(dimensions, weight, address, isRotatable, number, isFragile);
    }

    public CargoInformation setDimensions(Dimensions dimensions) {
        return new CargoInformation(dimensions, weight, address, isRotatable, number, isFragile);
    }

    @Override
    public String toString() {
        return "CargoInformation{" +
                "dimensions=" + dimensions +
                ", weight=" + weight +
                ", address='" + address + '\'' +
                ", isRotatable=" + isRotatable +
                ", number='" + number + '\'' +
                ", isFragile=" + isFragile +
                '}';
    }
}
