package lab211Week1;

public class ConvertNumber {
    private int decimal;
    private String binary;

    public ConvertNumber() {
    }

    public String decimalToBinary(int decimal) {
        if (decimal < 0) {
            throw new IllegalArgumentException("Decimal number must be non-negative.");
        }
        this.decimal = decimal;
        this.binary = Integer.toBinaryString(decimal);
        return this.binary;
    }

    public int binaryToDecimal(String binary) {
        if (!binary.matches("[01]+")) { 
            throw new IllegalArgumentException("Invalid binary number. It must contain only 0 or 1.");
        }
        this.binary = binary;
        this.decimal = Integer.parseInt(binary, 2); 
        return this.decimal;
    }
}
