package xyz;

public class Set {

		public static void main(String[] args) {
		Cuboid obj1 = new Cuboid(1f,20f,30f);
		//Cuboid obj2 = new Cuboid(5f,2f,3f);
		//Cuboid obj3 = new Cuboid(1f,2f,3f);
	   // Cuboid obj4 = new Cuboid(100f,20f,30f);
	    System.out.println("Volume="+obj1.getVolume());
	    System.out.println("Surface Area="+obj1.getSurfaceArea());
	    Cuboid obj2 = new Cuboid(5f,2f,3f);
	   System.out.println("Volume="+obj2.getVolume());
	    System.out.println("Surface Area="+obj2.getSurfaceArea());
	   // System.out.println("Volume="+obj3.getVolume());
	   // System.out.println("Surface Area="+obj3.getSurfaceArea());
	   // System.out.println("Volume="+obj4.getVolume());
	  //  System.out.println("Surface Area="+obj4.getSurfaceArea());
	    obj1.l=30;
	    System.out.println("Volume="+ obj1.volume);
	   
	}
	}

