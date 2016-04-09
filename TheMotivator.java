public class TheMotivator {
	private ArrayList<String> events = new ArrayList<String>();
	public void thoughtForTheDay (int score) {
		System.out.println("Some new thoughts!");
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("Well, what can I say?");
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.upcomingEvents();
		tm.thoughtForTheDay(100);
		tm.createEvents();
	}
	public void upcomingEvents(){
		System.out.println("Kind of header for the the motivator");
		for (String event:events)
		 System.out.println("Party blabla");
	}
}


