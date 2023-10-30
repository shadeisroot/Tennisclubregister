import java.util.ArrayList;

public class Courts {
    private int fieldnumber;
    private ArrayList<Court> courts;
    public Courts() {
        this.courts = new ArrayList<>();
        courts.add(new Court(1));
        courts.add(new Court(2));
        courts.add(new Court(3));
    }

    public void showall(){
        for (Court court : courts){
            System.out.println(court);
        }
    }

    public ArrayList<Court> getCourts() {
        return courts;
    }

    public void setCourts(ArrayList<Court> fields) {
        this.courts = courts;
    }
}

