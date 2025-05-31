
public class StarSpiral {

	public static void main(String[] args) {
		// Coded by Kaipo Ojas
		//October 21, 2024
		//Creating Spiral with Stars using methods
		
		upTriangle();
		downTriangle();
		upTriangle();
		downTriangle();
		downTriangle();
		upTriangle();
		downTriangle();
		upTriangle();
	}
	public static void upTriangle() {
		System.out.println("  **  ");
		System.out.println(" *  * ");
		System.out.println("*    *");
	}
	public static void downTriangle() {
		System.out.println("*    *");
		System.out.println(" *  * ");
		System.out.println("  **  ");
	}
}
