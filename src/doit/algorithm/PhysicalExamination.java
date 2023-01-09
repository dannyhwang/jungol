package doit.algorithm;

public class PhysicalExamination {
	
	static final int VMAX = 21;
	
	static class PhyscData {
		String name;
		int height;
		double vision;
		
		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	public static void main(String[] args) {
		PhyscData p = new PhyscData("Kim", 170, 1.2);
		
		System.out.println(p.name);
	}
}

//class PhyscData {
//	String name;
//	int height;
//	double vision;
//	
//	PhyscData(String name, int height, double vision) {
//		this.name = name;
//		this.height = height;
//		this.vision = vision;
//	}
//}


