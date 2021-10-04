//PAOLA BELTRAN, SERGIO FLORES Y MARIO LOPEZ

package AcHilos;

public class Main {
	
	public static void main(String[] args) {
		
		Tuberia tub=new Tuberia();
		
		Productor prod=new Productor(tub);
		
		Consumidor eq1=new Consumidor(tub);
		Consumidor eq2=new Consumidor(tub);
		Consumidor eq3=new Consumidor(tub);
		Consumidor eq4=new Consumidor(tub);
		Consumidor eq5=new Consumidor(tub);
		
		prod.start();
		
		
		try {
			System.out.println("EQUIPO 1: ");
			eq1.start();
			eq1.join();
			System.out.println("EQUIPO 2: ");
			eq2.start();
			eq2.join();
			System.out.println("EQUIPO 3: ");
			eq3.start();
			eq3.join();
			System.out.println("EQUIPO 4: ");
			eq4.start();
			eq4.join();
			System.out.println("EQUIPO 5: ");
			eq5.start();
			eq5.join();
		} catch (InterruptedException e) {}
		
		
	    /*
		System.out.print("Equipo 1: ");
		for (int i = 0; i < 3; i++) {
			System.out.println(eq1.alum[i].nombre+" "+eq1.alum[i].tel);
		}
		
		System.out.print("Equipo 2: ");
		for (int i = 0; i < 3; i++) {
			System.out.println(eq2.alum[i].nombre+" "+eq2.alum[i].tel);
		}
		
		System.out.print("Equipo 3: ");
		for (int i = 0; i < 3; i++) {
			System.out.println(eq3.alum[i].nombre+" "+eq3.alum[i].tel);
		}
		
		System.out.print("Equipo 4: ");
		for (int i = 0; i < 3; i++) {
			System.out.println(eq4.alum[i].nombre+" "+eq4.alum[i].tel);
		}
		
		
		System.out.print("Equipo 5: ");
		for (int i = 0; i < 3; i++) {
			System.out.println(eq5.alum[i].nombre+" "+eq5.alum[i].tel);
		}
		*/
		
	}

}
