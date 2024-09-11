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
    }
}