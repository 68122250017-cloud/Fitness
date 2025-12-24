public class Equipment {

    private String equipmentName;
    private String status;

    public Equipment(String name) {
        equipmentName = name;
        status = "Available";
    }

    public boolean isAvailable() {
        return status.equals("Available");
    }

    public void book() {
        status = "Booked";
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void showStatus() {
        System.out.println("Equipment: " + equipmentName);
        System.out.println("Status: " + status);
    }
}