package com.aulaficr;

public class Veiculo {
    int qtdPessoas;
    String tipo;
    String categoria;
    String cor;
    int qtdPortas;
    float capacidadeLitros;
    float consumoLitros;
    Calculadora calc = new Calculadora();

    public Veiculo(String novoTipo, String novaCategoria, int portas) {
        tipo = novoTipo;
        qtdPortas = portas;
    }

    void autonomia() {
        calc.divisao(capacidadeLitros, consumoLitros);
    }
    void consumoEstimado(float km) {
        calc.divisao(km, consumoLitros);
    }
}
