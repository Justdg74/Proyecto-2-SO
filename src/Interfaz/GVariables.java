/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

/**
 *
 * @author alexi
 */


import Clases.Character;
import Clases.Saga;
import EDD.Lista;

public class GVariables {
    private static String[] starTrek={"Archer", "BorgCat", "Burnham", "Enterprise", "Gul", "Janeway", "Jean-Luc", "Kirk", "LiveLong", "Mccoy", "Panel", "Pike", "Riker", "Sarek", "Scott", "Sisko", "Spock", "StarTrek", "UnicornDog", "Worf"} ;
    private static String[] starWars={"Ahsoka", "BB8", "BobaFett", "C3PO", "Chewbacca1", "Chewbacca2", "DarthVader", "Grivous", "HanSolo", "Leia", "Luke", "Mando1", "Mando2", "Mando3", "Maul", "ObiWan", "Qui-Gon", "R2D2", "Windu", "Yoda"};
    
    private static String[] objetos={"Sable","Pistola","Escudo","Planeador","Armadura","Abanicos","Gorra de Camionero","Cafe","Sandwich de la Muerte","Collar de Katara"};
  
    private static Saga SStarTrek;
    private static Saga SStarWars;
    
    private static Lista ganadores=new Lista();

    public static String[] getStarTrek() {
        return starTrek;
    }

    public static void setStarTrek(String[] starTrek) {
        GVariables.starTrek = starTrek;
    }

    public static String[] getStarWars() {
        return starWars;
    }

    public static void setStarWars(String[] starWars) {
        GVariables.starWars = starWars;
    }

    public static String[] getObjetos() {
        return objetos;
    }

    public static void setObjetos(String[] objetos) {
        GVariables.objetos = objetos;
    }

    public static Saga getSStarTrek() {
        return SStarTrek;
    }

    public static void setSStarTrek(Saga SStarTrek) {
        GVariables.SStarTrek = SStarTrek;
    }

    public static Saga getSStarWars() {
        return SStarWars;
    }

    public static void setSStarWars(Saga SStarWars) {
        GVariables.SStarWars = SStarWars;
    }

    public static Lista getGanadores() {
        return ganadores;
    }

    public static void setGanadores(Lista ganadores) {
        GVariables.ganadores = ganadores;
    }
    
    
    
    
    
    
}

