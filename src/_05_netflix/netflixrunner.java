package _05_netflix;

public class netflixrunner {
public static void main(String[] args) {
	Movie HighRiseInvasion=new Movie("High Rise Invasion",7);
	Movie SpaceSweepers=new Movie("Space Sweepers",6);
	Movie BehindHerEyes=new Movie("Behind Her Eyes",7);
	Movie Parasyte=new Movie("Parasyte",8);
	Movie Erased=new Movie("Erased",8);
	
	
	System.out.println(HighRiseInvasion.getTicketPrice());
    System.out.println(	SpaceSweepers.getTicketPrice());
	System.out.println(BehindHerEyes.getTicketPrice());
	System.out.println(Parasyte.getTicketPrice());
	System.out.println(Erased.getTicketPrice());
	
	NetflixQueue netflix=new NetflixQueue();
	netflix.addMovie(HighRiseInvasion);
	netflix.addMovie(SpaceSweepers);
	netflix.addMovie(BehindHerEyes);
	netflix.addMovie(Parasyte);
	netflix.addMovie(Erased);
	
	netflix.printMovies();
	netflix.sortMoviesByRating();
	System.out.println(netflix.getBestMovie());
	System.out.println(netflix.getMovie(1));
	
}
}
