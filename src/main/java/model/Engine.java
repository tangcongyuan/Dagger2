package model;

public class Engine {
    private String make;
    private String description;

    public Engine() {
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Engine(Make: " +
                this.make +
                ", Description: " +
                this.description +
                ")";
    }

    public static class Builder {
        private String make;
        private String description;

        public Builder() {
        }

        public Builder withMake(String make) {
            this.make = make;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Engine build() {
            Engine engine = new Engine();
            engine.setMake(make);
            engine.setDescription(description);
            return engine;
        }
    }
}
