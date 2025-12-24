public class Membership extends Student {

    private String memberId;

    public Membership(String n, String sid, String e, String p, String mId) {
        super(n, sid, e, p);
        memberId = mId;
    }

    public boolean isMember() {
        return memberId != null && !memberId.equals("");
    }

    public void register(String newMemberId) {
        memberId = newMemberId;
        System.out.println("=== สมัครสมาชิกสำเร็จ ===");
        System.out.println("Member ID: " + memberId);
    }

    public String getMemberId() {
        return memberId;
    }

    public void showMemberStatus() {
        showInfo();
        if (isMember()) {
            System.out.println("Status: เป็นสมาชิก");
            System.out.println("Member ID: " + memberId);
        } else {
            System.out.println("Status: ไม่เป็นสมาชิก");
        }
    }
}