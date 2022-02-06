package br.com.mrgsoft.classesandmethods.classes;

import br.com.mrgsoft.classesandmethods.classes.Animals;

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
