package br.com.mrgsoft.classesandmethods;

public class Pedro extends Cidadao implements Presidente {
    @Override
    public void ganharEleicao() {
        System.out.println("Ganhar uma eleição no Brasil");
    }
}
