public class Valet implements HotelService {

    private String plateNumber;

    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    private void pickUpVehicle(String plateNumber) {
        System.out.println("Valet will pick up vehicle: " + plateNumber);
    }

    @Override
    public void execute() {
        pickUpVehicle(plateNumber);
    }
}
