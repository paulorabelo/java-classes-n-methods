package br.com.mrgsoft.classesandmethods;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Sobrecarga do método exibirDados é dada
        //de acordo com a entrada de dados.
        Pessoa pessoa = new Pessoa();
        pessoa.exibirDados("Paulo", 47);


        /*
        Conta conta = new Conta();
        conta.depositar(100);//valor neste momento de 200$
        conta.sacar(50);//valor de saldo neste momento 150$

//        conta.saldo = 0;//1.Classe privada não permite a recuperação dos dados

        System.out.println( conta.recupearSaldo() );//Novo método criado para acessar dados
        */



        /*
        Bird bird = new Bird();
        bird.correr();
        bird.fly();
        bird.dormir();


        Dog dog = new Dog();
        dog.correr();
        dog.bark();
        dog.dormir();

        dog.setCor("Branco");
        System.out.println( dog.getCor() );*/

//        Animals animals = new Animals();
//        animals.correr();




/*        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Pedro Marangoni";
        funcionario.salario = 1200;

//        funcionario.recuperarSalario();// Sem retorno void
        double salarioRecuperado = funcionario.recuperarSalario( 120, 20  );
        System.out.println("O Salário do Pedro e: " + salarioRecuperado );
*/
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