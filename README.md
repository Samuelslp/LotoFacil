# LotoFacil

O sistema é capaz de gerar jogos aleatórios, permitir que os jogadores façam suas apostas, verificar os resultados e calcular prêmios de acordo com as regras da loteria.
A aplicação possui um menu para a loteria utilizando as estruturas switch case e do while. Enquanto o usuário não digitar 0, para sair, novas apostas serão permitidas

Regras para a aposta de 0 a 100:
A opção 1 lê um número inteiro via teclado, de 0 a 100, caso o número seja maior que 100 ou menor que 0, a aplicação erro: “Aposta inválida". O sistema compara o número escolhido pelo usuário apostador com o número sorteado pelo
sistema.

Regras para a aposta de A à Z:
O sistema lê um char via teclado, de A à Z, comparando assim com o numero escolhido pelo o desenvolvedor (inicial do proprio nome), caso o usuario escolha o mesmo caracter, ganha 500 reais, caso escolha uma letra diferente o usuario retorna ao menu podendo fazer uma nova aposta.


Regras para a aposta de número par ou ímpar:
O prêmio será dado caso o usuário digite um número par. O sistema não irá premiar jogadores que digitarem um número ímpar.

BIBLIOTECAS

1.  java.util.Random;
2.  java.util.Scanner;
3.  java.lang.Character;
4.  java.awt.Color;
5.  java.awt.FlowLayout;
6.  java.awt.event.ActionEvent;
7.  java.awt.event.ActionListener;
8.  java.util.Random;
9.  javax.swing.JButton;
10. javax.swing.JFrame;
11. javax.swing.JOptionPane;
12. javax.swing.JPanel;

Essas bibliotecas integram o Java padrão e não precisam de nenhuma instalação extra, pois elas estão disponíveis por padrão na linguagem Java. Elas podem ser usadas para realizar tarefas como leitura de entrada do usuário,  geração de números aleatórios e manipulação de caracteres.
Versão do JDK Oracle OpenJDK  version 20.0.2
