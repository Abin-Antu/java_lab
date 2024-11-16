class Complex {
    int real, imaginary;

    // Constructor to initialize complex number
    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imaginary + c.imaginary);
    }

    // Method to subtract two complex numbers
    Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imaginary - c.imaginary);
    }

    // Method to multiply two complex numbers
    Complex multiply(Complex c) {
        int realPart = this.real * c.real - this.imaginary * c.imaginary;
        int imaginaryPart = this.real * c.imaginary + this.imaginary * c.real;
        return new Complex(realPart, imaginaryPart);
    }

    // Method to print the complex number
    void print() {
        if (this.imaginary >= 0)
            System.out.println(this.real + " + " + this.imaginary + "i");
        else
            System.out.println(this.real + " - " + (-this.imaginary) + "i");
    }
}

public class ComplexTest {
    public static void main(String[] args) {
        // Create two complex numbers z1 = 3 + 4i and z2 = 1 + 2i
        Complex z1 = new Complex(3, 4);
        Complex z2 = new Complex(1, 2);

        // Print the two complex numbers
        System.out.print("z1 = ");
        z1.print();
        System.out.print("z2 = ");
        z2.print();

        // Sum of z1 and z2
        Complex sum = z1.add(z2);
        System.out.print("Sum = ");
        sum.print();

        // Difference of z1 and z2
        Complex diff = z1.subtract(z2);
        System.out.print("Difference = ");
        diff.print();

        // Product of z1 and z2
        Complex product = z1.multiply(z2);
        System.out.print("Product = ");
        product.print();
    }
}
