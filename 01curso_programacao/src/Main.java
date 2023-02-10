import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		//TREINANDO OS TIPOS
		
		/*
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products: ");
		
		System.out.printf("%s, which price is $ %.2f%n",product1, price1);
		System.out.printf("%s, which price is $ %.2f%n%n",product2, price2);
		
		System.out.printf("Record: %d years old, code %d and gender: %c%n%n",age,code,gender);
		
		System.out.printf("Measue with eight decimal places: %.5f%n",measure);
		System.out.printf("Rouded (three decimal place): %.3f%n",measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal pont: %.3f%n",measure);
		*/
		
		// IMPRIMINDO O TIPO STRING
		/*
		Scanner sc = new Scanner(System.in);
		String x;
		x = sc.next();
		System.out.println("você digitou: " + x);
		
		sc.close();
		*/
		
		//IMPRIMINDO O TIPO INT
		/*
		Scanner sc = new Scanner(System.in);
		int x;
		x = sc.nextInt();
		System.out.println("você digitou: " + x);
		sc.close();
		*/
		
		//IMPRIMINDO O TIPO DOUBLE USANDO LOCALE PARA PEGA O PONTO 8.9
		/*
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		
		//System.out.println("você digitou: " + x);
		System.out.printf("você digitou: %.2f%n" , x);
		sc.close();
		*/
		
		//IMPRIMINDO O TIPO CHARACTERE
		
		/*
		Scanner sc = new Scanner(System.in);
		
		char x;
		x = sc.next().charAt(0);
		
		System.out.println("você digitou: " + x);
		
		sc.close();
		*/
		
		//ENTRADA DE DADOS DE VARIOS TIPOS
		
		/*
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		x = sc.next();// ler uma palavra
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Dados digitados ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		sc.close();
		*/
		
		//LER UM TEXTO ATÉ APERTAR ENTER
		
