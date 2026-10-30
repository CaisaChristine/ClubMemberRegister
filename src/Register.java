import java.util.ArrayList;
import java.util.List;

public class Register {
    private List<Member> medlemmar = new ArrayList<>();

    public void addMedlem(String namn, int id){
        //Member medlem = new Member(namn, id);
        //medlemmar.add(medlem);
        for (Member medlem : medlemmar) {
            if (medlem.getId() == id) {
                System.out.println("Detta ID-nummer finns redan!");
                return;
            }
        }

        Member medlem = new Member(namn, id);
        medlemmar.add(medlem);
        System.out.println("-------------- NY MEDLEM "+ medlem.getNamn() +" TILLAGD --------------");
    }

    public void listaAlla(){
        if(medlemmar.isEmpty()){
            System.out.println("Listan är tom!");
        } else {
            for(Member m : medlemmar){
                System.out.println("Namn: " + m.getNamn() + " | Medlemsnummer: " + m.getId());
            }
        }
    }

    public String hittaMedlem(String namn){
        String resultat = "";
        for(int i=0; i < medlemmar.size(); i++){
            Member m = medlemmar.get(i);
            if(m.getNamn().equalsIgnoreCase(namn)){
                //return m;
                resultat += "Namn: " + m.getNamn() + ", ID: " + m.getId() + "\n";
            }
        }
        //System.out.println("Ingen medlem hittades!");
        //return null;
        if (resultat.isEmpty()) {
            System.out.println("Ingen medlem hittades!");
            return null;
        }
        return resultat;
    }
}
