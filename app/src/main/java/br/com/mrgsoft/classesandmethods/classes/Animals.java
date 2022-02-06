package br.com.mrgsoft.classesandmethods.classes;

class Animals {

    int tamanho;
    String cor;
    double peso;

    //Getter and Setter
    void setCor(String cor){
        //Formatação e validação como vantagem
        this.cor = cor;
    }

    String getCor(){
        return this.cor;
    }

    //Getter and Setter using generate
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    void dormir(){
        System.out.println("Dormindo como um animal");
    }

    void correr(){
        System.out.println("Correndo como um");
    }

}
