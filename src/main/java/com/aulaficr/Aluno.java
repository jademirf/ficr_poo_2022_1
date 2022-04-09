package com.aulaficr;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Aluno {
    // Atributos:
    // -- Nome, matricula, serie, nota1, nota2, nota3 e nota4
    String nome, matricula, serie;
    float nota1, nota2, nota3, nota4, media;
    // método construtor
    public Aluno(String newNome, String newMatricula, String newSerie, float n1, float n2, float n3, float n4) {
        nome = newNome;
        matricula = newMatricula;
        serie = newSerie;
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
        nota4 = n4;
    }
    public void calcMedia() {
        media = (nota1 + nota2 + nota3 + nota4)/4;
        System.out.println("média calculada...");
    }

    // print dos dados do alunos com as notas, média e se foi aprovado ou não
    public void printSituacaoAluno() {
        System.out.println("Aluno: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Notas: " + nota1 + " - " + nota2 + " - " + nota3 + " - " + nota4);
        calcMedia();
        System.out.println("Media: " + media);
        if(media>=7) {
            System.out.println("APROVADO!");
        } else if(media >= 4) {
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.println("REPROVADO!");
        }
    }
}
