import java.util.Locale;
import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EXERCICIOS DA SEÇÃO 4
		//LISTA 01
		
		//QUESTÃO 01
		/*
		Scanner sc = new Scanner(System.in);
		int num1, num2, soma;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		soma = num1 + num2;
		
		System.out.println("SOMA = " +soma);
		*/
		
		//QUESTÃO 2
		/*Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		double raio, area = 0, X;
		
		
		raio = sc.nextDouble();
		X = Math.pow(raio,2.0);
		area = 3.14159 * X;
		
		System.out.printf("A = %.4f%n" , area);
		*/
		
		
		//QUESTAO 3
		/*
		Scanner sc = new Scanner(System.in);
		int A,B,C,D, diferenca;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferenca = (A * B) - (C * D);
		System.out.println("DIFERENÇA = " + diferenca);
		*/
		
		//QUESTAO 4
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x, y;
		double z, w;
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		w = y * z;
		
		System.out.println("NUMBER = " + x);
		System.out.printf("SALARY = U$ = %.2f%n",w);
		 */
		
		//QUESTAO 5
		
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int p1,p2,n1,n2;
		double v1,v2, calc;
		
		p1 = sc.nextInt();
		n1 = sc.nextInt();
		v1 = sc.nextDouble();

		p2 = sc.nextInt();
		n2 = sc.nextInt();
		v2 = sc.nextDouble();
		
		calc = (n1 * v1) + (n2 * v2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", calc);
		*/
		
		//QUESTAO 6
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A,B,C, x,y,z,w,t;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		x = (A * C)/2.0;
		y = Math.pow(C, 2) * 3.14159;
		z = ((A+B)*C)/2.0;
		w = Math.pow(B, 2);
		t = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", x);
		System.out.printf("CIRCULO: %.3f%n", y);
		System.out.printf("TRAPEZIO: %.3f%n", z);
		System.out.printf("QUADRADO: %.3f%n", w);
		System.out.printf("RETANGULO: %.3f%n", t);
		*/
		
		//LISTA EXERCICIOS 02 ESTRUTURAS CONDICIONAIS
		
		//QUESTÃO 1
		/*
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		if(num >0) {
			System.out.println("NÃO NEGATIVO");
		}else {
			System.out.println("NEGATIVO");
		}*/
		
		//QUESTÃO 2
		/*
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		if(num %2 ==0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}*/
		
		//QUESTAO 3
		/*
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Digite um número A: ");
		a = sc.nextInt();
		System.out.println("Digite um número B: ");
		b = sc.nextInt();		
		
		if(a % b == 0 || b % a == 0) {
			System.out.println("SÃO MULTIPLOS");
		}else {
			System.out.println("NÃO SÃO MULTIPLOS");
		}
		*/
		
		//QUESTAO 4
		/*
		Scanner sc = new Scanner(System.in);
		int a, b,x;
		System.out.println("Hora Inicial: ");
		a = sc.nextInt();
		System.out.println("Hora Final: ");
		b = sc.nextInt();		
		
		if(a < b) {
			x = b - a;
		}else{
			x = 24 - a + b;
		}
		System.out.println("O JOGO DUROU " + x + " HORA(S)");
		sc.close();
		*/
		
		//QUESTAO 5
		
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int a, b;
		double total;
		
		System.out.println("Código: ");
		a = sc.nextInt();
		System.out.println("Quantidade: ");
		b = sc.nextInt();		
		
		if(a == 1 ) {
			total = b * 4.00;
		}else if(a == 2){
			total = b * 4.50;
		}else if(a == 3) {
			total = b * 5.00;
		}else if(a == 4) {
			total = b * 2.00;
		}else {
			total = b * 1.50;
		}
		System.out.printf("TOTAL %.2f%n", total);
		sc.close();
		*/
		
		//QUSTAO 6
		
		/*
		Scanner sc = new Scanner(System.in);
		double a, b;
			
		System.out.println("Digite o valor: ");
		a = sc.nextDouble();
				
		if(a > 0 && a <=25.0 ) {
			System.out.println("Intervalo [0,25]");
		}else if(a > 25.0 && a<=50.0){
			System.out.println("Intervalo [25,50]");
		}else if(a > 50.0 && a<=75.0) {
			System.out.println("Intervalo [50,75]");
		}else if(a > 75.0 && a <= 100) {
			System.out.println("Intervalo [75,100]");
		}else {
			System.out.println("Fora do Intervalo");
		}
		sc.close();
		*/
		
		//QUESTAO 7
		
		/*
		Scanner sc = new Scanner(System.in);
		double x, y;
			
		System.out.println("Digite o valor: ");
		x = sc.nextDouble();
		System.out.println("Digite o valor: ");
		y = sc.nextDouble();
				
		if(x == 0.0 && y == 0.0 ) {
			System.out.println("Origem");
		}else if(x == 0.0){
			System.out.println("Eixo Y");
		}else if(y == 0.0) {
			System.out.println("Eixo X");
		}else if(x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		}else if(x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		}else if(x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		}else {
			System.out.println("Q4");
		}
		sc.close();
		*/
		
		//QUESTAO 8
		/*
		Scanner sc = new Scanner(System.in);
		double x, y;
			
		System.out.println("Digite o salário: ");
		x = sc.nextDouble();
				
		if(x <= 2000.0 ) {
			y = 0.0;
			
		}else if(x <= 3000.0){
			y = (x - 2000.0) * 0.08;
			
		}else if(x <= 4500.0) {
			y = (x - 3000.0) * 0.18 + 1000.0 * 0.08;
		}else {
			y = (x - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if(y == 0.0) {
			System.out.println("Isento");
		}else {
			System.out.printf("R$ %.2f%n", y);
		}
		sc.close();
		*/		
		
		////LISTA 03 ESTRUTURA DE REPETIÇÃO WHILE
		
		//QUESTAO 1
		/*
		Scanner sc = new Scanner(System.in);
		int senha = 0;
		
		while (senha!=2002) {
			
			System.out.println("Senha inválida");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido");
		sc.close();
		*/
		
		//QUESTAO 2
		
		/*
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x != 0 && y != 0) {
			
			if(x>0 && y>0) {
				System.out.println("Primeiro");
			}else if(x>0 && y<0) {
				System.out.println("Quarto");
			}else if(x<0 && y< 0) {
				System.out.println("Terceiro");
			}else {
				System.out.println("Segundo");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		sc.close();
		*/
		
		//QUESTAO 3
		
		/*
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int op;
		Scanner sc = new Scanner(System.in);
		op = sc.nextInt();
		while(op != 4) {
			
			if(op ==1) {
				alcool = alcool +1;
			}else if(op ==2) {
				gasolina = gasolina + 1;
			}else {
				diesel = diesel + 1;
			}
			op = sc.nextInt();			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();
		*/
		
		// LISTA 04 - FOR
		
		
		//QUESTAO 1
		
		/*
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		for(int i=1 ; i<x; i++) {
			if (i%2!=0) {
				System.out.println(i);
			}
		}
		sc.close();
		*/
		
		//QUESTAO 2
		/*
		Scanner sc = new Scanner(System.in);
		int n;
		n= sc.nextInt();
		int in = 0;
		int out = 0;
		
		for(int i = 0; i<n; i++) {
			int x = sc.nextInt();
			
			if(x>=10 && x<=20) {
				in++;
			}else
				out++;
		}
		System.out.println(in + "in");
		System.out.println(out + "out");
		sc.close();
		*/
		
		//QUESTAO 3
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		double n1,n2,n3, media = 0;
		
		for(int i = 0; i<n;i++) {
			
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			n3 = sc.nextDouble();
			media = (n1*2 + n2*3 + n3*5)/10.0;
			
			System.out.printf("%.f%n",media);
		}
		sc.close();
		*/
		
		//QUESTAO 4
		
		/*
		Scanner sc = new Scanner(System.in);
		int n;
		double div;
		n = sc.nextInt();
		
		
		for(int i = 0; i<n;i++) {
			
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
	
			div = (double)n1/n2;
			System.out.printf("%.1f%n", div);
			if(n2 == 0) {
				System.out.println("divisão impossivel");
			}
		}
		sc.close();
		*/
		
		//QUESTAO 5
		/*
		Scanner sc = new Scanner(System.in);
		int n, fat = 1;
		
		n = sc.nextInt();
			
		for(int i = 1; i<=n;i++) {
				fat = fat * i;
			}
		System.out.println(fat);
		
		sc.close();
		*/
		
		//QUESTAO 6
		
		/*
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
		sc.close();
		*/
		
		//QUESTAO 7
		/*
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			
			int primeiro = i;
			int segundo = i *i;
			int terceiro = i*i*i;
			
			System.out.printf("%d %d %d %n",primeiro, segundo, terceiro);
		}
		sc.close();
		*/
		
		//EXERCICIO 05 - NUMEROS NEGATIVOS - VETOR
		/*
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		System.out.println("Quantos números você vai digital? ");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i =0; i<n; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("Numeros negativos ");
		for(int i = 0; i< n; i++) {
			if(vetor[i]< 0) {
				System.out.printf("%d%n",vetor[i]);
			}
			sc.close();
		}
		 */
		
		//EXERCICIO 05 - SOMA VETOR
/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		System.out.println("Quantos números você vai digital? ");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		double soma=0, media=0;
		
		for(int i =0; i<n; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		
		for(int i = 0; i< n; i++) {
			
			soma = soma + vetor[i];
			
		}
		media = soma/n;
		System.out.println("VALORES");
		
		for(int i=0; i<n; i++) {
			System.out.printf("VALORES: %.1f%n ", vetor[i]);
		}
		System.out.printf("SOMA: %.2f%n",soma);
		System.out.printf("MEDIA: %.2f%n",media);
		sc.close();
	*/
		//PROBLEMA ALTURAS
		/*

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = 0, idade;
		String nome;
		double altura;
		
		System.out.println("Quantos números você vai digital? ");
		n = sc.nextInt();
		
		double[] vetorAltura = new double[n];
		String [] vetorNome = new String[n];
		int[] vetorIdade = new int[n];
		
		
		for(int i =0; i<n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.println("Nome: ");
			vetorNome[i] = sc.next(); 
			System.out.println();
			System.out.println("Idade: ");			
			vetorIdade [i] = sc.nextInt();
			System.out.println("Altura: ");
			vetorAltura[i] = sc.nextDouble();
		}
		double soma = 0, alturaMedia=0, percentual = 0;
		alturaMedia = soma/n;
		int menor = 0;
		
		for(int i=0; i<n; i++) {
			if(vetorIdade[i]< 16) {
				menor++;				
			}
		soma = soma + vetorAltura[i];
			
		}
		alturaMedia = soma/n;
		percentual = (menor/n) * 100;
		
		System.out.printf("Altura média: %.2f%n",alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentual);
		
		 for(int i=0; i<n; i++) {
		        if (vetorIdade[i] < 16) {
		        	System.out.printf("%s\n", vetorNome[i]);
		        }
		    }

		
		sc.close();
		*/
		
		//NUMEROS PARES
		
		/*
		Scanner sc = new Scanner(System.in);
		int n ;
		
		System.out.println("Quantos números você vai digital? ");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		
		for(int i =0; i<n; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextInt(); 
		}
		
		int par = 0;
		
		for(int i=0; i<n; i++) {
			if(vetor[i] % 2 == 0) {
				par++;				
			}
		}
		
		 for(int i = 0; i <n; i ++) {
		        if (vetor[i]% 2 == 0) {
		        	System.out.printf("Numeros de pares: %n%d %n", vetor[i]);
		        }
		    }
		System.out.println("Quantidade de pares = " + par);
		sc.close();
		
		*/
		
		//MAIOR NUMERO
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n, posMaior ;
		double maior;
		
		System.out.println("Quantos números você vai digital? ");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
		
		
		for(int i =0; i<n; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextDouble(); 
		}
		
		maior = vetor[0];
		posMaior = 0;
		
		for(int i=1; i<n; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
				posMaior=i;				
			}
		}
		
		System.out.printf("MAIOR VALOR = %.1f\n", maior);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posMaior);

		sc.close();
		*/
		
		//SOMA DE VETORES
		/*
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Quantos valores vai ter em cada vetor?");
		n = sc.nextInt();
		
		int[] vetor1 = new int[n];
		int[] vetor2 = new int[n];
		int[] vetor3 = new int[n];
		
 		System.out.println("Digite os valores do vetor A");
		
 		for(int i = 0; i<n; i++) {
			vetor1[i] = sc.nextInt();
		}
		System.out.println("Digite os valores do vetor B");
		for(int i = 0; i<n; i++) {
			vetor2[i] = sc.nextInt();
		}
		for(int i = 0; i<n; i++) {
			vetor3[i] = vetor1[i] + vetor2[i];
		}
		
		System.out.println("Vetor resultante:");
		for(int i = 0; i<n; i++) {
			System.out.printf("%d\n", vetor3[i]);		
		}
		
		sc.close();
		*/
		//MEDIA DE NOTAS
		
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma = 0, media = 0;
		
		System.out.println("Quantos valores vai ter em cada vetor?");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
				
 		for(int i = 0; i< n; i++) {
 			System.out.println("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		for(int i = 0; i<n; i++) {
			soma = soma + vetor[i];
		}
		media = soma/n;
		System.out.printf("Media do vetor: %.3f%n",media);
		
		System.out.println("Elementos abaixo da media:");
		
		for(int i = 0; i<n; i++) {
			if(vetor[i]<media) {
				
				System.out.printf("%.1f%n",vetor[i]);
			}
		}
		sc.close();
		*/
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, par=0;
		double soma = 0, media = 0;
		
		System.out.println("Quantos elementos vai ter o vetor?");
		n = sc.nextInt();
		
		double[] vetor = new double[n];
				
 		for(int i = 0; i< n; i++) {
 			System.out.println("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		for(int i = 0; i<n; i++) {
			if(vetor[i] % 2 == 0) {
				soma = soma + vetor[i];
				par++;
			}
		}
		if(par == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}else {
			media = soma/par;	
			System.out.printf("Média dos pares: %.1f%n", media);
		}
		
		sc.close();
		*/
		
		//MATRIZ
		/*
		Scanner sc = new Scanner(System.in);
		
		int l,c;
		l=sc.nextInt();//linha
		c=sc.nextInt();//coluna
		
		int [][] mat = new int[l][c];
		
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int num = sc.nextInt();
		
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length; j++) {
				if (mat[i][j] == num) {
					System.out.println("Position: " + i + ", " + j + ": ");
				if(j > 0) {
					System.out.println("Left: " + mat[i][j-1]);
				}
				if(i > 0) {
					System.out.println("Up: " + mat[i -1][j]);
				}
				if(j< mat[i].length-1) {
					System.out.println("Right: " + mat[i][j+1]);
				}
				if(i< mat.length-1) {
					System.out.println("Down: " + mat[i+1][j]);
				}
			}
		}
	}
		sc.close();
		*/
		}
}
