package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {

        // Création des objets DAO et Métier
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();

        // Injection statique via setter
        metier.setDao(dao);

        // Calcul et affichage du résultat
        System.out.println("Résultat = " + metier.calcul());
    }
}