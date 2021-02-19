package java8.map.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//https://mkyong.com/java8/java-8-flatmap-example/
//www.java67.com/2016/03/how-to-use-flatmap-in-java-8-stream.html#ixzz6aNN3CgTH
public class MapVSFlatMap {

	public static void main(String[] args) {
		
		//step I
		List<String> teamIndia = Arrays.asList("Virat", "Dhoni", "Jadeja"); 
		List<String> teamAustralia = Arrays.asList("Warner", "Watson", "Smith"); 
		List<String> teamEngland = Arrays.asList("Alex", "Bell", "Broad"); 
		List<String> teamNewZeland = Arrays.asList("Kane", "Nathan", "Vettori"); 
		List<String> teamSouthAfrica = Arrays.asList("AB", "Amla", "Faf"); 
		List<String> teamWestIndies = Arrays.asList("Sammy", "Gayle", "Narine"); 
		List<String> teamSriLanka = Arrays.asList("Mahela", "Sanga", "Dilshan"); 
		List<String> teamPakistan = Arrays.asList("Misbah", "Afridi", "Shehzad"); 
		
		List<List<String>> playersInWorldCup2016 = new ArrayList<>(); 
		playersInWorldCup2016.add(teamIndia); 
		playersInWorldCup2016.add(teamAustralia); 
		playersInWorldCup2016.add(teamEngland); 
		playersInWorldCup2016.add(teamNewZeland); 
		playersInWorldCup2016.add(teamSouthAfrica); 
		playersInWorldCup2016.add(teamWestIndies); 
		playersInWorldCup2016.add(teamSriLanka); 
		playersInWorldCup2016.add(teamPakistan); 
		System.out.println(playersInWorldCup2016);
		
		// Let's print all players before Java 8 
		List<String> listOfAllPlayers = new ArrayList<>(); 
		for(List<String> team : playersInWorldCup2016){ 
			 for(String name : team){ 
				 listOfAllPlayers.add(name); 
			} 
		} 
		System.out.println("Players playing in world cup 2016"); 
		System.out.println(listOfAllPlayers); 
		// Now let's do this in Java 8 using FlatMap 
		List<String> flatMapList = playersInWorldCup2016 
				.stream()
				.flatMap(pList -> pList.stream())
				.collect(Collectors.toList()); 
		System.out.println("List of all Players using Java 8"); 
		System.out.println(flatMapList);

		// step II
		List<String> houseGryffindor = Arrays.asList("Albus", "Harry", "Ron", "Hermione");
        List<String> houseHufflepuff = Arrays.asList("Bridget", "Cedric", "Nymphadora");
        List<String> houseRavenclaw = Arrays.asList("Luna", "Garrick", "Filius");
        List<String> houseSlytherin = Arrays.asList("Severus", "Tom", "Phineas");
	    
        List<List<String>> hogwarts = new ArrayList<List<String>>(); 
        hogwarts.add(houseGryffindor);
        hogwarts.add(houseHufflepuff);
        hogwarts.add(houseRavenclaw);
        hogwarts.add(houseSlytherin);
        
        System.out.println(hogwarts);
        
     // Printing All Hogwarts Houses In Pre-Java8 World
        List<String> listOfAllHouses = new ArrayList<String>();
        for(List<String> house : hogwarts) {
            for(String hName : house) {
                listOfAllHouses.add(hName);
            }
        }
        System.out.println("<!---------------Hogwarts Houses without using Java 8---------------!>");
        System.out.println(listOfAllHouses);
 
      // Now let's Achieve This By Using 'flatMap()' Method In Java8 
        //List<String> flatMapList = hogwarts.stream().flatMap(hList -> hList.stream()).collect(Collectors.toList()); 
        List<String> flatMapList2 = hogwarts.stream().flatMap(hList -> hList.stream()).collect(Collectors.toList());
        System.out.println("<!---------------Hogwarts Houses Using Java8---------------!>"); 
        System.out.println(flatMapList2);
        
        
        // step III
        
		// Creating a list of Prime Numbers 
        List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13); 
          
        // Creating a list of Odd Numbers 
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5); 
          
        // Creating a list of Even Numbers 
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8); 
  
        List<List<Integer>> listOfListofInts = Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers); 
  
        System.out.println("The Structure before flattening is : " + listOfListofInts); 
          
        // Using flatMap for transformating and flattening. 
        List<Integer> listofInts  = listOfListofInts.stream() 
                                    .flatMap(list -> list.stream()) 
                                    .collect(Collectors.toList()); 
        System.out.println("The Structure after flattening is : " + listofInts);
        List<Integer>listofInts2 = listOfListofInts.stream()
        		.flatMap(list->list.stream())
        		.collect(Collectors.toList());
  
        System.out.println("The Structure after flattening is : " + listofInts2); 
    } 
}
