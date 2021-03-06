import java.util.*;

public class CollegeSelectorTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CollegeSelector cs = new CollegeSelector();

		cs.createNewInfo(1, "Loyola Marymount University", "priority", "high", true);
		cs.createNewAcademic(1, 5, 8, 9, 7, 9, 4, 3, 10, 10, 10, 9, 8, 2, 3, 6, 7, 8, 10);
		cs.createNewRealLifeInfo(1, 5, 2, 7, 8, 9, 10, 9, 10, 10, 10, 5, 6, 7, 8, 9, 7, 9, 10, 2, 3, 6, 8, 4);
		cs.createNewFinancial(1, 60000, 38000, 38978, 1086, 188, 39766, 100000, 3908);

		int id2 = 2;
		String n2 = "University of California: Berkley";
		String c2 = "reach";
		String p2 = "medium";
		boolean v2 = true;

		String chan = "lts";

		cs.createNewInfo(id2, n2, c2, p2, v2);
		cs.createNewAcademic(id2, 7, 7, 8, 5, 3, 1, 2, 5, 7, 9, 8, 10, 9, 1, 5, 5, 7, 2);
		cs.createNewRealLifeInfo(id2, 7, 2, 9, 6, 5, 3, 7, 6, 8, 2, 1, 7, 8, 9, 7, 10, 8, 2, 1, 7, 5, 4, 10);
		cs.createNewFinancial(id2, 70000, 1079, 10398, 1098, 839, 490, 55000, 8000);

		int id3 = 3;
		String n3 = "Loyola University of Chicago";
		String c3 = "reach";
		String p3 = "low";
		boolean v3 = true;

		cs.createNewInfo(id3, n3, c3, p3, v3);
		cs.createNewAcademic(id3, 1, 5, 8, 6, 8, 2, 6, 8, 5, 7, 8, 6, 5, 4, 3, 10, 8, 9);
		cs.createNewRealLifeInfo(id3, 2, 7, 9, 0, 8, 7, 10, 9, 7, 6, 7, 3, 4, 2, 3, 8, 9, 7, 9, 5, 6, 7, 10);
		cs.createNewFinancial(id3, 10000, 5000, 8189, 10789, 17890, 16678, 11086, 3380);

		cs.createNewInfo(4, "Random University", "reach", "low", false);
		cs.createNewAcademic(4, (int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2),
				(int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2),
				(int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2),
				(int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2),
				(int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2),
				(int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2));
		cs.createNewRealLifeInfo(4, (int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2),
				(int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2),
				(int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2),
				(int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2),
				(int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2),
				(int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2),
				(int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2),
				(int) (Math.random() * 10 + 2), (int) (Math.random() * 10 + 2));
		cs.createNewFinancial(4, (int) (Math.random() * 10000), (int) (Math.random() * 10000),
				(int) (Math.random() * 10000), (int) (Math.random() * 10000), (int) (Math.random() * 10000),
				(int) (Math.random() * 10000), (int) (Math.random() * 10000), (int) (Math.random() * 10000));

		cs.printAllSchools();
		cs.printBestSchool();

	}
}
