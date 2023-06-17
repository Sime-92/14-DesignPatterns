public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder(12)
                .cheese(true)
                .pepperoni(false)
                .bacon(true)
                .build();
        System.out.println(pizza);

    }

}