package lista1;

import java.util.Scanner;
/*
@author Carolinda
 */
public class Lista1 {

    public static void main(String[] args) {
    }
      public static void Exercicio1(){
/* 1 */

    Scanner ler = new Scanner(System.in);
        
        int n, m;
        System.out.println("Digite um numeros inteiros maior que 0: ");        
        n = ler.nextInt();
        
        while (n !=0) {
            m = n * n;
            System.out.printf("Quadrado de %d : %d \n",n , m);
            System.out.println("Digite um numeros inteiros maior que 0, ou 0 para sair");
             n = ler.nextInt();
            
        }    
    }
    
    public static void Exercicio2(){
        
/* 2 */

        Scanner ler = new Scanner(System.in);
        int n, i, soma;
        
        System.out.printf("\nDigite um numero: ");
        n = ler.nextInt();
        soma = 0;
        i = 1;
        
        while (i <= n) {
            soma = soma + i;
            i = i + 1;
        }
        
        System.out.printf("Soma dos primeiros inteiros positivos de %d : %d\n", n, soma);
    }
    
    public static void Exercicio3(){
        
/* 3 */
        Scanner ler = new Scanner(System.in);
        int n, i = 0, imp = 1;
        
        System.out.printf("\nDigite um valor para n: ");
        n = ler.nextInt();
  
        
        System.out.printf("Os impares de %d sao: \n", n);
        while(i<n){
            System.out.printf("%d\n", imp);
            imp = imp + 2;
            i++;
        }
                
    }
    
    public static void Exercicio4_1(){
        
/* 4 */
        Scanner ler = new Scanner(System.in);

        int x, n, pot, i;
        
        System.out.printf("Digite um valor para x, inteiro e maior que 0:");
        x = ler.nextInt();
        System.out.printf("Digite um valor para n, inteiro e maior que 0:");
        n = ler.nextInt();
        
        pot = 1;
        i = 0;
        
        while(i != n){
            pot = pot * x;
            i = i + 1;
        }
        System.out.printf("\n o valor de x=%d elevado a n=%d é\n: %d\n", x, n, pot);
  
    }
    
    public static void Exercicio4_2(){
/* 4 */

        Scanner ler = new Scanner(System.in);

	int i, mvenda = 0, dia=0;
	int[] marco = new int[32];
	for(i = 1; i <= 31; i++){
            System.out.printf("Digite quantos discos foram vendidos no dia %d: \n",i);
            marco[i] = ler.nextInt();
        }
        for(i = 0; i <= 31; i++){
            if(marco[i] > mvenda){
                mvenda = marco[i];
                dia = i;
            }
        }
        System.out.printf("A maior venda do mes de Marco foi no dia %d vendendo %d discos \n", dia, mvenda);
	
    }
    
    public static void Exercicio5(){
        
/*5*/
                
        int n[] = {5,10,15,20,25};
        int i, soma = 0;
        
        for(i=0; i<5; i++){
            if(n[i]%2==0){
                soma = soma + n[i];
            }
        }
          System.out.printf("A soma dos pares é: %d\n", soma);          
    }
    
    public static void Exercicio6(){
        
/*6*/
        Scanner ler = new Scanner(System.in);
    
        int n, i, num = 1;
    
        System.out.printf("Digite um numero inteiro maior que 0\n");
        n = ler.nextInt();
    
        for(i = 2; i <= n; i++){
            num = num * i;         
        }
        System.out.printf("Valor de %d! : %d\n", n, num);

    }
    
    public static void Exercicio7(){
        
/* 7 */
        Scanner ler = new Scanner(System.in);

        int i, j, n, mult = 0, cont = 0;
        
        System.out.printf("Digite o numero de multiplos que serão impressos: \n");
        n = ler.nextInt();
        System.out.printf("Digite um numero para i e outro para j: \n");
        i = ler.nextInt();
        j = ler.nextInt();
        
        System.out.printf("Os %d primeiros multiplos de %d ou de %d sao: ", n, i, j);
        while (cont < n){
            if (mult%i == 0 || mult%j == 0){
                System.out.printf(" %d", mult);
                cont = cont + 1;
            }
            mult = mult + 1;
        }
        System.out.printf("\n");
    }
    
    public static void Exercicio8(){
/* 8 */
        Scanner ler = new Scanner(System.in);
        
        int i = 1, j = 0, n;
        
        System.out.printf("Entre com o número: \n");
        n = ler.nextInt();
        while(j < n){
            j = i*(i+1)*(i+2);
            i++;
        }
            if(j == n){
                System.out.printf("%d é triagular!\n", n);
            }
            else{
                System.out.printf("%d nao é triagular!\n", n);
            }
    }
    
