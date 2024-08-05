package main.java.com.vasylwecek.basepatterns.creation.build;


class Building {
    private final String foundation;
    private final String structure;
    private final String roof;
    private final int floors;
    private final boolean hasGarage;
    private final boolean hasSwimmingPool;
    private final boolean hasGarden;

    // Приватный конструктор для Builder
    private Building(Builder builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roof = builder.roof;
        this.floors = builder.floors;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
        this.hasGarden = builder.hasGarden;
    }

    @Override
    public String toString() {
        return "Building{" + '\n' +
                "foundation=" + foundation + '\n' +
                "structure=" + structure + '\n' +
                "roof=" + roof + '\n' +
                "floors=" + floors + '\n' +
                "hasGarage=" + hasGarage + '\n' +
                "hasSwimmingPool=" + hasSwimmingPool + '\n' +
                "hasGarden=" + hasGarden + '\n' +
                '}';
    }

    // Статический класс Builder
    public static class Builder {
        private String foundation;
        private String structure;
        private String roof;
        private int floors;
        private boolean hasGarage;
        private boolean hasSwimmingPool;
        private boolean hasGarden;

        public Builder setFoundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public Builder setStructure(String structure) {
            this.structure = structure;
            return this;
        }

        public Builder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public Builder setFloors(int floors) {
            this.floors = floors;
            return this;
        }

        public Builder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public Builder setHasSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public Builder setHasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public Building build() {
            return new Building(this);
        }
    }
}

