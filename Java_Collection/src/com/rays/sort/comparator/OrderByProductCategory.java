package com.rays.sort.comparator;

import java.util.Comparator;

public class OrderByProductCategory implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return o1.productCategory.compareTo(o2.productCategory); // asc
	}
	
}