    public static void Exercicio9(){
/* 9 */      
        Scanner ler = new Scanner(System.in);
        
        int n, divisores = 2, primo;
        
        System.out.printf("Digite um numero inteiro: \n");
        n = ler.nextInt();
        
        if(n <= 1){
            primo = 0;
        }
        else{
            primo = 1;
        }
        while(divisores <= n/2 && primo == 1){
            if(n % divisores == 0){
                primo = 0;
            }
            divisores= divisores++;
        } 
        if(primo == 1){
            System.out.printf(" %d é primo\n", n);
        }
        else{
            System.out.printf(" %d nao e primo\n", n);
        }
  
 } 
    
    public static void Exercicio10(){
/*10*/
        Scanner ler = new Scanner(System.in);
        int n, m, i;
        
        System.out.printf("Digite dois numeros inteiros positivos:\n");
        n = ler.nextInt();
        m = ler.nextInt();
        System.out.printf("MDC(%d,%d) = ",n, m);
        
        i = n % m;
        while(i !=0) {
            i = m % n;
            m = n;
            n = i;
        }
        System.out.printf("%d\n", m);
  
    }
    
    public static void Exercicio11(){
/* 11 */      
        Scanner ler = new Scanner(System.in);
        
        int n, soma = 0, div;

        System.out.printf("Digite um numero inteiro positivo: ");
        n = ler.nextInt();
        
        for (div = 1; div < n; div++){
            if (n % div == 0)
                soma = soma + div;
        }
        if (n == soma){
            System.out.printf("%d e perfeito\n", n);
        }
        else{
            System.out.printf("%d nao e perfeito\n", n);
        }
    }
    
    public static void Exercicio12(){
/* 14 */
        Scanner ler = new Scanner(System.in);
        
        int n, fanterior = 0, fatual = 1, fproximo, i = 1;
        
        System.out.printf("Digite um numero para n: \n");
        n = ler.nextInt();
        while(i < n) {
            fproximo = fatual + fanterior;
            fanterior = fatual;
            fatual = fproximo;
            i = i+1;
        }
        System.out.printf("Numero %d de Fibonacci = %d\n", n, fatual);

    }
    
    public static void Exercicio13(){
/* 13 */
        Scanner ler = new Scanner(System.in);
        
        int n, m, j, i, cong;
        
        System.out.printf("Digite valores para n: \n");
        n = ler.nextInt();
        System.out.printf("Digite valores para m: \n");
        j = ler.nextInt();
        System.out.printf("Digite valores para j: \n");
        m = ler.nextInt();
        
        cong = j;
        
        System.out.printf("Os %d primeiros naturais congruentes a %d modulo %d sao: ",n, j, m);
        for (i = 0; i < n; i++) {
            System.out.printf("%d ", cong);
            cong = cong + m;   
        }
        System.out.printf("\n");

    }
    
    public static void Exercicio14(){
/* 14 */
        
        Scanner ler = new Scanner(System.in);
        int n, pot = 1, conv = 0, m;
        
        System.out. printf("Digite um numero numero binario para ser transformado em decimal: \n");
        n = ler.nextInt();
        m = n;
        
        while(n!= 0){
            conv = conv + n % 10 * pot;
            n = n /10;
            pot = pot * 2;
        }
        System.out.printf("%d para decimal e: %d\n", m, conv);
    }
    
    public static void Exercicio15(){
/* 15 */
        
        Scanner ler = new Scanner(System.in);
        int n, bin, aux, dig, pot;
        
        System.out. printf("Digite um numero numero decimal para ser transformado em binario: \n");
        n = ler.nextInt();
        
        
        aux = n;
        bin = 0;
        pot = 1;
                
        while(aux > 0){
            dig = aux % 2;
            aux = aux / 2;
            bin = bin + dig * pot;
            pot = pot * 10;
        }
        System.out.printf("%d para decimal e: %d\n", n, bin);
        
    }
    public static void Exercicio16(){
/* 16 */       
        Scanner ler = new Scanner(System.in);
        
        int a, b, c, i;
        
        System.out.printf("Digite um numero para a: \n");
        a = ler.nextInt();
        System.out.printf("Digite um numero para b: \n");
        b = ler.nextInt();
        System.out.printf("Digite um numero para c: \n");
        c = ler.nextInt();
        
        if(b>a){
            i = a;
            a = b;
            b = i;
        }
        if(c>a){
            i = a;
            a = c;
            c = i;        
        }
        if( a * a == b * b + c * c){
            System.out.printf("O triangulo e retangulo\n");
        }
        else{
            System.out.printf("O triangulo nao e retangulo\n");
        }
        
    }
    
