package design_pattern.composite.nato_example;

public class F16 implements IAircraft, IAlliancePart{
    @Override
    public int getCrewCount() {
        return 10;
    }
}
