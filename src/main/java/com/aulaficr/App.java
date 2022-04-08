package com.aulaficr;

public class App 
{
    public static void main( String[] args )
    {
        Pessoa pessoa1 = new Pessoa("123456879", "Desmennyellysson Jerry", "masculino", "desmeny@mail.com");
        System.out.println(pessoa1.tipo);
        pessoa1.printDadosCadastrais();

    }
}

