package Lab2;

/**
 * @author sam Kauffman
 * @Version 0.1
 *
 */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasketballTeam stats = new BasketballTeam();
		stats.setStats(5, 10, 3, 8, 16, 10);
		double[] array = stats.getStats();
		for(int i = 0; i < 3; i++) {
			System.out.println(array[i]);
		}
	}

}
