package fr.eni.ecole.geography.application;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

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
		
	}
	
}
