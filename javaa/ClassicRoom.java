public class ClassicRoom extends Reservation {

    private boolean locker;

    public ClassicRoom() {
        this.roomType = "Classic Room";
        this.locker = true;
    }

    @Override
    public Reservation reset() {
        return new ClassicRoom();
    }

    @Override
    public String toString() {
        return super.toString() + ", Locker: " + locker;
    }
}