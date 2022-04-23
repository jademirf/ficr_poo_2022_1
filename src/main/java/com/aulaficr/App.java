package com.aulaficr;

import java.util.LinkedList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        // TODO: 
        // 1 - Criar um sistema de Eventos onde podemos cadastrar eventos contendo:
        // Evento => Titulo, dia, horario, local
        // Cada evento pode ter pessoas inscritas:
        // Pessoa => Nome, email, telefone, cpf
        // O sistema deve permitir o usuário confirmar ou negar a participação
        // O sistema deve permitir listar as pessoas que confirmaram presença no evento
        
        List<Evento> eventos = new LinkedList<>(); 
        Pessoa novaPessoa;

        
        // cria um evento e adiciona à lista
        eventos.add(new Evento("Título do Evento 01", "01/05/2022","11:30h",     "Wilson's House"));
        eventos.add(new Evento("Título do Evento 02", "02/05/2022","20:30h",     "Emersons`s Kwid"));
        
        novaPessoa = new Pessoa("Desmennyellysson Jerry", "desmeny@gmail.com", "(81) 99999-8888", "123.456.789-10");
        
        // Adicionando no Evento 01
        eventos.get(0).addParticipante(novaPessoa);
        eventos.get(0).addParticipante(new Pessoa("Astrogildo Lauriano", "astro@gmail.com", "(81) 98888-8888", "321.456.789-10"));

        // Adicionando no Evento 02
        eventos.get(1).addParticipante(novaPessoa);

        for (int i = 0; i < eventos.size(); i++) {
            eventos.get(i).listaInscritos();
        }
    }
}

