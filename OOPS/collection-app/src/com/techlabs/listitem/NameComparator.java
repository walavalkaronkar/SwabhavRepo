package com.techlabs.listitem;

import java.util.Comparator;

public class NameComparator implements Comparator {

	@Override
	public int compare(Object arg0, Object arg1) {
		ListItem item1=(ListItem)arg0;
		ListItem item2=(ListItem)arg1;
		return item1.getName().compareTo(item2.getName());
	}
}
