
// declaring our interface
interface AdvancedArithmetic {
// declaring our abstract method
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {

// empty constructor
    Calculator() {}

// overriding the abstract method
    @Override
    public int divisorSum(int n) {
        int total = 1 + n;
        for (int i = 2; i < (n / 2) + 1; i++) {
            if (n % i == 0) {
                total = total + i;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.divisorSum(6));
        System.out.println(c.divisorSum(10));
        System.out.println(c.divisorSum(55));
    }
}