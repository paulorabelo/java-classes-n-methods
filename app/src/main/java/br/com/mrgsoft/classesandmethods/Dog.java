package br.com.mrgsoft.classesandmethods;

import org.w3c.dom.ls.LSOutput;

class Dog extends Animals {

    void bark(){
        System.out.println("Latindo como um cão");
    }

    @Override
    void correr() {
        super.correr();
        System.out.println("cão");
    }
}
