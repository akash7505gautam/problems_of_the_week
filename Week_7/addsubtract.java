public class AddSubtract {
    private int total;
    private boolean isAdd;

    // Constructor to initialize with the first number
    public AddSubtract(int initial) {
        this.total = initial;
        this.isAdd = true; // Next operation will be subtract
    }

    // Method to apply the next number
    public AddSubtract apply(int number) {
        if (isAdd) {
            total += number;
        } else {
            total -= number;
        }
        isAdd = !isAdd;
        return this; // for chaining
    }

    // Method to get the final result
    public int getResult() {
        return total;
    }

    // Static method to start the process (for cleaner syntax)
    public static AddSubtract addSubtract(int initial) {
        return new AddSubtract(initial);
    }
}
