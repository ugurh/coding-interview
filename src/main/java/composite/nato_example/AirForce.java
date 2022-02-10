package composite.nato_example;

import java.util.ArrayList;
import java.util.List;

public class AirForce implements IAlliancePart {
    int count = 0;

    public AirForce() {
    }

    List<IAlliancePart> planes = new ArrayList<>();

    public void add(IAlliancePart alliancePart) {
        planes.add(alliancePart);
    }

    @Override
    public int getCrewCount() {
        planes.forEach(i -> count += i.getCrewCount());
        return count;
    }
}
