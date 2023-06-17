public class Pizza {
    private int size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean bacon;
    private boolean olives;

    public static class Builder {
        //required
        private final int size;

        //optional
        private boolean cheese = false;
        private boolean pepperoni = false;
        private boolean bacon = false;
        private boolean olives = false;

        public Builder(int size) {
            this.size = size;
        }

        public Builder cheese(boolean value) {
            cheese = value;
            return this;
        }

        public Builder pepperoni(boolean value) {
            pepperoni = value;
            return this;
        }

        public Builder bacon(boolean value) {
            bacon = value;
            return this;
        }

        public Builder olives(boolean value) {
            olives = value;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    private Pizza(Builder builder) {
        size = builder.size;
        cheese = builder.cheese;
        pepperoni = builder.pepperoni;
        bacon = builder.bacon;
        olives = builder.olives;
    }

    public String toString() {
        StringBuilder stB = new StringBuilder();
        stB.append("Size: "+size+"\n");
        stB.append("Cheese: "+cheese+"\n");
        stB.append("Pepperoni: "+pepperoni+"\n");
        stB.append("Bacon: "+bacon+"\n");
        stB.append("Olives: "+olives+"\n");
        return stB.toString();
    }
}
