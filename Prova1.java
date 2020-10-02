package LiandraJavaAngular;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Prova1 {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner ler = new Scanner(System.in);
		int opcao = 0;
		System.out.println("1 - Exercicio 1");
		System.out.println("2 - Exercicio 2");
		System.out.println("3 - Exercicio 3");
		System.out.println("4 - Exercicio 4");
		System.out.println("5 - Exercicio 5");
		System.out.println("0 - sair");
		opcao = ler.nextInt();

		switch (opcao) {

		case 1:
			exercUm(rd);
			break;

		case 2:
			exercDois(rd);
			break;

		case 3:
			exercTres(rd);
			break;

		case 4:
			exercQuatro(rd);
			break;

		// default:
		// System.out.println(" ");
		// break;
		}
		System.exit(0);
	}

	public static void exercUm(Random rd) {

		// 1- Faça um algoritmo que receba dois números, calcule e mostre a divisão do
		// primeiro número pelo segundo. Sabe-se que o segundo número não pode ser zero,
		// portanto não é necessário se preocupar com validações.

		Scanner ler = new Scanner(System.in);

		double n1, n2;
		double divisao;

		System.out.println("Informe n1: ");
		n1 = ler.nextDouble();

		System.out.println("Informe n2: ");
		n2 = ler.nextDouble();

		System.out.println("Você informou os numeros: " + n1 + " e " + n2);
		divisao = n1 / n2;

		System.out.println("A divisao do primeiro numero pelo segundo é: " + divisao);
	}

	public static void exercDois(Random rd) {
		// 2- Faça um algoritmo que receba um número aleatório maior que 25, e calcule a
		// soma dos números anteriores até ele. (ex: 10 = 10 + 9 + 8 + 7 + 6 + 5 + 4 + 2
		// + 1)

		int numeroAleatorio = 0;
		int numerosAnteriores = 0;
		int soma = 0;
		int contador = 0;

		numeroAleatorio = ThreadLocalRandom.current().nextInt(25, 100);
		System.out.println("Numero gerado: " + numeroAleatorio);

		for (int i = 1; i < numeroAleatorio + 1; i++) {
			soma += i;
		}
		System.out.println("A soma é: " + soma);

}

	public static void exercTres(Random rd) {

		// 3- Escreva um algoritmo que gere 500 valores inteiros e positivos e:
		// a. encontre o maior valor;
		// b. encontre o menor valor;
		// c. calcule a média dos números lidos.

		int somaTotal = 0, media, numerosGerados, maior = 0, menor = 10001;

		for (int i = 0; i < 500; i++) {
			numerosGerados = ThreadLocalRandom.current().nextInt(1, 10000);
			somaTotal += numerosGerados;

			if (numerosGerados > maior) {
				maior = numerosGerados;
			}
			if (numerosGerados < menor) {
				menor = numerosGerados;
			}
		}

		media = somaTotal / 500;

		System.out.println("Foram gerados 500 números entre 1 e 10000");
		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);
		System.out.println("A média é: " + media);

	}

	public static void exercQuatro(Random rd) {

		// 4- Faça um algoritmo que:
		// a. Gere um número aleatório entre 1 e 15;
		// b. Peça para o usuário escolher um número entre 1 e 15;
		// c. Caso o usuário acerte o número gerado, o programa mostra a seguinte
		// mensagem: “Usuário acertou o número gerado, Parabéns!”;
		// d. Caso o usuário erre, o programa mostrará a mensagem: “Usuário não acertou,
		// gostaria de tentar de novo?”;
		// e. Mostre a Opção: “1 – Tentar novamente”, “0 – Sair”;

		Scanner ler = new Scanner(System.in);
		int numeroAleatorio;
		int numeroUsuario;
		int opcao;
		boolean condicao = true;

		while (condicao) {
			numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 15);
			System.out.println("Por favor, escolha um numero entre 1 e 15");
			numeroUsuario = ler.nextInt();

			if (numeroUsuario == numeroAleatorio) {
				System.out.println("Usuário acertou o número gerado, Parabéns!");
			} else {
				System.out.println("Usuário não acertou, gostaria de tentar de novo?");
				System.out.println("1 – Tentar novamente");
				System.out.println("0 - sair");
				opcao = ler.nextInt();
				if (opcao == 0) {
					condicao = false;
				}
			}
		}
	}

}
