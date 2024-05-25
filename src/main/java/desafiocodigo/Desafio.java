package desafiocodigo;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitorDeEntrada = new Scanner(System.in);

        System.out.println("Digite o valor bruto do salário:");
        float valorSalario = leitorDeEntrada.nextFloat();

        System.out.println("Digite o valor adicional dos benefícios:");
        float valorBeneficio = leitorDeEntrada.nextFloat();

        float valorImposto = 0;
        if(valorSalario >= 0 && valorSalario <= 1100) {
            valorImposto = 0.05F * valorSalario;
        } else if(valorSalario > 1100 && valorSalario <= 2500) {
            valorImposto = 0.10F * valorSalario;
        } else if(valorSalario > 2500) {
            valorImposto = 0.15F * valorSalario;
        }

        float saida = valorSalario - valorImposto + valorBeneficio;
        System.out.println(String.format("%.2f",saida));
    }
}
