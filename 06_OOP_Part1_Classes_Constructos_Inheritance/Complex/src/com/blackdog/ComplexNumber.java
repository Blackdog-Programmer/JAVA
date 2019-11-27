package com.blackdog;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real; this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real; this.imaginary += imaginary;
    }
    public void add(ComplexNumber otherComplexNumber) {
        this.real += otherComplexNumber.real;
        this.imaginary += otherComplexNumber.imaginary;
    }

    public void subtract(double real, double imaginary) {
        this.real -= real; this.imaginary -= imaginary;
    }
    public void subtract(ComplexNumber otherComplexNumber) {
        this.real -= otherComplexNumber.real;
        this.imaginary -= otherComplexNumber.imaginary;
    }

}
