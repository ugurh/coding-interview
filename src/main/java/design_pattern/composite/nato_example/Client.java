package design_pattern.composite.nato_example;

public class Client {

    public static void main(String[] args) {

        AirForce NatoAllaiance = new AirForce();

        // The nested methods aren't listed for brevity's sake
        NatoAllaiance.add(new UsaAirForce());
        NatoAllaiance.add(new TurkeyAirForce());

        F16 frenchF16 = new F16();
        C130Hercules germanCargo = new C130Hercules();

        NatoAllaiance.add(frenchF16);
        NatoAllaiance.add(germanCargo);

        System.out.println(NatoAllaiance.getCrewCount());
    }
}
