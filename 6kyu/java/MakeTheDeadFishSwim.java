//MakeTheDeadFishSwim

// Create a parser to interpret and execute the Deadfish language.

// Deadfish operates on a single value in memory, which is initially set to 0.

// It uses four single-character commands:

// i: Increment the value
// d: Decrement the value
// s: Square the value
// o: Output the value to a result array
// All other instructions are no-ops and have no effect.

// Examples
// Program "iiisdoso" should return numbers [8, 64].
// Program "iiisdosodddddiso" should return numbers [8, 64, 3600].

public class MakeTheDeadFishSwim {

    public static int[] parse(String data) {
        int arraySize = 0;
        for (char i : data.toCharArray()) {
            if (i == 'o') {
                arraySize++;
            }
        }
        int[] numbers = new int[arraySize];
        int index = 0;
        int value = 0;
        for (char i : data.toCharArray()) {
            switch (i) {
                case 'i':
                    value++;
                    continue;
                case 'd':
                    value--;
                    continue;
                case 's':
                    value *= value;
                    continue;
                case 'o':
                    numbers[index] = value;
                    index++;
            }
        }
        return numbers;
    }
}