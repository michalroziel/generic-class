public class PairTestDrive {

    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<>("Hello", 42);
        System.out.println(pair);

        Pair<Integer, String> pair2 = new Pair<>(42, "Hello");
        System.out.println(pair2);

    }

}
