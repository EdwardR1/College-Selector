import java.util.*;
import java.io.*;

public class Printer extends Financial {

	public void printInformation(int num) {
		System.out.println(super.getInformation(num));
	}

	public void printCompareAcademic(int school1, int school2) {
		System.out.println(super.compareTotalAcademic(school1, school2));
	}

	public void printCompareReal(int school1, int school2) {
		System.out.println(super.compareTotalReal(school1, school2));
	}

	public void printAllSchools() {
		for (int i = 0; i < super.getNumberOfItems(); i++) {
			printInformation(i);
			System.out.println();
		}
	}

	public void printBestSchool() {
		int a = super.findBestAcademic();
		int r = super.findBestReal();
		int f = super.findBestValue();
		if (a == r && a == f && r == f) {
			System.out.println(
					super.getName(a) + " is the best school for all categories, having a total academic score of "
							+ super.calcTotalScore(a) + ", \n a total real life score of " + super.calcRTotalScore(r)
							+ ", \n and costing " + super.CalcTotalSum(f));
		} else if (a == r && a != f) {
			System.out.println(super.getName(a)
					+ " is the best school academically and realistically,\n receiving an academic score of "
					+ super.calcTotalScore(a) + " and a total real life score of " + super.calcRTotalScore(r)
					+ ". \n However, " + super.getName(f) + " is the best value for money, costing "
					+ super.CalcTotalSum(f));
		} else if (a == f && r != f) {
			System.out.println(super.getName(a)
					+ " is the best school academically and the best value for money. \n With a score of "
					+ super.calcTotalScore(a) + " and costing " + super.CalcTotalSum(f) + ".\n However, "
					+ super.getName(r) + " scored the best for real life with a score of " + super.calcRTotalScore(r));
		} else if (a != r && f == r) {
			System.out.println(super.getName(f) + " is the best value for money and for real life, but "
					+ super.getName(a) + " is the best for academic life." + "\n" + super.getName(f) + " costs "
					+ super.CalcTotalSum(f) + " and for real life scored " + super.calcRTotalScore(r) + "\n" + " however, "
					+ super.getName(a) + " scored " + super.calcTotalScore(a) + " making it the best academic school");
		}
	}

}
