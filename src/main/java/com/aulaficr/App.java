package com.aulaficr;

public class App 
{
    public static void main( String[] args )
    {
        // Pessoa pessoa1 = new Pessoa("123456879", "Desmennyellysson Jerry", "masculino", "desmeny@mail.com");
        /* pessoa1.printDadosCadastrais(); */

        Aluno a1 = new Aluno("Desmennyellysson Jerry da Silva", "ABC1234", "GOT", 7, 8, 9.5f, 4.5f);
        a1.printSituacaoAluno();

        Aluno a2 = new Aluno("newNome", "newMatricula", "newSerie", 5, 7, 4.5f, 3);
        a2.printSituacaoAluno();

    }
}

