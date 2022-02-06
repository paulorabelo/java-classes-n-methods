package br.com.mrgsoft.classesandmethods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Pedro Marangoni";
        funcionario.salario = 1200;

//        funcionario.recuperarSalario();// Sem retorno void
        double salarioRecuperado = funcionario.recuperarSalario( 120, 20  );
        System.out.println("O Salário do Pedro e: " + salarioRecuperado );

//        //int numero = 10;
//        Casa minhaCasa = new Casa();
//        minhaCasa.cor = "Cor azul";
//
//        System.out.println( minhaCasa.cor );
//        minhaCasa.abrirPorta();
//
//        Casa suaCasa = new Casa();// Criação ou instanciação de um objeto
//        suaCasa.cor = "Cor rosa";

    }
}