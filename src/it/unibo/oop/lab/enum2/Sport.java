/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

	BASKET(Place.INDOOR, 5, "Basket"),
	BIKE(Place.OUTDOOR, 1, "Bike"),
	F1(Place.OUTDOOR, 1, "Formula 1"),
	MOTOGP(Place.OUTDOOR, 1, "MotoGP"),
	SOCCER(Place.OUTDOOR, 11, "Soccer"),
	TENNIS(Place.OUTDOOR, 1, "Tennis"),
	VOLLEY(Place.INDOOR, 6, "Volleyball");
	
	private final Place place;
	private final int noTeamMembers;
	private final String actualName;

	
	private Sport(final Place place, final int noTeamMembers, final String actualName) {
		this.place = place;
		this.noTeamMembers = noTeamMembers;
		this.actualName = actualName;
	}
	
	public boolean isIndividualSport() {
		return this.noTeamMembers == 1;
	}
	
	public boolean isIndoorSport() {
		return this.place == Place.INDOOR;
	}
	
	public Place getPlace() {
		return this.place;
	}
	
	public String toString() {
		return this.actualName + " [place: "
							   + this.place
							   + " - team members: "
							   + this.noTeamMembers
							   + "]";
	}
}
