package com.techlabs.movies;

public class CompositeTest {
	
	
	public static void main(String[] args) {
	
		Folder root=new Folder("Movies");
		root.setLevel(0);
		root.addItems(new File("Titanic","1024"));
		root.addItems(new File("BatMan","600"));
		
		Folder hindi=new Folder("Hindi");
		hindi.addItems(new File("3Idiots","2048"));
		hindi.addItems(new File("All the best","248"));
		hindi.addItems(new File("Race","1048"));
		
		Folder english=new Folder("English");
		english.addItems(new File("SpiderMan","1450"));
		english.addItems(new File("HarryPotter","1200"));
		
		Folder action =new Folder("action");
		
		
		int level=root.getLevel();
		english.setLevel(level+1);
		hindi.setLevel(level+1);
		action.setLevel(level+1);
		root.addItems(english);
		root.addItems(hindi);
		english.addItems(action);
		
		
		
		root.addItems(new File("BatMan","600"));
		root.display();
	}
}