/*
		Scanner sc = new Scanner(System.in);
		
		String S1,S2,S3;
	 
		S1 = sc.nextLine();
		S2= sc.nextLine();
		S3= sc.nextLine();//quebra de linha
		
		System.out.println("Dados digitados ");
		System.out.println(S1);
		System.out.println(S2);
		System.out.println(S3);
		*/
		
		//USANDO INT ANTES DE STRING PEGA VAZIO USAR NEXTLINE()
		/*
		Scanner sc = new Scanner(System.in);
		int x;
		String S1,S2,S3;
		x = sc.nextInt();
		sc.nextLine(); //pegar a quebra de linha vazia
		S1 = sc.nextLine();
		S2= sc.nextLine();
		S3= sc.nextLine();//quebra de linha
		
		System.out.println("Dados digitados ");
		System.out.println(x);
		System.out.println(S1);
		System.out.println(S2);
		System.out.println(S3);
		*/
		
		//OPERAÇÕES MATEMATICAS
		
		/*
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A,B,C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("Raiz quadrada de: "+ x + " = " + A);
		System.out.println("Raiz quadrada de: "+ y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		A = Math.pow(x,y);
		B = Math.pow(x,2.0);
		C = Math.pow(5.0,2.0);
		
		System.out.println(x + " elevado a "+ y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
			
		System.out.println(" valor absoluto de: "+ y + " = " + A);
		System.out.println("valor absoluto de: " + z + " = " + B);
		*/
		
		
		//ESTRUTURA CONDICIONAL SIMPLES
		/*
		int x = 5;
		System.out.println("Bom dia");
		if (x<0) {
			System.out.println("Boa tarde");
		}
		System.out.println("Boa noite");
		*/
		
		
		//ESTRUTURA CONDICIONAL COMPOSTA
		/*
		Scanner sc = new Scanner(System.in);
		int x ;
		System.out.println("Quantas horas? ");
		x = sc.nextInt();
		
		if (x<12) {
			System.out.println("Bom dia");
		}else {
			System.out.println("Boa tarde");
		}
		sc.close();
		*/
		
		//ESTRUTURA DE CONDIÇÃO ENCADEADA
		
		/*
		Scanner sc = new Scanner(System.in);
		int x ;
		System.out.println("Quantas horas? ");
		x = sc.nextInt();
		
		if (x<12) {
			System.out.println("Bom dia");
		}else if (x<18) {
				System.out.println("Boa tarde");				
		}else{
		
			System.out.println("Boa noite");
		}
		sc.close();
		
		//OPERADORES ACUMULATIVOS
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int minuto = sc.nextInt();
		double conta = 50.0;
		if(minuto>100) {
			conta += (minuto - 100)*2.0; // conta = conta + ....
		}
		System.out.printf("Valor da conta: %.2f%n", conta);
		sc.close();
		*/
		
		//	SWITCH CASE - CTRL + SHIFT + F IDENTAÇAO AUTOMATICA
		
		/*
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;
		switch (x) {
			case 1:
				dia = "domingo";
				break;
			case 2:
				dia = "segunda";
				break;
			case 3:
				dia = "terca";
				break;
			case 4:
				dia = "quarta";
				break;
			case 5:
				dia = "quinta";
				break;
			case 6:
				dia = "sexta";
				break;
			case 7:
				dia = "sabado";
				break;
			default:
				dia = "valor invalido";
				break;
		}
		System.out.println("Dia da semana: " + dia);
		
		sc.close();	
		*/
		
		//EXPRESSÃO CONDICIONAL TERNANRIA
		/*
		double preco = 40.0;
		double desconto = (preco < 20.0) ? preco* 0.1 : preco * 0.05;
		System.out.println(desconto);
		*/
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		sc.close();
		*/
		
		//WHILE : quando nao sabe a quantidade de repetições
		/*
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int soma=0;
		while(x!=0) {
			soma = soma + x;
			x = sc.nextInt();
		}
		sc.close();
		System.out.println(soma);
		*/
		//ESTRUTURA DE REPETIÇÃO FOR
		/*
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int soma = 0;
		for(int i = 0; i<n; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		System.out.println(soma);
		sc.close();
		*/
		
		//ESTRUTURA DE REPETIÇÃO DO-WHILE: repete pelo menos 1x, se for verdade continua, falso pula fora
		/*
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp;
		do {
			System.out.println("Digite a temperatura em celsius: ");
			
			double c = sc.nextDouble();
			double f = 9.0 * c/5.0 + 32.0;
			
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
			System.out.println("Deseja repetir s/n?");
			
			resp = sc.next().charAt(0);	
		}while(resp != 'n');
		
		
		sc.close();
		
		*/
		
		//Operadores bitwise
		/*
		Scanner sc = new Scanner(System.in);
		int mask = 0b100000;
		int n = sc.nextInt();
		if ((n & mask) != 0) {
		System.out.println("6th bit is true!");
		}
		else {
		System.out.println("6th bit is false");
		}
		sc.close();
		*/
		//FUNÇÕES PARA STRING
		/*
		String original = "abcde FGHIJ ABC abc DEFG ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a > b && a > c) {
		System.out.println("Higher = " + a);
		} else if (b > c) {
		System.out.println("Higher = " + b);
		} else {
		System.out.println("Higher = " + c);
		}
		sc.close();
		*/
		//FUNÇÕES
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int higher = max(a, b, c);
		showResult(higher);
		sc.close();
		}
		public static int max(int x, int y, int z) {
			int aux;
			if (x > y && x > z) {
				aux = x;
			} else if (y > z) {
				aux = y;
			} else {
				aux = z;
			}
			return aux;
		}
		public static void showResult(int value) {
			System.out.println("Higher = " + value);
		}
		*/
		
		//MEMBROS STATIC
		/*
		//public static final double PI = 3.14159; -- declarar antes da função main -- static final-- nao muda o valor
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		
		double radius = sc.nextDouble();
		double c = circumference(radius);
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		
		sc.close();
		}
	
		public static double circumference(double radius) {
			return 2.0 * PI * radius;
		}
		
		public static double volume(double radius) {
			return 4.0 * PI * radius * radius * radius / 3.0;
		}
		*/
		
		//VETOR
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double [n];//criando vetor
		
		for(int i = 0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for(int i = 0; i< n; i++) {
			soma += vect[i];
		}
		
		double media = soma/n;
		System.out.printf("AVERAGE: %.2f%n", media);
		sc.close();
		*/
		
		// DIFERENÇA DO FOR PARA O FOR EACH
		/*
		
		String[] vect = new String[] {"Marina", "Bob", "Teo"};
		
		for(int i=0; i< vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		for(String obj: vect) {
			System.out.println("-----" + obj);
		}
		 */	
		
		//LISTAS
		/*
		List<String> list = new ArrayList<>();
		list.add("Mari");
		list.add("Teo");
		list.add("Bob");
		list.add("Lua");
		list.add(2, "Jose");
		list.add("Mara");
		list.add("Marcos");
		
		for(String x : list) {
			System.out.println(x);
			
		}
		
		System.out.println(list.size()); //tamanho da lista
		
		list.remove("Mari");//remoção por nome
		list.remove(3);// remoção por posição
		list.removeIf(x -> x.charAt(0)=='M');//remoção por predicado ---todos com M
		
		for(String x : list) {
			System.out.println("----------" + x);
			
		}
		System.out.println("index of bob: " + list.indexOf("Teo"));
		System.out.println("index of bob: " + list.indexOf("Joao"));//qnd nao tem na lista -1
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());//pegaa somente com a letra J, cria outra lista e depois coleta a lista antiga novamente
		
		for(String x : result) {
			System.out.println("------^^" + x);
			
		}
		String name = list.stream().filter(x -> x.charAt(0)=='T').findFirst().orElse(null);//primeiro elemento da lista com a letra T
		System.out.println(name);
		*/
		
		//MATRIZ
		/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] mat = new int[n][n]; // instancia a matriz na mememoria
		
		for(int i =0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		for(int i =0; i< mat.length; i++) {
			System.out.println(mat[i][i] + " ");
		}
		System.out.println();
		
		int cont = 0;
		
		for(int i = 0; i<mat.length; i++) {
			for(int j = 0; j<mat[i].length; j++) {
				if(mat[i][j] < 0) {
					cont++;
				}
			}
		}
		System.out.println("Negative numbers: "+ cont);
		sc.close();
		*/
		
		//DATE
		/*
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");//formato iso 8601
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		LocalDate d10 = LocalDate.of(2022,05,20);
		LocalDateTime d11 = LocalDateTime.of(2022, 07, 10, 1, 30);
		
		System.out.println("dp1: " + d01.toString()); //local ^^ usando toString para tranformar padra GMT ou  UTC
		System.out.println("d02: " + d02.toString());
		System.out.println("d03: " + d03.toString()); //global +3 em Londres - padrao GMT
		System.out.println("d04: " + d04.toString());
		System.out.println("d05: " + d05.toString());
		System.out.println("d06: " + d06.toString());
		System.out.println("d07: " + d07.toString());
		System.out.println("d08: " + d08.toString());
		System.out.println("d09: " + d09.toString());
		System.out.println("d010: " + d10.toString());
		System.out.println("d011: " + d11.toString());
		*/
		
		//TRANSFORMANDO DATE EM STRING
		/*
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");//formato iso 8601
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());//especifica o fusorario do sistema local
		
		
		System.out.println("d04: " + d04.format(fmt1));
		System.out.println("d04: " + fmt1.format(d04));
		System.out.println("d04: "+ d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));//instancia o objeto, formata e mostra na tela
		System.out.println("d05: " + d05.format(fmt2));
		System.out.println("d06: " + fmt3.format(d06));
		*/
		
		//CONVERTER DATAS GLOBAL-LOCAL
		/*
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		//for(String s: ZoneId.getAvailableZoneIds()) {
		//	System.out.println(s);
		//}
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());//convertendo para uma data local considerando o fuso horario da maquina
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("r1: " + r1);
		System.out.println("r2: " + r2);
		System.out.println("r3: " + r3);
		
		System.out.println("d04:dia " + d04.getDayOfMonth());
		System.out.println("d04:mes " + d04.getMonthValue());
		System.out.println("d04:ano  " + d04.getYear());
		System.out.println("d05:hora  " + d05.getHour());
		*/
		
		
		//DATA E HORA E DIFERENÇA DE TEMPO
		/*
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate semanaPassada = d04.minusDays(7);
		LocalDate proxSemana = d04.plusDays(7);
		LocalDate proxAno = d04.plusYears(7);
		
		System.out.println(semanaPassada);
		System.out.println(proxSemana);
		System.out.println(proxAno);
		
		LocalDateTime semanaPass = d05.minusDays(7);
		LocalDateTime proxSeman = d05.minusDays(7);

		System.out.println(proxSeman);
		System.out.println(semanaPass);
		
		Instant semanaPas = d06.minus(7, ChronoUnit.DAYS);
		Instant proxSema = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println(proxSema);
		System.out.println(semanaPas);
		
		//DURAÇÃO 
		
		Duration t1 = Duration.between(semanaPassada.atStartOfDay(), d04.atStartOfDay());
		System.out.println(t1.toDays());
		
		Duration t2 = Duration.between(semanaPass, d05);
		System.out.println(t2.toDays());
		
		Duration t3 = Duration.between(semanaPas, d06);
		System.out.println(t3.toDays());
		
		*/
		/*
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); //declarando 
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("25/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(y1);
		System.out.println(y2);
		
		System.out.println("y1: " +sdf1.format(y1));
		System.out.println("y2: " +sdf2.format(y2));
		System.out.println("y3: " +sdf2.format(y3));
		
		Date x1 = new Date();
		System.out.println(x1);
		System.out.println(sdf2.format(x1));
		
		Date x2 = new Date(System.currentTimeMillis());
		System.out.println(sdf2.format(x2));
		
		Date x3 = new Date(0L);
		System.out.println(sdf2.format(x3));
		
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		System.out.println(sdf2.format(x4));
	*/
		
		//Somando uma unidade de tempo
		/*
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(sdf.format(d));
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		System.out.println(sdf.format(d));
		*/
		
		
	}
	
	
}
	

 