public class Main {
    public static void main(String[] args) {
        
    }
    public static int[] plusOne(int[] digits) {
        int sum = digits.length;
        for ( int i = sum-1; i >= 0; i--){
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] massiv = new int[sum+1];
        massiv[0] = 1;
        return massiv;

    }
}