public class FitnessClass {

    private String className;
    private Trainer trainer;

    public FitnessClass(String cname, Trainer t) {
        className = cname;
        trainer = t;
    }

    public String getClassName() {
        return className;
    }

    public void showClass() {
        System.out.println("Class: " + className);
        trainer.showTrainer();
    }
}
