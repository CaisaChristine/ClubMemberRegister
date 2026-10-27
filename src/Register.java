import java.util.ArrayList;
import java.util.List;

public class Register {
    private List<Member> medlemmar = new ArrayList<>();

    public void addMedlem(String namn, int id){
        Member medlem = new Member(namn, id);
        medlemmar.add(medlem);
    }

    public void listaAlla(){
        if(medlemmar.isEmpty()){
            System.out.println("Listan är tom!");
        } else {
            for(Member m : medlemmar){
                System.out.println("Medlem: " + m.getNamn() + " | Medlemsnummer: " + m.getId());
            }
        }
    }

    public Member hittaMedlem(String namn){
        for(int i=0; i<medlemmar.size(); i++){
            Member m = medlemmar.get(i);
            if(m.getNamn().equalsIgnoreCase(namn)){
                return m;
            }
        }
        System.out.println("Ingen medlem hittades!");
        return null;
    }
}
