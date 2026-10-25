import java.util.ArrayList;
import java.util.List;

public class Register {
    private List<Medlem> medlemmar = new ArrayList<>();

    public void addMedlem(String namn, int id){
        Medlem medlem = new Medlem(namn, id);
        medlemmar.add(medlem);
    }
}
