package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Osoba> listaOsob = new ArrayList<Osoba>();
    public static void main(String[] args) {
	// osoby ...
     Osoba osoba1 = new Osoba("Jan", "Kowalski", "1980-11-02", new Adres("Poznań", "ul. Szklista 12", "60-111"));
     Osoba osoba2 = new Osoba("Anna", "Zamojska", "1988-03-02");
     Osoba osoba3 = new Osoba("Janina", "Kot", "1988-04-02");
     Osoba osoba4 = new Osoba("Antoni", "Robak", "1995-12-02");
     listaOsob.add(osoba1);
     listaOsob.add(osoba2);
     listaOsob.add(osoba3);
     listaOsob.add(osoba4);
        System.out.println(osoba1.getImię());
      boolean czyUdałoSię = osoba1.setNazwisko("Mickiewcz!");
      if (!czyUdałoSię)
          System.out.println("Nie udało się zmienić nazwiska");
     for(Osoba osX : listaOsob)
        System.out.println(osX.toString());
     for(int i = 0; i < listaOsob.size(); i++)
         System.out.println(listaOsob.get(i).toString());
    }
}
