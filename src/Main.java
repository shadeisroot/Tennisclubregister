import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Adressregister adressregister = new Adressregister();
        Courts courts = new Courts();
        Reservation reservation = new Reservation();


        boolean exit = false;
        while(!exit){
            System.out.println("Welcome please press what you want to do. (1) Make new member, (2) Find Member, (3) delete Member (4) Make report of all the members (5) Exit");
            int choice = scan.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Please enter Membernumber: ");
                    int Memnum = scan.nextInt();
                    System.out.println("Enter Member name: ");
                    String memName = scan.next();
                    System.out.println("Enter Member Lastname ");
                    String memLast = scan.next();
                    System.out.println("Enter StreetName ");
                    String streetName = scan.next();
                    System.out.println("Enter House Number");
                    int housenum = scan.nextInt();
                    System.out.println("Enter Postal");
                    int Postal = scan.nextInt();
                    System.out.println("Enter City");
                    String City = scan.next();
                    System.out.println("Enter Phone number");
                    int Phonenum = scan.nextInt();
                    Member member = new Member(Memnum, memName, memLast, streetName, housenum, Postal, City, Phonenum);
                    adressregister.register(member);
                    break;
                case 2:
                    System.out.println("Enter what to search for: ");
                    adressregister.search(scan.next());
                    break;
                case 3:
                    boolean breakout = false;
                    while(!breakout) {
                        System.out.println("Enter the membernumber you want to delete or Enter 00 to exit");
                        int numtodelete = scan.nextInt();
                        if(numtodelete == 00) {
                            breakout = true;
                            break;
                        }
                        else{
                            adressregister.removeMemberByMemberNumber(numtodelete);
                            adressregister.showall();
                        }
                    }
                case 4:
                    adressregister.showall();
                    break;
                case 5:
                    exit = true;
                    break;
                case 6:
                    courts.showall();
                    break;
                case 7:
                    System.out.println("Enter number you want to reserve");
                    courts.showall();
                    int numb = scan.nextInt();
                    reservation.reserve(numb, courts);
                    break;
            }
        }

    }
}