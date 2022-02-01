package design_pattern.prototype;

public class F16Engine {
    
    String type;

    public F16Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "F16Engine{" +
                "type='" + type + '\'' +
                '}';
    }
}
