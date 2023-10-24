import java.util.ArrayList;
import java.util.Objects;

public class Adressregister {
    private ArrayList<Member> members;

    public Adressregister() {
        this.members = new ArrayList<>();
    }

    public void register(Member member) {
        members.add(member);
    }

    public void showall() {
        for (Member member : members) {
            System.out.println(member);
        }
    }

    public void search(String stringsearch){
        for (Member member : members){
            if (member.getMemberName().contains(stringsearch) || member.getMemberLastname().contains(stringsearch) || member.getStreetName().contains(stringsearch) || member.getCity().contains(stringsearch)) {
                System.out.println("Member found: " + member);
                // Print other member attributes as needed
            }
        }
    }
    public void removeMemberByMemberNumber(int memberNumber) {
        Member memberToRemove = null;

        for (Member member : members) {
            if (member.getMemberNumber() == memberNumber) {
                memberToRemove = member;
                break;
            }
        }

        if (memberToRemove != null) {
            members.remove(memberToRemove);
        }
        else
            System.out.println("Membernumber with " + memberNumber + " does not exist");
    }
}