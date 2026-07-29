package com.rays.sort.comparable;

//humne idhr private attributes bnaye h but comparator m public bnaye
public class Marksheet implements Comparable<Marksheet> {

	private int rollNo;
	private String name;
	private int physics;

	public Marksheet(int rn, String n, int p) {
		this.rollNo = rn;
		this.name = n;
		this.physics = p;
	}

	@Override
	public int compareTo(Marksheet o) {
//		return this.rollNo - o.rollNo; // asc int 
//		return o.rollNo - this.rollNo; // desc int
//		return this.name.compareTo(o.name); // asc string 
		return o.name.compareTo(this.name); // desc string  
	}

	@Override
	public String toString() {
		return "rollNo: " + rollNo + ", name: " + name + ", phy: " + physics;
	}

}
