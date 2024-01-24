package com.cdmg_tapas.features;

import com.cdmg_tapas.features.tapas.domain.Tapa;
import com.cdmg_tapas.features.tapas.presentation.MainTapas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Bienvenido a la aplicacion Avila-Tapas");
        System.out.println(" ");
        System.out.println("¿Que operacion quieres realizar? Introduce el numero de la operacion que corresponde.");
        System.out.println("1. Ver todas las tapas.");
        System.out.println("2. Ver una tapa en concreto.");
        System.out.println("3. Borrar una tapa.");
        System.out.println("4. Añadir una tapa nueva.");
        System.out.println("5. Actualizar una tapa.");

        String opcion = sc.nextLine();

        switch (opcion){
            case "1":

                MainTapas.prtintTapas();

                break;
            case "2":
                System.out.println("Introduce el ID de la tapa que quieres VER: ");
                String id = sc.nextLine();

                MainTapas.printTapa(id);

                break;

            case "3":
                MainTapas.prtintTapas();

                System.out.println("Introduce el ID de la tapa que quieres BORRAR: ");
                String idDel = sc.nextLine();

                MainTapas.deleteTapa(idDel);

                System.out.println("La tapa con ID " + idDel + " ha sido borrada" );

                break;

            case "4":
                System.out.println("Introduce el ID de la tapa que quieres Crear: ");
                String idCreate = sc.nextLine();
                System.out.println("Introduce el Nombre de la tapa que quieres Crear: ");
                String name = sc.nextLine();
                System.out.println("Introduce los Participantes de la tapa que quieres Crear: ");
                String part = sc.nextLine();
                System.out.println("Introduce los Puntos Totales de la tapa que quieres Crear: ");
                String totalP = sc.nextLine();
                System.out.println("Introduce los Votos de la tapa que quieres Crear: ");
                String votes = sc.nextLine();
                System.out.println("Introduce los Ingredientes de la tapa que quieres Crear: ");
                String ingredients = sc.nextLine();

                MainTapas.createTapa(new Tapa(idCreate,name,part,totalP,votes,ingredients));

                System.out.println("Se ha creado la tapa con ID " + idCreate);

                MainTapas.prtintTapas();

                break;

            case "5":
                System.out.println("Introduce el ID de la tapa que quieres MODIFICAR: ");
                String idMod = sc.nextLine();

                System.out.println("Introduce la modificaion del Nombre de la tapa que quieres Crear: ");
                String nameMod = sc.nextLine();
                System.out.println("Introduce la modificaion del los  Participantes de la tapa que quieres Crear: ");
                String partMod = sc.nextLine();
                System.out.println("Introduce la modificaion de Puntos Totales de la tapa que quieres Crear: ");
                String totalPMod = sc.nextLine();
                System.out.println("Introduce la modificaion de los Votos de la tapa que quieres Crear: ");
                String votesMod = sc.nextLine();
                System.out.println("Introduce la modificaion de los Ingredientes de la tapa que quieres Crear: ");
                String ingredientsMod = sc.nextLine();

                System.out.println("Se ha modificado tapa con ID " + idMod);

                MainTapas.createTapa(new Tapa(idMod,nameMod,partMod,totalPMod,votesMod,ingredientsMod));

                MainTapas.printTapa(idMod);

                break;


        }


    }
}