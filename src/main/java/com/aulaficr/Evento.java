package com.aulaficr;

import java.util.LinkedList;
import java.util.List;

public class Evento {
    String titulo, dia, horario, local;
    //lista de inscritos
    List<Pessoa> inscritos = new LinkedList<>();
    
    // Método construtor da classe
    public Evento(String novoTitulo, String novoDia, String novoHorario, String novoLocal) {
        titulo = novoTitulo;
        dia = novoDia;
        horario = novoHorario;
        local = novoLocal;
    }

    // Método para adicionar uma pessoa na lista do evento
    public void addParticipante(Pessoa novoInscrito) {
        inscritos.add(novoInscrito);
    }

    public void listaInscritos() {
        System.out.println("Título: " + titulo);
        System.out.println("-----Inscritos----- ");
        for(int i = 0; i < inscritos.size(); i++) {
            System.out.println((i+1) + "- " + inscritos.get(i).nome + " - " + inscritos.get(i).email);
        }
    }
}
