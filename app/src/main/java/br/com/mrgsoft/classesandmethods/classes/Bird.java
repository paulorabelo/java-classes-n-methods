package br.com.mrgsoft.classesandmethods.classes;

class Bird extends Animals {

    void fly(){
        System.out.println("Voando como um pássaro");
    }

    @Override
    void correr() {
        super.correr();
        System.out.println("pássaro");
    }
}
