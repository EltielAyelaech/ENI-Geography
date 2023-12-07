package fr.eni.ecole.geography.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class HeadOfState {
	
	private String name;
	private String title;
	private LocalDate rulingStart;
	
	public HeadOfState(String name, String title, LocalDate rulingStart) {
		this.name = name;
		this.title = title;
		this.rulingStart = rulingStart;
	}

	public String getName() {
		return name;
	}

	public LocalDate getRulingStart() {
		return rulingStart;
	}
	
	
	public String getTitle() {
		return title;
	}

	public String toString() {
		String resultat = "";
		
		if ( getTitle() != null ) {
			resultat += getTitle()+" ";
		}
		
		resultat += getName();
		
		if (getRulingStart() != null) {
			resultat += " (depuis ";
			resultat += getRulingStart().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
			resultat+= ")";
		}
			
		return resultat;
	}
	

	
}
