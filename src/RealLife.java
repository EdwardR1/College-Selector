import java.util.*;

public class RealLife extends Academic implements Fundamentals {
	private ArrayList<Integer> ID = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> ss1 = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> ss2 = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> sbm = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> sd = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> fso = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> ssc = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> dr = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> dl = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> cf = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> locfo = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> leo = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> sse = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> sc = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> ocsp = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> loct = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> scpp = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> fan = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> fsa = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> smi = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> tc = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> wo = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> isc = new ArrayList<Integer>() {
		{
			add(0);
		}
	};

	public void createNewRealLifeInfo(int ID, int ss1, int ss2, int sbm, int sd, int fso, int ssc, int dr, int dl,
			int cf, int locfo, int leo, int sse, int sc, int intsc, int ocsp, int loct, int scpp, int fan, int fsa,
			int smi, int tc, int wo, int isc) {

		this.ID.add(ID);
		this.ss1.add(ss1);
		this.ss2.add(ss2);
		this.sbm.add(sbm);
		this.sd.add(sd);
		this.fso.add(fso);
		this.ssc.add(ssc);
		this.dr.add(dr);
		this.dl.add(dl);
		this.cf.add(cf);
		this.locfo.add(locfo);
		this.leo.add(leo);
		this.sse.add(sse);
		this.sc.add(sc);
		this.ocsp.add(ocsp);
		this.loct.add(loct);
		this.scpp.add(scpp);
		this.fan.add(fan);
		this.fsa.add(fsa);
		this.smi.add(smi);
		this.tc.add(tc);
		this.wo.add(wo);
		this.isc.add(isc);

	}

	public String getName(int num) {
		return super.getName(num);
	}

	public int findID(String input) {
		return super.findID(input);
	}

	public int calcRTotalScore(int num) {
		if (this.ID.size() < num) {
			return 0;
		} else {
			int x = num;
			int tot = this.ss1.get(x) + this.ss2.get(x) + this.sbm.get(x) + this.sd.get(x) + this.fso.get(x)
					+ this.ssc.get(x) + this.dr.get(x) + this.dl.get(x) + this.cf.get(x) + this.locfo.get(x)
					+ this.leo.get(x) + this.sse.get(x) + this.sc.get(x) + this.ocsp.get(x) + this.loct.get(x)
					+ this.scpp.get(x) + this.fan.get(x) + this.fsa.get(x) + this.smi.get(x) + this.tc.get(x)
					+ this.wo.get(x) + this.isc.get(x);
			return tot;
		}
	}

	public String compareTotalReal(int school1, int school2) {
		int s1 = calcRTotalScore(school1);
		int s2 = calcRTotalScore(school2);
		if (getAbbreviation(school1) != null && getAbbreviation(school2) != null) {
			if (s1 > s2) {
				return getAbbreviation(school1) + " is a better school academically than " + getAbbreviation(school2);
			} else if (s2 > s1) {
				return getAbbreviation(school2) + " is a better school academically than " + getAbbreviation(school1);
			} else {
				return getAbbreviation(school1) + " is the same academically as " + getAbbreviation(school2);
			}
		} else {
			return "One of the school's doesn't exist and cannot be judged";
		}
	}

	public int calcRAverage(int num) {
		return calcRTotalScore(num) / 22;
	}

	public int findBestReal() {
		int mark = 0;
		for (int i = 0; i < this.ID.size(); i++) {
			if (i + 1 < this.ID.size()) {
				int s1 = calcRTotalScore(i);
				int s2 = calcRTotalScore(i + 1);
				if (s1 > s2) {
					mark = i;
				} else if (s2 > s1) {
					mark = i + 1;
				} else {
					mark = i;
				}
			}
		}
		return mark;
	}

	public String bestReal() {
		return getName(findBestReal()) + " is the best school for real life";
	}

	public String getInformation(int num) {
		if (this.ID.size() - 1 < num) {
			return super.getInformation(num);
		} else {
			return super.getInformation(num).concat("your average real life score was ")
					.concat("" + calcRTotalScore(num)).concat(", averaging at ").concat("" + calcRAverage(num) + "\n");
		}
	}

}
