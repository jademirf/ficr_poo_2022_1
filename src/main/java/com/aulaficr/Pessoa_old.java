package com.aulaficr;

public class Pessoa_old {
    String tipo;
    String nome;
    String sexo;
    String email;
    String cpfCnpj;
    String tipoDoc;
    public Pessoa(String newCpfCnpj, String newNome, String newSexo, String newEmail) {
        sexo = newSexo;
        nome = newNome;
        email = newEmail;
        cpfCnpj = newCpfCnpj;

        if (cpfCnpj.length() > 14 ) {
            tipo = "Pessoa Jurídica";
            tipoDoc = "CNPJ";
        } else {
            tipo = "Pessoa Física";
            tipoDoc = "CPF";
        }
    }
    // Método para imprimir todos os dados da pessoa de uma vez só
    public void printDadosCadastrais() {
        System.out.println(nome + ", é " + tipo + ", " + tipoDoc + ": " + cpfCnpj + ", email: " + email + ", sexo: " + sexo);
    }
}
