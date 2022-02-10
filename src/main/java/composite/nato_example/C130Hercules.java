package composite.nato_example;

public class C130Hercules implements IAircraft, IAlliancePart{
    @Override
    public int getCrewCount() {
        return 20;
    }
}
