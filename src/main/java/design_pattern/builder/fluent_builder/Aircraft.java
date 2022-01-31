package design_pattern.builder.fluent_builder;

public class Aircraft {

    private String model;
    private String colour;
    private int capacity;

    public Aircraft(String model, String colour, int capacity) {
        this.model = model;
        this.colour = colour;
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    public static class Builder {

        private String model;
        private String colour;
        private int capacity;

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder colour(String colour) {
            this.colour = colour;
            return this;
        }

        public Builder capacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public Aircraft builder() {
            return new Aircraft(model,colour,capacity);
        }
    }
}
