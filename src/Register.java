import java.util.ArrayList;
import java.util.List;

public class Register {
    private List<Medlem> medlemmar = new ArrayList<>();

    public void addMedlem(String namn, int id){
        Medlem medlem = new Medlem(namn, id);
        medlemmar.add(medlem);
    }

    public void listaAlla(){
        if(medlemmar.size() = 0){
            System.out.println("Listan är tom!");
        } else {
            for(Medlem m : medlemmar){
                System.out.println("Medlem: " + m.getNamn() + " | Medlemsnummer: " + m.getId());
            }
        }
    }

    public Medlem hittaMedlem(String namn){
        for(int i=0; i<medlemmar.size(); i++){
            Medlem m = medlemmar.get(i);
            if(m.getNamn().equalsIgnoreCase(namn)){
                return m;
            }
        }
        System.out.println("Ingen medlem hittades!");
        return null;
    }
}
