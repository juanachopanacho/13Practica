import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {




//        Convertir numero n veces hasta que se cumpla una condicion
//        int contador = 0;
//        int potencia = 3;
//
//        System.out.println("digite el numero a convertir");
//        contador=ingreso.nextInt();
//
//       while (contador>=0){
//           System.out.println(Math.pow(contador,potencia));
//           contador=ingreso.nextInt();
//       }


//        for (int i = 1; i <= contador; i++) {
//           System.out.println("digite la cantidad de terminos");
//           contador=ingreso.nextInt();
//
//           if (contador>=0){
//               elevado = Math.pow(contador,2);
//               System.out.println(elevado + i);
//           } else{
//               System.out.println("wrong way bitch");
//               break;
//           }
//
//        }


//        Mostrar si un numero es par o impar hasta que se introduzca un cero
//        
//        int contador =0;
//
//        System.out.println("digite el numero a convertir");
//        contador=ingreso.nextInt();
//
//       while (contador!=0){
//           if (contador%2 == 0 ){
//               System.out.println("par!");
//           } else {
//               System.out.println("impar!");
//           }
//
//           contador=ingreso.nextInt();
//       }

//        Contar n numeros introducidos y terminar cuando es negativo
//        int numero =0;
//        int acumulador=0;
//
//        System.out.println("digite un numero");
//        numero=ingreso.nextInt();
//
//       while (numero>0){
//
//           acumulador = ++acumulador;
//           System.out.println("Se han introducido " + acumulador + " numeros. El número introducido fue " + numero);
//           numero=ingreso.nextInt();
//       }
//
//       System.out.println("Se introdujeron " + acumulador + " numeros.");

// Crear numero aleatorio y cerrar cuando se haya adivinado
//        int numero, aleatorio=0, contador=0;
//
//        aleatorio= (int)(Math.random()*100);
//        System.out.println(aleatorio);
//
//        System.out.println("digite un numero");
//        numero=ingreso.nextInt();
//
//        while (aleatorio!=numero){
//
//            contador = ++contador;
//            System.out.println("Jaja, boludo");
//           numero=ingreso.nextInt();
//       }
//        contador = ++contador;
//        System.out.println("Te demoraste " + contador + " intentos");


// Pedir numeros hasta que se ingrese 0, mostrar la suma de todos
//        int numero =0;
//        int acumulador=0;
//
//        System.out.println("digite un numero");
//        numero=ingreso.nextInt();
//
//       while (numero!=0){
//
//           acumulador = acumulador+numero;
//           System.out.println("Los numeros suman " + acumulador + " El número introducido fue " + numero);
//           numero=ingreso.nextInt();
//       }
//
//       System.out.println("Los numeros suman " + acumulador);

//Pedir numeros hasta que se ingrese uno negativo y calcular la media
//        double numero =0;
//        double acumulador=0;
//        double media=0;
//        int contador =0;
//
//        System.out.println("digite un numero");
//        numero=ingreso.nextDouble();
//
//        while (numero>0){
//
//            acumulador = acumulador+numero;
//            contador = ++contador;
//            media = acumulador/contador;
//            System.out.println("El valor acumulado es: " + acumulador + " conteo es: " + contador+ " La media es: " + media);
//            numero=ingreso.nextInt();
//        }
//
//        System.out.println("El valor acumulado es: " + acumulador + " conteo es: " + contador+ " La media es: " + media);
//

//        Ingresar un numero y que se muestren desde el 1 los numeros hasta dicho numero
//        int numero;
//        System.out.println("digite un numero");
//        numero=ingreso.nextInt();
//        for(int i=1; i<=numero;i++){
//            System.out.println(i);
//        }

//        Decremento de 7 en 7 desde un numero X hasta 0
//        int numero;
//        System.out.println("digite un numero");
//        numero=ingreso.nextInt();
//        for(int i=numero; i>=0;i-=7){
//            System.out.println(i);
//        }


//        Suma de 10 numeros
//        int numero;
//        int suma =0;
//
//        for(int i=1; i<=10;i++){
//            System.out.println("digite un numero");
//            numero=ingreso.nextInt();
//            suma = suma + numero;
//            System.out.println(numero);
//            System.out.println(suma);
//
//        }



//        for(int i=1; i<=contadorImpares;i++){
//
//            System.out.println("digite un numero");
//            numero=ingreso.nextInt();
//
//            if (numero%2!=0){
//                contadorImpares += contadorImpares;
////                if(contadorImpares==0){
////                    contadorImpares=1;
////                }
//                producto=contadorImpares*numero;
//                System.out.println(numero);
//            }
//
//        }

//        Ingresa n cantidad de numeros y multiplicar los 10 primeros
//        int numero;
//        int producto =1;
//        int contadorImpares=0;
//
//        while (contadorImpares<=10){
//
//            System.out.println("digite un numero");
//            numero=ingreso.nextInt();
//
//            if (numero%2!=0){
//                contadorImpares = ++ contadorImpares;
//
////                if(contadorImpares==0){
////                    producto = contadorImpares*numero;
////                }else{
//                    producto=producto*numero;
////                }
//                System.out.println("el numero ingresado fue: " + numero + " el producto fue " + producto + " CI " + contadorImpares);
//            }
//
//        }


//Sumar todos los impares uq existan del 1 al 20
//        long producto =1;
//
//        for(int i=1; i<=20;i++){
//
//            if (i%2!=0){
//                producto=producto*i;
//                System.out.println("ene " +i + " epe " + producto);
//            }
//
//        }

        //Calcular factorial de un numero
//        int numero;
//        int resultado = 1;
//
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Digite el numero");
//        numero= entrada.nextInt();
//
//        for(int i=1; i<=numero;i++){
//
//            resultado = i * resultado;
//            System.out.println("avance" + resultado);
//
//        }

//        LLenar arreglo
//        int [] numero = {5,8,9,7};
//
////        int [] numero = new int[3];
////
////        numero[0]=6;
////        numero[1]=4;
////        numero[2]=7;
//
////        System.out.println(numero[0]);
//
//        for (int i=0; i<=3;i++){
//            System.out.println(numero[i]);
//        }

//        Cargar un arreglo con n cantidad de elemntos ingresando cada uno
//        int numero=1;
//
//        Scanner entrada = new Scanner(System.in);
//        Scanner caracteres = new Scanner(System.in);
//
//        System.out.println("Digite el numero de elementos");
//        numero= entrada.nextInt();
//        System.out.println(numero);
//
//        char [] letras= new char[numero];
//
//
//
//        for (int i=0; i<numero;i++){
//        System.out.println(i+"Digite el caracter");
//        letras [i]= caracteres.next().charAt(0);
//        }
//
//        for (int i=0; i<numero;i++){
//            System.out.println(letras[i]);
//        }

//       for normal vs for each
//        String[] nombres= {"juan", "pedro", "pablo","timoteo", "filemon", "ala", "sape", "peluca"};
//
//        for normal
//        for (int i=0; i< nombres.length;i++){
//            System.out.println((i+1) + nombres[i]);
//        }
//
//        for each
//        for (String i: nombres ){
//            System.out.println(i);
//        }


//        Crear y llenar array para imprimirlo a la inversa
//        String[] nombres= new String[5];
//
//        Scanner entrada = new Scanner(System.in);
//
//        for (int i=0; i< nombres.length;i++){
//            System.out.println("Ingrese valores");
//            nombres [i]= entrada.next();
//        }
//
//        for (int i=nombres.length; i> 0;i--){
//            System.out.println(i);
//        }


//        Pedir 5 numeros, calcular media de positivos, media de negativos y conteo de cero, imprimir matriz tmb
//        Double[] nombres= new Double[5];
//        int cuentaPositivos=0;
//        int cuentaNegativos=0;
//        int cuentaCeros=0;
//        double sumaPositivos=0;
//        double sumaNegativos=0;
//        double promedioPositivos=0;
//        double promedioNegativos=0;
//
//        Scanner entrada = new Scanner(System.in);
//
//        for (int i=0; i< nombres.length;i++){
//            System.out.println("Ingrese valores");
//            nombres [i]= Double.valueOf(entrada.next());
//
//            if (nombres [i] > 0){
//                cuentaPositivos++;
//                sumaPositivos += nombres[i];
//                promedioPositivos = sumaPositivos/cuentaPositivos;
//                System.out.println(cuentaPositivos);
//            }
//
//            if (nombres [i] == 0){
//                cuentaCeros++;
//            }
//
//            if (nombres [i] < 0){
//                cuentaNegativos++;
//                sumaNegativos += nombres[i];
//                promedioNegativos = sumaNegativos/cuentaNegativos;
//                System.out.println(cuentaPositivos);
//            }
//        }
//
//        for (int i=0; i< nombres.length;i++){
//            System.out.println(nombres[i]);
//        }
//
//        System.out.println("El promedio de los positivos es " + promedioPositivos + " .El promedio de los negativos es " + promedioNegativos + " .El conteo de los ceros es: " + cuentaCeros);

//        CREAR 2 MATRICES Y CONCATENAR LOAS VALORES DE DICHAS MATRICES EN UNA TERCERA TIPO TEXTO
//        int [] ma1= new int [10];
//        int [] ma2= new int [10];
//        String [] ma3= new String [10];
//
//        Scanner enMa1 = new Scanner(System.in);
//        Scanner enMa2 = new Scanner(System.in);
//
//        for (int i=0; i< ma1.length;i++){
//            System.out.println("Ingrese valores matriz 1");
//            ma1 [i]= enMa1.nextInt();
//        }
//
//        for (int i=0; i< ma2.length;i++){
//            System.out.println("Ingrese valores matriz 2");
//            ma2 [i]= enMa2.nextInt();
//        }
//
//        for (int i=0; i< ma3.length;i++){
//            ma3 [i]= Integer.toString(ma1[i]) + Integer.toString(ma2[i]);
//        }
//
//        for (int i=0; i< ma1.length;i++){
//            System.out.println(ma1[i]);
//        }
//
//        for (int i=0; i< ma2.length;i++){
//            System.out.println(ma2[i]);
//        }
//
//        for (int i=0; i< ma3.length;i++){
//            System.out.println(ma3[i]);
//        }



//        unir elementos de 2 matrices en 1 sola. ordenarlo 1 del 1ma y 2 de 2ma
//        int [] ma1= new int [10];
//        int [] ma2= new int [10];
//        int [] ma3= new int [ma1.length+ma2.length];
//
//        Scanner enMa1 = new Scanner(System.in);
//        Scanner enMa2 = new Scanner(System.in);
//
//        for (int i=0; i< ma1.length;i++){
//            System.out.println("Ingrese valores matriz 1");
//            ma1 [i]= enMa1.nextInt();
//        }
//
//        for (int i=0; i< ma2.length;i++){
//            System.out.println("Ingrese valores matriz 2");
//            ma2 [i]= enMa2.nextInt();
//        }
//
////        for (int i=0; i< ma3.length;i++){
////            ma3 [i]= ma1[i] + ma2[i];
////        }
//
//        for (int i=0; i< ma1.length;i++){
//            System.out.println(ma1[i]);
//        }
//
//        for (int i=0; i< ma2.length;i++){
//            System.out.println(ma2[i]);
//        }
//
//
//        int j=0;
//        for (int i=0; i< ma1.length;i++){
//            ma3[j] = ma1 [i];
//            j++;
//            ma3[j] = ma2 [i];
//            j++;
//        }
//
//        for (int l=0; l< ma3.length;l++){
//            System.out.println(ma3[l]);
//        }


//Matriz dettalada general
//        int [][] matriz = {{1,2},{4,5}};

//Matriz detallada valor por valor
//        int [][] matriz = new int [2][2];
//
//        matriz[0][0] = 1;
//        matriz[0][1] = 2;
//        matriz[1][0] = 4;
//        matriz[1][1] = 5;

//        Crear matriz
//        int matriz [][],nF, nC;
//
//        Scanner enMa1 = new Scanner(System.in);
//
//        System.out.println("Digite filas");
//        nF= enMa1.nextInt();
//        System.out.println("Digite columnas");
//        nC= enMa1.nextInt();
//
//        matriz = new int [nF][nC];
//
//        System.out.println("Digite la matriz de " + matriz.length + " filas. Y " + matriz[0].length + " columnas." );
//        for (int i=0; i< matriz.length;i++){
//            for (int j=0; j<matriz[0].length;j++){
//                System.out.print(" ["+i+"] "+" ["+j+"] ");
//                matriz[i][j] = enMa1.nextInt();
//            }
//        }
//
//
//        for (int i=0; i< matriz.length;i++){
//            for (int j=0; j<matriz[0].length;j++){
//                System.out.print("[" + matriz[i][j] + "]");
//            }
//            System.out.println("");
//        }

    }
}