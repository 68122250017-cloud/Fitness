public class Reservation {

    private Membership member;
    private String useDate;   // วันใช้งานจากผู้ใช้

    public Reservation(Membership m, String date) {
        member = m;
        useDate = date;
    }

    public void bookEquipment(Equipment e) {
        if (e.isAvailable()) {
            e.book();
            logUsage("Equipment", e.getEquipmentName());
        } else {
            System.out.println("อุปกรณ์ไม่ว่าง");
        }
    }

    public void bookClass(FitnessClass f) {
        logUsage("Fitness Class", f.getClassName());
        f.showClass();
    }

    // ระบบบันทึกการใช้งาน
    public void logUsage(String type, String name) {
        System.out.println("=== บันทึกการใช้งาน ===");
        System.out.println("Member ID: " + member.getMemberId());
        System.out.println("Type: " + type);
        System.out.println("Name: " + name);
        System.out.println("Date: " + useDate);
    }
}