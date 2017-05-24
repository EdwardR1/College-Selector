import java.util.*;

public class Financial extends RealLife implements Fundamentals {
	private ArrayList<Integer> ID = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> t = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> fi = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> rb = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> ble = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> at = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> cc = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> sc = new ArrayList<Integer>() {
		{
			add(0);
		}
	};
	private ArrayList<Integer> icc = new ArrayList<Integer>() {
		{
			add(0);
		}
	};

	public void createNewFinancial(int ID, int t, int fi, int rb, int ble, int at, int cc, int sc, int icc) {
		this.ID.add(ID);
		this.t.add(t);
		this.fi.add(fi);
		this.rb.add(rb);
		this.ble.add(ble);
		this.at.add(at);
		this.cc.add(cc);
		this.sc.add(sc);
		this.icc.add(icc);
	}

	public int CalcTotalSum(int num) {
		// int x = this.ID.get(num);
		int totLoss = this.t.get(num) + this.fi.get(num) + this.rb.get(num) + this.ble.get(num) + this.at.get(num)
				+ this.cc.get(num);
		int totGain = this.sc.get(num) + this.icc.get(num);
		int tot = totLoss - totGain;
		return tot;
	}

	public String getName(int num) {
		return super.getName(num);
	}

	public int findID(String input) {
		return super.findID(input);
	}

	public String getInformation(int num) {
		if (this.ID.size() - 1 < num) {
			return super.getInformation(num);
		}
		if (num == 0) {
			return "";
		} else {
			return super.getInformation(num).concat("having said that, ").concat(super.getName(num))
					.concat(" will cost ").concat("" + CalcTotalSum(num) + "\n");
		}
	}

	public int findBestValue() {
		int mark = 0;
		for (int i = 0; i < this.ID.size(); i++) {
			if (i+1 < this.ID.size()) {
				int s1 = CalcTotalSum(i);
				int s2 = CalcTotalSum(i + 1);
				if(s1 < s2){
					mark = i;
				}
				else if(s2 < s1){
					mark = i+1;
				}
				else{
					mark = i;
				}
			}
		}
		return mark;
	}
	
	public String bestValue(){
		return getName(findBestValue()) + " is the school with the best value";
	}


	public void setFee(int id, String name, int cost) {
		switch (name) {
		case "tuition": {
			this.t.set(id, cost);
			break;
		}
		case "t": {
			this.t.set(id, cost);
			break;
		}
		case "fi": {
			this.fi.set(id, cost);
			break;
		}
		case "insurance": {
			this.fi.set(id, cost);
			break;
		}
		case "room": {
			this.rb.set(id, cost);
			break;
		}
		case "board": {
			this.rb.set(id, cost);
			break;
		}
		case "rb": {
			this.rb.set(id, cost);
			break;
		}
		case "ble": {
			this.ble.set(id, cost);
			break;
		}
		case "at": {
			this.at.set(id, cost);
			break;
		}
		case "cc": {
			this.cc.set(id, cost);
			break;
		}
		case "carpark": {
			this.cc.set(id, cost);
			break;
		}
		case "sc": {
			this.sc.set(id, cost);
			break;
		}
		case "scholarship": {
			this.sc.set(id, cost);
			break;
		}
		case "internship": {
			this.icc.set(id, cost);
			break;
		}
		case "icc": {
			this.icc.set(id, cost);
			break;
		}
		}
	}

	public int getFee(int id, String name) {
		switch (name) {
		case "tuition": {
			return this.t.get(id);

		}
		case "t": {
			return this.t.get(id);

		}
		case "fi": {
			return this.fi.get(id);

		}
		case "insurance": {
			return this.fi.get(id);

		}
		case "room": {
			return this.rb.get(id);

		}
		case "board": {
			return this.rb.get(id);

		}
		case "rb": {
			return this.rb.get(id);

		}
		case "ble": {
			return this.ble.get(id);

		}
		case "at": {
			return this.at.get(id);

		}
		case "cc": {
			return this.cc.get(id);

		}
		case "carpark": {
			return this.cc.get(id);

		}
		case "sc": {
			return this.sc.get(id);

		}
		case "scholarship": {
			return this.sc.get(id);

		}
		case "internship": {
			return this.icc.get(id);

		}
		case "icc": {
			return this.icc.get(id);
		}
		default: {
			return 0;
		}
		}
	}

}

/*
 * Tuition Fees, Insurance Room and Board Books, Lab and similar expenses Annual
 * travel (to-from school) Car and carpark Scholarship contribution --
 * Internship or Co-Op contributions ---
 */