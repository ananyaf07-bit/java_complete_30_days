public class TypeConversion {
    public static void main(String[] args) {
        // 1. Create an int variable with value 130
        int originalInt = 130;

        // 2. Explicitly cast it to byte (narrowing conversion)
        byte castedByte = (byte) originalInt;

        // 3. Convert that byte to double (widening conversion)
        double widenedDouble = castedByte;

        // 4. Print all three values
        System.out.println("Original int: " + originalInt);
        System.out.println("After casting to byte: " + castedByte);
        System.out.println("After widening to double: " + widenedDouble);

        // 5. Create a double variable with value 99.99 and explicitly cast it to int
        double originalDouble = 99.99;
        int castedInt = (int) originalDouble;

        // 6. Print the original and converted values
        System.out.println("Original double: " + originalDouble);
        System.out.println("After casting to int: " + castedInt);
    }
}
