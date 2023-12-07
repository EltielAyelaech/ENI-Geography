package fr.eni.ecole.geography.application;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.HashMap;
import java.util.Map;

import fr.eni.ecole.geography.bo.HeadOfState;
import fr.eni.ecole.geography.bo.Country;

public class GeographicalObserver {
	public static void main(String[] args) {
		// source : Wikipedia (dec. 2022)
		Country bouthan = new Country("Bouthan", 38394, 782.318f);
		Country capVert = new Country("Cap-Vert", 4033, 583.255f);
		Country chypre = new Country("Chypre" , 9251, 1266.676f);
		Country japon = new Country("Japon" , 377975 , 125104.000f);
		Country lettonie = new Country("Lettonie", 64559 , 1907.675f);

		HeadOfState bouthanHeadOfState = new HeadOfState("igme Khesar Wangchuck", "Roi" , LocalDate.of(2008,  Month.NOVEMBER, 6));
		HeadOfState capVertHeadOfState = new HeadOfState("José Maria Neves", "Président", LocalDate.of(2021, Month.NOVEMBER, 9));
		HeadOfState chypreHeadOfState = new HeadOfState("Níkos Anastasiádis", "Président", LocalDate.of(2013, Month.FEBRUARY, 28));
		HeadOfState japonHeadOfState = new HeadOfState("Naruhito", "Empereur", LocalDate.of(2019, Month.OCTOBER, 22) );
		HeadOfState lettonieHeadOfState = new HeadOfState("Egils Levits", "Président", LocalDate.of(2019, Month.JULY, 8));
		
		Country atlantide = new Country("Atlantide", 10235 , 50.000f);
		Country mordor = new Country("Mordor", 666666, 666.000f);
		
		HeadOfState atlantideHeadOfState = new HeadOfState("Atlas", "Roi", LocalDate.of(Year.MIN_VALUE, Month.JANUARY , 1));
		HeadOfState mordorHeadOfState = new HeadOfState("Sauron", "Seigneur", null);
		// *** NE RIEN MODIFIER AU-DESSUS DE CETTE LIGNE  *** //
		
        System.out.println("\033[2m1. Déclarez une variable paysFictifs de type Map<ChefEtat, Pays>\033[0m");
        System.out.println("\033[2m2. Valorisez-la avec une instance de HashMap\033[0m");
        Map<HeadOfState, Country> fictiveCountries = new HashMap<HeadOfState, Country>();

        System.out.println("\033[2m3. Ajoutez-y le Mordor et l’Atlantide\033[0m");
        fictiveCountries.put(atlantideHeadOfState, atlantide);
        fictiveCountries.put(mordorHeadOfState, mordor);

        System.out.println("\033[2m4. A l’aide d’une boucle « for each », affichez les informations de toutes les entrées de\033[0m");
        System.out.println("\033[2m   paysFictifs  sur la console de sortie standard.\033[0m");
        System.out.println("\033[2m   Indice : le type de la variable d’itération de la boucle est\033[0m");
        System.out.println("\033[2m   Map.Entry<ChefEtat, Pays>\033[0m");
        fictiveCountries.forEach((HeadOfState hos, Country c) -> System.out.printf("Head of state: %s; Country: %s\n", hos, c));

        System.out.println("\033[2m5. Créez un 2e dictionnaire de recensement des pays et de leur chef d’état qui\033[0m");
        System.out.println("\033[2m   contient les pays réels, et affectez-le à une variable paysReels.\033[0m");
        Map<HeadOfState, Country> realCountries = new HashMap<HeadOfState, Country>() {{
            put(bouthanHeadOfState, bouthan);
            put(capVertHeadOfState, capVert);
            put(chypreHeadOfState, chypre);
            put(japonHeadOfState, japon);
            put(lettonieHeadOfState, lettonie);
        }};

        System.out.println("\033[2m6. Affichez paysReels sur la console de sortie standard.\033[0m");
        realCountries.forEach((HeadOfState hos, Country c) -> System.out.printf("Head of state: %s; Country: %s\n", hos, c));

        System.out.println("\033[2m7. En une seule instruction, ajoutez les pays fictifs à paysReels\033[0m");
        realCountries.putAll(fictiveCountries);

        System.out.println("\033[2m8. Affichez paysReels sur la console de sortie standard.\033[0m");
        realCountries.forEach((HeadOfState hos, Country c) -> System.out.printf("Head of state: %s; Country: %s\n", hos, c));

        System.out.println("\033[2m9. Afficher le pays dont le roi est Naruhito.\033[0m");
        System.out.println(
            realCountries
                .entrySet()
                .stream()
                .filter(x -> x.getKey().getName().equals("Naruhito"))
                .findFirst()
                .get()
                .getValue()
        );
    
        System.out.println("\033[2m10.  Dans paysFictifs, supprimez l’entrée dont le chef d’état est Atlas\033[0m");
        fictiveCountries.remove(
            fictiveCountries
                .entrySet()
                .stream()
                .filter(x -> x.getKey().getName().equals("Atlas"))
                .findFirst()
                .get()
                .getKey()
        );

        System.out.println("\033[2m11. Affichez paysReels sur la console de sortie standard.\033[0m");
        realCountries.forEach((HeadOfState hos, Country c) -> System.out.printf("Head of state: %s; Country: %s\n", hos, c));

        System.out.println("\033[2m12. Affichez paysFictifs sur la console de sortie standard.\033[0m");
        fictiveCountries.forEach((HeadOfState hos, Country c) -> System.out.printf("Head of state: %s; Country: %s\n", hos, c));

        System.out.println("\033[2m13.  Modifier la population du Mordor\033[0m");
        mordor.setPopulation(42069);

        System.out.println("\033[2m14.  Affichez paysFictifs sur la console de sortie standard.\033[0m");
        fictiveCountries.forEach((HeadOfState hos, Country c) -> System.out.printf("Head of state: %s; Country: %s\n", hos, c));

        System.out.println("\033[2m15.  Affichez paysReels sur la console de sortie standard.\033[0m");
        realCountries.forEach((HeadOfState hos, Country c) -> System.out.printf("Head of state: %s; Country: %s\n", hos, c));

        System.out.println("\033[2m16.  Affichez les chefs d’état de paysReels sur la console de sortie standard. \033[0m");
        realCountries.forEach((HeadOfState hos, Country c) -> System.out.println(hos));

        System.out.println("\033[2m17.  Affichez les pays de paysReels sur la console de sortie standard.\033[0m");
        realCountries.forEach((HeadOfState hos, Country c) -> System.out.println(c));
	}
}
