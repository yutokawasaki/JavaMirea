package Lab1;

public class Sum {
    private int[] numbers = new int[100];
    private int result;

    public Sum() {
        for (int i = 0; i < 100; i++) {
            numbers[i] = i;
        }
    }

    public void WhileSum() {
        result = 0;
        int i = 0;
        while (i < 100) {
            result = result + numbers[i];
            i++;
        }
    };

    public void ForSum() {
        result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + numbers[i];
        }
    }

    public void DoWhileSum() {
        result = 0;
        int i = 0;
        do {
            result = result + numbers[i];
            i++;
        } while (i < 100);
    }

    @Override
    public String toString() {
        return "Sum{" +
                "result=" + result +
                '}';
    }
}
