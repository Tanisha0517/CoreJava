package com.rays.list;

import java.util.ArrayList;

public class ArrayListTask {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();

		a.add(10);
		a.add(20);
		a.add(10);
		a.add(30);
		a.add(20);
		a.add(40);

		for (int i = 0; i < a.size(); i++) {

			if (a.indexOf(a.get(i)) == i) {
				System.out.println(a.get(i));
			}
		}
	}
}
//We will use two methods in this indexOf and get
//get(i) -> current index ka element return karega
// indexOf() -> us element ka first index return karega
// Agar current index aur first index same hain,
// to element first time mila hai, isliye print karo.
// Agar same nahi hain, to duplicate hai, print mat karo.