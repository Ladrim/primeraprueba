package cosas;// Created by jhant on 12/10/2023.

public class Main
{
    public static void main(String...args)
    {
        Persona elviejo = new Persona("viejo", "434343P");
        Persona bol = new Persona("bolichastico", "128832321P");

        bol.setPadre(elviejo);
        bol.getNombre();


        System.out.println(bol);
    }
}
