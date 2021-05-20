package xyz;

 class Cuboid {
	public float volume,surfaceArea;
	public float l,b,h;
	//Cuboid(){
	//	l=0; b=0; h=0;
		
	//}
	//Take Input
	Cuboid(float x,float y,float z ){
		l=x;
		b=y;
		h=z;
	}
	float getVolume() {
		volume=l*b*h;
		return volume;
	}
	float getSurfaceArea() {
		surfaceArea=(2*l*b + 2*b*h + 2*h*l);
		return surfaceArea;
		
		
	}
}

	

	


