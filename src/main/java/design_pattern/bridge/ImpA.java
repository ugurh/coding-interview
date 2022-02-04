package design_pattern.bridge;

public class ImpA implements Bridge {
    @Override
    public void print() {
        System.out.println("Print Imp-A");
    }
}
