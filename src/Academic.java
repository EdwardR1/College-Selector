import java.util.*;

public class Academic extends Info implements Fundamentals {
	private ArrayList<Integer> ID = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> sr = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> pm = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> dr = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> ss = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> ap = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> tc = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> sfr = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> acs = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> frr = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> fygr = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> csf = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> mcr = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> slr = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> twich = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> sas = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> icop = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> isap = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> lts = new ArrayList<Integer>() {
		{
			add(0);
		}
	};

	public void createNewAcademic(int ID, int sr, int pm, int dr, int ss, int ap, int tc, int sfr, int acs, int frr,
			int fygr, int csf, int mcr, int slr, int twich, int sas, int icop, int isap, int lts) {
		this.ID.add(ID);
		this.sr.add(sr);
		this.pm.add(pm);
		this.dr.add(dr);
		this.ss.add(ss);
		this.ap.add(ap);
		this.tc.add(tc);
		this.sfr.add(sfr);
		this.acs.add(acs);
		this.frr.add(frr);
		this.fygr.add(fygr);
		this.csf.add(csf);
		this.mcr.add(mcr);
		this.slr.add(slr);
		this.twich.add(twich);
		this.sas.add(sas);
		this.icop.add(icop);
		this.isap.add(isap);
		this.lts.add(lts);
	}

	public String getName(int num) {
		return super.getName(num);
	}

	public int calcTotalScore(int num) {
		if (this.ID.size() < num) {
			return 0;
		} else {
			int x = num;
			int tot = this.sr.get(x) + this.pm.get(x) + this.dr.get(x) + this.ss.get(x) + this.ap.get(x)
					+ this.tc.get(x) + this.sfr.get(x) + this.acs.get(x) + this.frr.get(x) + this.fygr.get(x)
					+ this.csf.get(x) + this.mcr.get(x) + this.slr.get(x) + this.twich.get(x) + this.sas.get(x)
					+ this.icop.get(x) + this.isap.get(x) + this.lts.get(x);
			return tot;
		}
	}

	public int calcAverageScore(int num) {
		int x = num;
		return calcTotalScore(num) / 18;
	}

	public int findID(String input) {
		return super.findID(input);
	}

	public String getInformation(int num) {
		if (this.ID.size() - 1 < num) {
			return super.getInformation(num);
		} else {
			return super.getInformation(num).concat("your average academic score was ").concat("" + calcTotalScore(num))
					.concat(", averaging at ").concat("" + calcAverageScore(num) + "\n");
		}
	}

	public String compareTotalAcademic(int school1, int school2) {
		int s1 = calcTotalScore(school1);
		int s2 = calcTotalScore(school2);
		if (school1 < this.ID.size() && school2 < this.ID.size()) {
			if (getAbbreviation(school1) != null && getAbbreviation(school2) != null) {
				if (s1 > s2) {
					return getAbbreviation(school1) + " is a better school academically than "
							+ getAbbreviation(school2);
				} else if (s2 > s1) {
					return getAbbreviation(school2) + " is a better school academically than "
							+ getAbbreviation(school1);
				} else {
					return getAbbreviation(school1) + " is the same academically as " + getAbbreviation(school2);
				}
			} else {
				return "One of the school's doesn't exist and cannot be judged";
			}
		} else {
			return "One of the school's doesn't exist and cannot be judged";
		}
	}

	public int findBestAcademic() {
		int mark = 0;
		for (int i = 0; i < this.ID.size(); i++) {
			if (i + 1 < this.ID.size()) {
				int s1 = calcTotalScore(i);
				int s2 = calcTotalScore(i + 1);
				if(s1 > s2){
					mark = i;
				}
				else if(s2 > s1){
					mark = i+1;
				}
				else{
					mark = i;
				}
			}
		}
		return mark;
	}
	
	public String bestAcademic(){
		return getName(findBestAcademic()) + " is the best academically driven school";
	}

	public void setAcademicScore(int id, String name, int num) {
		switch (name) {
		case "sr": {
			this.sr.set(id, num);
			break;
		}
		case "pm": {
			this.pm.set(id, num);
			break;
		}
		case "dr": {
			this.dr.set(id, num);
			break;
		}
		case "ss": {
			this.ss.set(id, num);
			break;
		}
		case "ap": {
			this.ap.set(id, num);
			break;
		}
		case "tc": {
			this.tc.set(id, num);
			break;
		}
		case "sfr": {
			this.sfr.set(id, num);
			break;
		}
		case "acs": {
			this.acs.set(id, num);
			break;
		}
		case "frr": {
			this.frr.set(id, num);
			break;
		}
		case "fygr": {
			this.fygr.set(id, num);
			break;
		}
		case "csf": {
			this.csf.set(id, num);
			break;
		}
		case "mcr": {
			this.mcr.set(id, num);
			break;
		}
		case "slr": {
			this.slr.set(id, num);
			break;
		}
		case "twich": {
			this.twich.set(id, num);
			break;
		}
		case "sas": {
			this.sas.set(id, num);
			break;
		}
		case "icop": {
			this.icop.set(id, num);
			break;
		}
		case "isap": {
			this.isap.set(id, num);
			break;
		}
		case "lts": {
			this.lts.set(id, num);
			break;
		}
		}
	}

	public int getAcademicScore(int id, String name) {
		switch (name) {
		case "sr": {
			return this.sr.get(id);

		}
		case "pm": {
			return this.pm.get(id);

		}
		case "dr": {
			return this.dr.get(id);

		}
		case "ss": {
			return this.ss.get(id);

		}
		case "ap": {
			return this.ap.get(id);

		}
		case "tc": {
			return this.tc.get(id);

		}
		case "sfr": {
			return this.sfr.get(id);

		}
		case "acs": {
			return this.acs.get(id);

		}
		case "frr": {
			return this.frr.get(id);

		}
		case "fygr": {
			return this.fygr.get(id);

		}
		case "csf": {
			return this.csf.get(id);

		}
		case "mcr": {
			return this.mcr.get(id);

		}
		case "slr": {
			return this.slr.get(id);

		}
		case "twich": {
			return this.twich.get(id);

		}
		case "sas": {
			return this.sas.get(id);

		}
		case "icop": {
			return this.icop.get(id);

		}
		case "isap": {
			return this.isap.get(id);

		}
		case "lts": {
			return this.lts.get(id);

		}
		default: {
			return 0;
		}
		}
	}

}

/*
 * School Ranking Program Match Department Ranking, Recognition School
 * Selectivity Admissions % Teaching Calendar Student-Faculty Ratio Avg Class
 * Sizes Freshman Retention Rate 4-yr Graduation Rate Course Selection,
 * Flexibility Mandatory Course Requirements Second Language Requirements
 * Teaching Week, In-Class Hours Student Academic Services Intern, Co-Op
 * Programs International, Study Abroad Program Learning Through Service
 */