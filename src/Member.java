public class Member {
    private String namn;
    private int id;

    public Member(String namn, int id) {
        this.namn = namn;
        this.id = id;
    }

    public String getNamn() {
        return namn;
    }

    public int getId() {
        return id;
    }
}
