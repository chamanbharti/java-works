package hibernate5.simple;

import org.testng.annotations.Test;

import hibernate5.model.Person;
import hibernate5.model.Ranking;
import hibernate5.model.Skill;

public class ModelTest {

	@Test
	public void testModelCreation() {
		Person subject = new Person();
		subject.setName("Chaman Bharti");
		
		Person observer = new Person();
		observer.setName("Mamta Tripathy");
		
		Skill skill = new Skill();
		skill.setName("Java");
		
		Ranking ranking = new Ranking();
		ranking.setSubject(subject);
		ranking.setObserver(observer);
		ranking.setSkill(skill);
		ranking.setRanking(8);
		//just to give us visual verification
		System.out.println(ranking);
	}
}
