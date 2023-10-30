import java.util.ArrayList;

public class Reservation {

    private int resnumb;
    private ArrayList<Court> court;

    public void reserve(int resnumb, Courts courts){
        court = courts.getCourts();
        court.remove(resnumb);
        courts.setCourts(court);

        System.out.println("Field is being reserved");
    }
}
