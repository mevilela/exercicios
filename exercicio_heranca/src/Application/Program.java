package Application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Program {
    public static void main(String[] args){

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING - pegar um objeto do tipo BusinessAccount e atribui-lo para uma variavel do tipo account

        Account acc1 = bacc;

        // A herança é uma relacao de É UM - uma businessaccount é uma account - podemos fazer atribuicoes.

        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);

        // está atribuido um abj da subclasse para a superclasse

        Account acc3 = new SavingsAccount(1004, "James", 0.0, 0.01 );

        // operação normal pegar um objeto da subclasse e atribuir a uma variavel da seuperclasse

        //DOWNCASTING - é converter um objeto da superclasse para subclasse (processo inverso do up)

        //BusinessAccount acc4 = acc2; vai dar um erro - incompatibilidade de tipos, pq nao pode converter de account para business account
        //pq a variavel acc2 é do tipo account, mesmo ela tendo sido instaciada para uma BusinessAccount - o compilador vai reclamar
        //a conversao não é natural - tem q ser feita manualmente
        //colocar entre parenteses o tipo da subclasse - forcar o casting

        BusinessAccount acc4 = (BusinessAccount) acc2; //downcasting
        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount) acc3; - Exception in thread "main" java.lang.ClassCastException: class entities.SavingsAccount cannot be cast to class entities.BusinessAccount (entities.SavingsAccount and entities.BusinessAccount are in unnamed module of loader 'app')
        // at Application.Program.main(Program.java:37) - Não pode ser convertido pq ele é dop tipo savingsaccount

        // o downcasting nem sempre vai dar certo e o compilador nao vai p+erceber, só quando rodar o programa.
        // COMO EVITAR????
        // testar primeiro - como? INSTANCE OF

        // BusinessAccount acc5 = (BusinessAccount) acc3;
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!!");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!!");
        }


        Account acc6 = new Account(1005, "Alex", 1000.0);
        acc6.withdraw(200.0);
        System.out.println(acc6.getBalance());

        //OVERRIDE EM ACAO
        Account acc7 = new SavingsAccount(1006, "Ana", 1000.0, 0.01);
        acc7.withdraw(200);
        System.out.println(acc7.getBalance());

        //SUPER - É possivel chamar a implementação da superclasse usando a palavra SUPER
        //Exemplo: suponha que na BusinessAccount a regra para saque seja realizar o saque normalmente da
        // superclasse e descontar mais 2.0.

        Account acc8 = new BusinessAccount(1007, "Harry", 1000.0, 500.0);
        acc8.withdraw(200);
        System.out.println(acc8.getBalance());















    }
}
