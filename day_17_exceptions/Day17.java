
class Day17 {

    static void power(int n, int p) throws Exception {
        if (n >= 0 && p >= 0) {
            System.out.println(Math.pow(n, p));
        } else {
            throw new Exception("n and p should be non-negative");
        }
    }

    public static void main(String[] args) {
        try {
            Day17.power(-2,3);
        } catch (Exception e) {
            System.err.println( e.getClass().getSimpleName() + ": " + e.getMessage() );
        }

    }
}