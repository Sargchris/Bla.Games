package BlaSouls;

import java.util.Scanner;

public class Bla_Souls {
	
	public static String username;
	public static int gold=0;
	static int health=0;
	static int curationC=10;
	static int curationL=5;
	static int curationM=20;
	static int hechizos=10;
	static Scanner s = new Scanner(System.in);
	public static void intro() {
		System.out.println("						Bla Souls\n					Preparado para morir edition.\n" + ""
				+ "                                                                                                                     \r\n"
				+ "                                                     .                                                                  \r\n"
				+ "                                                    .#=                                                                 \r\n"
				+ "                                                  .*%%#*-                                                               \r\n"
				+ "                                                  +%%%+**.                                                              \r\n"
				+ "                                               ...=++**++-                                                              \r\n"
				+ "                                          .:-=-==++===+==--:. .                                                         \r\n"
				+ "                                         :++*+++***++*++=++=-==:.                                                       \r\n"
				+ "                                        .++*********###**#***+==-.                                                      \r\n"
				+ "                                       .*##*####**####%%######=++=                                                      \r\n"
				+ "                                      :*##%%%%%%%####*%%##=+*#***+-                                                     \r\n"
				+ "                                      +#+%%%%%%%%#%%######*+#%%##+=:                                                    \r\n"
				+ "                                       -#%%%%%%%%%%%########%%%%#*==:                                                   \r\n"
				+ "                                      *%%%#%%-#%%%%%%######%#%%%#***+                                                   \r\n"
				+ "                                     -%%#%%+  *#%%#####*##%#.=%%%#*##:                                                  \r\n"
				+ "                                     +%%%%#   -###%#####***-  -%%%%#-.                                                  \r\n"
				+ "                                     *%%%*. :%%%###*#%%##**#. :%%%%*:                                                   \r\n"
				+ "                                    .%#%-   *#%%####%%%###**+  :#%%#:                                                   \r\n"
				+ "                                    =%%-   .##%%%%%#%%%###**#. +#*##+                                                   \r\n"
				+ "                                    +%%%=  -%%%%%%%%%%%%#####- :=#+%*:                                                  \r\n"
				+ "                                    -#%*:  -%#%%%%%%%%%%%%%%%*   =%%#:                                                  \r\n"
				+ "                                           *%%%%%%%%%%%%%##%%#.   =%**:                                                 \r\n"
				+ "                                          .%%%%%%%%%%%%%%%%%%#:   += -#*-                                               \r\n"
				+ "                                          =%%%%%%%%%%%%%%%%%##-       .+%+.                                             \r\n"
				+ "                                          #%%%%%%%%%%%%%%%%###=         .=*=                                            \r\n"
				+ "                                         -%%%%%%%%%##%%%%%%###=           .*#=                                          \r\n"
				+ "                                         *%%%%%%%%+ =+%%%%%###=             :*#:                                        \r\n"
				+ "                                        :%%%%%%%%%: =:%%%%%%##=               -#*.                                      \r\n"
				+ "                                        +%%%%%%%%%- :.%%%%%%##=                 =#+                                     \r\n"
				+ "                                       .%%%++%%%%%= . %%%%%%##=                  .+*.                                   \r\n"
				+ "                                       =%+-  *%#%%+   %%%%%#*#.                                                         \r\n"
				+ "                                       *%.   :#%%%%:  %%%%%*                                                            \r\n"
				+ "                                      -%#     +%%%%: .%%%##=                                                            \r\n"
				+ "                                      #%=     =%%%%  .%%#%%:                                                            \r\n"
				+ "                                      *%.     +%%%%=  #%%%#                                                             \r\n"
				+ "                                              =%%%%#  *%%%*                                                             \r\n"
				+ "                                               *%%%-  =%%%#                                                             \r\n"
				+ "                                                .:.                                                                     \r\n"
				+ "                                                                                                                        \r\n"
				+ "                                                                                                                        \r\n"
				+ "\rBla.Games©\n"
				+ "\n1-Comenzar");
		int x = s.nextInt();
		
		if (x != 1) {
			System.out.print("Cerrando el juego...");
			System.exit(0);
		}
		if (x == 1) {
			System.out.print("AVISO: esta es una parodia/interpretacion del videojuego Dark Souls, realizada en formato de texto, inspirada por el lore del juego; "
					+ "\ncualquier parecido con la obra original es pura coincidencia, no recomendado para menores de 2 años..."
					+ "\n"
					+ "Disfruta el viaje jugador!"
					+ "\n."
					);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
					System.out.print( "\n."
					+ "\n."
					+ "\nFROM BLA.GAMES©"
			);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
							System.out.print("\n."
					+ "\n."
					+ "\n."
					+ "\n."
					+ "\n."
					+ "\n "
					+ "\n "
				);
					try {
						Thread.sleep(800);
				} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
				}
			System.out.print( "\n ");
			System.out.println("*Voz de mujer mayor* En la edad de los ancestros, el mundo era caos, sumido en una niebla infinita...\nUn mundo de montañas grises, gigantescos arboles y dragones eternos..."
					+ "\nPero entonces, llego la luz, el fuego, y con el fuego llego la disparidad. Calor y Frio. Vida y Muerte. Luz y Oscuridad..."
					+ "\nEntonces ellos surgieron de la oscuridad, y encontraron las almas de los dioses dentro de la llama:"
					+ "\n "
					+ "\nNito, el primero de los muertos..."
					+ "\nLa bruja de Izalith y sus hijas del caos..."
					+ "\nGwyn, el señor de la luz solar, y sus leales caballeros..."
					+ "\nY el furtivo pigmeo, facilmente olvidado... "
					+ "\n"
					+ "\nCon el poder de los dioses, desafiarón a los dragones: atravesaron sus escamas petreas, tejieron tormentas de fuego, esparcieron la muerte y la enfermedad, y los dragones desaparecieron..."
					+ "\n"
					+ "\nY asi comenzó la edad de Fuego."
					+ "\nPero pronto las llamas se apagarón... y solo quedo Oscuridad..."
					+ "\nAhora solo quedan ascuas, el hombre ya no ve la luz del sol, solo una continua noche eterna..."
					+ "\nY entre los vivos se ve a aquellos que sufren la maldición de la Señal Oscura..."
					+ "\n "
					+ "\nAsi es, la Señal Oscura de los No Muertos. Y en esta tierra encierran a los no muertos, donde esperarán al fin de los tiempos..."
					+ "\nY ahi es donde entras tu, para cumplir con tu destino, pues se dice que un No Muerto sera elegido para alzarse y recuperar la primera llama... "
					+ "\nPero para ello deberas derrotar incontables enemigos, empezando por el Demonio Salvaje, guardian del Asilo de los No Muertos."
					+ "\n"
					+ "\nPero antes de empezar..."
					+ "\n");
			
			System.out.println("¿Cúal es tu nombre?"); //Si se cambia se rompe
			String z=s.nextLine(); //Si se cambia se rompe
			username =s.nextLine(); //Si se cambia se rompe
			System.out.println("Tu nombre es "+ username); //Si se cambia se rompe
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			do{System.out.println("Ahora deberas eligir tu clase:\n1-Siguiente.");
			x = s.nextInt();} while (x!=1);
			if (x==1) {
				elegirClase();
			}
		}
	}
	
	public static void elegirClase() {
		System.out.println("Clases para seleccionar:\n");
		System.out.println("1-Caballero - Caballero de baja categoria, proveniente del reino de Astora, el cual es conocido por sus diestros caballeros.\n Tiene mayor vida que el resto de clases y sufrira menos daño gracias a su fuerte armadura pesada."
				+ "Ademas hará un daño bastante aceptable gracias a su espada larga.\n Esta clase permite intimidar en algunas tomas de decisiones");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("2-Hechizero - Hechizero solitario que abondonó la academia de Dragones de Vinheim para seguir investigando por su cuenta.\n Puede hacer muchos ataques a distancia con sus hechizos y curarse ilimitadamente,"
				+ "pero posee menor vida que otras clases y al no usar armadura sufrira mucho daño.\n Ademas su ataque cuerpo a cuerpo sera bajo. Esta clase permite persuadir a las personas en algunas tomas decisiones.");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
		
		System.out.print("¿Cúal es tu elección:");
		int clase = s.nextInt();
		switch (clase) {
		case 1:
			System.out.println("Has elegido Caballero.");
			System.out.println(".\n.\n.\n.\n.\n."
			 );
		try {
				Thread.sleep(800);
		} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		System.out.println("\n.\n.\n.\nCARGANDO...");
		try {
			Thread.sleep(1000);
	} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
			health=250;
			parte1caballero();
			break;
		case 2:
			System.out.println("Has elegido Hechizero.");
			System.out.println(".\n.\n.\n.\n.\n."
					 );
				try {
						Thread.sleep(800);
				} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
				}
				System.out.println("\n.\n.\n.\nCARGANDO...");
				try {
					Thread.sleep(1000);
			} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
			health=150;
			parte1hechizero();
			break;
		default:
			System.out.println("La opción elegida no es valida.");
			break;
		}
		
	}

	public static void parte1caballero() {
		System.out.println(".\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.");
		System.out.println("*Te encuentras en el refugio de los No Muertos, lugar recondito del reino de Lodran en el que los No Muertos son encerrados hasta que llege el fin de los tiempos,\ny son vigilados por demonios para que no puedan escapar..."
				+ "El propio reino fue destrozado por los demonios hace tiempo, y aunque fueron derrotados, todavia vagan a sus anchas por estas tierras...\n"
				+ "Ahora te encuentras en tu celda,junto con tu compañero y amigo Zorgos,el cual junto a ti sirvio en la orden de la llama...\nTe despiertas tras escuchar un gran estruendo en la celda, y observas que la puerta a sido derribada..."
				+ "Al mismo tiempo tu viejo amigo comienza a hablar:*\n\n");
		
		System.out.println("Zorgos: Aahh por fin despiertas "+username+", todavia no te has convertido en un hueco... Bueno aun estas a tiempo de escapar,\n al parecer alguien esta escapando y a destrozado la pared de la celda..."
				+ "Yo apenas puedo moverme...vete antes de que me convierta en hueco y te ataque sin razón...\n Ah y... Buena suerte compañero, y que la llama guie tus pasos noble caballero...*cierra los ojos y duerme...*\n");
		
		System.out.println("\n1-Levantarte y salir de la celda\n2-Volver a descansar y morir en paz.\n");
		int eleccion = s.nextInt();
		switch (eleccion) {
		case 1:
			System.out.println(username+": Debo salir de aqui, puede que esta sea mi ultima oportunidad de salir de aqui cuerdo, si no me acabare volviendo hueco... Adios amigo Zorgos, que la llama este siempre contigo.\n"
					+ "*Comienzas a caminar por el pasillo, lleno de celdas en ruinas, mientras observas varios No Muertos, algunos heridos, y otros ya convertidos en huecos.\n"
					+ "Haciendo un ruido metalico a cada paso que das, debido a tu pesada armadura de acero, acabas llegando a una gran sala,custodiada por varios huecos armados,\nNo Muertos que ya sin consciencia ni control vagan como zombis"
					+ "por las zonas donde perdieron su humanidad.*\n\n"
					+ username+": Maldición debo llegar al otro lado de la sala si quiero salir de aqui... Podria enfrentarme a ellos o podria intentar esquivarlos sin que me vean...\n"
							+ "¿Qué quieres hacer?\n"
							+ "1-Luchar contra los huecos.\n"
							+ "2-Intentar pasar desapercibido.\n");
						int elec2 = s.nextInt();
						
						switch (elec2) {
						case 1: {
							System.out.println(username+": VENID AQUI ESCORIA, NO ME PARAREIS AHORA AAAAHH!!!!\n"
									+ "*Cargas contra los huecos eliminando a dos de ellos rapidamente antes de que puedan reaccionar, mientras otros 2 huecos asumen posiciones de cobate y se preparan para hacerte frente.*");
							System.out.println("1-A LUCHAR!");
							int x = s.nextInt();

							
							if (x != 1) {
								System.out.println("1-A LUCHAR!");
								x = s.nextInt();
							}
							if (x == 1) {
								int hueco1=50;
								int hueco2=60;
								while(health>0) {
								while(hueco1>0){
									System.out.println("vida hueco 1: "+hueco1+"\nVida "+username+": "+health+"\nPociones: "+curationC);
									System.out.println("1-Ataque rapido\n2-Ataque pesado\n3-Esquivar\n4-protegerse\n5-Curarse");
									int z=s.nextInt();
									
								if (z == 1) {
									hueco1 = hueco1 - ((int) (Math.random() * (20 - 10 + 1) + 10));
									health = health - ((int) (Math.random() * (20 - 10 + 1) + 10));
									System.out.println("vida hueco 1: "+hueco1+"\nVida "+username+": "+health+"\nPociones: "+curationC);
									System.out.println(username+" ha realizado ataque ligero. Hueco 1 ha realizado ataque pesado.");
									System.out.println();
								} // if 1
								if (z == 2) {
									hueco1 = hueco1 - ((int) (Math.random() * (30 - 10 + 1) + 10));
									health = health - ((int) (Math.random() * (15 - 5 + 1) + 5));
									System.out.println("vida hueco 1: "+hueco1+"\nVida "+username+": "+health+"\nPociones: "+curationC);
									System.out.println("Jugador ha realizado ataque pesado. Hueco 1 ha realizado ataque ligero");
									System.out.println();
								} // if 2
								if (z == 3) {
									health = health - ((int) (Math.random() * (15 - 5 + 1) + 5));
									System.out.println("vida hueco 1: "+hueco1+"\nVida "+username+": "+health+"\nPociones: "+curationC);
									System.out.println(username+" ha realizado esquive. Hueco 1 ha realizado ataque ligero");
									System.out.println();
								} // if 3
								if (z == 4) {
									health = health - ((int) (Math.random() * (20 - 10 + 1) + 10));
									System.out.println("vida hueco 1: "+hueco1+"\nVida "+username+": "+health+"\nPociones: "+curationC);
									System.out.println(username+" ha realizado protección. Hueco 1 ha realizado ataque pesado.");
									System.out.println();
									
								} // 4
								if (z == 5) {
									if (curationC>0) {
									hueco1 = hueco1 + ((int) (Math.random() * (10 - 5 + 1) + 5));
									health = health + ((int) (Math.random() * (50 - 20 + 1) + 1));
									System.out.println("vida hueco 1: "+hueco1+"\nVida "+username+": "+health+"\nPociones: "+curationC);
									System.out.println(username+" ha realizado Curación. Hueco 1 ha realizado Curación");
									System.out.println();
									curationC=curationC-1;
									}
									if (curationC==0) {
										System.out.println("No te quedan pociones de salud.");
										System.out.println();
									}
								} // 5
							}
								while(hueco2>0){
									System.out.println("vida hueco 2: "+hueco2+"\nVida "+username+": "+health+"\nPociones: "+curationC);
									System.out.println("1-Ataque rapido\n2-Ataque pesado\n3-Esquivar\n4-protegerse\n5-Curarse");
									int z=s.nextInt();
									
									if (z == 1) {
										hueco2 = hueco2 - ((int) (Math.random() * (20 - 10 + 1) + 10));
										health = health - ((int) (Math.random() * (20 - 10 + 1) + 10));
										System.out.println("vida hueco 2: "+hueco2+"\nVida "+username+": "+health+"\nPociones: "+curationC);
										System.out.println(username+" ha realizado ataque ligero. Hueco 2 ha realizado ataque pesado.");
										System.out.println();
									} // if 1
									if (z == 2) {
										hueco2 = hueco2 - ((int) (Math.random() * (30 - 10 + 1) + 10));
										System.out.println("vida hueco 2: "+hueco2+"\nVida "+username+": "+health+"\nPociones: "+curationC);
										System.out.println("Jugador ha realizado ataque pesado. Hueco 2 ha realizado bloqueo");
										System.out.println();
									} // if 2
									if (z == 3) {
										health = health - ((int) (Math.random() * (15 - 5 + 1) + 5));
										System.out.println("vida hueco 2: "+hueco2+"\nVida "+username+": "+health+"\nPociones: "+curationC);
										System.out.println(username+" ha realizado esquive. Hueco 2 ha realizado ataque ligero");
										System.out.println();
									} // if 3
									if (z == 4) {
										health = health - ((int) (Math.random() * (20 - 10 + 1) + 10));
										System.out.println("vida hueco 2: "+hueco2+"\nVida "+username+": "+health+"\nPociones: "+curationC);
										System.out.println(username+" ha realizado protección. Hueco 2 ha realizado ataque pesado.");
										System.out.println();
									} // 4
									if (z == 5) {
										if (curationC>0) {
										hueco2 = hueco2 + ((int) (Math.random() * (10 - 5 + 1) + 5));
										health = health + ((int) (Math.random() * (50 - 20 + 1) + 1));
										System.out.println("vida hueco 2: "+hueco2+"\nVida "+username+": "+health+"\nPociones: "+curationC);
										System.out.println(username+" ha realizado Curación. Hueco 2 ha realizado Curación");
										System.out.println();
										curationC=curationC-1;
										}
										if (curationC==0) {
											System.out.println("No te quedan pociones de salud.");
											System.out.println();
										}
									} // 5
									

							}
								
								
								if (hueco1<= 0 && hueco2 <= 0) {
									System.out.println("HAS GANADO!");
									System.out.println("RECOMPENSA: 10 MONEDA DE ORO Y 1 POCION DE SALUD.");
									System.out.println("*Has conseguido acabar con ellos, y ahora te diriges a un gran patio central de la prisión, acercandote cada vez mas a la salida, y al demonio...*");
									curationC=curationC+1;
									parte2caballero();
									break;
								}
								if (health<= 0) {
									System.out.println("HAS MUERTO!");
									System.out.println("\n\n\nY asi el noble caballero murió intentando escapar del Asilo de los No Muertos, y se convirtió en un hueco mas que protegía el lugar...");
									System.exit(0);
								}
							}
							}
						}
						case 2:{
							int y=((int)(Math.random()*2+1));
							if(y==2) {
								System.out.println("Has conseguido pasar desapercibido, y ahora te diriges a un gran patio central de la prisión, acercandote cada vez mas a la salida, y al demonio...");
								parte2caballero();
								break;
							}
							if(y==1) {
								System.out.println("TE HAN DESCUBIERTO, DEBERAS LUCHAR CONTRA ELLOS!");
								int hueco1=50;
								int hueco2=60;
								while(health>0) {
								while(hueco1>0){
									System.out.println("vida hueco 1: "+hueco1+"\nVida "+username+": "+health+"\nPociones: "+curationC);
									System.out.println("1-Ataque rapido\n2-Ataque pesado\n3-Esquivar\n4-protegerse\n5-Curarse");
									int z=s.nextInt();
									
								if (z == 1) {
									hueco1 = hueco1 - ((int) (Math.random() * (20 - 10 + 1) + 10));
									health = health - ((int) (Math.random() * (20 - 10 + 1) + 10));
									System.out.println("vida hueco 1: "+hueco1+"\nVida "+username+": "+health+"\nPociones: "+curationC);
									System.out.println(username+" ha realizado ataque ligero. Hueco 1 ha realizado ataque pesado.");
									System.out.println();
								} // if 1
								if (z == 2) {
									hueco1 = hueco1 - ((int) (Math.random() * (30 - 10 + 1) + 10));
									health = health - ((int) (Math.random() * (15 - 5 + 1) + 5));
									System.out.println("vida hueco 1: "+hueco1+"\nVida "+username+": "+health+"\nPociones: "+curationC);
									System.out.println("Jugador ha realizado ataque pesado. Hueco 1 ha realizado ataque ligero");
									System.out.println();
								} // if 2
								if (z == 3) {
									health = health - ((int) (Math.random() * (15 - 5 + 1) + 5));
									System.out.println("vida hueco 1: "+hueco1+"\nVida "+username+": "+health+"\nPociones: "+curationC);
									System.out.println(username+" ha realizado esquive. Hueco 1 ha realizado ataque ligero");
									System.out.println();
								} // if 3
								if (z == 4) {
									health = health - ((int) (Math.random() * (20 - 10 + 1) + 10));
									System.out.println("vida hueco 1: "+hueco1+"\nVida "+username+": "+health+"\nPociones: "+curationC);
									System.out.println(username+" ha realizado protección. Hueco 1 ha realizado ataque pesado.");
									System.out.println();
								} // 4
								if (z == 5) {
									if (curationC>0) {
									hueco1 = hueco1 + ((int) (Math.random() * (10 - 5 + 1) + 5));
									health = health + ((int) (Math.random() * (50 - 20 + 1) + 1));
									System.out.println("vida hueco 1: "+hueco1+"\nVida "+username+": "+health+"\nPociones: "+curationC);
									System.out.println(username+" ha realizado Curación. Hueco 1 ha realizado Curación");
									System.out.println();
									curationC=curationC-1;
									}
									if (curationC==0) {
										System.out.println("No te quedan pociones de salud.");
										System.out.println();
									}
								} // 5
							}//hueco1
								while(hueco2>0){
									System.out.println("vida hueco 2: "+hueco2+"\nVida "+username+": "+health+"\nPociones: "+curationC);
									System.out.println("1-Ataque rapido\n2-Ataque pesado\n3-Esquivar\n4-protegerse\n5-Curarse");
									int z=s.nextInt();
									
									if (z == 1) {
										hueco2 = hueco2 - ((int) (Math.random() * (20 - 10 + 1) + 10));
										health = health - ((int) (Math.random() * (20 - 10 + 1) + 10));
										System.out.println("vida hueco 2: "+hueco2+"\nVida "+username+": "+health+"\nPociones: "+curationC);
										System.out.println(username+" ha realizado ataque ligero. Hueco 2 ha realizado ataque pesado.");
										System.out.println();
									} // if 1
									if (z == 2) {
										hueco2 = hueco2 - ((int) (Math.random() * (30 - 10 + 1) + 10));
										System.out.println("vida hueco 2: "+hueco2+"\nVida "+username+": "+health+"\nPociones: "+curationC);
										System.out.println("Jugador ha realizado ataque pesado. Hueco 2 ha realizado bloqueo");
										System.out.println();
									} // if 2
									if (z == 3) {
										health = health - ((int) (Math.random() * (15 - 5 + 1) + 5));
										System.out.println("vida hueco 2: "+hueco2+"\nVida "+username+": "+health+"\nPociones: "+curationC);
										System.out.println(username+" ha realizado esquive. Hueco 2 ha realizado ataque ligero");
										System.out.println();
									} // if 3
									if (z == 4) {
										health = health - ((int) (Math.random() * (20 - 10 + 1) + 10));
										System.out.println("vida hueco 2: "+hueco2+"\nVida "+username+": "+health+"\nPociones: "+curationC);
										System.out.println(username+" ha realizado protección. Hueco 2 ha realizado ataque pesado.");
										System.out.println();
									} // 4
									if (z == 5) {
										if (curationC>0) {
										hueco2 = hueco2 + ((int) (Math.random() * (10 - 5 + 1) + 5));
										health = health + ((int) (Math.random() * (50 - 20 + 1) + 1));
										System.out.println("vida hueco 2: "+hueco2+"\nVida "+username+": "+health+"\nPociones: "+curationC);
										System.out.println(username+" ha realizado Curación. Hueco 2 ha realizado Curación");
										System.out.println();
										curationC=curationC-1;
										}
										if (curationC==0) {
											System.out.println("No te quedan pociones de salud.");
											System.out.println();
										}
									} // 5
							}//hueco2
								
								
								if (hueco1<= 0 && hueco2 <= 0) {
									System.out.println("HAS GANADO!");
									System.out.println("RECOMPENSA: 10 MONEDA DE ORO Y 1 POCION DE SALUD.");
									System.out.println("*Has conseguido acabar con ellos, y ahora te diriges a un gran patio central de la prisión, acercandote cada vez mas a la salida, y al demonio...*");
									curationC=curationC+1;
									parte2caballero();
									break;
								}
								if (health<= 0) {
									System.out.println("HAS MUERTO!");
									System.out.println("\n\n\nY asi el noble caballero murió intentando escapar del Asilo de los No Muertos, y se convirtió en un hueco mas que protegía el lugar...");
									System.exit(0);
								}
							}
							}
						}
						default:{
							System.out.println("La opción elegida no es valida.");
							elec2 = s.nextInt();
							break;
							}
						}
			
		case 2:
			System.out.println("Decides que estas harto de aventuras y luchas y prefieres descansar aqui junto a tu viejo amigo de la orden de la llama.");
			System.out.println(".\n.\n.\n.");
			System.out.println("HAS MUERTO!");
			System.exit(0);
		default:
			System.out.println("La opción elegida no es valida.");
			eleccion = s.nextInt();
			break;
		
		}
	}
	public static void parte2caballero() {
		System.out.println("*Decides bajar al gran patio, donde se encuentra una gran puerta de hierro, y al otro lado, el Demonio Salvaje que protege la unica salida del lugar.\n"
				+ "Tras intentar abrirla, y ver que es imposible, decides dar un rodeo dirigiendote por una puerta situada a la izquierda de la gran puerta,\n"
				+ "la cual llevaba a unos calabozos donde se encontraban varios no muertos y huecos encerrados.*\n"
				+ "1-Atravesar los calabozos.\n");
				int x = s.nextInt();
				while (x!=1) {
					System.out.println("1-Atravesar los calabozos.");
					x = s.nextInt();
				}
				if(x==1) {
				System.out.println(username+": Pobres desgraciados... Que la llama guie vuestras almas.\n"
				+ "*Atraviesas los pasillos llenos de celdas y salas, observando como los no muertos te observan esperanzados de que tu pudieses matar al demonio.\n"
				+ "Tras cruzar los calabozos casi sin problemas, con algun encontronazo sin importancia, llegas a la otra salida de loz calabozos que da al patio de entrada\n"
				+ "de la prision, donde hace guardia sin descanso el Demonio Salvaje.*\n\n"
				+ username+": Solo hay un camino... A traves del Demonio, hacía la libertad. Que la llama guie mi fuerza!\n"
						+ "1-Atacar al Demonio\n");
					int z=s.nextInt();
					while (x!=1) {
						System.out.println("1-Atacar al Demonio.");
						z = s.nextInt();
					}
					if(z==1) {
					BattleBoss1C();
					}
				}
	}


	public static void parte1hechizero() {
		System.out.println(".\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.\n.");
		System.out.println("*Te encuentras en el refugio de los No Muertos, lugar recondito del reino de Lodran en el que los No Muertos son encerrados hasta que llege el fin de los tiempos,\ny son vigilados por demonios para que no puedan escapar..."
				+ "El propio reino fue destrozado por los demonios hace tiempo, y aunque fueron derrotados, todavia vagan a sus anchas por estas tierras...\n"
				+ "Te encuentras en la vieja biblioteca del refugio, en la que pasas tus dias leyendo acerca de magias oscuras y poderosas, capaces de destruir a los demonios\n "
				+ "con solo unas palabras. Te encuentras solo, leyendo 'El Codice de los Oscuros' en busca de sus debilidades, cuando escuchas el sonido de una pelea;\n"
				+ "Unos No Muertos, se estan peleando en el patio central, frente al Demonio Salvaje que guarda la puerta, y parece que estos intentan escapar del refugio. "
				+ username+": Puede que esta sea mi oportunidad de escapar de aqui, mientras esos inutiles distraen a la bestia puedo aprovechar a escapar.\n\n");
		
		System.out.println("1-Aprovechar la revuelta para intentar escapar rapidamente"
				+ "\n2-No hacer nada y quedarte en el refugio hasta el fin de tus dias");
		int eleccion=s.nextInt();
		switch (eleccion) {
		
		case 1:
			System.out.println("Aprovechas la ocasion para bajar a los calabozos rapidamente y poder ir por la entrada secundaria al patio de entrada, donde se encuentra el demonio.\n"
					+ "En los calabozos parace que hay algunos huecos pero no son hostiles a no ser que les ataques.");
			System.out.println("1-Seguir tranquilamente hasta el patio interior."
					+ "\n2-Atacar a los Huecos");
			int eleccion2=s.nextInt();
			switch (eleccion2) {
			case 1:
				System.out.println(username+": Yo no os ataco y vosotros no me atacais, y todos felices claro que si.\n"
						+ "Te diriges al patio interior mientras escuchas los ruidos de pelea de los otros no muertos que intenan escapar.");
				BattleBoss1H();
				break;
			case 2:
				System.out.println(username+": Me vendra bien un poco de practica de lucha.");
				combateOpcionalHechizero();
				break;
			}
		case 2: 
			System.out.println("Al parecer tu no eres el No muerto elegido para salvar el mundo, pues decides quedarte en el refugio hasta que dejes de ser tu mismo "
					+ "\ny te conviertas en un hueco mas.");
			System.exit(0);
			
		
		}
		
	}

	
	public static void combateOpcionalHechizero() {
		System.out.println(username+": VENID AQUI ESCORIA!!\n"
				+ "*Atacas a los huecos eliminando a dos de ellos rapidamente antes de que puedan reaccionar, mientras otros 2 huecos asumen posiciones de cobate y se preparan para hacerte frente.*");
		System.out.println("1-A LUCHAR!");
		int x = s.nextInt();

		
		if (x != 1) {
			System.out.println("1-A LUCHAR!");
			x = s.nextInt();
		}
		if (x == 1) {
			int hueco1=50;
			int hueco2=60;
			while(health>0) {
			while(hueco1>0){
				System.out.println("vida hueco 1: "+hueco1+"\nVida "+username+": "+health+"\nHechizos: "+hechizos);
				System.out.println("1-Bola de fuego(a distancia)\n2-Mano Relampago(Cercano)\n3-Esquivar\n4-Curarse");
				int z=s.nextInt();
				
			if (z == 1) {
				if(hechizos >0) {
				hueco1 = hueco1 - ((int) (Math.random() * (50 - 10 + 1) + 10));
				System.out.println("vida hueco 1: "+hueco1+"\nVida "+username+": "+health+"\nHechizos: "+hechizos);
				System.out.println(username+" ha realizado bola de fuego. Hueco 1 esta en llamas.");
				System.out.println();
				hechizos=hechizos-1;
				}
				else {
					health = health - ((int) (Math.random() * (15 - 5 + 1) + 5));
					System.out.println("No te quedan hehizos.\nHueco 1 ha realizado ataque ligero");
				}
			} // if 1
			if (z == 2) {
				if(hechizos >0) {
				hueco1 = hueco1 - ((int) (Math.random() * (100 - 50 + 1) + 10));
				health = health - ((int) (Math.random() * (30 - 5 + 1) + 5));
				System.out.println("vida hueco 1: "+hueco1+"\nVida "+username+": "+health+"\nHechizos: "+hechizos);
				System.out.println("Jugador ha realizado Mano Relampago. Hueco 1 ha realizado ataque pesado");
				System.out.println();
				hechizos=hechizos-1;
				}
				else {
					health = health - ((int) (Math.random() * (30 - 5 + 1) + 5));
					System.out.println("No te quedan hehizos.\nHueco 1 ha realizado ataque pesado");
				}
			} // if 2
			if (z == 3) {
				health = health - ((int) (Math.random() * (10 - 0 + 1) + 0));
				System.out.println("vida hueco 1: "+hueco1+"\nVida "+username+": "+health+"\nHechizos: "+hechizos);
				System.out.println(username+" ha realizado esquive. Hueco 1 ha realizado ataque ligero");
				System.out.println();
				
			} // if 3
			if (z == 4) {
				hueco1 = hueco1 + ((int) (Math.random() * (10 - 5 + 1) + 5));
				health = health + ((int) (Math.random() * (50 - 30 + 1) + 1));
				System.out.println("vida hueco 1: "+hueco1+"\nVida "+username+": "+health+"\nHechizos: "+hechizos);
				System.out.println(username+" ha realizado Curación. Hueco 1 ha realizado Curación");
				System.out.println();
				
			} // 4
		}
			while(hueco2>0){
				System.out.println("vida hueco 2: "+hueco2+"\nVida "+username+": "+health+"\nHechizos: "+hechizos);
				System.out.println("1-Bola de fuego(a distancia)\n2-Mano Relampago(Cercano)\n3-Esquivar\n4-Curarse");
				int z=s.nextInt();
				
				if (z == 1) {
					if(hechizos >0) {
					hueco2 = hueco2 - ((int) (Math.random() * (50 - 10 + 1) + 10));
					System.out.println("vida hueco 2: "+hueco2+"\nVida "+username+": "+health+"\nHechizos: "+hechizos);
					System.out.println(username+" ha realizado bola de fuego. Hueco 2 esta en llamas.");
					System.out.println();
					hechizos=hechizos-1;
					}
					else {
						health = health - ((int) (Math.random() * (15 - 5 + 1) + 5));
						System.out.println("No te quedan hehizos.\nHueco 2 ha realizado ataque ligero");
					}
				} // if 1
				if (z == 2) {
					if(hechizos >0) {
					hueco2 = hueco2 - ((int) (Math.random() * (100 - 50 + 1) + 10));
					health = health - ((int) (Math.random() * (30 - 5 + 1) + 5));
					System.out.println("vida hueco 2: "+hueco2+"\nVida "+username+": "+health+"\nHechizos: "+hechizos);
					System.out.println("Jugador ha realizado Mano Relampago. Hueco 2 ha realizado ataque pesado");
					System.out.println();
					hechizos=hechizos-1;
					}
					else {
						health = health - ((int) (Math.random() * (30 - 5 + 1) + 5));
						System.out.println("No te quedan hehizos.\nHueco 2 ha realizado ataque pesado");
					}
				} // if 2
				if (z == 3) {
					health = health - ((int) (Math.random() * (10 - 0 + 1) + 0));
					System.out.println("vida hueco 2: "+hueco2+"\nVida "+username+": "+health+"\nHechizos: "+hechizos);
					System.out.println(username+" ha realizado esquive. Hueco 2 ha realizado ataque ligero");
					System.out.println();
					
				} // if 3
				if (z == 4) {
					hueco2 = hueco2 + ((int) (Math.random() * (10 - 5 + 1) + 5));
					health = health + ((int) (Math.random() * (50 - 30 + 1) + 1));
					System.out.println("vida hueco 2: "+hueco2+"\nVida "+username+": "+health+"\nHechizos:"+hechizos);
					System.out.println(username+" ha realizado Curación. Hueco 2 ha realizado Curación");
					System.out.println();
					
				} // 4
				

		}
			
			
			if (hueco1<= 0 && hueco2 <= 0) {
				System.out.println("HAS GANADO!");
				System.out.println("RECOMPENSA: 10 MONEDA DE ORO Y RECUPERAS 2 HECHIZOS.");
				System.out.println("*Has conseguido acabar con ellos, y ahora te diriges al patio interior donde se encuentra el Demonio Salvaje.*");
				hechizos=hechizos+2;
				BattleBoss1H();
				break;
			}
			if (health<= 0) {
				System.out.println("HAS MUERTO!");
				System.out.println("\n\n\nY asi el poderoso hechizero murió intentando escapar del Asilo de los No Muertos, y se convirtió en un hueco mas que vagaba en el lugar...");
				System.exit(0);
			}
		}
		}
	}
	
	
	public static void BattleBoss1H() {
		System.out.println("*Sigues al patio interior, mientras escuchas la lucha de otros huecos contra el demonio."
				+ "\nDe repente el Demonio te ve, y te preparas para peelear*");
		
		int x;
		System.out.println("1-Siguiente");
		x = s.nextInt();
		int z = 0;
		int vidaBoss = 750;

		if (x != 1) {
			System.out.print("Huyendo del combate!");
			System.exit(0);
		}
		if (x == 1) {
			System.out.println();
		
			while (z != 6) {
				System.out.println("vida Demonio Salvaje: "+vidaBoss+"\nVida "+username+": "+health+"\nHechizos: "+hechizos);
				System.out.println("1-Bola de fuego(a distancia)\n2-Mano Relampago(Cercano)\n3-Esquivar\n4-Curarse\n5-Huir");
				 z=s.nextInt();
				
				if (z == 1) {
					if(hechizos >0) {
					vidaBoss = vidaBoss - ((int) (Math.random() * (100 - 50 + 1) + 50));
					System.out.println("vida Demonio Salvaje: "+vidaBoss+"\nVida "+username+": "+health+"\nHechizos: "+hechizos);
					System.out.println(username+" ha realizado bola de fuego. Demonio Salvaje esta en llamas.");
					System.out.println();
					hechizos=hechizos-1;
					}
					else {
						health = health - ((int) (Math.random() * ( 25 - 5 + 1) + 5));
						System.out.println("No te quedan hehizos.\nDemonio Salvaje ha realizado ataque ligero");
					}
				} // if 1
				if (z == 2) {
					if(hechizos >0) {
					vidaBoss = vidaBoss - ((int) (Math.random() * (150 - 75 + 1) + 75));
					health = health - ((int) (Math.random() * (50 - 20 + 1) +20));
					System.out.println("vida Demonio Salvaje: "+vidaBoss+"\nVida "+username+": "+health+"\nHechizos: "+hechizos);
					System.out.println("Jugador ha realizado Mano Relampago. Demonio Salvaje ha realizado ataque pesado");
					System.out.println();
					hechizos=hechizos-1;
					}
					else {
						health = health - ((int) (Math.random() * (50 - 20 + 1) + 20));
						System.out.println("No te quedan hehizos.\nDemonio Salvaje ha realizado ataque pesado");
					}
				} // if 2
				if (z == 3) {
					health = health - ((int) (Math.random() * (25 - 0 + 1) + 0));
					System.out.println("vida Demonio Salvaje: "+vidaBoss+"\nVida "+username+": "+health+"\nHechizos: "+hechizos);
					System.out.println(username+" ha realizado esquive. Demonio Salvaje ha realizado ataque ligero");
					System.out.println();
					
				} // if 3
				if (z == 4) {
					vidaBoss = vidaBoss + ((int) (Math.random() * (20 - 10 + 1) + 10));
					health = health + ((int) (Math.random() * (70 - 30 + 1) + 1));
					System.out.println("vida Demonio Salvaje: "+vidaBoss+"\nVida "+username+": "+health+"\nHechizos: "+hechizos);
					System.out.println(username+" ha realizado Curación. Demonio Salvaje ha realizado Curación");
					System.out.println();
					
				} // 4
				
				if (health <= 0) {
					System.out.println("HAS MUERTO!");
					System.exit(0);
				} // if VIDA PLAYER

				if (vidaBoss <= 0) {
					System.out.println("HAS GANADO!");
					System.out.println("RECOMPENSA: 1 MONEDA DE ORO.");
					escaparAsilo();
				} // VIDA BOSS	
			
			}
			if (z == 5) {
				System.out.println(username +" intenta huir pero es atrapado por el Demonio Salvaje.\nHAS MUERTO! ");
				System.exit(0);
			} // if y=6
		
		}
	}

	public static void BattleBoss1C() {
		int x;
		System.out.println("1-Siguiente");
		x = s.nextInt();
		int y = 0;
		int vidaBoss = 750;

		if (x != 1) {
			System.out.print("Huyendo del combate!");
			System.exit(0);
		}

		if (x == 1) {
			System.out.println();
			System.out.println(
					"No hay vuelta atras, debes enfrentarte al Demonio Salvaje y derrotarle antes de que te mate!");
			System.out.println("Vida Demonio Salvaje:" + vidaBoss + "\nVida "+ username +":" + health+"\nPociones: "+curationC + "\n");

			while (y != 6) {
				System.out.println("1-Ataque rapido\n2-Ataque pesado\n3-Esquivar\n4-protegerse\n5-Curarse\n6-huir");
				y = s.nextInt();
				System.out.println();
				if (y == 1) {
					vidaBoss = vidaBoss - ((int) (Math.random() * (40 - 20 + 1) + 20));
					health = health - ((int) (Math.random() * (70 - 10 + 1) + 10));
					System.out.println("Vida Demonio Salvaje:" + vidaBoss + "\nVida"+ username +":" + health+"\nPociones: "+curationC);
					System.out.println(username +" ha realizado ataque ligero. Demonio Salvaje ha realizado ataque pesado.");
					System.out.println();
				} // if 1
				if (y == 2) {
					vidaBoss = vidaBoss - ((int) (Math.random() * (70 - 30 + 1) + 30));
					health = health - ((int) (Math.random() * (40 - 25 + 1) + 25));
					System.out.println("Vida Demonio Salvaje:" + vidaBoss + "\nVida "+ username +":" + health+"\nPociones: "+curationC);
					System.out.println(username +" ha realizado ataque pesado. Demonio Salvaje ha realizado ataque ligero");
					System.out.println();
				} // if 2
				if (y == 3) {
					health = health - ((int) (Math.random() * (20 - 5 + 1) + 5));
					System.out.println("Vida Demonio Salvaje:" + vidaBoss + "\nVida "+ username +":" + health+"\nPociones: "+curationC);
					System.out.println(username +" ha realizado esquive. Demonio Salvaje ha realizado ataque ligero");
					System.out.println();
				} // if 3
				if (y == 4) {
					health = health - ((int) (Math.random() * (100 - 1 + 1) + 1));
					System.out.println("Vida Demonio Salvaje:" + vidaBoss + "\nVida "+ username +":" + health+"\nPociones: "+curationC);
					System.out.println(username +" ha realizado protección. Demonio Salvaje ha realizado Ataque Final");
					System.out.println();
				} // 4
				if (y == 5) {
					if (curationC>0) {
					health = health + ((int) (Math.random() * (50 - 25 + 1) + 25));
					health = health - ((int) (Math.random() * (20 - 5 + 1) + 5));
					System.out.println("Vida Demonio Salvaje:" + vidaBoss + "\nVida "+ username +":" + health+"\nPociones: "+curationC);
					System.out.println(username +" ha realizado Curación. Demonio Salvaje ha realizado Ataque ligero");
					System.out.println();
					curationC=curationC-1;
					}
					if (curationC==0) {
						health = health - ((int) (Math.random() * (50 - 5 + 1) + 5));
						System.out.println("Vida Demonio Salvaje:" + vidaBoss + "\nVida "+ username +":" + health+"\nPociones: "+curationC);
						System.out.println(username +" no tiene pociones de curacion. Demonio Salvaje ha realizado Ataque pesado");
						System.out.println();
					}
				} // 5
				if (health <= 0) {
					System.out.println("HAS MUERTO!");
					System.exit(0);
				} // if VIDA PLAYER

				if (vidaBoss <= 0) {
					System.out.println("HAS GANADO!");
					System.out.println("RECOMPENSA: 1 MONEDA DE ORO.");
					escaparAsilo();
				} // VIDA BOSS

			} // while
			if (y == 6) {
				System.out.println(username +" intenta huir pero es atrapado por el Demonio Salvaje.\nHAS MUERTO! ");
				System.exit(0);
			} // if y=6
		}
	} // if x==1
	
	public static void escaparAsilo() {
		System.out.println("\n.\n.\n.\n.");
		System.out.println("Y así, el no muerto "+username+", gracias a sus habilidades, "
				+ "logró escapar del refugio de los no muertos, venciendo al Demonio Salvaje que impedia que los no muertos escaparan."
				+ "Y así fue como comenzó su larga travesía para cumplir con su destino, y recuperar la primera llama, "
				+ "para con ella desterrar a los siervos de la oscuridad y traer la paz a Lodran");
		System.out.println("\n.\n.\n.\n.");
		System.out.println("GRACIAS POR JUGAR! \nESTA ES UNA DEMO DE UN PROYECTO REALIZADO POR ABURRIMIENTO Y AMOR AL ARTE, SI QUIERES\nPROBAR MAS JUEGOS "
				+ "ESTATE ATENTO A LAS ULTIMAS NOTICIAS DE BLA.GAMES! UN SALUDO JUGADOR!"
				+ "\n\n\n\n\n");
		try {
			Thread.sleep(1000);
	} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		System.out.println("\n\n\n\nCreditos:\n\nDesarrollado y Producido por:\n DarZaquer");
		System.exit(0);
	}
	public static void main(String[] args) {
		intro();//  		  ________________________________  __
//							  \\	//\\	//\\	//\\    // /  |\
//	   						   \\  //  \\  //  \\  //  \\  // / B | \-
//								\\//B	\\//L   \\//A   \\//=|) L |  \
//								//\\	//\\    //\\    //\\=|) A |  /
  	   						   // S\\ O//U \\ L//  \\S //  \\ \   | /-
							  //	\\//	\\//    \\//    \\ \__|/
//	  						  --------------------------------  
	}
	}