    public static void Exercicio17(){
/* 17 */
        Scanner ler = new Scanner(System.in);
        
        int a, b, c, i;
        
        System.out.printf("Digite um numero para a: \n");
        a = ler.nextInt();
        System.out.printf("Digite um numero para b: \n");
        b = ler.nextInt();
        System.out.printf("Digite um numero para c: \n");
        c = ler.nextInt();     
        
        if (c > a){
            if (a > b){
                System.out.printf("A ordem crescente: %d %d %d\n", b, a, c);
            }
            else{
                if (b < c){
                    System.out.printf("A ordem crescente: %d %d %d\n", a, b, c);
                }
            }
        }
        if (a > b){
            if (b > c){
                System.out.printf("A ordem crescente: %d %d %d\n", c, b, a);
            }
            else {
                if (c < a){
                    System.out.printf("A ordem crescente: %d %d %d\n", b, c, a);
                }
            }
        }
        if (a < b){
            if (c < a){
                System.out.printf("A ordem crescente: %d %d %d\n", c, a, b);
            }
            else{
                if (c < b){
                    System.out.printf("A ordem crescente: %d %d %d\n", a, c, b);
                }
            }
        }
    }
    
    public static void Exercicio18E19(){
        
/* 18 19 */


        for (int x = 1; x <= 9999; x++) {
            int a = x / 100;
            int b = x % 100;
            int raiz = (a + b);
            
            if ((raiz * raiz) == x){
                System.out.println(x + " = " + raiz + "² = " + a + " + " + b);
            }
        }
    }
    
    
    public static void ExercicioR1(){
        
/* Repetição 1 */
        
        
        Scanner ler = new Scanner(System.in);
        
	int n, i, total = 0;

	System.out.printf("Digite um numero para n:");
	n = ler.nextInt();

	for(i = 0; i <= n; i++){	
		if(i % 2 == 0){
		total = total + i;	
		}
	}

	 System.out.printf("O total da soma dos pares e: %d \n", total);
    }
    
    
    public static void ExercicioR2(){
        
/* Repetição 2 */
        
        Scanner ler = new Scanner(System.in);
        

        boolean encontrou;
        int n, cat1, cat2, hipot;
        
        System.out.printf("Digite o comprimento maximo da hipotenusa: ");
        n = ler.nextInt();
        
        for(hipot = 1; hipot <= n; hipot++){
            encontrou = false;
            for(cat1 = 1; cat1 < hipot && !encontrou; cat1++){
                cat2 = cat1;
                while(cat1*cat1 + cat2*cat2 < hipot*hipot)
                    cat2++;
                if (cat1*cat1 + cat2*cat2 == hipot*hipot){
                    System.out.printf("hipotenusa = %d, catetos %d e %d\n", hipot, cat1, cat2);
                    encontrou = true;
                }
            }
        }
    }
        
        public static void ExercicioR3(){
            
/* Repetição 3 */
            
            Scanner ler = new Scanner(System.in);
            
            int m, n, x, y, valor;
            int xmax = 0; 
            int ymax = 0;
            int valormaximo = 0;
            
             System.out.printf("Digite o valor de m: ");
             m = ler.nextInt();
             System.out.printf("Digite o valor de n: ");
             n = ler.nextInt();
             
             for(x = 0; x <= m; x++){
                 for(y = 0; y <= n; y++){
                     valor = (x*y) - (x*x) + y;
                     if (valor > valormaximo){
                         valormaximo = valor;
                         xmax = x;
                         ymax = y;
                     }
                 }
             }
             System.out.printf("Valor maximo da funcao = %d foi alcancado com x = %d e "
                     + "y = %d\n", valormaximo, xmax, ymax);
        }
        
        
        public static void ExercicioR5(){
            
/* Repetição 5 */
           int n, m, i, ini = 1;
           Scanner ler = new Scanner(System.in);
           
           System.out.println("Digite o valor de n: ");
           n = ler.nextInt();
            //n = 3
           
           for(m = 1; m <= n; m++){
               
               System.out.printf("%d^3 = %d", m, ini);
               for(i = 1; i < m; i++)
                   
                   System.out.printf("+%d", ini + 2 * i);
            
               ini = ini + 2 * m;
            
               System.out.printf("\n");
               
               }
           }
    
}
