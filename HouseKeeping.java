public class HouseKeeping implements HotelService{

    private int roomNumber;

    public HouseKeeping(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    private void cleanRoom(int roomNumber) {
        System.out.println("Housekeeping will clean room number: " + roomNumber);
    }

    @Override
    public void execute() {
        cleanRoom(roomNumber);
    }
}
