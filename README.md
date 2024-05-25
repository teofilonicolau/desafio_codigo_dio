# Desafio de Cálculo de Salário

Este desafio é parte dos Desafios de Código: Aperfeiçoe Sua Lógica e Pensamento Computacional da DIO. O objetivo é criar um programa em Java que calcule e imprima o salário a ser transferido para um funcionário.

## Como o programa funciona?

O programa recebe dois valores de entrada: o valor bruto do salário e o adicional dos benefícios. Em seguida, calcula o salário a ser transferido da seguinte maneira:

`(valor bruto do salário - percentual de imposto mediante ao salário) + adicional dos benefícios`

O percentual de imposto é calculado com base nas seguintes alíquotas:

- De R$ 0,00 a R$ 1100.00 = 5.00%
- De R$ 1100.01 a R$ 2500.00 = 10.00%
- Maior que R$ 2500.00 = 15.00%

## Entrada e Saída

A entrada consiste em vários arquivos de teste, cada um contendo o valor bruto do salário e o adicional dos benefícios.

Para cada arquivo de entrada, o programa gera um arquivo de saída. Este arquivo contém uma linha com um número que é a diferença entre o valor bruto do salário e o percentual de imposto, somado ao adicional dos benefícios.

## Exemplo

Por exemplo, se a entrada for:

2000 250


A saída será

2050.00


![image](https://github.com/teofilonicolau/desafio_codigo_dio/assets/97030160/1ec05733-ee71-44a1-855a-dbf62a4302f4)



Isso significa que, para um salário bruto de R$ 2000,00 e um adicional de benefícios de R$ 250,00, o salário a ser transferido após a dedução do imposto será de R$ 2050,00.






