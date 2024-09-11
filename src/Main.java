import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


        /*tablica musi miec z gory okreslony rozmiar nie mozna go
         pozniej zmienic elementem tablicy moga byc typy proste i zlozone
         tablica z wartosciami zlozonymi od 1 do 100
         */

        int [] tablicaliczblosowych = new int[6];
        for (int i = 0; i < tablicaliczblosowych.length; i++) {
            tablicaliczblosowych[i] = (int) (Math.random()*100+1);
        }
            //wypisywanieelementowtablicy
        for (int element:tablicaliczblosowych) {
            System.out.println(element+", ");
        }
        //kolekcje nie musza miec odrazu rozmiaru moze sie zmieniac
        //listy list zbiory set i mapy

        // twworzenie listy z klawiatury do kolekcji
        ArrayList<Integer> liczbaliczbpisanych = new ArrayList<>();
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("podaj 6 liczb");
        for (int i = 0; i < 6; i++) {
            int liczba = klawiatura.nextInt();
            liczbaliczbpisanych.add(liczba);
        }
        System.out.println("wstawiono liczby: ");
        for (Integer liczba:liczbaliczbpisanych) {
            System.out.println(liczba);
        }
        for (int i = 0; i < liczbaliczbpisanych.size(); i++) {
            System.out.println(liczbaliczbpisanych.get(i));
        }
    }
}