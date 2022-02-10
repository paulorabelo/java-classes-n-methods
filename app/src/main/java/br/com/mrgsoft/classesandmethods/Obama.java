package br.com.mrgsoft.classesandmethods;

public class Obama extends Cidadao implements Presidente {
    @Override
    public void ganharEleicao() {
        System.out.println("Ganhar uma eleição nos EUA");
    }
}
