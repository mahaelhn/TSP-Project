package tsp;

import java.util.LinkedList;

/*create our main method, add our cities and 
 * evolve a route for our travelling salesman problem.*/

public class TSP_GA {

	public static void main(String[] args) {

		LinkedList<Set> ll = new LinkedList<Set>();
		ll = UtilFile.getData("towns.csv", ",");
		
		//System.out.println(ll.size());
	    //System.out.println(ll.get(0).x +" || "+ ll.get(0).y);
	
		int nbCities = 48;//Number of cities
		
		/*
		for(int i=0; i <nbCities; i++)
		{
			Set mySet = new Set(ll.get(i).x, ll.get(i).y);
			ll.add(mySet);
		}
		*/
		
		
		for(int i=0; i <nbCities; i++)
		{
			 City city = new City(ll.get(i).x, ll.get(i).y);
			  TourManager.addCity(city);
		}
		
		
		
		
		
		
		
		
        // Create and add our cities
     /*   City city = new City(60, 200);
        TourManager.addCity(city);
        City city2 = new City(180, 200);
        TourManager.addCity(city2);
        City city3 = new City(80, 180);
        TourManager.addCity(city3);
        City city4 = new City(140, 180);
        TourManager.addCity(city4);
        City city5 = new City(20, 160);
        TourManager.addCity(city5);
        City city6 = new City(100, 160);
        TourManager.addCity(city6);
        City city7 = new City(200, 160);
        TourManager.addCity(city7);
        City city8 = new City(140, 140);
        TourManager.addCity(city8);
        City city9 = new City(40, 120);
        TourManager.addCity(city9);
        City city10 = new City(100, 120);
        TourManager.addCity(city10);
        City city11 = new City(180, 100);
        TourManager.addCity(city11);
        City city12 = new City(60, 80);
        TourManager.addCity(city12);
        City city13 = new City(120, 80);
        TourManager.addCity(city13);
        City city14 = new City(180, 60);
        TourManager.addCity(city14);
        City city15 = new City(20, 40);
        TourManager.addCity(city15);
        City city16 = new City(100, 40);
        TourManager.addCity(city16);
        City city17 = new City(200, 40);
        TourManager.addCity(city17);
        City city18 = new City(20, 20);
        TourManager.addCity(city18);
        City city19 = new City(60, 20);
        TourManager.addCity(city19);
        City city20 = new City(160, 20);
        TourManager.addCity(city20);*/

        // Initialize population
        Population pop = new Population(48, true);
        System.out.println("Initial distance: " + pop.getFittest().getDistance());

      // Evolve population for 100 generations
        pop = GA.evolvePopulation(pop);
        for (int i = 0; i < 100; i++) {
            pop = GA.evolvePopulation(pop);
        }

        // Print final results
        System.out.println("Finished");
        System.out.println("Final distance: " + pop.getFittest().getDistance());
        System.out.println("Solution:");
        System.out.println(pop.getFittest());
    }
}
