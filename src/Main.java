import java.util.*;

public class Main {
    public static <hashSet> void main(String[] args) {

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
        //wypisywanie liczb bez powtorzen
        ArrayList<Integer>tablicalosowychbezpowtorzen = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int liczba = (int) (Math.random()*100+1);
            while (liczbaliczbpisanych.contains(liczba)) {
                liczba = (int) (Math.random()*100+1);
            }
            tablicalosowychbezpowtorzen.add(liczba);
        }
        System.out.println("wylosowane liczby:");
        System.out.println(tablicalosowychbezpowtorzen);
        //los bez powtorzen do zbioru
        HashSet<Integer> zbior = new HashSet<>();
        while (zbior.size()<6) {
            int liczba = (int) (Math.random()*10+1);
            zbior.add(liczba);
        }
        System.out.println(zbior);
        LinkedList<Integer> trafione = new LinkedList<>();
        for (Integer wpisana: liczbaliczbpisanych) {
            if(zbior.contains(wpisana)){
                trafione.add(wpisana);
            }
        }
        System.out.println("trafione" + trafione);
    }
    //metody

    /**
     * Metoda wylosujLiczby losuje liczby calkowite z zakresu 1 do 100
     * @param ile - liczba całkowita przechowująca ile liczb wylosujemy
     * @return lista z wylosowanymi liczbami
     */
    private static ArrayList<Integer> wylosujLiczby(int ile){
        ArrayList<Integer>listaLosowychBezPowtorzen =new ArrayList<>();
        for (int i = 0; i < ile; i++) {
            int liczba = (int)(Math.random()*100+1);
            while(listaLosowychBezPowtorzen.contains(liczba)){
                liczba= (int)(Math.random()*100+1);
            }
            listaLosowychBezPowtorzen.add(liczba);
        }
        return listaLosowychBezPowtorzen;
    }

    private static ArrayList<Integer> wpiszLiczbyZKlawiatury(int ile){
        ArrayList<Integer> listaLiczbWpisanych = new ArrayList<>();
        System.out.println("podaj "+ile+" liczb");
        Scanner klawiatura = new Scanner(System.in);
        for (int i = 0; i < ile; i++) {
            int liczba = klawiatura.nextInt();
            listaLiczbWpisanych.add(liczba);
        }
        return listaLiczbWpisanych;
    }
    private static void wypiszKolekcję(List<Integer> listaDoWypisania){
        for (Integer element:listaDoWypisania) {
            System.out.println("Element:"+element);
        }
    }
    private static LinkedList<Integer> zwrocTrafione(ArrayList<Integer> listaLiczbWpisanych,
                                              ArrayList<Integer>listaLiczbLosowych){
        LinkedList<Integer> trafione =new LinkedList<>();
        //trafiione to elementy które występują w wylosowanych i wpisanych
        for (Integer wpisana: listaLiczbWpisanych) {
            if(listaLiczbLosowych.contains(wpisana)){
                trafione.add(wpisana);
            }
        }
        return trafione;
        public static void main(String[]args){
            ArrayList<Integer> losowe = wylosujLiczby(6);
            System.out.println("wylosowana lista");
            wypiszKolekcję(losowe);
            ArrayList<Integer> wpisane = wpiszLiczbyZKlawiatury(6);
            wypiszKolekcję(wpisane);
            LinkedList<Integer> trafione = zwrocTrafione(losowe, wpisane);
            wypiszKolekcję(trafione);

        }
    }


}
