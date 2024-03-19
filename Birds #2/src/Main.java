public class Main {
    public static void main(String[] args) {

        Bird Seagull = new Seagull("Seagull", 2, 15.5f);
        Seagull.fly();

    } // calls method in seagull -> then goes to superclass (bird) -> calls
    // flymethod in flyBehaviour -> bec fly behaviour is an instance of canflybehabior, it will call the canflymethod in flybehaviour
}
