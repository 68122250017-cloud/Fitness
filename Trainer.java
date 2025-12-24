public class Trainer {

    private String coachName;

    public Trainer(String name) {
        coachName = name;
    }

    public String getCoachName() {
        return coachName;
    }

    public void showTrainer() {
        System.out.println("Trainer: " + coachName);
    }
}