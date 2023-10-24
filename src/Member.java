public class Member {
    private int memberNumber;
    private String memberName;
    private String memberLastname;
    private String streetName;
    private int houseNumber;
    private int postalcode;
    private String city;
    private int phoneNumber;

    public Member(int memberNumber, String memberName, String memberLastname, String streetName, int houseNumber, int postalcode, String city, int phoneNumber){
        this.memberNumber = memberNumber;
        this.memberName = memberName;
        this.memberLastname = memberLastname;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.postalcode = postalcode;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberNumber=" + memberNumber +
                ", memberName='" + memberName + '\'' +
                ", memberLastname='" + memberLastname + '\'' +
                ", streetName='" + streetName + '\'' +
                ", houseNumber=" + houseNumber +
                ", postalcode=" + postalcode +
                ", city='" + city + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public String getCity() {
        return city;
    }
    public String getMemberName(){
        return memberName;
    }

    public String getMemberLastname() {
        return memberLastname;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getMemberNumber() {
        return memberNumber;
    }
}
