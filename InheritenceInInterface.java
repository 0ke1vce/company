package com.company;

import java.util.Scanner;

interface sampleInterface {
    void meth1();

    void meth2();
}

interface childSampleInterface extends sampleInterface {
    void meth3();

    void meth4();
}

class MySampleClass implements childSampleInterface {
    @Override
    public void meth1() {
        System.out.println("meth 1");
    }

    @Override
    public void meth2() {
        System.out.println("meth 2");
    }

    @Override
    public void meth3() {
        System.out.println("meth 3");
    }

    @Override
    public void meth4() {
        System.out.println("meth 4");
    }
}

public class InheritenceInInterface {
    public static void main(String[] args) {
        MySampleClass msC = new MySampleClass();
        msC.meth1();
        msC.meth2();
        msC.meth3();
        msC.meth4();

    }
}

// Interfaces can extend other interfaces.
