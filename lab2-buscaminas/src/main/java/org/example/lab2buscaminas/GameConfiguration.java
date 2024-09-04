package org.example.lab2buscaminas;

import java.util.Arrays;

public class GameConfiguration {
    public void colocarPosicionesBombasEnArreglo(String posiciones, int[][] posicionesBombasArray) {
        String[] palabras = posiciones.split(" ");
        System.out.println(Arrays.toString(palabras));
        for(int i = 0; i < palabras.length; i++){
            String[] numeros = palabras[i].replace("(","").replace(")","").split(",");
            posicionesBombasArray[i][0] = Integer.parseInt(numeros[0])-1;
            posicionesBombasArray[i][1] = Integer.parseInt(numeros[1])-1;
        }
    }

    public void colocarBombasEnArregloInt(int[][][] bombasInt, int[][] posicionesBombasArray) {
        llenarArarregloDe0(bombasInt,0); //mandamos el 0 para indicar que vamos a llenar de 0 el arreglo de bombas
        for(int i = 0; i<posicionesBombasArray.length; i++){
            bombasInt[0][posicionesBombasArray[i][0]][posicionesBombasArray[i][1]]=1;
        }
    }

    public void llenarArarregloDe0(int[][][] bombasInt,int n) {
        for(int i=0;i<bombasInt.length;i++){
            for(int j=0;j<bombasInt[0].length;j++){
                bombasInt[n][i][j] = 0; //cuando n=1: parcelas, cuando n=0: bombas
            }
        }
    }



    public boolean explotarParcela(int[][][] casillas, String[] posicionesStr) {

        boolean hayBomba=false;

        //si hay bomba en la parcela, cambia a estado 1 (celda rosada)
        if(casillas[0][Integer.parseInt(posicionesStr[0])-1][Integer.parseInt(posicionesStr[1])-1] ==1){
            casillas[1][Integer.parseInt(posicionesStr[0])-1][Integer.parseInt(posicionesStr[1])-1] = 1;
            hayBomba=true;
        }else{//si no hay bomba en la parcela, cambia a estado 2 (celda verde)
            casillas[1][Integer.parseInt(posicionesStr[0])-1][Integer.parseInt(posicionesStr[1])-1] = 2;
        }
        return hayBomba;
    }

    public void llenarCantidadDeBombasAlRededor(int[][][] casillas) {

        //llenamos arreglo casillas[2][i][j] con cantidad de bombas al rededor de cada celda
        for(int i=0; i<casillas.length; i++){
            for(int j=0; j<casillas[i].length; j++){



            }
        }

    }
}
