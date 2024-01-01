/*
 For a stream of integers, implement a data structure that checks if the last k integers parsed in the stream are equal to value.

Implement the DataStream class:

DataStream(int value, int k) Initializes the object with an empty integer stream and the two integers value and k.
boolean consec(int num) Adds num to the stream of integers. Returns true if the last k integers are equal to value, and false otherwise. If there are less than k integers, the condition does not hold true, so returns false.
 
 */

 class DataStream {
    private int value;
    private int k;
    private int[] buffer;
    private int count;

    public DataStream(int value, int k) {
        this.value = value;
        this.k = k;
        this.buffer = new int[k];
        this.count = 0;
    }

    public boolean consec(int num) {
        buffer[count % k] = num;
        count++;

        if (count >= k) {
            int consecCount = 0;
            for (int i = 0; i < k; i++) {
                if (buffer[i] == value) {
                    consecCount++;
                }
            }
            return consecCount == k;
        }

        return false;
    }
}
