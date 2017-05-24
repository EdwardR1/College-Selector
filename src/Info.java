import java.util.*;

public class Info implements Fundamentals {
	private ArrayList<Integer> ID = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<String> Name = new ArrayList<String>() {
		{
			add("Default");
		}
	};
	private ArrayList<String> Abbreviation = new ArrayList<String>() {
		{
			add(findAbbreviation(0));
		}
	};
	private ArrayList<String> Classification = new ArrayList<String>() {
		{
			add("Default");
		}
	};
	private ArrayList<String> Preference = new ArrayList<String>() {
		{
			add("Default");
		}
	};
	private ArrayList<Boolean> Visit = new ArrayList<Boolean>() {
		{
			add(true);
		}
	};

	public void createNewInfo(int id, String n, String c, String p, boolean v) {
		this.ID.add(id);
		this.Name.add(n);
		this.Abbreviation.add(findAbbreviation(id));
		this.Classification.add(c);
		this.Preference.add(p);
		this.Visit.add(v);
	}

	public String getName(int num) {
		if (num == 0) {
			return "Default Null School";
		}
		return this.Name.get(num);
	}

	public int findID(String input) {
		int id = 0;
		if (input.length() >= 6) {
			for (int i = 0; i < this.Name.size(); i++) {
				if (this.Name.get(i).equalsIgnoreCase(input)) {
					id = i;
				}
			}
		} else {
			for (int i = 0; i < this.Abbreviation.size(); i++) {
				if (this.Abbreviation.get(i).equalsIgnoreCase(input)) {
					id = i;
				}
			}
		}

		return id;
	}

	public int getID(int num) {
		return this.ID.get(num);
	}

	public String findAbbreviation(int num) {
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		ArrayList<Integer> specialChar = new ArrayList<Integer>();
		int x = this.ID.get(num);
		String n = this.Name.get(x);
		String abrv = "";
		abrv = abrv.concat("" + n.charAt(0));
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) == ' ' && n.substring(i - 1, i + 4).contains("of") == false) {
				indexes.add(i);
			} else if (n.charAt(i) == ':') {
				indexes.add(i - 1);
			}
		}
		for (int j = 0; j < indexes.size(); j++) {
			abrv += n.substring(indexes.get(j) + 1, indexes.get(j) + 2);
		}
		return abrv;
	}

	public String getAbbreviation(int num) {
		if (num == 0) {
			return "default";
		} else {
			return this.Abbreviation.get(num);
		}
	}

	public String getClassification(int num) {
		if (num == 0) {
			return "default";
		} else {
			return this.Classification.get(num);
		}
	}

	public String getPreference(int num) {
		if (num == 0) {
			return "default";
		} else {
			return this.Preference.get(num);
		}
	}

	public boolean getVisit(int num) {
		if (num == 0) {
			return false;
		} else {
			return this.Visit.get(num);
		}
	}

	public String getInformation(int num) {
		int x = getID(num);
		String vi = "";
		if (getVisit(num) == true) {
			vi = "is";
		} else {
			vi = "is not";
		}
		String text = "";
		if (getID(x) == 0 || getName(x).equalsIgnoreCase("Default Null School")
				|| getClassification(x).equalsIgnoreCase("default") || getPreference(x).equalsIgnoreCase("default")) {
			text = "";
		} else {
			text = "The school is named " + getName(x) + " and it's abbreviated as " + getAbbreviation(x)
					+ ". \nYou classified it as a " + getClassification(x) + " and placed it " + getPreference(x)
					+ " priority \nand said that there " + vi + " a visit planned.\n";
		}
		return text;
	}

	/*
	 * public String getInformation(int num) { int x = this.ID.get(num); String
	 * vi = ""; if (this.Visit.get(x) == true) { vi = "is"; } else { vi =
	 * "is not"; } String text = ""; if (this.ID.get(x) == 0 ||
	 * this.Name.get(x).equalsIgnoreCase("Default Null School") ||
	 * this.Classification.get(x).equalsIgnoreCase("default") ||
	 * this.Preference.get(x).equalsIgnoreCase("default")){ text = ""; } else{
	 * text = "The school is named " + this.Name.get(x) +
	 * " and it's abbreviated as " + this.Abbreviation.get(x) +
	 * ". \nYou classified it as a " + this.Classification.get(x) +
	 * " and placed it " + this.Preference.get(x) +
	 * " priority \nand said that there " + vi + " a visit planned"; } return
	 * text; }
	 */

	public int getNumberOfItems() {
		return this.ID.size();
	}

}
