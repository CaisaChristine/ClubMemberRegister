import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\n1. Add new member\n2. Show all members\n3. Search for member\n4. Quit");
            int option = scanner.nextInt();
            Register register = new Register();
            scanner.nextLine();

            switch (option){
                case 1 -> {
                    System.out.println("-------------- NEW MEMBER --------------");
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Member ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    register.addMedlem(name, id);

                    //Depending on response from register (true/false or do it already log something?)  make some output of succeded to add member
                }
                case 2 -> {
                    System.out.println("-------------- MEMBERS --------------");
                    register.listaAlla();
                }
                case 3 -> {
                    System.out.println("-------------- SEARCH FOR MEMBER --------------");
                    //Depending on register function either take in ID or name
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    //System.out.println("Member ID: ");
                    //String id = scanner.nextLine();
                    Member member = register.hittaMedlem(name);

                    if (member == null){
                        System.out.println("-------------- MEMBER DO NOT EXIST --------------");
                    } else {
                        System.out.println("-------------- MEMBER FOUND --------------");
                        System.out.println("Name: " + member.getNamn());
                        System.out.println("ID: " + member.getId());
                    }
                }
                case 4 -> {
                    System.out.println("CLOSING....");
                    return;
                }
            }

        }

    }
}
