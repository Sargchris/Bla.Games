package blabla;

import java.util.Scanner;

public class bla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Bienvenido Bla games, quieres jugar?\n"
					+ "1-Si\n"
					+ "2-No ");
			int x= s.nextInt();
			int y;
			int v;
			
			
			if (x==1) {
				 System.out.print("Juguemos!");
				 System.out.println(" Reglas: Introduce un numero de cerillas entre 1 y 100."
				 		+ "\n Cada vez que tengas que quitar cerillas, puedes quitar entre 1 y 10. "
				 		+ "\n Suerte Jugadores!");
				 System.out.println(" Introduce el numero de cerrillas iniciales: \n");
				 y = s.nextInt();
					/* if (y>100)
						   System.out.println("Error, no puede haber mas de 100 cerillas payaso.");
						   System.exit(0); */
		     
		      
			 while (y>0)  {
				 System.out.print("Quedan "+ y + " cerillas" + " ¿Cuantas cerillas quieres quitar Jugador1?");
				 v = s.nextInt();
				 System.out.println(y-v);
				 y= (y-v);
				 System.out.print("Quedan "+ y + " cerillas" + " ¿Cuantas cerillas quieres quitar Jugador2?");
				 v = s.nextInt();
				 System.out.println(y-v);
				 y= (y-v);
				 
				if (y<=0) {
					 System.out.println("Has perdido!");
				     System.exit(0);    
				}
			 }
			}
			
			
			 if(x==2) {
				 System.out.print("Cerrando sesion.");
				 System.exit(0);
			 }
			 
			else {
				System.out.print("ERROR! Cerrando sesion!");
				System.exit(0);
			}
		}
		
	}

}
