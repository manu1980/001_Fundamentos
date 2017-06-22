/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.fundamentos;

/**
 *
 * @author Manu
 */
public class Fundamentos {
    /*TIPOS DE DATOS PRIMITIVOS
     Todos los tipo primitivos aunque no inicialices tienen una inicialización por defecto*/

    byte bite;//numero entero -128 a 127
    short corto = 32767;//numero entero mayor que byte
    int numero = 2_147_483_647; //numero entero mayor que short
    long largo = 9_223_372_036_854_775_807L;//numero entero mayor que int

    float flotante;//decimal
    double decimal;//decimal mayor capacidad que float

    char caracter = 'a'; //caracter
    boolean esVerdadero;//Verdadero o falso

    //TIPO STRING --> Cadena de caracteres  inicializacion por defecto es null (vacío) porque es un punero a memoria;
    static String nombre = "Manu";

    //FORMAS DE DECLARAR UNA VARIABLE
    int a, b, c;       //solo el tipo en la primera variable
    int d, e, f = 0;//Sólo la f está inicializada
    static float g = 16.05021579F;//con F
    float h = 16.0f;//con F
    static long iban = 1021_2536_2222_3333L;//se utiliza para que sea mas legible pero es como si no existiera la _ ni L 1021253622223333

    final int edad;

    /*OPERADORES ARITMETICOS
     +  Calcula la suma
     -  calcula la resta
     *  calcula l amultiplicacion
     /   calcula la division
     %  calcula el resto
     */
    /*OPERADORES  DE RELACION
    < menor
    > mayor
    <= menor igual que
    >= mayor  igual que 
    !=  distinto
    == igual
     */
    
    /*OPERADORES LOGICOS
    &&  el primer operando es falso el siguiente no se evalua
    & se evaluan los dos
    ||  si el primer operando es cierto el siguiente no se evalua
    |
    ! not
    ^ xor true y false=true,  true y true=false,  false y false=false
    ~
    -
    
     */
    public Fundamentos() {
        edad = 34;
    }

    public static void main(String[] args) {
        System.out.println(nombre);
        System.out.println(iban);

        //CONSTANTE del metodo main
        final String name = "Manu Alonso";

    }

}
