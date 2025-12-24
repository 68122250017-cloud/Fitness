import java.util.Scanner;

public class FitMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== ตรวจสอบสถานะสมาชิก ===");

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter student ID: ");
        String sid = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter phone: ");
        String phone = sc.nextLine();

        System.out.print("Enter member ID (ถ้าไม่มีให้กด Enter): ");
        String memberId = sc.nextLine();

        //สร้างสมาชิก
        Membership m = new Membership(name, sid, email, phone, memberId);

        //ตรวจสอบสถานะสมาชิก
        if (m.isMember()) {
            System.out.println("\n=== พบข้อมูลสมาชิก ===");
            m.showMemberStatus();

            //รับวันใช้งานจากผู้ใช้
            System.out.print("\nEnter usage date (dd/mm/yyyy): ");
            String useDate = sc.nextLine();

            //สร้างReservation(บันทึกวันใช้งาน)
            Reservation r = new Reservation(m, useDate);

            //เมนูจอง
            System.out.println("\nเลือกบริการ");
            System.out.println("1. จองอุปกรณ์");
            System.out.println("2. จองคลาส");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine(); //เคลียร์บรรทัด

            if (choice == 1) {
                Equipment e = new Equipment("Treadmill");
                r.bookEquipment(e);

            } else if (choice == 2) {
                Trainer t = new Trainer("Coach A");
                FitnessClass f = new FitnessClass("Yoga", t);
                r.bookClass(f);

            } else {
                System.out.println("เลือกไม่ถูกต้อง");
            }

        } else {
            System.out.println("\n=== ไม่เป็นสมาชิก ===");
            System.out.print("ต้องการสมัครสมาชิกใหม่หรือไม่ (Y/N): ");
            String ans = sc.nextLine();

            if (ans.equalsIgnoreCase("Y")) {
                System.out.print("Enter new Member ID: ");
                String newId = sc.nextLine();
                m.register(newId);
            } else {
                System.out.println("ยกเลิกการสมัครสมาชิก");
            }
        }

        System.out.println("\n=== สิ้นสุดการทำงาน ===");
        sc.close();
    }
}
