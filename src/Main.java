import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Register register = new Register();

        while (true){
            System.out.println("\n1. Lägg till ny medlem\n2. Visa alla medlemmar\n3. Sök efter medlem\n4. Avsluta");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1 -> {
                    System.out.println("-------------- NY MEDLEM --------------");
                    System.out.println("Namn: ");
                    String name = scanner.nextLine();
                    System.out.println("Medlems ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    register.addMedlem(name, id);

                    System.out.println("-------------- NY MEDLEM "+ name +" TILLAGD --------------");
                }
                case 2 -> {
                    System.out.println("-------------- MEDLEMMAR --------------");
                    register.listaAlla();
                }
                case 3 -> {
                    System.out.println("-------------- SÖK EFTER MEDLEM --------------");
                    System.out.println("Namn: ");
                    String name = scanner.nextLine();
                    Member member = register.hittaMedlem(name);

                    if (member != null) {
                        System.out.println("-------------- MEDLEM HITTADES --------------");
                        System.out.println("Namn: " + member.getNamn());
                        System.out.println("ID: " + member.getId());
                    }
                }
                case 4 -> {
                    System.out.println("AVSLUTAR....");
                    return;
                }
                default -> System.out.println("Ogiltigt menyval!");
            }

        }

    }
}
