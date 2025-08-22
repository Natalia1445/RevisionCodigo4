package com.generation; 
// El ejercicio consiste en el clásico juego de papel, piedra y tijeras, de uno a uno, donde la persona
// ganadora se puede determinar mediante casos 
// 1. Papel gana a piedra
// 2. Tijeras gana a papel
// 3. Piedra gana a Tijeras
// Por ello se realizan los inpts o entradas de cada jugador
// Y el ganador se determina mediante los casos 1) Empate 2) Los distintos casos 1,2,3
// Al final e imprime la respuesta de quién es el ganador jugador 1 o "jugador 2"
import java.util.Scanner; //Se importa java.util.Scanner

public class Codigo4 {
	public static void main(String[] args) { //Se agrega main

    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    Scanner sc = new Scanner(System.in); //Se crea correctamente el scanner
    String j1 = sc.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    String j2 = sc.nextLine(); //s2 es el elemento a escanear
    
    if (j1.equals(j2)) { //Se elimina doble igual por un equals más apropiado
      System.out.println("Empate");
    } //if 
    else {
      int g = 0; //Se define pero aún no se le asigna un  valor 
      
      switch (j1) {
      case "piedra": 
          if (j2.equals("tijeras")) {
              g = 1; // piedra gana a tijeras
          } else if (j2.equals("papel")) {
              g = 2; // papel gana a piedra
          }
          break;
      
      case "papel": 
          if (j2.equals("piedra")) {
              g = 1; // papel gana a piedra
          } else if (j2.equals("tijeras")) {
              g = 2; // tijeras gana a papel
          }
          break;
      
      case "tijeras": 
          if (j2.equals("papel")) {
              g = 1; // tijeras gana a papel
          } else if (j2.equals("piedra")) {
              g = 2; // piedra gana a tijeras
          }
          break;
      
      default: 
          System.out.println("Entrada no válida");
          break;
      
  }
      System.out.println("Gana el jugador " + g);
      
    
    }//else
    sc.close();

	}//main
  
}//class codigo 4
