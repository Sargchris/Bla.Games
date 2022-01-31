package varios;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PlaceHolder {
	static Scanner s = new Scanner(System.in);
	//Player
	public static int playerHP;
	public static int maxPlayerHP;
	public static String playerClass;
	public static String playerWeapon = "Ninguna";
	public static String playerDisWeapon = "Ninguna";
	public static int playerDmg;
	public static int playerDisDmg = 0;
	public static int typeDmg; // 1 para perforante, 2 para cortante, 3 para contundente
	public static int atkBonus;
	public static int ammunition;
	public static String playerArmor;
	public static boolean bonusL = false;
	public static int playerAC;
	public static int bonusAC;
	public static int totalAC; // Hay que declarar el playerAC +bonusAC en las clases, aqu� no se puede.
	public static int galeones;
	public static boolean stealthDis = false; // en caso de usar x armaduras tienes desventaja en sigilo
	public static int SpellSlots;
	public static int MaxSpellSlots; //Cantidad de hechizos por Descanso largo
	public static int SpellBonus;
	public static int choice;
	public static int xp;
	public static int level;
	public static boolean devotado = false; // Bufo de deidad
	public static boolean marcado = false; //marcado por el sol
	//Enemy
	public static int EnemyHP;
	public static int EnemyAC;
	public static int EnemyDmg;
	//Mundo
	public static boolean fighting = false;
	public static String Day = "Es de noche";
	public static int isDay = 0;
	
	///loots
	public static int looted1 = 0; // acolito del Sol Tenso cabo
	public static int looted2 = 0; // Victima tenso cabo
	public static int looted2p1 = 0; // Victima tenso cabo
	public static int looted3 = 0; // Elegido del sol carabela
	public static boolean looted4 = false; //aposentos
	public static boolean looted5 = false;
	//Situations
	public static boolean terminada = false; // la subasta
	public static boolean Uencounter = false; // Hombre lobo Uni False = no ha sucedido
	public static boolean soborno = false; // guardias Uni
	public static boolean enganyados = false; // guardias Uni
	public static boolean encontrado = false; //Ruinas del Sol
	public static boolean bloqueado = true; //Cocina
	public static boolean Ormr = true; //Ormrinn vivo o muerto true = vivo
	public static boolean escamas = true; //recogidas o no escamas de Ormrinn
	public static boolean PasilloE = false; //Espectro pasillos False = no ha sucedido
	public static boolean armeryE = false; //Encuentro armer�a False = no ha sucedido
	public static boolean Aencounter = false; // Encuentro en los aposentos. False = no ha sucedido
	public static boolean grupCarr = false; // acolitos en la falda de la monta�a = no sucedido
	public static boolean forj = false; //forja Orm, false = no derrotado
	public static int finalshot = roll20();
	//INV
	static List<String> inv = new ArrayList<String>(); // https://stackoverflow.com/questions/22364768/inventory-system-for-a-text-based-adventure-game-in-java

	//CLASES
	
	public static void clase() {
		System.out.println("Elige tu clase: ");
		System.out.println("1- para Guerrero.");
		System.out.println("2- para Mago.");
		System.out.println("3- para Bardo.");
		System.out.println("4- para Vagabundo.");
		System.out.println("5- para Landsknecht Crigiolano.");
		int eleccion = s.nextInt();

		switch (eleccion) {
		case 1:
			StatsWarrior();
			galeones = 10;
			System.out.println("Elija su armamento: ");
			System.out.println("1- Florete [1d8 perforante] y daga velera[+1 AC]");
			System.out.println("2- Espada larga [1d10 cortante]");
			System.out.println("3- Espada de armas [1d6 cortante] y ecudo heraldico [+2 AC]");
			System.out.println("4- Maza [1d8 contundente]");
			System.out.println("5- Alabarda [2d6 cortante]");
			int starterWeapon = s.nextInt();
			switch (starterWeapon) {
			case 1:
				playerWeapon = "Florete [1d8 perforante]";
				playerDmg = (int) (1 + (Math.random() * 9));
				typeDmg = 1;
				bonusAC = 1;
				totalAC = playerAC + bonusAC;
				break;
			case 2:
				playerWeapon = "Espada Larga [1d10 cortante]";
				playerDmg = (int) (1 + (Math.random() * 11));
				typeDmg = 2;
				break;
			case 3:
				playerWeapon = "Espada de armas [1d6 cortante]";
				playerDmg = (int) (1 + (Math.random() * 7));
				typeDmg = 2;
				bonusAC = 2;
				totalAC = playerAC + bonusAC;
				break;
			case 4:
				playerWeapon = "Maza [1d8 contundente]";
				playerDmg = (int) (1 + (Math.random() * 7));
				typeDmg = 3;
				break;
			case 5:
				playerWeapon = "Alabarda [2d6 cortante]";
				playerDmg = (int) (1 + (Math.random() * 7) + (1 + (Math.random() * 7)));
				typeDmg = 2;
				break;
			default:
				System.out.println("Eso no es una opci�n");
				clase();
				break;
			} // End starterWeapon warrior
			break; // End Warrior
		case 2:
			StatsWizard();
			galeones = 20;
			System.out.println("Elija su armamento: ");
			System.out.println("1- Bast�n [1d6 contundente]");
			System.out.println("2- Daga [1d4 cortante]");
			System.out.println("3- Foco Arcano [+4 a los hechizos]");
			System.out.println("4- ballesta de mano [1d8 perforante] y 20 virotes");
			starterWeapon = s.nextInt();
			switch (starterWeapon) {
			case 1:
				playerWeapon = "bast�n [1d6 contundente]";
				playerDmg = (int) (1 + (Math.random() * 7));
				typeDmg = 3;
				break;
			case 2:
				playerWeapon = "Daga [1d4 cortante]";
				playerDmg = (int) (1 + (Math.random() * 5));
				typeDmg = 2;
				break;
			case 3:
				playerWeapon = "Foco arcano [+4 a los hechizos]";
				playerDmg = (int) (1);
				SpellBonus = SpellBonus + 4;
				typeDmg = 3;
				break;
			case 4:
				playerDisWeapon = "Ballesta de mano [1d8 perforante]";
				playerDisDmg = (int) (1 + (Math.random() * 9));
				playerDmg = 1;
				typeDmg = 3;
				ammunition = 20;
				break;
			default:
				System.out.println("Eso no es una opcci�n");
				clase();
				break;

			}// End starterWeapon wizard

			break; // End wizard
		case 3:
			StatsBard();
			galeones = 30;
			System.out.println("Elija su armamento: ");
			System.out.println("1- Florete [1d8 perforante]");
			System.out.println("2- Alfanje [1d8 cortante]");
			System.out.println("3- L�tigo [2d4 perforante]");
			System.out.println("4- Cuchillo [1d6 costante] y Daga Velera [+1AC]");
			starterWeapon = s.nextInt();

			switch (starterWeapon) {
			case 1:
				playerWeapon = "Florete [1d8 perforante]";
				playerDmg = roll8();
				typeDmg = 1;
				break;
			case 2:
				playerWeapon = "Alfanje [1d8 cortante]";
				playerDmg = roll8();
				typeDmg = 2;
				break;
			case 3:
				playerWeapon = "L�tigo [2d4 cortante]";
				playerDmg = roll4() + roll4();
				typeDmg = 2;
				break;
			case 4:
				playerWeapon = "Cuchillo [1d6 cortante]";
				playerDmg = roll6();
				typeDmg = 2;
				bonusAC = 1;
				totalAC = playerAC + bonusAC;
				break;
			default:
				System.out.println("Eso no es una opcci�n");
				clase();
				break;
			}// End stater Weapon Bard
			break; // End Bard
		case 4:
			StatsHobo();
			galeones = 0;
			System.out.println("Elija su armamento: ");
			System.out.println("1- Garrote [1d6 Contundente]");
			System.out.println("2- Cuchillo Maltrecho [1d4 Cortante]");
			starterWeapon = s.nextInt();

			switch (starterWeapon) {
			case 1:
				playerWeapon = "Garrote [1d6 Contundente]";
				playerDmg = roll6();
				typeDmg = 3;
				break;
			case 2:
				playerWeapon = "Cuchillo Maltrecho [1d4 cortante]";
				playerDmg = roll6();
				typeDmg = 2;
				break;
			default:
				System.out.println("Eso no es una opcci�n");
				clase();
				break;
			} // End starter weapon Hobo
			break;
		case 5:
			StatsLandsknecht();
			galeones = 25;
			System.out.println("Elija su armamento: ");
			System.out.println("1- Zweihander [1d12 cortante]");
			System.out.println("2- Pica [1d10 perforante]");
			System.out.println("3- Messer [1d6 cortante] y escudo de brazo Crigiolano [+1 AC]");
			System.out.println("4- Ballesta pesada con cranequin [1d10 perforante] y daga de rondel [1d4 perforante]");
			inv.add("Pluma y sombrero Crigiolano");
			starterWeapon = s.nextInt();

			switch (starterWeapon) {
			case 1:
				playerWeapon = "Zweihander [1d12 cortante]";
				playerDmg = roll12();
				typeDmg = 2;
				break;
			case 2:
				playerWeapon = "Pica [1d10 perforante]";
				playerDmg = roll10();
				typeDmg = 1;
				break;
			case 3:
				playerWeapon = "Messer [1d6 cortante]";
				playerDmg = roll6();
				bonusAC = 1;
				typeDmg = 2;
				totalAC = playerAC + bonusAC;
				break;
			case 4:
				playerWeapon = "daga de rondel [1d4 perforante]";
				playerDisWeapon = "Ballesta pesada con cranequin [1d10 perforante]";
				playerDisDmg = roll10();
				playerDmg = roll4();
				typeDmg = 1;
				ammunition = 20;
				break;
			default:
				System.out.println("Eso no es una opcci�n");
				clase();
				break;
			}

			break; // End staterweapon landsknecht Crigiolano
		default:
			System.out.println("Eso no es un opcci�n");
			clase();
			break;
		}// End selecci�n

	} // End class selection

	public static void StatsWarrior() {
		playerClass = "Guerrero";
		playerHP = (int) (1 + (Math.random() * 10)) + 5;
		maxPlayerHP = playerHP;
		playerArmor = "Cota de placas";
		atkBonus = 3;
		stealthDis = true;
		playerAC = 14;
		totalAC = playerAC + bonusAC;
		xp = 0;
		level = 1;
	} // End StatsWarrior

	public static void StatsWizard() {
		playerClass = "Mago";
		playerHP = (int) (1 + (Math.random() * 6)) + 4;
		maxPlayerHP = playerHP;
		playerArmor = "Gambes�n";
		playerAC = 11;
		totalAC = playerAC + bonusAC;
		atkBonus = 0;
		SpellSlots = 5;
		MaxSpellSlots = 5;
		xp = 0;
		level = 1;
	}// End StatsWizard

	public static void StatsBard() {
		playerClass = "Bardo";
		playerHP = roll8() + 5;
		maxPlayerHP = playerHP;
		playerArmor = "Brigantina";
		atkBonus = 2;
		playerAC = 13;
		totalAC = playerAC + bonusAC;
		xp = 0;
		level = 1;
	}

	public static void StatsHobo() {
		playerClass = "Vagabundo";
		playerHP = roll6() + 3;
		maxPlayerHP = playerHP;
		playerArmor = "Nada";
		atkBonus = 2;
		playerAC = 9;
		totalAC = playerAC + bonusAC;
		xp = 0;
		level = 1;
	}

	public static void StatsLandsknecht() {
		playerClass = "Landsknecht Crigiolano";
		playerHP = roll10() + 5;
		maxPlayerHP = playerHP;
		playerArmor = "Coraza";
		atkBonus = 3;
		playerAC = 16;
		totalAC = playerAC + bonusAC;
		xp = 0;
		level = 1;
	} // End StatsLandsknecht

	// MECANICS
	
	public static void longRest() {
		playerHP = maxPlayerHP;
		SpellSlots = MaxSpellSlots;
		DayCycle();
	}

	public static void DayCycle() {
		if (isDay % 2 == 0) {
			Day = "Es de d�a";
			isDay++;
		} else {
			Day = "Es de noche";
			isDay++;
		}
	}

	public static void enemies(int e) {
		switch (e) {
		case 1: // ac�lito del Sol melee.
			EnemyHP = (int) (1 + (Math.random() * 10) + 3);
			EnemyAC = 11;
			EnemyDmg = (int) (1 + (Math.random() * 9));
			break;
		case 2: // mago del sol
			EnemyHP = (int) (1 + (Math.random() * 6));
			EnemyAC = 9;
			EnemyDmg = roll12();
			break;
		case 3: // Elegido del Sol
			EnemyHP = roll20() + 10;
			EnemyAC = 15;
			EnemyDmg = (roll12() + roll6() + 3);
			break;
		case 4: //Herrero del sol
			EnemyHP = roll12() + roll10() + 15;
			EnemyAC = 13;
			EnemyDmg = (roll8() + roll4() + 4);
			break;
		case 5: //�ltimo bendito
			EnemyHP = 50 + roll20() + roll20() + roll20();
			if(inv.contains("Medall�n del sol quemado")) {
				EnemyHP = EnemyHP - 15;	
			}
			if(inv.contains("Frasco Estrellado")) {
				EnemyHP = EnemyHP - 15;
			}
			if (inv.contains("Sol de bronce")) {
				EnemyHP = EnemyHP - 10;
			}
			EnemyAC = 16;
			EnemyDmg = roll8() + roll6() + 6;
			break;
		} // End switch e.

	}

	public static void enemies2(int e) {
		switch (e) {
		case 1: // Ratero de los callejones
			EnemyHP = roll8() + 5;
			EnemyAC = 12;
			EnemyDmg = roll6();
			break;
		case 2: // Guarda Uni
			EnemyHP = roll6() + 10;
			EnemyAC = 14;
			EnemyDmg = (roll6() + roll6());
			break;
		}
	}

	public static void beasts(int e) {
		switch (e) {
		case 1: // Hombre Lobo
			EnemyHP = roll8() + roll8() + roll8() + roll8() + 18;
			EnemyAC = 13;
			EnemyDmg = roll4() + roll4() + roll8() + 5;
			break;
		case 2: //Ormrinn
			EnemyHP = 30 + roll10() + roll6() + roll6();
			EnemyAC = 15;
			EnemyDmg = roll8() + roll10() + 10;
			break;
		case 3: //awaken armor
			EnemyHP = 20 + roll12();
			if(typeDmg == 3) {EnemyAC = 14;} else {EnemyAC = 18;}
			EnemyDmg = roll8() + 4;
			
			break;
		}
	}

	public static void SolarBeasts(int e) {
		switch (e) {
		case 1: // Sabueso Solar
			EnemyHP = roll8() + roll8() + 11;
			EnemyAC = 14;
			EnemyDmg = roll6() + roll6() + roll6() + roll6() + roll6() + roll6();
			break;
		case 2: //Espectro del sol
			EnemyHP = roll10() + 15 + roll8();
			EnemyAC = 13;
			EnemyDmg = roll4() + roll4() + roll4() + 2;
			break;
		case 3: //Fragmento de luz
			EnemyHP = 40 + roll20() + roll6();
			EnemyAC = 14;
			EnemyDmg = 6 + roll10() + roll8() + roll8();
			break;
		}
	}

	public static void ataque() {
		if (roll20() + atkBonus < EnemyAC) {
			System.out.println("Tu ataque ha fallado.");
			if (roll20() < totalAC) {
				System.out.println("El ataque enemigo ha fallado.");
			}
		} else {
			EnemyHP = EnemyHP - playerDmg;
			playerHP = playerHP - EnemyDmg;
			System.out.println(
					"Atacas al enemigo, pero en el proceso tambi�n sufres da�os. Tu HP actual es: " + playerHP);
			if (playerHP <= 0) {
				muerte();
			}
			if (EnemyHP <= 0) {
				fighting = false;
			}
		} // final else ataque
	}

	public static void ataqueDistancia() {
		if (roll20() + atkBonus < EnemyAC) {
			System.out.println("Tu ataque ha fallado");
			ammunition = ammunition - 1;
		} else {
			if (ammunition > 0) {
				EnemyHP = EnemyHP - playerDisDmg;
				ammunition = ammunition - 1;
				System.out.println("Disparas tu arma hiriendo a tu enemigo.");
				if (playerHP <= 0) {
					muerte();
				}
				if (EnemyHP <= 0) {
					fighting = false;
				}
			} else {
				System.out.println("No te queda munici�n que disparar.");
			}
		}
	}

	public static void defensa() {
		if (roll20() < playerAC + 4) {
			System.out.println("Adoptas una pose defensiva y evitas sufrir da�o alguno.");
		} else {
			playerHP = playerHP - EnemyDmg;
			System.out.println("El enemigo consigue superar tu defensa. Tu HP actual es: " + playerHP);
			if (playerHP <= 0) {
				muerte();
			}
		}
	}

	public static void observar() {
		if (EnemyHP > (EnemyHP / 4) * 3) {
			System.out.println("El enemigo aparenta estar en buenas condiciones");

		} else {
			if (EnemyHP > (EnemyHP / 4) * 2) {
				System.out.println("El enemigo aparenta esta bapuleado, pero lo suficiente para seguir peleando.");
			} else {
				if (EnemyHP > (EnemyHP / 4) * 1) {
					System.out.println("El enemigo se ve terriblemente herido.");
				}
			}
		}
	}

	public static void muerte() {
		System.out.println("Tus esfuerzos has resultado futiles al final.");
		System.out.println("Al menos lo intentaste...");
		System.out.println("***EL SOL HA MUERTO***");
		System.exit(0);
	}

	public static void fight(int f) {
		fighting = true;
		System.out.println("Adoptas una posici�n de combate frente a tu enemigo.");
		enemies(f);
		while (EnemyHP > 0) {
			System.out.println("Elige que hacer");
			System.out.println("1- atacar cuerpo a cuerpo");
			System.out.println("2- ataque a distancia");
			System.out.println("3- Defenderse");
			System.out.println("4- observar al rival");
			System.out.println("5- inventario");
			if (playerClass == "Mago") {
				System.out.println("6- Hechizos"); // System.out.println("");
			}
			choice = s.nextInt();
			if (choice > 4 && playerClass != "Mago") {
				System.out.println("Eso no es una opci�n");
			}

			switch (choice) {
			case 1:
				ataque();
				break;
			case 2:
				ataqueDistancia();
				break;
			case 3:
				defensa();
				break;
			case 4:
				observar();
				break;
			case 5:
				inventory();
				break;
			case 6:
				if (playerClass == "Mago") {
					DoMagic();
				} else {
					System.out.println("No posees la capacidad de usa magia.");
				}
				break;
			default:
				System.out.println("Eso no es una opci�n");
				break;
			}

			if (EnemyHP <= 0) {
				fighting = false;
			}

			if (playerHP <= 0) {
				muerte();
			}

		} // fin while fighting

		if (f == 1 || f == 2) {
			xp = xp + 25;
		}

		checkLvl();
	}

	public static void fight2(int f) {
		fighting = true;
		System.out.println("Adoptas una posici�n de combate frente a tu enemigo.");
		enemies2(f);
		while (EnemyHP > 0) {
			System.out.println("Elige que hacer");
			System.out.println("1- atacar cuerpo a cuerpo");
			System.out.println("2- ataque a distancia");
			System.out.println("3- Defenderse");
			System.out.println("4- observar al rival");
			System.out.println("5- inventario");
			if (playerClass == "Mago") {
				System.out.println("6- Hechizos"); // System.out.println("");
			}
			choice = s.nextInt();
			if (choice > 4 && playerClass != "Mago") {
				System.out.println("Eso no es una opci�n");
			}

			switch (choice) {
			case 1:
				ataque();
				break;
			case 2:
				ataqueDistancia();
				break;
			case 3:
				defensa();
				break;
			case 4:
				observar();
				break;
			case 5:
				inventory();
				break;
			case 6:
				if (playerClass == "Mago") {
					DoMagic();
				} else {
					System.out.println("No posees la capacidad de usa magia.");
				}
				break;
			default:
				System.out.println("Eso no es una opci�n");
				break;
			}

			if (EnemyHP <= 0) {
				fighting = false;
			}

			if (playerHP <= 0) {
				muerte();
			}

		} // fin while fighting

		if (f == 1 || f == 2) {
			xp = xp + 25;
		}

		checkLvl();
	}

	public static void fightBeast(int f) {
		fighting = true;
		System.out.println("Adoptas una posici�n de combate frente a tu enemigo.");
		beasts(f);
		while (EnemyHP > 0) {
			System.out.println("Elige que hacer");
			System.out.println("1- atacar cuerpo a cuerpo");
			System.out.println("2- ataque a distancia");
			System.out.println("3- Defenderse");
			System.out.println("4- observar al rival");
			System.out.println("5- inventario");
			if (playerClass == "Mago") {
				System.out.println("6- Hechizos"); // System.out.println("");
			}
			choice = s.nextInt();
			if (choice > 4 && playerClass != "Mago") {
				System.out.println("Eso no es una opci�n");
			}

			switch (choice) {
			case 1:
				ataque();
				break;
			case 2:
				ataqueDistancia();
				break;
			case 3:
				defensa();
				break;
			case 4:
				observar();
				break;
			case 5:
				inventory();
				break;
			case 6:
				if (playerClass == "Mago") {
					DoMagic();
				} else {
					System.out.println("No posees la capacidad de usa magia.");
				}
				break;
			default:
				System.out.println("Eso no es una opci�n");
				break;
			}

			if (EnemyHP <= 0) {
				fighting = false;
			}

			if (playerHP <= 0) {
				muerte();
			}

		} // fin while fighting

		if (f == 1) {
			xp = xp + 300;
		} else if (f == 2) {
			xp = xp + 400;
		} else if (f == 3) {
			xp = xp + 250;
		}

		checkLvl();
	}

	public static void fightSolarBeasts(int f) {
		fighting = true;
		System.out.println("Adoptas una posici�n de combate frente a tu enemigo.");
		SolarBeasts(f);
		while (EnemyHP > 0) {
			System.out.println("Elige que hacer");
			System.out.println("1- atacar cuerpo a cuerpo");
			System.out.println("2- ataque a distancia");
			System.out.println("3- Defenderse");
			System.out.println("4- observar al rival");
			System.out.println("5- inventario");
			if (playerClass == "Mago") {
				System.out.println("6- Hechizos"); // System.out.println("");
			}
			choice = s.nextInt();
			if (choice > 4 && playerClass != "Mago") {
				System.out.println("Eso no es una opci�n");
			}

			switch (choice) {
			case 1:
				ataque();
				break;
			case 2:
				ataqueDistancia();
				break;
			case 3:
				defensa();
				break;
			case 4:
				observar();
				break;
			case 5:
				inventory();
				break;
			case 6:
				if (playerClass == "Mago") {
					DoMagic();
				} else {
					System.out.println("No posees la capacidad de usa magia.");
				}
				break;
			default:
				System.out.println("Eso no es una opci�n");
				break;
			}

			if (EnemyHP <= 0) {
				fighting = false;
			}

			if (playerHP <= 0) {
				muerte();
			}

		} // fin while fighting

		if (f == 1) {
			xp = xp + 325;
		} else if (f ==2) {
			xp = xp + 150;
		} else if (f == 3) {
			xp = xp + 500;
		}

		checkLvl();
	}

	public static void checkLvl() {
		if (xp >= 300 && level < 2) {
			level = 2;
			if (playerClass == "Guerrero") {
				maxPlayerHP = maxPlayerHP + (roll10() + 3);
				System.out.println("has subido al nivel: " + level);
			} // End lvlup warrior
			if (playerClass == "Mago") {
				maxPlayerHP = maxPlayerHP + (roll6() + 2);
				System.out.println("has subido al nivel: " + level);
			} // End lvlup wizard
			if (playerClass == "Bardo") {
				maxPlayerHP = maxPlayerHP + (roll8() + 3);
				System.out.println("has subido al nivel: " + level);
			} // End lvlup bard
			if (playerClass == "Vagabundo") {
				maxPlayerHP = maxPlayerHP + (roll6() + 1);
				System.out.println("has subido al nivel: " + level);
			} // End lvlup hobo
			if (playerClass == "Landsknecht Crigiolano") {
				maxPlayerHP = maxPlayerHP + (roll10() + 5);
				System.out.println("has subido al nivel: " + level);
			}
		} // Ends lvl2 check
		if (xp >= 900) {
			level = 3;
			if (playerClass == "Guerrero") {
				maxPlayerHP = maxPlayerHP + (roll10() + 3);
				System.out.println("has subido al nivel: " + level);
			} // End lvlup warrior
			if (playerClass == "Mago") {
				maxPlayerHP = maxPlayerHP + (roll6() + 2);
				System.out.println("has subido al nivel: " + level);
			} // End lvlup wizard
			if (playerClass == "Bardo") {
				maxPlayerHP = maxPlayerHP + (roll8() + 3);
				System.out.println("has subido al nivel: " + level);
			} // End lvlup bard
			if (playerClass == "Vagabundo") {
				playerHP = playerHP + (roll6() + 1);
				System.out.println("has subido al nivel: " + level);
			} // End lvlup hobo
			if (playerClass == "Landsknecht Crigiolano") {
				maxPlayerHP = maxPlayerHP + (roll10() + 5);
				System.out.println("has subido al nivel: " + level);
			}
		} // Ends lvl3 check
	}

	public static void DoMagic() {
		System.out.println("Puedes hacer los siguiente hechizos");
		System.out.println("1- Misil m�gico.");
		System.out.println("2- Spray venenoso.");
		System.out.println("3- Saeta de fuego.");
		if (level >= 2) {
			System.out.println("4- M�sculos decayentes");
			System.out.println("5- Catapulta");
		} else if (level >= 3) {
			System.out.println("6- Dedos de medusa");
			System.out.println("7- Fuego compacto");
		}
		int h = s.nextInt();

		if (SpellSlots <= 0) {
			System.out.println("No te quedan Spell Slots, no puedes hacer magia.");
		} else {
			switch (h) {
			case 1:
				if (roll20() + SpellBonus < EnemyAC) {
					System.out.println("Tu hechizo ha fallado.");
					SpellSlots--;
				} else {
					EnemyHP = EnemyHP - (roll4() + roll4() + roll4() + SpellBonus);
					SpellSlots--;
					System.out.println(
							"Tres proyectiles de un azul celeste brotan de tus dedos, directos contra tu enemigo");
				}
				break; // End Magic Missile
			case 2:
				if (roll20() + SpellBonus < EnemyAC) {
					System.out.println("Tu hechizo ha fallado.");
					SpellSlots--;
				} else {
					EnemyHP = EnemyHP - (roll6() + roll6() + SpellBonus);
					SpellSlots--;
					System.out.println(
							"De los poros de tu mano empiezan a salir cientos de gotas de veneno que caen sobre tu enemigo.");
				}
				break; // End
			case 3:
				if (roll20() + SpellBonus < EnemyAC) {
					System.out.println("Tu hechizo ha fallado.");
					SpellSlots--;
				} else {
					EnemyHP = EnemyHP - (roll10() + SpellBonus);
					SpellSlots--;
					System.out.println(
							" Una gruesa saeta de fuego brota de la palma de tu mano que sale disparada contra tu rival");
				}
				break; // End fire bolt.
			case 4:
				if (level >= 2) {
					if (roll20() + SpellBonus < EnemyAC) {
						System.out.println("Tu hechizo ha fallado.");
						SpellSlots--;
					} else {
						EnemyHP = EnemyDmg - (roll4() + SpellBonus);
						SpellSlots--;
						System.out
								.println("Tocas  a tu oponente y sus m�sculos comienzan a proyectar un putrido hedor, "
										+ "las fuerzas de tu rival merman conforme sus m�sculos se consumen por la podredumbre");
					}
				} else {
					System.out.println("Eso no es una opci�n");
				}
				break; // End M�sculos decayentes
			case 5:
				if (level >= 2) {
					if (roll20() + SpellBonus < EnemyAC) {
						System.out.println("Tu hechizo ha fallado.");
						SpellSlots--;
					} else {
						EnemyHP = EnemyDmg - (roll8() + roll8() + SpellBonus);
						SpellSlots--;
						System.out.println(
								"Haces levitar un objeto cercano y lo lanzas en un arco contra tu oponente a gran velocidad");
					}
				} else {
					System.out.println("Eso no es una opci�n");
				}
				break; // End catapulta.
			case 6:
				if(level >= 3) {
					if (roll20() + SpellBonus < EnemyAC) {
						System.out.println("Tu hechizo ha fallado");
						SpellSlots--;
					} else {
						EnemyHP = EnemyHP - (roll12() + roll6() + SpellBonus);
						SpellSlots--;
						System.out.println("Tus dedos mutan y se vuelven mil y un venenosos tent�culos de medusa que azotan a tu enemigo.");
					}
				} else {
					System.out.println("Eso no es una opci�n");
				}
				break;
			case 7:
				if(level >= 3) {
					if(roll20() + SpellBonus < EnemyAC) {
						System.out.println("Tu hechizo ha fallado");
						SpellSlots--;
					} else {
						EnemyHP = EnemyHP - (roll20() + SpellBonus);
						SpellSlots--;
						System.out.println("De tu dedo una recta vara de ardiente naranja sale despedida atraesando tu rival como si aire fuera.");
					}
				} else {
					System.out.println("Eso no es una opci�n");
				}
				break;
			default:
				System.out.println("Eso no es una opci�n");
				break;
			}
		}
	}// End DoMagic

	public static void inventory() {
		System.out.println("********************************************************************************");
		System.out.print("Clase: ");
		System.out.println(playerClass);
		System.out.print("PV: ");
		System.out.println(playerHP);
		System.out.print("Arma: ");
		System.out.println(playerWeapon);
		System.out.print("Arma a distancia: ");
		System.out.println(playerDisWeapon);
		System.out.print("Munici�n: ");
		System.out.println(ammunition);
		System.out.print("Tipo de armadura y CA: ");
		System.out.print(playerArmor);
		System.out.print(" || ");
		System.out.println(totalAC = playerAC + bonusAC);
		System.out.print("Galeones de oro: ");
		System.out.println(galeones);
		System.out.println(Day);
		System.out.print("Nivel: ");
		System.out.println(level);
		System.out.print("Experiencia: ");
		System.out.println(xp);
		while (SpellSlots > 0) {
			System.out.print("Spell Slots: ");
			System.out.println(SpellSlots);
			System.out.print("Bonus al hechizo: ");
			System.out.println(SpellBonus);
			break;
		}
		System.out.println("********************************************************************************");
		System.out.println("Objetos: ");
		System.out.println(inv);
		System.out.println("********************************************************************************");
	}

	//BRIZARESCA
	
	public static void hoboStart() {
		System.out.println(
				"Esperas sentado frente a la puerta de la taberna Cabo Tenso, nadie te deja un misero gale�n en el bol.");
		System.out.println(
				"Dos individuos vestidos en negro y dorado con medallones de un Sol dorado en el pecho entran si volver la vista, ");
		System.out.println(
				"De un momento a otro la tarbertna monta en panico, escuchas un grito que no llegas a entender, ");
		System.out.println(
				"a trav�s del deformado vidrio ves a uno de los hombres en negro y dorado atravesando a alguien con su florete");
		System.out.println("su compa�ero aguarda pacientemente junto a �l.");
		System.out.println("�Que quieres hacer?");
		System.out.println("1- Entrar y enfrentarte al hombre del florete.");
		System.out.println("2- Entrar y enfrentarte a su acompa�ante.");
		System.out.println("3- Esperar sin hacer nada");
		choice = s.nextInt();

		switch (choice) {
		case 1:
			fight(1);
			break;
		case 2:
			fight(2);
			break;
		case 3:
			System.out.print(
					"Quedarte sin hacer nada ha sido tu mejor opci�n, al poco los asaltantes se marchan del local.");
			tensoCabo3();
			break;
		default:
			System.out.println("Eso no es un opci�n.");
			hoboStart();
			break;
		}
	}

	public static void tensoCabo() {
		System.out.printf(
				"El interior de la taberna 'Tenso Cabo' el aire huele a cerveza y a sudoroso hombre de mar, \n tocan en el escenario un grupo de cuatro bardos, con bandurrias y violines tocan 'El aparejo mal atado' aunque cuesta escucharles con todo el gent�o.\n");
		System.out.printf(
				"Mientras te levantas al terminar tu plato entran por la puerta un par de hombres, vestidos en negro y dorado, \n cubiertos por capas del pecho les cuelgan sendos colgantes con del iconograf�a del sol. \n Los hombres se dirigen con decisi�n a una de las mesas donde un comensal les advierte y nervioso se levanta, \n");
		System.out.printf(
				"Uno de los hombres desenvaina un florete y ensarta sin pensar al hombre asustado. todos en la taberna gritan. \n 'Sol est in linea ad supplicium!' Grita el hombre del florete con este a�n atravesando a su victima"); // The
																																																											// sun
																																																											// is
																																																											// in
																																																											// line
																																																											// to
																																																											// execution

		System.out.println("�Que quieres hacer?");
		System.out.println("1- Combatir al hombre del florete.");
		System.out.println("2- Combatir a su acompa�ante.");
		System.out.println("3- Intentar huir por la puerta.");
		System.out.println("4- Intentar huir por una de las ventanas.");
		System.out.println("5- No hacer nada.");
		choice = s.nextInt();
		switch (choice) {
		case 1:
			fight(1);
			break;
		case 2:
			fight(2);
			break;
		case 3:
			System.out.println("Intentas salir por la puerta");
			if (roll20() > 10) {
				System.out.println("Consigues huir de la taberna sin meterte en ning�n embrollo.");
				plaza2();
			} else {
				System.out.println("Mientras te intentas escabullir ente la confusa gente uno de los hombres te ve,");
				System.out.println("Se acerca a ti de forma poco amigable, preparate a luchar");
				fight(2);
			}
			break;
		case 4:
			if (roll20() > 15) {
				System.out.println(
						"Consigues acercarte lo suficiente como para abrirla con disimulo y salir por la misma de la taberna.");
				plaza2();
			} else {
				System.out.println(
						"Te acercas a una de las ventanas, pero est�n cerradas y acbas de llmar mucho la atenci�n.");
				System.out.println("Uno de los hombres te ve, y se acerca a t� de forma poco amigable.");
				fight(2);
			}
			break;
		case 5:
			System.out.print(
					"Quedarte sin hacer nada ha sido tu mejor opci�n, despues de su frase ambos asltantes se marchan.");
			tensoCabo3();
			break;
		default:
			System.out.println("Eso no es un opci�n.");
			tensoCabo();
			break;
		} // fin switch choice

		tensoCabo2();

	} // End tensoCabo

	public static void tensoCabo2() {

		System.out.println("Tras acabar con tu rival su acompa�ante huye despavorido");
		System.out.println("�Que quiere hacer?");
		System.out.println("1- Marcharte a la plaza.");
		System.out.println("2- Inspeccionar el cadaver de tu rival.");
		System.out.println("3- Inspeccionar el cadaver de la victima.");
		System.out.println("4- Inventario.");
		System.out.println("5- Descansar.");
		System.out.println("6- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 6) {
			switch (choice) {
			case 1:
				plaza();
				break;
			case 2:
				if (looted1 == 0) {
					System.out.println("Revisando en el inerte cuerpo encuentras: ");
					System.out.println("Un pu�ado de galeones de Oro");
					galeones = galeones + roll8();
					System.out.println("Un florete [1d8 perforante]. �Quieres cogerlo?");
					System.out.println("[Esta acci�n cambiar� tu arma de forma irreversible]");
					System.out.println("1- Coger florete");
					System.out.println("2- ignorar");
					int cog = s.nextInt();
					if (cog == 1) {
						playerWeapon = "Florete [1d8 perforante]";
						playerDmg = (int) (1 + (Math.random() * 9));
						typeDmg = 1;
					}
					looted1++;
					tensoCabo2();
				}
				if (looted1 > 0) {
					System.out.println("No queda nada m�s de inter�s");
					tensoCabo2();
				}
				break;
			case 3:
				if (looted2 == 0) {
					System.out.println("Revisando en el inerte cuerpo encuentras: ");
					System.out.println("Un pu�ado de galeones de Oro");
					galeones = galeones + roll4();
					System.out.println("Un medall�n con iconograf�a del Sol");
					System.out.println("�Quieres coger el medall�n?");
					System.out.println("1- Cogerlo.");
					System.out.println("2- Ignorarlo.");
					int cogMed = s.nextInt();
					if (cogMed == 1) {
						inv.add("Medall�n del sol");
					}
					looted2++;
					tensoCabo2();
				}
				if (looted2 > 0) {
					System.out.println("No queda nada m�s de inter�s");
					tensoCabo2();
				}
				break;
			case 4:
				inventory();
				tensoCabo2();
				break;
			case 5:
				longRest();
				tensoCabo2();
				break;
			default:
				System.out.println("Eso no es una opci�n");
				tensoCabo2();
				break;
			}// end switch choice
		} // end while
		if (choice == 6) {
			System.exit(0);
		}
	}

	public static void tensoCabo3() {

		System.out
				.println("Al final ambos asaltantes terminan por abandonar la taberna dejando nada m�s que silencio.");
		System.out.println("�Que quiere hacer?");
		System.out.println("1- Marcharte a la plaza.");
		System.out.println("2- Inspeccionar el cadaver de la victima.");
		System.out.println("3- Inventario.");
		System.out.println("4- Descansar.");
		System.out.println("5- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 5) {
			switch (choice) {
			case 1:
				plaza();
				break;
			case 2:
				if (looted2p1 == 0) {
					System.out.println("Revisando en el inerte cuerpo encuentras: ");
					System.out.println("Un pu�ado de galeones de Oro");
					galeones = galeones + roll4();
					System.out.println("Un medall�n con iconograf�a del Sol"); // System.out.println("");
					System.out.println("�Quieres coger el medall�n?");
					System.out.println("1- Cogerlo.");
					System.out.println("2- Ignorarlo.");
					int cogMed = s.nextInt();
					if (cogMed == 1) {
						inv.add("Medall�n del sol");
					}
					looted2p1++;
					tensoCabo3();
				}
				if (looted2p1 > 0) {
					System.out.println("No queda nada m�s de inter�s");
					tensoCabo3();
				}
				break;
			case 3:
				inventory();
				tensoCabo3();
				break;
			case 4:
				longRest();
				tensoCabo3();
				break;
			default:
				System.out.println("Eso no es una opci�n");
				tensoCabo3();
				break;
			}// end switch choice
		} // end while

		if (choice == 5) {
			System.exit(0);
		}

	}

	public static void viaPrincipalO() {

		System.out.println(
				"Una alargada v�a, cruzando de lado a lado brizzaresca, al oeste uno atraviesa la entrada y sale de las murallas de la ciudad");
		System.out.println(
				"Al noroeste se ven por encima de las dem�s casas las torres de la universidad de Brizzaresca");
		System.out.println("Al sureste la entrada a las callejuelas te observa, al este la plaza");
		System.out.println("�A donde te diriges?");
		System.out.println("1- Al port�n de las murallas.");
		System.out.println("2- A la Universidad.");
		System.out.println("3- A las callejuelas.");
		System.out.println("4- A la plaza");
		System.out.println("5- Inventario");
		System.out.println("6- Descansar");
		System.out.println("7- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 7) {
			switch (choice) {
			case 1:
				porton();
				break;
			case 2:
				if (soborno == true || enganyados == true) {
					entradaUniversidad2();
				} else {
					entradaUniversidad1();
				}
				break;
			case 3:
				callejuelas();
				break;
			case 4:
				plaza2();
				break;
			case 5:
				inventory();
				viaPrincipalO();
				break;
			case 6:
				longRest();
				viaPrincipalO();
				break;
			default:
				System.out.println("Eso no es una opci�n");
				viaPrincipalO();
				break;
			}// End switch choice ViaPricipalO
			if (choice == 7) {
				System.exit(0);
			}
			viaPrincipalO();
		}
	}

	public static void entradaUniversidad1() {
		System.out.println("Siguiendo por una de las m�s coloridas calles de Brizzaresca");
		System.out.println("terminas llegado a la universidad mayor, donde reposa todo el");
		System.out.println("saber de la ciudad estado, o al menos eso asegura su director.");
		System.out.println("Dos hombres en coraza y alabardas guardan el campus de los no deseados");
		System.out.println("te miran con codescendencia mientras te acercas a la verja.");
		System.out.println("-�Que quieres? --Pregunta uno de ellos.");
		System.out.println("-Este no es lugar para gente Zarrapastrosa como t�. --A�ade el otro.");
		System.out.println("�Que haces?");
		System.out.println("1- Intentar dialogar tu entrada.");
		System.out.println("2- Ofrecer 10 galeones para pasar.");
		System.out.println("3- Abrite camino a la fuerza");
		System.out.println("4- Marcharte a la via oeste");
		System.out.println("5- Descansar");
		System.out.println("6- Inventario");
		System.out.println("7- Salir de la sesion [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 7) {
			switch (choice) {
			case 1:
				int result = roll20();
				if (result >= 17) {
					System.out.println("Tras un poco de enga�o y lengua viperina convences a los guardas de que");
					System.out.println(
							"estudias en la universidad de renombre y te dejan pasar tras una extensiva disculpa.");
					entradaUniversidad2();
					enganyados = true;
				} else {
					System.out.println(
							"Lo has intentado y has fallado tus palabras no han llegado a enga�as a los porteros");
					entradaUniversidad1();
				}
				break;
			case 2:
				if (galeones < 10) {
					System.out.println("No teienes dinero para sobornarles");
					entradaUniversidad1();
				} else {
					galeones = galeones - 10;
					System.out.println("No siempre necesitas una lengua de plata para entrar a los sitios");
					System.out.println("en ocasiones unas monedas de oro hacen el truco. Los guardianes no");
					System.out.println("reniegan tu oferta, te dejan pasar bajo su atenta mirada.");
					soborno = true;
					entradaUniversidad2();
				}

				break;
			case 3:
				fight2(2);
				enganyados = true;
				entradaUniversidad2();
				break;
			case 4:
				viaPrincipalO();
				break;
			case 5:
				inventory();
				entradaUniversidad1();
				break;
			case 6:
				longRest();
				entradaUniversidad1();
				break;
			default:
				System.out.println("Eso no es una opci�n");
				entradaUniversidad1();
				break;
			}// End switch choice ViaPricipalO
			if (choice == 7) {
				System.exit(0);
			}
			entradaUniversidad1();
		}
	}

	public static void entradaUniversidad2() {
		System.out.println("Siguiendo por una de las m�s coloridas calles de Brizzaresca");
		System.out.println("terminas llegado a la universidad mayor, donde reposa todo el");
		System.out.println("saber de la ciudad estado, o al menos eso asegura su director.");
		System.out.println("Dos hombres en coraza y alabardas guardan el campus de los no deseados");
		System.out.println("Sus miradas ahora ni rozan tu figura.");
		System.out.println("�Que haces?");
		System.out.println("1- Entrar a la universidad.");
		System.out.println("2- Marcharte a la via oeste");
		System.out.println("3- Descansar");
		System.out.println("4- Inventario");
		System.out.println("5- Salir de la sesion [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 5) {
			switch (choice) {
			case 1:
				if (Uencounter == true) {
					interiorUniversidad();
				} else {
					interiorUniversidadE();
				}
				break;
			case 2:
				viaPrincipalO();
				break;
			case 3:
				longRest();
				entradaUniversidad2();
				break;
			case 4:
				inventory();
				entradaUniversidad2();
				break;
			default:
				System.out.println("Eso no es una opci�n");
				entradaUniversidad2();
				break;
			}// End switch choice ViaPricipalO
		}
		if (choice == 5) {
			System.exit(0);
		}
		entradaUniversidad2();
	}

	public static void interiorUniversidadE() {
		System.out.println("Caminas por el silencioso interior de la universidad");
		System.out.println("lo unico que se escucha son las atenuadas voces de catedraticos dando clase.");
		System.out.println(
				"-Y si tuviera seis puntas su sombra tambi�n las tendr�a... -- Se escucha desde una de las aulas");
		System.out.println("Conforme caminas se se empiezan a escuchar murmullos que poco a poco escalan ha gritos");
		System.out
				.println("girando una esquina aparecen corriendo en direcci�n contraria a la tuya unas seis personas");
		System.out.println("te quedas pasmado conforme te rebasan pegando gritos que apenas forman palabras");
		System.out.println(
				"De pronto del mismo pasillo por el que han venido esos hombres se empieza a escuchar una carrera");
		System.out.println("una de algo pesado y grande, cuyas pisadas suenan a las de un sabueso rabioso");
		System.out.println(
				"m�s pronto que tarde aparece derrapando por los brillantes suelos de la universidad una forma");
		System.out.println(
				"vagamente humanoide, grande como dos hombres codo con codo, cubierto por pelaje gris y negro");
		System.out.println(
				"al final de sus manos se extienden garras largas como tu propia mano, los ojos amarillos repletos de furia");
		System.out.println(
				"se cruzan con los tuyos, la bestia arruga su hocico de canino antes de empezar a correr hac�a a t�.");
		if (inv.contains("Amuleto de paja")) {
			System.out.println("De pronto sientes un extra�o calor en ti.");
			System.out.println("el amuleto de paja comienza a arder con extra�o fuego verde");
			System.out.println("el fuego indoloro al tacto se aviva conforme la bestia se acerca, la cual al ver");
			System.out.println("las llamas se detiene en seco. Atemorizada, la bestia se lanza al suelo");
			System.out.println(
					"las verdes llamas envuelven al ser y para cuando se disipan un hombre com�n yace en el suelo");
			xp = xp + 300;
			Uencounter = true;
			interiorUniversidad();
		} else {
			System.out.println("La odiosa bestia se abalanza sobre t�.");
			System.out.println("�Que haces?");
			System.out.println("1- Le plantas cara");
			System.out.println("2- Intentas huir");
			choice = s.nextInt();

			switch (choice) {
			case 1:
				fightBeast(1);
				Uencounter = true;
				interiorUniversidad();
				break;
			case 2:
				int huida = roll20();
				if (huida >= 17) {
					System.out.println(
							"Huyes, te escondes en el primer aula que encuentras y atrancas la puerta con ayuda de algunos estudiantes.");
					System.out.println(
							"Esperais... Y al final se hace el silencio, has evitado la conforntaci�n, pero la bestia ahora ronda suelta.");
					Uencounter = true;
				} else {
					fightBeast(1);
					Uencounter = true;
					interiorUniversidad();
				}
				break;
			default:
				System.out.println("Eso no es una opci�n");
				break;
			}
		}

		interiorUniversidadE();
	}

	public static void interiorUniversidad() {
		System.out.println("Las aulas se han calmado desde el econtronazo con aquel proyecto de clase");
		System.out.println("que termin� con un licantropo rondando por los pasillos de la universidad.");
		System.out.println("Los pasillos vuelven a su normal silencio, solo irrumpido por los tutores");
		System.out.println("con la voz m�s potente. Los pasillos est� pulidos y las paredes decoradas");
		System.out.println("de formas variopintas reflejando los estudios disponibles en la universidad");
		System.out.println("�Que quieres hacer?");
		System.out.println("1- Al observatorio");
		System.out.println("2- A la biblioteca");
		System.out.println("3- A la entrada de la universidad.");
		System.out.println("4- Descansar");
		System.out.println("5- Inventario");
		System.out.println("6- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 6) {
			switch (choice) {
			case 1:
				if (Day == "Es de d�a") {
					observatorioD();
				} else {
					observatorioN();
				}
				break;
			case 2:
				biblioteca();
				break;
			case 3:
				entradaUniversidad2();
				break;
			case 4:
				longRest();
				interiorUniversidad();
				break;
			case 5:
				inventory();
				interiorUniversidad();
				break;
			} // End switch interUni
		} // End while interUni
		if (choice == 6) {
			System.exit(0);
		}

		interiorUniversidad();
	}// En interUni

	public static void biblioteca() {
		System.out.println("Pasando por las puertas al lugar m� silencioso de la universidad mayor");
		System.out.println("te encuentras rodeado de estanterias, y estas repletas de libros, una ");
		System.out.println("peque�a fortuna en papel, cuero y mano de obra al alcance de cualquiera.");
		System.out.println("Sorprendentemente te cuesta encontrar gente en los pasillos ente estanter�as");
		System.out.println("con total libertad puedes imitar a los dem�s presentes y curiosear los libros");
		System.out.println("�Que quieres hacer?");
		System.out.println("1- Curiosear entre los libros disponibles");
		System.out.println("2- Volver a los pasillos de la universidad");
		System.out.println("3- Descansar");
		System.out.println("4- Inventario");
		System.out.println("5- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 5) {
			switch (choice) {
			case 1:
				libros();
				break;
			case 2:
				interiorUniversidad();
				break;
			case 3:
				longRest();
				biblioteca();
				break;
			case 4:
				inventory();
				biblioteca();
				break;
			}
		}
		if (choice == 5) {
			System.exit(0);
		}

		biblioteca();
	}

	public static void libros() {
		System.out.println("�Que Libro quieres coger?");
		System.out.println("1- 'El origen del mundo.'");
		System.out.println("2- 'Las rutas de Brizzaresco.'");
		System.out.println("3- 'Galeones, Caravelas y otras naves modernas.'");
		System.out.println("4- 'Los siete humores del hombre y su relaci�n con la magia.'");
		System.out.println("5- 'De la destreza y el movimiento fluido usado en la esgrima de la defensa solar.'");
		System.out.println("6- 'Mileno el hombre que acert� una flecha a trav�s de mares y oceanos.'");
		System.out.println("7- Dejar de mirar libros.");
		choice = s.nextInt();
		while (choice != 7) {
			switch (choice) {
			case 1:
				System.out.println(
						"**********************************************************************************************");
				System.out.println(
						"-------------------------------------El origen del mundo.-------------------------------------");
				System.out.println(
						"Al principio, en el vac�o c�smico vagaba sin rumbo la Medusa Eterna, pulsando electricidad");
				System.out.println(
						"de forma intermitente dotanto de vida a otros sere vagantes. Estos primero estuvieron");
				System.out.println(
						"agradecidos por el don de la vida, pero consofrme pasaron las eras en la oscuridad se");
				System.out.println(
						"volvieron celosos, desagradecidos, envidiosos del don de crear vida. Por ello atacaron,");
				System.out.println(
						"la Medusa Eterna termin� descuartizada, su cuerpo la tierra que pisamos, sus tent�culos");
				System.out.println(
						"m�s grandes cordilleras y monta�as, y los tent�culos m�s peque�os se volvieron, animales");
				System.out.println("plantas y personas que poblaron el cadaver de la Medusa.");
				System.out.println(
						"Pero la muerte no es el fin, la Medusa, como ser eterno que es sigue vivo, y poco a poco");
				System.out.println(
						"se recompone, terremotos y monta�as que en el pasado estaban dos palmos m�s al sur, nos");
				System.out.println(
						"muestran en como lo que para ella es un instante y para nosotros mil millones de milenios");
				System.out.println(
						"se recompone, reclamando sus tent�culos para atrapar a los traidores cuyos ojos maldicen ");
				System.out.println(
						"las estrellas. Cuando un muere, su cuerpo vuelve a la tierra, la Medusa lo reclama recuperando");
				System.out.println("algo que hab�a perdido.");
				System.out.println(
						"**********************************************************************************************");
				biblioteca();
				break;
			case 2:
				System.out.println(
						"**********************************************************************************************");
				System.out.println(
						"-----------------------------------Las rutas de Brizzaresco-----------------------------------");
				System.out.println("Brizzaresco mayor comerciante en este continente es considerado el padre de las rutas modernas");
				System.out.println("para el comercio con especias; con su idea de hacer un largo canal artificial en un estrecho de");
				System.out.println("tierra al sur de brizzaresca que en el pasado bloqueaba el oc�ano tormentoso del nuboso, acort�");
				System.out.println("el tiempo necesario para el comercio de especias en a�os enteros, la obra de este canal dur� m�s");
				System.out.println("de una d�cada y se completo cuando Brizzaresco yac�a en su lecho de muerte; por desgracia nunca pudo");
				System.out.println("ver su obra completada. Alguno discuten si la noticia de que el canal fue llenado el d�a anterior");
				System.out.println("siquiera lleg� a sus oidos ancianos.");
				System.out.println(
						"**********************************************************************************************");
				biblioteca();
				break;
			case 3:
				System.out.println(
						"**********************************************************************************************");
				System.out.println(
						"--------------------------Galeones, Caravelas y otras naves modernas--------------------------");
				System.out.println("El gale�n es de los barco modenos m�s grandes que funciona a vela y sin remo alguno,");
				System.out.println("son lentos pero resistentes y las ciudades los usan de forma comercial y militar");
				System.out.println("a partes iguales. Un gale�n de Brizzaresca usa tres palos con velas cuadradas y una");
				System.out.println("gavia. Estas naves masivas son capaces de alcanza siete nudos y por lo general llevan.");
				System.out.println("un tripulante por tonelada de carga auqnue esto puede variar.");
				System.out.println("");
				System.out.println("La caravela constituye otra embarcaci�n a vela de caracteristica ligera.");
				System.out.println("Las carabelas m�s famosas son aquellas de Crigiola quienes las fabrican");
				System.out.println("de forma exqusita y no tienen comparaci�n en terminos de caravelas. Por");
				System.out.println("lo general tienen entre veinte y treinta zancadas largas de eslora.");
				System.out.println("Con su forma casco ligero resultan una veloz nave apta para ganar a barlovento,");
				System.out.println("cuando a esto le sumamos los novedosos ca�ones de polvora crigiolanos los vuelven");
				System.out.println("terribles amenazas, naves r�pidas con gran capacidad destructiva.");
				System.out.println(
						"**********************************************************************************************");
				biblioteca();
				break;
			case 4:
				System.out.println(
						"**********************************************************************************************");
				System.out.println(
						"-------------------Los siete humores del hombre y su relaci�n con la magia.-------------------");
				System.out.println("Los humores que corren por el interior de una persona son siete, ni uno m�s ni uno menos.");
				System.out.println("Los humores humanos han sido estudiados desde el inicio de los tiempos, aqu� se catalogan");
				System.out.println("todos ellos tras mi estancia en el convento de Oriannera m�s all� de las monta�as de la luz.");
				System.out.println("");
				System.out.println("El primero de los humores es el m�s b�sico y necesario para el hombre: La sangre.");
				System.out.println("la sangre corre por todos y quien carezca de ella est� muerto a todos los efectos");
				System.out.println("el �rgano de la sangre es el coraz�n qui�n la purifica de forma constante.");
				System.out.println("Aquel que tiene mucha sangre, ser� un envalentonado, un amoroso sin remedio y que solo ve");
				System.out.println("lo positivo en en todo. La estaci�n cuando la sangre est� m�s activa es la primavera");
				System.out.println("");
				System.out.println("El segundo de los humores es otro sin el que se puede vivir: El aire");
				System.out.println("El aire entra y sale de las personas en el llamado 'intercambio de humores'");
				System.out.println("El aire infla el cuerpo y mantiene la forma del mismo. El organo que trabaja con el aire son");
				System.out.println("los esponjosos pulmones. Los cuales trajan de m�s en oto�o.");
				System.out.println("Aquel con exceso de aire ser� robusto y p�lido, aquel con mucho aire tendr� fuerza");
				System.out.println("envidiable pero mucho aire vac�a la testa de alguien y ser� tozudo y lento para las artes");
				System.out.println("acad�micas.");
				System.out.println("");
				System.out.println("El tercero de los humores lo constituye la bilis de oro.");
				System.out.println("Que el nombre no enga�e al lector pues la bilis de oro no es de oro ni da las cualidades");
				System.out.println("que uno esperar�a. La bilis de oro la produce el h�gado y cuando m�s produce es en verano.");
				System.out.println("Aquel con exceso de bilis de oro se puede reconocer por mal temperamento y ser de f�cil enfado");
				System.out.println(" entrando con facilidad en c�lera. especial cuidado hay que tener dado que facilmente se produce");
				System.out.println("esta bilis con el alcohol.");
				System.out.println("");
				System.out.println("El cuarto humor tambi�n est� formado por una bilis, en este caso la bilis de �bano.");
				System.out.println("El cuarto humor lo produce el bazo, y se ceba en la gente durante el solticio de invierno.");
				System.out.println("La gente con exceso de este humor se caracteriza por sus caidos hombros y aura depresiva,");
				System.out.println("y hasta que no se drena esta bilis se ver� abatidos y somnolientos cada uno de sus d�as.");
				System.out.println("");
				System.out.println("El quinto humor lo constitulle la flema que produce el cerebro.");
				System.out.println("la flema que se ceba en el invierno con la gente que menores preocupaciones tiene.");
				System.out.println("Cuando alguien tiene exceso de flema su cerebro flota en este y se volver� indiferente");
				System.out.println("a cualquier evento por muy importante que le sea al igual que estar� calmado y con ojos caidos.");
				System.out.println("");
				System.out.println("El sexto humor lo forma el humo. y lo produce la grasa.");
				System.out.println("El humo es un humor que se produce a partir del buen comer y la grasa que atrae,");
				System.out.println("por ello los m�s robustos tienen m�s a sufrir de exceso de humo. El humo es invisible y");
				System.out.println("siempre se ceba alrededor del solticio de verano.");
				System.out.println("Quien est� con sobrante de humo estar� en las nubes, el humo ocupar� cualqueir hueco en su");
				System.out.println("cuerpo y lo enviar� a los rincones m�s profundos de su imaginaci�n, la mayor�a de artistas");
				System.out.println("intentan provocarse exceso de humo para sus obras m�s ambiciosas. pero no deje�s que nadie");
				System.out.println("cometa esta locura. El tiempo prolongado bajo un exceso de humo puede terminar en demecia");
				System.out.println("y campturar a una persona en estos fantasiosos mundos que no distingen de la realidad.");
				System.out.println("");
				System.out.println("El s�ptimo humor es la esencia.");
				System.out.println("Aunque todo el mundo tenga un m�nimo de esencia que la produce todo el cuerpo");
				System.out.println("y carece de temporada alta distinguible, los m�s propensos a sufrir exceso de esencia");
				System.out.println("son aquellos capaces de convertir esta esencia en m�gia.");
				System.out.println("El exceso de esencia vuelve a una persona reservada, antip�tica y por lo general esta");
				System.out.println("gente suele buscar la soledad donde enterrase en libros y documentos durante d�as y semanas");
				System.out.println("enteras. La forma m�s facil de drenar esta esencia es simplemente forzar a la persona a convertirla");
				System.out.println("en magia.");
				System.out.println(
						"**********************************************************************************************");
				if (bonusL == false) {
					SpellBonus = SpellBonus + 1;
					bonusL = true;
				}
				biblioteca();
				break;
			case 5:
				System.out.println(
						"**********************************************************************************************");
				System.out.println(
						"--------De la destreza y el movimiento fluido usado en la esgrima de la defensa solar.--------");
				System.out.println("{El libro abre con un diagrama de un hombre partido en cuatro con una cruz en el cuerpo");
				System.out.println("y otra divisi�n igual para la cabeza}");
				System.out.println("~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Aquestas son las divisiones del oponente tal y como indic� el maestro Wareing a�os a");
				System.out.println("tanto la testa como el torso habranse de separar en cuatro cuartos, paraa ambos son:");
				System.out.println("Superior siniestro y diestro e Inferior sinistro y diestro.");
				System.out.println("Quien combate siempre tienen en mente estas particiones del oponente.");
				System.out.println("~~~~~~~~~~~~~~~~~~~~");
				System.out.println("{Ahora un complejo diagrama de formas geometricas con dibujos de plantas de pies en");
				System.out.println("diferentes lugares se presenta entre las p�ginas}");
				System.out.println("~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Aqueste el primero de los ejercicios de pies, quien domine sus pasos sobre cualquier");
				System.out.println("terreno domina cualquier combate. Ejercita este disgrama cada d�a y los consecuentes");
				System.out.println("hasta que los domines todos {Las siguientes p�ginas suponen otros diagramas similares");
				System.out.println("y ejercicios de movimiento en un combate}");
				System.out.println("~~~~~~~~~~~~~~~~~~~~");
				System.out.println("{Una figura solitaria frente a un arco de piedra sobre unos escalones sujeta un florete");
				System.out.println("en recto angulo de noventa grados, de su brazo a su torso se marcan los distintos �gulos}");
				System.out.println("~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Quien sabe sujetar su arma con destreza es superior a todo el dem�s, con un �ngulo recto");
				System.out.println("como la justicia del Sol es como sujeta uno su florete [...]");
				System.out.println("~~~~~~~~~~~~~~~~~~~~");
				System.out.println("{El libro sigue a mostrar diversos diagramas en su mayor�a compuesto de circulos, con �ngulos");
				System.out.println("de entrada para las armas, a cada diagrama le acompa�a una explicaci�n de la t�cnica y como");
				System.out.println("defenderse de esa misma t�cnica.}");
				System.out.println(
						"**********************************************************************************************");
				if (bonusL == false) {
					atkBonus = atkBonus + 1;
					bonusL = true;
				}
				biblioteca();
				break;
			case 6:
				System.out.println(
						"**********************************************************************************************");
				System.out.println(
						"-------------Mileno el hombre que acert� una flecha a trav�s de mares y oceanos.--------------");
				System.out.println("Mileno era un hombre salido de la antigua nacion de Melian, era conocido en todo feudo");
				System.out.println("por su increible arquer�a, se dice que en la coronaci�n de Iline III acert� una flecha");
				System.out.println("a mil quinientas yardas y acert� a un panal de abejas lanzado desde un trabuquete. Cabe");
				System.out.println("resaltar que Mileno es m�s leyenda que historia aunque algunos historiadores contemporaneos");
				System.out.println("aseguran que sus haza�as fueron reales. Aunque otros dicen que cada haza�a la hizo un hombre");
				System.out.println("diferente y Mileno no es m�s que un amalgama popular de todos estos hombres. Las primeras");
				System.out.println("historias sobre Mileno son las menos fantasiosas con disparos m�s creibles que otros aunque");
				System.out.println("siguen siendo disparos sobrenaturales incluso con arcos de m�s de cien libras. La ultima");
				System.out.println("haza�a de la que se tiene registro es sin duda una fantas�a escrita por un autor an�nimo,");
				System.out.println("la historia que seguramente y conozca el lector por influencia popular pero que describir�");
				System.out.println("en caso de que este libro llegue a cruzar el oc�ano nuboso. \n"
						+ "Tras que unas tropas extrangeras");
				System.out.printf("de ultramar aparecieran de la nada y atacaran los feudos de Iline III y desaparecieran sin dejar \n");
				System.out.println("restro alguno se cree que Iline llam� a Mileno a quien le prometi� un feudo y puesto en la ciudadania");
				System.out.println("imperial con posibilidad de atender al senado si se aseguraba que esa desconocida tribu de hombres");
				System.out.println("marinos atacase el imperio de nuevo. Mileno no respondi� de forma inmediata al emperador, en su lugar");
				System.out.println("sali� al balc� del palacio imperial y pidi� un arco con el que no ten�a familiaridad alguna y tres");
				System.out.println("flechas, dispar� las tres flechas al horizonte y devolvio el arco. Al cabo de dos semanas apareci�");
				System.out.println("en las playas imperiales el supuesto rey del mar, lider de aquella perdida tribu, su cadaver fue");
				System.out.println("arrastrado por las corrientes del oc�ano nuboso, con una flecha en cada ojo y otra en el cabo que");
				System.out.println("hab�a unido en cierto momento la cuerda a un muelle.");
				System.out.println("Si bien las tribus de ultramar que atacaron al imperio si que existieron ya que se han encontrado");
				System.out.println("restos arqueologicos que encajan con la descripci�n de estas gentes, es imposible que una flecha");
				System.out.println("cruce el oceano. Incluso la existencia de Iline III se pone en duda, pues toda fuente del imperio");
				System.out.println("en la que se nombran emperadores es incompleta empezando por el d�cimo emperador cinco d�cadas");
				System.out.println("despu�s del aproximado reinado de Iline III.");
				System.out.println(
						"**********************************************************************************************");
				biblioteca();
				break;
			}
		}
		if (choice == 7) {
			biblioteca();
		}

		libros();
	}

	public static void observatorioD() {
		System.out.println("De d�a y de noche el observatorio forma el lugar mejor iluminado de la universidad.");
		System.out.println("La b�beda de cristal muestra el despejado cielo Brizzarino, el cual surcan las gaviotas");
		System.out.println(
				"m�ltiples telescopios, instrumentos de medidas, y material para tomar apuntes est�n esparcidos");
		System.out.println(
				"por la habitaci�n, sin mucho uso durante los momentos del d�a en los que el cielo tiene color.");
		System.out.println("�Que quieres hacer?");
		System.out.println("1- Observar por el telesc�pio");
		System.out.println("2- Marchar a los pasillos de la universidad");
		System.out.println("3- Descansar");
		System.out.println("4- Inventario");
		System.out.println("5- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();
		while (choice != 5) {
			switch(choice) {
			case 1:
				System.out.println("Te acercas y pones tu ojo en el telescopio, y de forma nada sorprendente");
				System.out.println("te ciegas tu solo, durante un tiempo no corto te dedicas a frotarte los ojos");
				System.out.println("y a�n as� a�n ves manchas de colores durante largo rato.");
				observatorioD();
				break;
			case 2:
				interiorUniversidad();
				break;
			case 3:
				longRest();
				observatorioN();
				break;
			case 4:
				inventory();
				observatorioD();
				break;
			}
		}
		if (choice == 5) {
			System.exit(0);
		}
		observatorioD();
	}

	public static void observatorioN() {
		System.out.println("De d�a y de noche el observatorio forma el lugar mejor iluminado de la universidad");
		System.out.println("las estrellas y otros astos se aprecian con increible claridad, a tu alrededor m�ltiples");
		System.out.println("estudiosos sentados en el suelo sobre alfombras, miran a traves de diversos telesc�pios");
		System.out.println("y toman apuntes de diversas maneras.");
		System.out.println("�Que quieres hacer?");
		System.out.println("1- Estudiar el cielo nocturno");
		System.out.println("2- Marchar a los pasillos de la universidad");
		System.out.println("3- Descansar");
		System.out.println("4- Inventario");
		System.out.println("5- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();
		while (choice != 5) {
			switch(choice) {
			case 1:
				if (inv.contains("Frasco negro")) {
					System.out.println("Mientras estudias el cielo nocturno a tu manera, te olvidas el frasco negro");
					System.out.println("debajo de un telescopio, directamente debajo de donde uno mira, en un pesta�eo");
					System.out.println("el frasco ha pasado de negro brea a un negro con moteado blanco brillante, casi");
					System.out.println("como si hubiera capturado la b�veda celeste en su interior.");
					inv.remove("Frasco negro");
					inv.add("Frasco Estrellado");
					System.out.println("La noche continua su curso sin mayor diferencia, en cuanto rompe el d�a los");
					System.out.println("estudiosos se van a descansar.");
					longRest();
					observatorioD();
				} else {
					System.out.println("Te pasas la noche mirando la boveda celeste, acompa�ado por multiples eruditos");
					System.out.println("por una noche tu tambi�n eres uno de los aprendices, se te imparten lecciones");
					System.out.println("sobre las constelaciones, estrellas, cometas y nebulas. Los tent�culos de la medusa");
					System.out.println("lo abrazan todo y en la noche aquellos que sujetan el cielo se vuelven las estrellas");
					System.out.println("y los moralos brazos celestes donde se concentran estas como pinceladas sobre un lienzo");
					System.out.println("negro.");
				}
				break;
			case 2:
				interiorUniversidad();
				break;
			case 3:
				longRest();
				observatorioD();
				break;
			case 4:
				inventory();
				observatorioN();
				break;
			}
		}
		if (choice == 5) {
			System.exit(0);
		}
		observatorioN();
	}

	public static void porton() {

		System.out.println(
				"Te acercas a al port� de la ciudad, el rastrillo est� levantado y la sombra de las murallas se alarga ante t�.");
		System.out.println(
				"Los guardas con sus anchas mangas montan guardia apoyados en sus alabardas hermosamente decoradas, y luciendo");
		System.out.println(
				"corazas brillantes con la insignia de la ciudad, \n una bandera rectangular con  trece alargados flecos a un lado vuela sobre las murallas");
		System.out.println("Sobre un campo de sangu�neo con decoraciones de or una medusa se enrosca en un ancla");
		System.out.println("�Que quieres hacer?");
		System.out.println("1- Salir fuera de la ciudad.");
		System.out.println("2- A la via principal oeste.");
		System.out.println("3- Inventario");
		System.out.println("4- Descansar");
		System.out.println("5- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 5) {
			switch (choice) {
			case 1:
				camposDeTrigo();
				break;
			case 2:
				viaPrincipalO();
				break;
			case 3:
				inventory();
				porton();
				break;
			case 4:
				longRest();
				porton();
				break;
			default:
				System.out.println("Eso no es una opci�n");
				porton();
				break;
			}// End switch choice ViaPricipalO
			if (choice == 5) {
				System.exit(0);
			}
			porton();
		}

	}

	public static void plaza() {
		// System.out.println("");
		System.out.printf(
				"Una tranquila plaza de forma circular, en el centro se alza erigida en marfil, la estatua a Saturnio Brizzaresco \n ba�ada por la crepitante luz anaranjada de las velas ofrecidas a sus pies \n");
		System.out.println("Famoso navegante que estableci� la ciudad estado de Brizzaresca donde te encuentras. ");
		System.out.println(
				" puedes observar como el ulimo de los asaltante de la taberna se ha escbullido por una de las esquinas que dan a la via principal en direcci�n oeste.");
		System.out.println("�Que quieres hacer?");
		System.out.println("1- Norte al puerto.");
		System.out.println("2- Este de la v�a principal.");
		System.out.println("3- Sur a las callejuelas.");
		System.out.println("4- Oeste de la v�a principal");
		System.out.println("5- Inventario");
		System.out.println("6- Descansar");
		System.out.println("7- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 7) {
			switch (choice) {
			case 1:
				puerto();
				break;
			case 2:
				viaPrincipalE();
				break;
			case 3:
				callejuelas();
				break;
			case 4:
				viaPrincipalO();
				break;
			case 5:
				inventory();
				plaza();
				break;
			case 6:
				longRest();
				plaza();
				break;
			default:
				System.out.println("Eso no es una opci�n");
				plaza();
				break;
			}// end switch choice
		} // end while
		if (choice == 7) {
			System.exit(0);
		}

		plaza();
	}

	public static void plaza2() {
		// System.out.println("");
		System.out.printf(
				"Una tranquila plaza de forma circular, en el centro se alza erigida en marfil, la estatua a Saturnio Brizzaresco \n ba�ada por la crepitante luz anaranjada de las velas ofrecidas a sus pies \n");
		System.out.println("Famoso navegante que estableci� la ciudad estado de Brizzaresca donde te encuentras. ");
		System.out.println("�Que quieres hacer?");
		System.out.println("1- Norte al puerto.");
		System.out.println("2- Este de la v�a principal.");
		System.out.println("3- Sur a las callejuelas.");
		System.out.println("4- Oeste de la v�a principal");
		System.out.println("5- Inventario");
		System.out.println("6- Descansar");
		System.out.println("7- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 7) {
			switch (choice) {
			case 1:
				puerto();
				break;
			case 2:
				viaPrincipalE();
				break;
			case 3:
				callejuelas();
				break;
			case 4:
				viaPrincipalO();
				break;
			case 5:
				inventory();
				plaza2();
				break;
			case 6:
				longRest();
				plaza2();
				break;
			default:
				System.out.println("Eso no es una opci�n");
				plaza2();
				break;
			}// end switch choice
		} // end while
		if (choice == 7) {
			System.exit(0);
		}

		plaza2();
	}

	public static void callejuelas() {
		boolean persuadido = false;

		System.out.println("Adentrandote por laberinticas callejuelas ves las partes bajas de la ciudad");
		System.out.println("");
		if (roll20() >= 18 && persuadido == false) {
			System.out.println("Caminando por las callejuelas, giras una esquina aleatoria, de esta misma salta");
			System.out.println("un ratero, como es su d�a a d�a te amenaza con su espada desgastada");
			System.out.println("'Tus galeones o te picho' te amenaza nervioso, listo para saltar a la minima.");
			System.out.println("�Que haces?");
			System.out.println("1- Darle tus galeones");
			System.out.println("2- Intentar convencerle de que no te atraque");
			System.out.println("3- Atacarle");
			System.out.println("4- Intentar rodearle sin alterarle");
			choice = s.nextInt();

			switch (choice) {
			case 1:
				galeones = 0;
				System.out.println("Tras darle tus galeones el hombre te deja marchar.");
				System.out.println("");
				callejuelas2();
				break;
			case 2:
				if (roll20() >= 19) {
					System.out.println(
							"Tras un breve charla cosigues convencerle de que no merece la pena y te deja pasar");
					persuadido = true;
					callejuelas2();
				} else {
					System.out.println("Tus esfuerzos a la hora de dialogar resultan futiles");
					System.out.println("el hombre cumple su promesa y se dispone a pincharte.");
					fight2(1);
					galeones = galeones + roll4();
				}
				break;
			case 3:
				fight2(1);
				galeones = galeones + roll4();
				break;
			case 4:
				if (roll20() >= 17) {
					System.out.println("Durante unos momentos de tensi�n caminas lentamente de forma lateral");
					System.out.println("bordeas a tu asaltante sin dmeasiado problema");
					callejuelas2();
				} else {
					System.out.println("Tus esfuerzos a la hora de evadirle resultan futiles");
					System.out.println("el hombre cumple su promesa y se dispone a pincharte.");
					fight2(1);
					galeones = galeones + roll4();
				}
				break;
			}

		} else {
			callejuelas2();
		}

		callejuelas2();
	}

	public static void callejuelas2() {
		System.out.println("Tras adentrarte por las callejuelas terminas en una encrucijada");
		System.out.println("podr�as adentrarte m�s o retroceder");
		System.out.println("�Que haces?");
		System.out.println("1- Adentrarte en las callejuelas");
		System.out.println("2- Retroceder a la plaza");
		System.out.println("3- Inventario");
		System.out.println("4- Descansar");
		System.out.println("5- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 5) {
			switch (choice) {
			case 1:
				barquero();
				break;
			case 2:
				plaza2();
				break;
			case 3:
				inventory();
				callejuelas2();
				break;
			case 4:
				longRest();
				callejuelas2();
				break;
			}
		}
		if (choice == 5) {
			System.exit(0);
		}

		callejuelas2();
	}

	public static void barquero() {
		System.out.println("En el fondo de las callejuelas se abren los canales, putridos con deshechos humanos");
		System.out.println("y alg�n humano ocasional, junto a un peque�o muelle que parece pudrirse una silueta");
		System.out.println("envuelta en una capa de verde oscuro que luce una m�scara de rata flota en una g�nldola");
		System.out.println(
				"'�Sube?' -El desconocido pregunta ofreciendo un asiento en la hermosa g�ndola fuera de lugar");
		System.out.println("�Que haces?");
		System.out.println("1- Subes");
		System.out.println("2- No subes y das media vuelta");
		System.out.println("3- Inventario");
		System.out.println("4- Descansar");
		System.out.println("5- Salir de la sesi�n[NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 5) {
			switch (choice) {
			case 1:
				System.out.println("'�Comprar� o vender�?'");
				mercadoCanales();
				break;
			case 2:
				callejuelas2();
				break;
			case 3:
				inventory();
				barquero();
				break;
			case 4:
				longRest();
				barquero();
				break;
			}
		}

		if (choice == 5) {
			System.exit(0);
		}

		barquero();
	}

	public static void mercadoCanales() {
		System.out.println("El hombre de la m�scara de rata rema con calma,");
		System.out.println("pasais bajo puentes arqueados antes de atracar");
		System.out.println("pones pie en una placeta flotante, un mercado");
		System.out.println("oculto al p�blico general, por haber hay de todo");
		System.out.println("�Que haces?");
		System.out.println("1- Comprar.");
		System.out.println("2- montar en la g�ndola y marchar.");
		System.out.println("3- Inventario");
		System.out.println("4- Descansar");
		System.out.println("5- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 5) {
			switch (choice) {
			case 1:
				comprarCanales();
				break;
			case 2:
				barquero();
				break;
			case 3:
				inventory();
				mercadoCanales();
				break;
			case 4:
				longRest();
				mercadoCanales();
				break;
			}
		}

		if (choice == 5) {
			System.exit(0);
		}
		mercadoCanales();
	}

	public static void comprarCanales() {
		boolean[] dis = new boolean[5]; // Disponibilidad
		dis[0] = true;
		dis[1] = true;
		dis[2] = true;
		dis[3] = true;
		dis[4] = true;
		System.out.println("�Que deseas comprar?");
		System.out.println("1- Alabarda [2d6 Cortante] {20 G}");
		System.out.println("2- Escudo Heraldico [+2 AC] {13 G}"); // 0 en dis
		System.out.println("3- Broquel [+1 AC] {9 G}"); // 1 en dis
		System.out.println("4- Escudo de brazo crigiolano [+1 AC] {10G}"); // 2 en dis
		System.out.println("5- L�tigo [2d4 perforante] {9 G}");
		System.out.println("6- Alfanje [1d8 cortante] {15 G}");
		System.out.println("7- Florete [1d8 cortante] {30 G}");
		System.out.println("8- Espada larga [1d10 cortante] {35 G}");
		System.out.println("9- Bast�n [1d6 contundente] {3 G}");
		System.out.println("10- Ballesta de mano[1d8 perforante] {40 G}");
		System.out.println("11- Ballesta pesada y cranequ�n [1d10 perforante] {45 G}");
		System.out.println("12- Foco arcano [+4 a los hechizos] {24 G}");// 3 en dis
		System.out.println("13- Pluma y sombrero Crigiolano {20 G}"); // 4 en dis
		System.out.println("14- Munici�n a distancia[20 U] {20 G}");
		System.out.println("15- Irse sin comprar nada");
		choice = s.nextInt();

		switch (choice) {
		case 1: // alabarda
			if (galeones < 20) {
				System.out.println("No te es posible comprar el objeto");
				mercadoCanales();
			} else {
				playerWeapon = "Alabarda [2d6 cortante]";
				playerDmg = (int) (1 + (Math.random() * 7) + (1 + (Math.random() * 7)));
				typeDmg = 2;
				galeones = galeones - 20;
			}
			break;
		case 2:
			if (dis[0] == false || galeones < 13) {
				System.out.println("No te es posible comprar el objeto");
				mercadoCanales();
			} else {
				galeones = galeones - 13;
				bonusAC = 2;
				dis[0] = false;
			}
			break; // End Escudo heraldicco
		case 3:
			if (dis[1] == false || galeones < 9) {
				System.out.println("No te es posible comprar el objeto");
				mercadoCanales();
			} else {
				galeones = galeones - 9;
				bonusAC = 1;
				dis[1] = false;
			}
			break; // End broquel
		case 4:
			if (dis[2] == false || galeones < 10) {
				System.out.println("No te es posible comprar el objeto");
				mercadoCanales();
			} else {
				galeones = galeones - 10;
				bonusAC = 1;
				dis[2] = false;
			}
			break; // End Escudo de brazo
		case 5:
			if (galeones < 9) {
				System.out.println("No te es posible comprar el objeto");
				mercadoCanales();
			} else {
				galeones = galeones - 9;
			}
			break;
		case 6: // alfanje
			if (galeones < 15) {
				System.out.println("No te es posible comprar el objeto");
				mercadoCanales();
			} else {
				playerWeapon = "Alfanje [1d8 cortante]";
				playerDmg = roll8();
				typeDmg = 2;
				galeones = galeones - 15;
			}
			break;
		case 7: // florete
			if (galeones < 30) {
				System.out.println("No te es posible comprar el objeto");
				mercadoCanales();
			} else {
				playerWeapon = "Florete [1d8 perforante]";
				playerDmg = (int) (1 + (Math.random() * 9));
				typeDmg = 1;
				galeones = galeones - 30;
			}
			break;
		case 8: // Espada larga
			if (galeones < 35) {
				System.out.println("No te es posible comprar el objeto");
				mercadoCanales();
			} else {
				playerWeapon = "Espada Larga [1d10 cortante]";
				playerDmg = (int) (1 + (Math.random() * 11));
				typeDmg = 2;
				galeones = galeones - 35;
			}
			break;
		case 9: // bast�n
			if (galeones < 3) {
				System.out.println("No te es posible comprar el objeto");
				mercadoCanales();
			} else {
				playerWeapon = "bast�n [1d6 contundente]";
				playerDmg = (int) (1 + (Math.random() * 7));
				typeDmg = 3;
				galeones = galeones - 3;
			}
			break;
		case 10: // ballesta
			if (galeones < 40) {
				System.out.println("No te es posible comprar el objeto");
				mercadoCanales();
			} else {
				playerDisWeapon = "Ballesta de mano [1d8 perforante]";
				playerDisDmg = (int) (1 + (Math.random() * 9));
				galeones = galeones - 40;
				ammunition = ammunition + 20;
			}
			break;
		case 11: // ballesta Pesada
			if (galeones < 45) {
				System.out.println("No te es posible comprar el objeto");
				mercadoCanales();
			} else {
				playerDisWeapon = "Ballesta pesada con cranequin [1d10 perforante]";
				playerDisDmg = roll10();
				galeones = galeones - 45;
				ammunition = ammunition + 20;
			}
			break;
		case 12: // foco arcano
			if (dis[3] == false || galeones < 24) {
				System.out.println("No te es posible comprar el objeto");
				mercadoCanales();
			} else {
				galeones = galeones - 24;
				SpellBonus = SpellBonus + 4;
				dis[3] = false;
			}
			break;
		case 13: // Pluma y sombrero Crigiolano
			if (dis[4] == false || galeones < 20) {
				System.out.println("No te es posible comprar el objeto");
				mercadoCanales();
			} else {
				inv.add("Pluma y sombrero Crigiolano");
				galeones = galeones - 20;
				dis[4] = false;
			}
			break;
		case 14: // municion
			if (galeones < 20) {
				System.out.println("No te es posible comprar el objeto");
				mercadoCanales();
			} else {
				galeones = galeones - 20;
				ammunition = ammunition + 20;
			}
			break;
		case 15:
			mercadoCanales();
			break;
		}

		comprarCanales();
	}

	public static void puerto() {

		System.out.printf(
				"El olor a mar salda te llena las fosas nasales y el sonido de las gaviotas es el del unico pajaro en el momento. \n");
		System.out.printf(
				"Los marineros cargan y descarga todo tipo de bienes en los barcos, el m�s llamativo una carabela cuyas enormes velas lucen \n");
		System.out.printf(
				"la insignia del ducado de Crigiola, la carabela est� protegida por una gran cantidad de guardias Crigolenses \n");
		System.out.printf(
				"que bloquean el paso a todo aquel que no viste a la moda de Crigiola con sombrero de ala ancha y pluma de fais�n al cuello. \n");
		System.out.printf(
				"Siguiendo el puerto al este se ve el edificio de la lonja y su apabullado comercio que no se detiene ni de d�a ni de noche. \n");
		System.out.printf("Al sur la plaza con la estatua de Saturnio Brizzaresco espera \n");
		System.out.println("�A donde quieres ir?");
		System.out.println("1- A la carabela Crigiolana");
		System.out.println("2- A la lonja");
		System.out.println("3- A la plaza");
		System.out.println("4- Inventario");
		System.out.println("5- Descansar");
		System.out.println("6- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 6) {
			switch (choice) {
			case 1:
				if (inv.contains("Pluma y sombrero Crigiolano")) {
					System.out.println("Ah, subid subid, nada mejor que ver a uno de los nuestros aqu�");
					carabela();
				} else if (!inv.contains("Pluma y sombrero Crigiolano")) {
					System.out.println("�EH! �A donde vas? En esta nave solo entran Crigiolanos.");
					System.out.println("");
					puerto();
				}
				break;
			case 2:
				if (terminada == false) {
					lonja();
				} else {
					lonja2();
				}
				break;
			case 3:
				plaza2();
				break;
			case 4:
				inventory();
				puerto();
				break;
			case 5:
				longRest();
				puerto();
				break;
			default:
				System.out.println("Eso no es una opci�n");
				puerto();
				break;
			}
		} // End while choice puerto
		if (choice == 6) {
			System.exit(0);
		}

		puerto();
	}

	public static void lonja() {

		if (Day == "Es de d�a") {
			System.out.println(
					"El aire se ve inundado por el hedor a pescado muerto sobre cajas de sal para conservarlo");
			System.out.println(
					"las especias importadas se mezclan en el aire y en las cajas expuestas en colorida exposici�n");
			System.out.println("La gente grita sus precios mientras que otros realizan regateos.");
			System.out.println(
					"Una se�ora mayor se pasea con una cesta de mombre de la que cuelga un cartel. 'Amuletos' pone.");
			System.out.println("Al sur la lonja conecta con la via principal este.");
			System.out.println("Y al oeste con el puerto.");
			System.out.println("�Que quieres hacer?");
			System.out.println("1- Hablar con la se�ora");
			System.out.println("2- Ir a la v�a principal Este");
			System.out.println("3- Ir al puerto");
			System.out.println("4- Inventario");
			System.out.println("5- Descansar");
			System.out.println("6- Salir de la sesi�n [NO SE GUARDA]");
			choice = s.nextInt();

			while (choice != 6) {
				switch (choice) {
				case 1:
					System.out.println(
							"La se�ora camina despacio, alzando sus manos huesudas sujerando uno de los susodichos amuletos");
					System.out.println(
							"Los amuletos parecen colgantes de paja pero parecen tener un peso nada caracteristico de la paja");
					System.out.println(
							"'Comprad, comprad mi amuleto' Te dice alzando uno en tu cara 'Cuarenta galeones para librarte del mal'");
					System.out.println("�Que haces?");
					System.out.println("1- Comprar el amuleto");
					System.out.println("2- No comprar no comprar");
					choice = s.nextInt();
					switch (choice) {
					case 1:
						if (galeones >= 40) {
							System.out.println("'Maravillas, tened tened, la fortuna en sus manos'");
							inv.add("Amuleto de paja");
							galeones = galeones -40;
							lonja();
						} else {
							System.out.println("'Oh, pobre de ti mi alma. m�s no tienes lo suficientes galeones'");
							lonja();
						}
						break;
					case 2:
						System.out.println("Ignoras a la mujer de manos huesudas.");
						lonja();
						break;
					}

					lonja();
					break;
				case 2:
					viaPrincipalE();
					break;
				case 3:
					puerto();
					break;
				case 4:
					inventory();
					lonja();
					break;
				case 5:
					longRest();
					lonja();
					break;
				default:
					System.out.println("Eso no es una opci�n");
					lonja();
					break;
				} // End while choice lonja d�a
			} // End If
		} // End while lonja d�a
		if (choice == 6) {
			System.exit(0);

		} else if (Day == "Es de noche") {
			System.out.println("llegas a la lonja cuya actividad no para ni de d�a ni de noche.");
			System.out.println("El aire huele a pescado y exoticas especias, la gente grita sus precios y quejas");
			System.out.println("al fondo de la lonja unos individuos de negro y dorado se escabullen por una puerta");
			System.out.println("Al sur la lonja conecta con la via principal este.");
			System.out.println("Y al oeste con el puerto.");
			System.out.println("�Que quieres hacer?");
			System.out.println("1- Seguir a los hombre de Negro y Dorado");
			System.out.println("2- Ir a la v�a principal Este");
			System.out.println("3- Ir al puerto");
			System.out.println("4- Inventario");
			System.out.println("5- Descansar");
			System.out.println("6- Salir de la sesi�n [NO SE GUARDA]");
			choice = s.nextInt();

			while (choice != 6) {
				switch (choice) {
				case 1:
					subasta();
					break;
				case 2:
					viaPrincipalE();
					break;
				case 3:
					puerto();
					break;
				case 4:
					inventory();
					lonja();
					break;
				case 5:
					longRest();
					lonja();
					break;
				default:
					System.out.println("Eso no es una opci�n");
					lonja();
					break;
				} // End while choice lonja noche
			} // End while lonja noche
			if (choice == 6) {
				System.exit(0);
			} // End If
		} // End if dia/noche
		lonja();
	}

	public static void lonja2() {

		if (Day == "Es de d�a") {
			System.out.println(
					"El aire se ve inundado por el hedor a pescado muerto sobre cajas de sal para conservarlo");
			System.out.println(
					"las especias importadas se mezclan en el aire y en las cajas expuestas en colorida exposici�n");
			System.out.println("La gente grita sus precios mientras que otros realizan regateos.");
			System.out.println(
					"Una se�ora mayor se pasea con una cesta de mombre de la que cuelga un cartel. 'Amuletos' pone.");
			System.out.println("Al sur la lonja conecta con la via principal este.");
			System.out.println("Y al oeste con el puerto.");
			System.out.println("�Que quieres hacer?");
			System.out.println("1- Hablar con la se�ora");
			System.out.println("2- Ir a la v�a principal Este");
			System.out.println("3- Ir al puerto");
			System.out.println("4- Inventario");
			System.out.println("5- Descansar");
			System.out.println("6- Salir de la sesi�n [NO SE GUARDA]");
			choice = s.nextInt();

			while (choice != 6) {
				switch (choice) {
				case 1:
					System.out.println(
							"La se�ora camina despacio, alzando sus manos huesudas sujerando uno de los susodichos amuletos");
					System.out.println(
							"Los amuletos parecen colgantes de paja pero parecen tener un peso nada caracteristico de la paja");
					System.out.println(
							"'Comprad, comprad mi amuleto' Te dice alzando uno en tu cara 'Cuarenta galeones para librarte del mal'");
					System.out.println("�Que haces?");
					System.out.println("1- Comprar el amuleto");
					System.out.println("2- No comprar no comprar");
					choice = s.nextInt();
					switch (choice) {
					case 1:
						if (galeones >= 40) {
							System.out.println("'Maravillas, tened tened, la fortuna en sus manos'");
							inv.add("Amuleto de paja");
							lonja();
						} else {
							System.out.println("'Oh, pobre de ti mi alma. m�s no tienes lo suficientes galeones'");
							lonja();
						}
						break;
					case 2:
						System.out.println("Ignoras a la mujer de manos huesudas.");
						lonja();
						break;
					}

					lonja();
					break;
				case 2:
					viaPrincipalE();
					break;
				case 3:
					puerto();
					break;
				case 4:
					inventory();
					lonja();
					break;
				case 5:
					longRest();
					lonja();
					break;
				default:
					System.out.println("Eso no es una opci�n");
					lonja();
					break;
				} // End while choice lonja d�a
			} // End If
		} // End while lonja d�a
		if (choice == 6) {
			System.exit(0);

		} else if (Day == "Es de noche") {
			System.out.println("llegas a la lonja cuya actividad no para ni de d�a ni de noche.");
			System.out.println("El aire huele a pescado y exoticas especias, la gente grita sus precios y quejas");
			System.out.println("al fondo de la lonja unos individuos de negro y dorado ya no est�n junto a la puerta");
			System.out.println("Al sur la lonja conecta con la via principal este.");
			System.out.println("Y al oeste con el puerto.");
			System.out.println("�Que quieres hacer?");
			System.out.println("1- Ir a la v�a principal Este");
			System.out.println("2- Ir al puerto");
			System.out.println("3- Inventario");
			System.out.println("4- Descansar");
			System.out.println("5- Salir de la sesi�n [NO SE GUARDA]");
			choice = s.nextInt();

			while (choice != 5) {
				switch (choice) {
				case 1:
					viaPrincipalE();
					break;
				case 2:
					puerto();
					break;
				case 3:
					inventory();
					lonja2();
					break;
				case 4:
					longRest();
					lonja();
					break;
				default:
					System.out.println("Eso no es una opci�n");
					lonja();
					break;
				} // End while choice lonja noche
			} // End while lonja noche
			if (choice == 5) {
				System.exit(0);
			} // End If
		} // End if dia/noche
		lonja2();
	}

	public static void subasta() {
		int galeonesOfrecidos = 0;
		@SuppressWarnings("unused")
		int GaleonesRival = 50;
		int galeonesOfrecidosRivales = 0;
		int turnos = 5;
		@SuppressWarnings("unused")
		int limiteDeApuesta = galeones;
		if (terminada == false) {
			System.out.println("Siguiendo a los hombres de negro y dorado te adentras en una gran sala, ");
			System.out.println("en el centro se alza un pedestal con algo tapado por un pa�o de seda blanca, ");
			System.out.println("alrededor del pedestal en circulo la gente se sienta en sillas curules. ");
			System.out.println("Te sientas a cierta distancia de los hombres de negro y dorado, vigilante.");
			System.out.println(
					"Un hombre con mascar� de colibr� sube junto al pedestal rodeado de braseros que le alumbran");
			System.out.println("El hombre quita el pa�o de seda blanca para mostrar un sol de oxidado bronce ");
			System.out.println("cuyo centro es de negro azabache, anuncia el inicio de la subasta por la pieza");
			System.out.println("encontrada en el fondo del oceano por marineros crigiolanos.");
			System.out.println("�Quieres pujar?");
			System.out.println("1- Pujar");
			System.out.println("2- No pujar");
			choice = s.nextInt();
			switch (choice) {
			case 1:
				for (int i = 0; i <= turnos; i++) {
					if (galeones > galeonesOfrecidosRivales) {
						System.out.println("�cuanto quieres pujar?");
						galeonesOfrecidos = s.nextInt() + galeonesOfrecidos;
						if (galeonesOfrecidos > galeones) {
							System.out.println("No puedes pujar m�s dinero del que tienes");
							System.out.println("�cuanto quieres pujar?");
							galeonesOfrecidos = s.nextInt() + galeonesOfrecidos;
						}
						System.out.println("Ofreces un total de: " + galeonesOfrecidos + " galeones");
						System.out.println("Los hombres de negro y dorado no parece que quieran perder la subasta.");
						System.out.print("Ofrecen: ");
						galeonesOfrecidosRivales = galeonesOfrecidos + 10;
						System.out.println(galeonesOfrecidosRivales + " galeones");
					} else {
						System.out.println("No tienes galeones suficientes para superar la siguiente puja.");
						System.out.println("");
					}
				}
				if (galeonesOfrecidos > galeonesOfrecidosRivales) {
					System.out.println("Tu puja termina siendo la �ltima y ganadora");
					galeones = galeones - galeonesOfrecidos;
					System.out.println("tras pagar el dinero el tasador te ofrece el objeto que aceptas");
					inv.add("Sol de bronce");
				} else {
					System.out.println("Los hombres pagan con descaro la pieza al curador");
					System.out.println("la guardan en una ornamentada caja antes de salir.");
					System.out.println("todos se van de nuevo a la lonja y tu igual");
					System.out.println("");
					terminada = true;
					lonja2();
				}
				break;
			case 2:
				System.out.println("Las gentes pujan pero en el momento que empiezan a hacerlo tambi�n los hombres de");
				System.out
						.println("negro y dorado nadie opone resistencia. Al final los hombres pagan con descaro al ");
				System.out.println("curador y guardan la pieza en una ornamentada caja antes de salir.");
				System.out.println("Todos marchan a la lonja y t� haces igual.");
				System.out.println("");
				terminada = true;
				lonja2();
				break;
			}

		} else {
			System.out.println("La subas ya ha terminado, no tienes nada que hacer aqu�");
			System.out.println("vuelves a la lonja");
			lonja2();
		}

		subasta();
	}

	public static void carabela() {
		System.out.println("Con la cabeza gacha y vestimentas Crigiolanas no llamas la atenci�n,");
		System.out.println("subes a la carabela Crigiolana de velas triangulares, la madera cruje mecida por las olas");
		System.out.println("Los marineros crigiolanos mueven cajas de all� para all�, suben y bajan a la cubierta");
		System.out.println("superior a trav�s de una trampilla met�lica.");
		System.out.println("�Que quieres hacer?");
		System.out.println("1- Bajar a la zona inferior.");
		System.out.println("2- Ir al puerto");
		System.out.println("3- Inventario");
		System.out.println("4- Descansar");
		System.out.println("5- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 5) {
			switch (choice) {
			case 1:
				if (looted3 > 0) {
					interiorCarabela2();
				} else {
					interiorCarabela1();
				}
				break;
			case 2:
				puerto();
				break;
			case 3:
				inventory();
				carabela();
				break;
			case 4:
				longRest();
				carabela();
				break;
			default:
				System.out.println("Eso no es una opci�n");
				carabela();
				break;
			}
		} // End while Carabela
		if (choice == 5) {
			System.exit(0);
		}
		carabela();
	}

	public static void interiorCarabela1() {
		System.out.println("Bajas por la trampilla con confianza sin llamar la atenci�n");
		System.out.println("Tras bajar unos niveles por la carabela, te encuentras en la linea de ");
		System.out.println("flotaci�n, este piso parece extra�amente silencioso, poc m�s adelante ves un ca��n");
		System.out.println("fuera de lugar, demasiado adentro, te acercas, por la ventana ves entrar a");
		System.out.println(
				"un hombre de negro y dorado con el medall�n del sol. Est� envuelto en una extra�a aura durada");
		System.out.println(
				"por el hueco donde deber�a asomar el ca��n, entre sus manos porta una botella del m�s puro negro");
		System.out.println("El hombre se abalanza sobre ti.");
		System.out.println("�Que quieres hacer?");
		System.out.println("1- Atacar a la vez.");
		System.out.println("2- Intentar esquivarle");
		choice = s.nextInt();

		switch (choice) {
		case 1:
			fight(3);
			break;
		case 2:
			if (roll20() > playerAC) {
				playerHP = playerHP - roll6();
				fight(3);
			} else {
				fight(3);
			}
			break;
		default:
			System.out.println("Eso no es una opci�n.");
			interiorCarabela1();
			break;
		} // End switch choice

		interiorCarabela2();
	}

	public static void interiorCarabela2() {
		System.out.println("El cadaver de tu rival ha perido su aura dorada, ahora yace en el suelo");
		System.out.println("su cuerpo de pronto se envuelve en amarillas llamas que vuelven su carne cenizas");
		System.out.println("Quedan sus ropajes y la botella de puro negro tapada por una cubierta dorada");
		System.out.println("�Que quiere hacer?");
		System.out.println("1- Revisar el cuerpo");
		System.out.println("2- Curiosear las mercancias de la carabela");
		System.out.println("3- Volver arriba");
		System.out.println("4- Inventario");
		System.out.println("5- Descansar");
		System.out.println("6- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();
		int revisado = 0;

		while (choice != 6) {
			switch (choice) {
			case 1:
				if (looted3 == 0) {
					System.out.println("Entre las ropas llenas cenizas encuentras el negro frasco");
					System.out.println(" y los pocos galeones que no se han fundido.");
					galeones = galeones + roll4();
					System.out.println("�Quieres coger el frasco?");
					System.out.println("1- Coger el frasco.");
					System.out.println("2- Ignorar el frasco.");
					int cogFras = s.nextInt();
					if (cogFras == 1) {
						inv.add("Frasco negro");
					}
					looted3++;
					interiorCarabela2();
				}
				if (looted3 > 0) {
					System.out.println("No queda nada m�s");
					interiorCarabela2();
				}

				break;
			case 2:
				if (revisado == 0) {
					if (roll20() > 17) {
						System.out.println("Entre las cajas encuentras una de las mejores");
						System.out.println("innovaciones de guerra producidas por Crigiola.");
						System.out.println("Un arqueb�s [2d12 perforante]");
						System.out.println("�Quieres cogerlo?");
						System.out.println("1- Coger el mosquete y su munici�n");
						System.out.println("2- Ignorarlo");
						choice = s.nextInt();
						if (choice == 1) {
							playerDisWeapon = "arqueb�s [2d12 perforante]";
							playerDisDmg = (roll12() + roll12());
							ammunition = 12;
						}
						interiorCarabela2();
					} else {
						System.out.println("No pareces encontrar nada que te interese");
						interiorCarabela2();
					}
					revisado++;
				} else {

				}

				break;
			case 3:
				carabela();
				break;
			case 4:
				inventory();
				interiorCarabela2();
				break;
			case 5:
				longRest();
				interiorCarabela2();
				break;
			}
		}
		if (choice == 6) {
			System.exit(0);
		}

		interiorCarabela2();
	}

	public static void viaPrincipalE() {

		System.out.println("En la zona este de la v�a principal la gente se mueve como el torrente de un r�o, ");
		System.out.println(
				"toda clase de personas camina, mercaderes ricos, pescaderos modestos, villanos pobres y peregrinos zarrapastrosos");
		System.out.println(
				"algunos van a la lonja, otros a la plaza, pero muchos, tanto habitantes de la ciudad como viajeros se dirigen al Duomo de la Medusa eterna");
		System.out.println("�Que quieres hacer");
		System.out.println("1- Ir a la catedral de la Medusa Eterna.");
		System.out.println("2- Ir a la plaza.");
		System.out.println("3- Ir a la lonja.");
		System.out.println("4- inventario.");
		System.out.println("5- descansar.");
		System.out.println("6- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();
		while (choice != 6) {
			switch (choice) {
			case 1:
				catedralME();
				break;
			case 2:
				plaza2();
				break;
			case 3:
				lonja();
				break;
			case 4:
				inventory();
				viaPrincipalE();
				break;
			case 5:
				longRest();
				viaPrincipalE();
				break;
			default:
				viaPrincipalE();
				break;
			}
		} // End while ViaPrincipalE

		if (choice == 6) {
			System.exit(0);
		}
		viaPrincipalE();
	}

	public static void catedralME() {
		System.out.println("Tus pasos resuenan con el eco producido en el interior de la colosal estructura.");
		System.out.println("La catedral de marmol de un pristino blanco se alza por encima de cualquier otro edificio");
		System.out.println(
				"sus techos de dorados colores se ven invadidos por las gaviotas que vigilan a los feligreses ");
		System.out.println(
				"y peregrinos que vienen s pedir el mayor perdon por sus errores. en el interior de la catedral ");
		System.out.println(
				"una estatua de la medusa eterna hecha de marmol negro con tentaculos extendiendose m�s all� del altar ");
		System.out.println(
				"subiendo por columnas hasta el techo del edificio. Los creyentes se arremolinan junto a la estatua, ");
		System.out.println(
				"un rezo colectivo donde todos caminas despacio alrededor de la enorme estatua en el centro de la estancia.");
		System.out.println("�Que haces?");
		System.out.println("1- Rezar devotamente a la Medusa Eterna.");
		System.out.println("2- Da media vuelta a la v�a principal Este.");
		System.out.println("3- Inventario");
		System.out.println("4- Descansar");
		System.out.println("5- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();

		while (choice != 5) {
			switch (choice) {
			case 1:
				if (devotado == false) {
					System.out.println("Te unes a la marabunta de gente, giras con ellos en silencio.");
					System.out.println("Tu mente se pierde en el cosmos, te dejas alcanzar por los infinitos ");
					System.out.println(
							"tent�culos de la Medusa Eterna, sientes como superponen tu piel y te adoptan como uno m�s");
					System.out.println("");
					System.out.println("Ahora eres longevo como una medusa");
					System.out.println("Vida +");
					System.out.println("");

					maxPlayerHP = maxPlayerHP + (10);
					longRest();
					longRest();

					devotado = true;
					catedralME();
				} else {
					System.out.println("Ya estas devotado.");
					catedralME();
				}
				break;
			case 2:
				viaPrincipalE();
				break;
			case 3:
				inventory();
				catedralME();
				break;
			case 4:
				longRest();
				catedralME();
				break;
			default:
				System.out.println("Eso no es una opci�n");
				catedralME();
				break;
			}
		} // End while Carabela
		if (choice == 5) {
			System.exit(0);
		}
		catedralME();
	}

	// EXTERIORES / RUINAS DEL SOL
	public static void camposDeTrigo() {
		System.out.println("Al salir de la ciudad una suave brisa mece los dorados");
		System.out.println("campos de trigo cuya altura iguala la de tus ojos con ");
		System.out.println("facilidad. Entre estas altas cosechas veraniegas casas");
		System.out.println("de granjeros se ocultan y camiando entre el trigo los");
		System.out.println("granjeros van con la hoz. Mientras tanto, en el horizonte");
		System.out.println("las monta�as de la Luz, llamadas as� por su amarillento color");
		System.out.println("aguardan, transmitiendo opresiva sensaci�n en t�.");
		System.out.println("�Que haces?");
		System.out.println("1- Poner rumbo a las monta�as de la Luz");
		System.out.println("2- Caminar entre los campos de trigo.");
		System.out.println("3- Descansar");
		System.out.println("4- Inventario");
		System.out.println("5- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();
		
		while (choice != 5) {
			switch(choice){
			case 1:
				int encounter = roll20();
				if (encounter <16) {
					System.out.println("Tu trayecto comienza, sin embargo");
					System.out.println("desde el lateral del sendero aparece como materializado del aire");
					System.out.println("un extra�o sabueso, de apariencia fam�lica");
					System.out.println("con ojos que brillan con color del Oro, y cuyo");
					System.out.println("esqu�lico cuerpo emite fuerte olor a az�fre");
					fightSolarBeasts(1);
					faldaMont();
					
				} else {
					System.out.println("Comienzas trayecto a las monta�as con rara");
					System.out.println("sensaci�n, de forma constante, sientes miradas");
					System.out.println("lo m�s extra�o es que se sienten como si vinieran");
					System.out.println("del mismo Sol que pica sobre tu nuca.");
					faldaMont();
				}
				
				break;
			case 2:
				int entrada = roll20();
				if (entrada >= 18 || encontrado == true) {
					encontrado = true;
					ruinasSol();
				}else {
					System.out.println("Por mucho que buscas, solo terminas en caminos a casetas");
					System.out.println("o te topas con granjeros limpiando el campo recogiendo");
					System.out.println("grandes matas de trigo. Al final terminas de nuevo en el");
					System.out.println("camino sin nada nuevo que se te aporte.");
					camposDeTrigo();
				}
				break;
			case 3:
				longRest();
				camposDeTrigo();
				break;
			case 4:
				inventory();
				camposDeTrigo();
				break;
			}
		}
		if (choice == 5) {
			System.exit(0);
		}
		camposDeTrigo();
	}
	
	public static void ruinasSol() {
		System.out.println("Tanteando a ciegas entre el trigo si que te topas");
		System.out.println("con algo que llama tu atenci�n, en una parcela lejos");
		System.out.println("de todas las dem�s, donde no solo crece trigo salvaje");
		System.out.println("si no tambi�n �rboles y toda clase de hierbajos pues");
		System.out.println("abandonada parece la parcela, oculto entre la maleza");
		System.out.println("un port�n que a nadie le habr�a pasado desapercibido");
		System.out.println("m�s tan cerca de la ciudad, con puertas vueltas dentro");
		System.out.println("de un arco cuya arquitectura en nada se parece a la local");
		System.out.println("abusando de triangulos de diversos �ngulos para formar otras");
		System.out.println("formas geom�tricas, algunas acompa�adas por formas m�s org�nicas");
		System.out.println("casi como tent�culos pero m�s similares a como un ni�o dubujar�a");
		System.out.println("los rayos del sol, alargadas y con muchas curvas.");
		System.out.println("�Que haces?");
		System.out.println("1- Adentrarse por los portones");
		System.out.println("2- Dar media vuelta los campos cuidados");
		System.out.println("3- Descansar");
		System.out.println("4- Inventario");
		System.out.println("5- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();
		
		while (choice != 5) {
			switch(choice) {
			case 1:
				hall();
				break;
			case 2:
				camposDeTrigo();
				break;
			case 3:
				longRest();
				ruinasSol();
				break;
			case 4:
				inventory();
				ruinasSol();
				break;
			}
		}
		if (choice == 5) {
			System.exit(0);
		}
		
		ruinasSol();
	}
	
	public static void hall () {
		System.out.println("El pasillo de fr�a y grisacea piedra, se encuentra a oscuras,");
		System.out.println("la poca luz que se cuela desde la entrada mustra holl�n en las");
		System.out.println("paredes, anta�o ard�an velas en esos candelabros de pies, ahora");
		System.out.println("el lugar est� a oscuras y solo sobreviven en su interior hongos");
		System.out.println("que han hecho del lugar su nuevo hogar, al igual que la entrada");
		System.out.println("la arquitectura es dominada por triangulos o formas serpentinas.");
		System.out.println("�Que haces?");
		System.out.println("1- Avanzar a tientas en la oscuridad");
		System.out.println("2- Retroceder a la entrada.");
		System.out.println("3- Descansar");
		System.out.println("4- Inventario");
		System.out.println("5- Salir de la sesi�n [NO SE GUARDA]");
		if (playerClass == "Mago") {
			System.out.println("6- Usar un hechizo de fuego para iluminar [-1 Spell Slot]");
		}
		choice = s.nextInt();
		while (choice != 5) {
			switch (choice) {
				case 1:
					if(roll20() >= 15) {
						System.out.println("A tientas terminas llegando a la siguiente sala de las ruinas.");
						salonCentral();
					} else {
						System.out.println("Caminas sin rumbo por la oscuridad, lo �nico al tacto");
						System.out.println("es la fr�a piedra de las paredes y de tanto en tanto");
						System.out.println("un honglo blando al tacto que facilmente se romper�a");
						System.out.println("de no tener un poco de cuidado.");
						System.out.println("Tras largo rato tanteando ves una luz, pero no hay emoci�n");
						System.out.println("es la luz de la entrada, sin rumbo has terminado en el punto");
						System.out.println("de partida.");
						hall();
					}
					break;
				case 2:
					ruinasSol();
					break;
				case 3:
					longRest();
					hall();
					break;
				case 4:
					inventory();
					hall();
					break;
				case 6:
					if(playerClass == "Mago" && SpellSlots >= 1) {
					System.out.println("Canalizando la esencia consigues estabilizar una saeta");
					System.out.println("de fuego en tu mano para dar luz, con ella consigues guiarte.");
					SpellSlots = SpellSlots - 1;
					salonCentral();
					} else {
						System.out.println("Opci�n no v�lida");
						hall();
					}
					break;
				default:
					System.out.println("Opci�n no v�lida");
					hall();
					break;
			} //switch
		}//while
		if(choice == 5) {
			System.exit(0);
		}
		hall();
	}
	
	public static void salonCentral() {
		System.out.println("Una serie de mesas con forma de triangulos obtusos se ven ba�adas");
		System.out.println("por la luz que se cuela desde una b�veda rota, alrededor de la misma");
		System.out.println("los �rboles crecen dando a ver que est�s bajo un bosque, las hojas en");
		System.out.println("las copas de los abetos dan sombra parcial. Un peque�o escal�n da pie");
		System.out.println("a una mesa m�s grande esta vez un triangulo equil�tero, cada pie del lugar");
		System.out.println("est� cubierto por una fina capa de polvo, sobre las mesas, los restos de una");
		System.out.println("cena abandonada se han pudrido, los bichos y animales se han festejado en lo");
		System.out.println("abandonado, solo los huesos quedan e incluso de esos faltan.");
		System.out.println("A ambos lados de la sala de planta tridecagonal se abren puertas que continuan");
		System.out.println("adentrandose en la abandonada estructura.");
		System.out.println("�Que haces?");
		System.out.println("1- Rebuscar entre las mesas");
		System.out.println("2- Ir a la puerta a diestra");
		System.out.println("3- Ir a la puerta a siniestra");
		System.out.println("4- Dar media vuelta");
		System.out.println("5- Descansar");
		System.out.println("6- Inventario");
		System.out.println("7- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();
		while (choice != 7) {
			switch(choice) {
			case 1:
				if(roll20() >= 13 && looted5 == true) {
					System.out.println("Abandonadas como si tal cosa encuentras bajo un par de");
					System.out.println("servilletas un peque�o pu�ado de monedas doradas, no");
					System.out.println("est�n acu�adas como las de Brizzaresca, pero de todas");
					System.out.println("formas en un mercado pasarian por aceptables, se podr�an");
					System.out.println("tratar como monedas de un lugar lejano o acu�aciones antiguas");
					System.out.println("de galeones Brizzarrescos.");
					galeones = (galeones + roll10() + roll8() + roll4()); 
				}else {
					System.out.println("Pese a rebuscar entre los varios asientos");
					System.out.println("mesas, y por todo aquello a la vista");
					System.out.println("no encuentras nada de valor alguno.");
					salonCentral();
				}
				break;
			case 2:
				pasillosIluminados();
				break;
			case 3:
				cocinas();
				break;
			case 4:
				hall();
				break;
			case 5:
				longRest();
				salonCentral();
				break;
			case 6:
				inventory();
				salonCentral();
				break;
			default:
				System.out.println("opci�n no v�lida");
				salonCentral();
				break;
			}//switch
		}// while
		if (choice == 7) {
			System.exit(0);
		}
		salonCentral();
	}
	
	public static void cocinas() {
		System.out.println("Accediendo desde el sal�n central llegas a lo que parecen");
		System.out.println("unas exquisitas cocinas, aunque no haya un ingrediente en");
		System.out.println("buen estado no cuesta imaginar como podr�a haber olido el");
		System.out.println("lugar en el pasado.");
		System.out.println("Al frente una puerta solitaria est� vuelta, y desciende un");
		System.out.println("par de escalones a una sala con barriles de madera podrida");
		System.out.println(" y cajones vacios, arramblados durante generaciones por la");
		System.out.println("fauna local. No muy lejos de esa misma puerta, otra se ve");
		System.out.println("atrancada por escombros caidos y otros tantos puestos a posta");
		System.out.println("�Que haces?");
		System.out.println("1- Ir al almac�n.");
		System.out.println("2- Volver al sal�n central");
		if (bloqueado == true) {
			System.out.println("3- El camino est� bloqueado por escombros");
		} else {
			System.out.println("3- Acceder a la bah�a de carga subterranea");
		}
		System.out.println("4- Descansar");
		System.out.println("5- Inventario");
		System.out.println("6- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();
		
		while (choice != 6) {
			switch (choice) {
				case 1:
					almacen();
					break;
				case 2:
					salonCentral();
					break;
				case 3:
					if (bloqueado == true) {
						System.out.println("No puedes ir por ah�");
						cocinas();
					} else {
						rioCarga2();
					}
					break;
				case 4:
					longRest();
					cocinas();
					break;
				case 5:
					inventory();
					cocinas();
					break;
				default:
					System.out.println("Eso no es una opci�n");
					cocinas();
					break;
			}//switch
		}//while
		if (choice == 6) {
			System.exit(0);
		}
		cocinas();
	}
	
	public static void almacen() {
		System.out.println("Bajas un par de escalones hasta lo que parece que");
		System.out.println("fue en su tiempo una despensa o almacen, la madera");
		System.out.println("se ha ido pudriedo con las goteras que caen desde");
		System.out.println("el techo o por el propio contenido que guardaban,");
		System.out.println("el hedor es p�tidro, aunque la carne haya pasado");
		System.out.println("a ser propiedad de los animales el olor de comida");
		System.out.println("pudriendose no se ha ido y no parece que vaya a irse");
		System.out.println("con facilidad.");
		System.out.println("En una de las paredes uno de los barriles est� caido");
		System.out.println("y apartado de su sitio, en la gruesa pared de piedra");
		System.out.println("se presenta un boquete, al otro lado se escucha un rio");
		System.out.println("subterraneo correr con calma, la humedad se cuela desde");
		System.out.println("la cueva con la que conecta.");
		System.out.println("�Que haces?");
		System.out.println("1- Ir al rio subterraneo.");
		System.out.println("2- Volver a las cocinas");
		System.out.println("3- Descansar");
		System.out.println("4- Inventario");
		System.out.println("5- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();
		
		while(choice != 5) {
			switch(choice) {
			case 1:
				if (Ormr == true) {
					rioCarga1();
				} else {
					rioCarga2();
				}
				break;
			case 2:
				cocinas();
				break;
			case 3:
				longRest();
				almacen();
				break;
			case 4:
				inventory();
				almacen();
				break;
			default:
				System.out.println("Eso no es una opci�n");
				almacen();
				break;
			}//switch
		}//while
		if (choice == 5) {
			System.exit(0);
		}
		almacen();
	}
	
	public static void rioCarga1() {
		System.out.println("Entrando a la cueva subterranea por la que el r�o");
		System.out.println("calmadamente traversa notas como es un r�o ancho y");
		System.out.println("profundo, al igual que el techo de la caverna es alto");
		System.out.println("en el r�o una especie de muelle con un par de barcas");
		System.out.println("a remos sin vela alguna atracados en el mismo.");
		System.out.println("Aunque la visibilidad sea reducida entra suficiente");
		System.out.println("luz por una serie de aperturas naturales en el techo");
		System.out.println("de la caverna. El agua calmada a primera vista comienza");
		System.out.println("a agitarse, el calmado tramo pasan a ser r�pidos y el");
		System.out.println("nivel del agua aumenta en un par de palmos, rompiendo");
		System.out.println("la superficie del r�o subterraneo aparece lo que a primera");
		System.out.println("vista parece una gran serpiente de azulados colores,");
		System.out.println("entre el patr�n azulado y gris lineas serpentenates");
		System.out.println("doradas salen desde los negros ojos hasta hundirse");
		System.out.println("en el agua y perderse junto el cuerpo de la serpiente.");
		System.out.println("con hambrientos ojos te mira, abriendo su mandibula");
		System.out.println("segmentada en tres, mostrando fieros colmillos y oscura");
		System.out.println("garganta.");
		System.out.println("La serpiente se lanza sobre ti. �Que haces?");
		System.out.println("1- Afrontarlo de cara");
		System.out.println("2- Intentar esquivar");
		choice = s.nextInt();
		
		switch(choice) {
			case 1:
				playerHP = playerHP - roll10();
				fightBeast(2);
				break;
			case 2:
				if (roll20() >= 15) {
					fightBeast(2);
				} else {
					playerHP = playerHP - roll8();
					fightBeast(2);
				}
				break;
			default:
				System.out.println("Eso no es una opci�n");
				rioCarga1();
				break;
		}//switch
		
		rioCarga2();
	}
	
	public static void rioCarga2() {
		bloqueado = false;
		System.out.println("Tras que Ormrinn desaparezca hundiendose en lo que");
		System.out.println("parece un r�o sin fondo, quien sabe si vivo o muerto,");
		System.out.println("el atracadero subterraneo parece despejado, da�ado por");
		System.out.println("Ormirinn, barcos parcialmente hundidos, todo empapado,");
		System.out.println("escamas de la serpiente esparcidas sobre la piedra, la");
		System.out.println("puerta bloqueada por escombros ha sido liberada de un");
		System.out.println("golpe del Ormrinn.");
		System.out.println("�Que haces?");
		System.out.println("1- Recoger las escamas de Ormrinn");
		System.out.println("2- Irse a las cocinas");
		System.out.println("3- Irse al almac�n");
		System.out.println("4- Tirarse al rio");
		System.out.println("5- Descansar");
		System.out.println("6- Inventario");
		System.out.println("7- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();
		while (choice != 7) {
			switch (choice) {
				case 1:
					if(escamas == true) {
						System.out.println("Consigues recuperar unas cuantas escamas del suelo");
						for (int i = 0; i < roll4(); i++) {
							inv.add("Escama Ormrinn");
						}
						escamas = false;
						rioCarga2();
					} else {
						System.out.println("No quedan escamas que recoger.");
						rioCarga2();
					}
					break;
				case 2:
					cocinas();
					break;
				case 3:
					almacen();
					break;
				case 4:
						if(roll20() == 20) {
							System.out.println("Te tiras a las g�lidas aguas con esperanza");
							System.out.println("de que siga Ormirinn muerto, la corriente");
							System.out.println("te lleva perezosamente, carente de r�pido");
							System.out.println("alguno en todo el traayecto. Tras un helada");
							System.out.println("traves�a a oscuras te detienes, de nuevo ves");
							System.out.println("luz desde la parte superior, una cuerda dirige");
							System.out.println("hacia arriba, pareces haber terminado en un");
							System.out.println("pozo. As� que subes la cuerda, no es plan de");
							System.out.println("seguir y obtener hipotermia.");
							if (Aencounter == false) {
								aposentosE();
							} else {
								aposentos();
							}
						} else {
							System.out.println("Te tiras al agua, con ropas y todo");
							System.out.println("est� fr�a muy fr�a, y las ropas y");
							System.out.println("armadura, auque sea un simple gambes�n");
							System.out.println("no ayuda, al final tus musculos se");
							System.out.println("entumecen, no consigues mantenerte a flote.");
							muerte();
						}
					break;
				case 5:
					longRest();
					rioCarga2();
					break;
				case 6:
					inventory();
					rioCarga2();
					break;
			}
		}
		if (choice == 7) {
			System.exit(0);
		}
		rioCarga2();
	}
	
	public static void pasillosIluminados() {
		System.out.println("Caminando entre los pasillos cuyas paredes han sido");
		System.out.println("pintadas con escenas que ahora se caen y se desconchan");
		System.out.println("agujeros irregulares en forma, tama�o y sitancia entre");
		System.out.println("los mismos permiten que la luz del exterior se cuele a");
		System.out.println("los pasillos abandonados. La disposici�n de los mismos");
		System.out.println("es laber�ntica y el orientarse si bien no es imposible");
		System.out.println("tampoco es un paseo por un campo de amapolas.");
		System.out.println("Conforme avanzas evitando aquellas paredes donde las");
		System.out.println("escenas pintadas se repiten una luz asoma al fondo en");
		System.out.println("lo que parecen unas escalerasa en espiral.");
		if (PasilloE == false) {
			System.out.println("Pero la luz no solo llega de ah�, saliendo de otro");
			System.out.println("de los pasillos, lo que parecer�a un rayo de sol suelto");
			System.out.println("se desliza por el suelo acompa�ado por un agudo pitido ");
			System.out.println("que nunca se detiene.");
			pasillosEnc();
		}
		System.out.println("�Que haces?");
		System.out.println("1- Avanzar al torre�n de ecaleras en espiral");
		System.out.println("2- volver por donde has venido");
		System.out.println("3- Descansar");
		System.out.println("4- Inventario");
		System.out.println("5- salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();
		while (choice != 5) {
			switch (choice) {
				case 1:
					torreH();
					break;
				case 2:
					salonCentral();
					break;
				case 3:
					longRest();
					pasillosIluminados();
					break;
				case 4:
					inventory();
					pasillosIluminados();
					break;
				default:
					System.out.println("Eso no es una opci�n");
					pasillosIluminados();
					break;
			} //Switch
		} //While
		if (choice == 5) {
			System.exit(0);
		}
		pasillosIluminados();
	}
	
	public static void pasillosEnc() {
		int escp = roll20();
		System.out.println("�Que haces?");
		System.out.println("1- Intentar huir por los pasillos hasta perderlo.");
		System.out.println("2- plantar cara.");
		System.out.println("3- intentar esquivar antes de que ataque.");
		choice = s.nextInt();
		
		switch (choice) {
			case 1:
				if (stealthDis == true) {
					int tir1 = roll20(), tir2 = roll20();
					if (tir1 > tir2) {escp = tir2;} else {escp = tir1;}
				}
				if(escp >= 16) {
					System.out.println("Te deslizas por los pasillos, seguido por");
					System.out.println("el rayo de luz extraviado, cada esquina la");
					System.out.println("giras, cualquier cosa que pueda desorientarlo");
					System.out.println("es de utilidad, al final te lanzas a las");
					System.out.println("escaleras en espiral, le consigues perder");
					System.out.println("pero sigue ah�.");
					torreH();
				} else {
					fightSolarBeasts(2);
					PasilloE = true;
					pasillosIluminados();
				}
				break;
			case 2:
				playerHP = playerHP - roll6();
				fightSolarBeasts(2);
				PasilloE = true;
				pasillosIluminados();
				break;
			case 3:
				if (roll20() > 14) {
					fightSolarBeasts(2);
					PasilloE = true;
					pasillosIluminados();
				} else {
					playerHP = playerHP - roll6();
					fightSolarBeasts(2);
					PasilloE = true;
					pasillosIluminados();
				}
				break;
			default:
				System.out.println("Eso no es una opci�n");
				pasillosEnc();
				break;
		}
		
		pasillosEnc();
	}
	
	public static void torreH() {
		System.out.println("A la torre que se encuentra hundida en la seca tierra");
		System.out.println("le falta el techo, cuyas vigas de madera terminaron");
		System.out.println("por ceder y acabaron por caer al fondo de la torre");
		System.out.println("algunas vigas a�n se mantienen tumbadas en las escaleras");
		System.out.println("entorpeciendo el paso.");
		System.out.println("Dos puertas son las m�s accesibles, una subiendo por");
		System.out.println("las escaleras de espiral y otra abajo escondida de la");
		System.out.println("luz.");
		System.out.println("�Que quieres hacer?");
		System.out.println("1- Ir a la puerta de arriba");
		System.out.println("2- Ir a la puerta de abajo");
		System.out.println("3- Volver a los pasillos");
		System.out.println("4- Descansar");
		System.out.println("5- Inventario");
		System.out.println("6- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();
		
		while (choice != 6) {
			switch (choice) {
				case 1:
					System.out.println("La puerta m�s alta carece de pomo o manilla");
					System.out.println("en su lugar un endidura con forma de sol");
					System.out.println("igual que la que llevaba el hombre de tenso");
					System.out.println("cabo alrededor del cuello.");
					if (inv.contains("Medall�n del sol")) {
						System.out.println("El medall�n encaja sin proble alguno y");
						System.out.println("acto seguido gira, dandote acceso a los");
						System.out.println("aposentos.");
						if (Aencounter == false) {
							aposentosE();
						} else {
							aposentos();
						}
					} else {
						System.out.println("Careces de un medall�n similar, para ti");
						System.out.println("esta puerta est� tan cerrada como cualquier");
						System.out.println("otra y careces de forma para entrar.");
						torreH();
					}
					break;
				case 2:
					armeria();
					break;
				case 3:
					pasillosIluminados();
					break;
				case 4:
					longRest();
					torreH();
					break;
				case 5:
					inventory();
					torreH();
					break;
				default:
					System.out.println("Eso no es una opci�n");
					torreH();
					break;
			} //switch
		}//while
		if (choice == 6) {System.exit(0);}
		
		torreH();
	}
	
	public static void armeria() {
		System.out.println("La puerta m�s baja est� vuelta, siguir bajando por las");
		System.out.println("escaleras ser�a ardua tarea ya que la mayor�a de los restos");
		System.out.println("del techo se han acumulado por esta zona baja, concretamente");
		System.out.println("te corta el  paso un par de vigas que para cruzarlas uno");
		System.out.println("habr�a de colgarse sobre el vac�o.");
		System.out.println("El interior de esta sala est� repleta de antiguas armas");
		System.out.println("y armaduras, todas algo maltrechas, aunque algunas a�n son");
		System.out.println("aceptable como armadura de uso real.");
		System.out.println("�Que haces?");
		System.out.println("1- Rebuscar entre las armas y armaduras");
		System.out.println("2- Dar media vuelta");
		System.out.println("3- Descansar");
		System.out.println("4- Inventario");
		System.out.println("5- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();
		
		while (choice != 5) {
			switch(choice) {
				case 1:
					if (armeryE == false) {
					System.out.println("Vas tocando pomos de espadas, mangos de hachas,");
					System.out.println("cabezas de maza y corazas de placas. Lo que es");
					System.out.println("para tu sorpresa, es una armadura que con vida");
					System.out.println("propia se comienza a montar en el aire como si");
					System.out.println("alguien la vistiera verdaderamente, los guanteletes");
					System.out.println("de dedos individuales agarran la espada que mejor");
					System.out.println("apariencia tiene, para acto seguido lanzarse a ti.");
					fightBeast(3);
					armeryE = true;
					armeria();
					} else {
						System.out.println("Un buen surtido de armas y armaduras se encuentra");
						System.out.println("a tu disposici�n en esta sala.");
						armasArme();
					}
					break;
				case 2:
					torreH();
					break;
				case 3:
					longRest();
					armeria();
					break;
				case 4:
					inventory();
					armeria();
					break;
				default:
					System.out.println("Eso no es una opci�n.");
					armeria();
					break;
			}
		}//while
		if (choice == 5) {System.exit(0);}
		
		armeria();
	}
	
	public static void armasArme() {
		System.out.println("Entre todas las armas abandonadas estas son las que");
		System.out.println("se encuentran en mejor estado:");
		System.out.println("[Cambiar un arma/armadura har� desaparecer aquella que portas]");
		System.out.println("1- La espada que bland�a la armadura viviente [1d8 cortante]");
		System.out.println("2- Una lanza cuyo aasta no se ha podrido [1d8 perforante]");
		System.out.println("3- Un messer cuyo mango es de hueso [1d6 cortante]");
		System.out.println("4- Una ballesta pesada con su cranequ�n y munici�n [1d10 perforante]");
		System.out.println("5- Un escudo her�ldico [+2 AC]");
		System.out.println("6- Pavisa Brizzina [+3 AC]");
		System.out.println("7- Foco Arcano [+4 a los hechizos]");
		System.out.println("8- Brigantina Brizzina con hombreras [14 AC]");
		System.out.println("9- Peto y espaldar de placas [16 AC]");
		System.out.println("10- dejar de mirar las armas");
		choice = s.nextInt();
		
		switch (choice) {
			case 1:
				playerWeapon = "Espada [1d8 cortante]";
				playerDmg = roll8();
				typeDmg = 2;
				break;
			case 2:
				playerWeapon = "Lanza [1d8 perforante]";
				playerDmg = roll8();
				typeDmg = 1;
				break;
			case 3:
				playerWeapon = "Messer [1d6 cortante]";
				playerDmg = roll6();
				typeDmg = 2;
				break;
			case 4:
				playerDisWeapon = "Una ballesta pesada con su cranequ�n y munici�n [1d10 perforante]";
				playerDisDmg = roll10();
				if (playerDisWeapon != "arqueb�s [2d12 perforante]") {
					ammunition = ammunition + 20;
				} else {
					ammunition = 20;
				}
				break;
			case 5:
				bonusAC = 2;
				totalAC = playerAC + bonusAC;
				break;
			case 6:
				bonusAC = 3;
				totalAC = playerAC + bonusAC;
				break;
			case 7:
				playerWeapon = "Foco arcano [+4 a los hechizos]";
				playerDmg = (int) (1);
				SpellBonus = SpellBonus + 4;
				typeDmg = 3;
				break;
			case 8:
				playerArmor = "Brigantina Brizzina con hombreras";
				playerAC = 14;
				stealthDis = true;
				totalAC = playerAC + bonusAC;
				break;
			case 9:
				playerArmor = "Peto y espaldar de placas";
				playerAC = 16;
				stealthDis = false;
				totalAC = playerAC + bonusAC;
				break;
			case 10:
				armeria();
				break;
			default:
				System.out.println("Eso no es una opci�n");
				armasArme();
				break;
		}
		armasArme();
	}
	
	public static void aposentosE() {
		System.out.println("La �nica habitaci�n por encima de la tierra en las");
		System.out.println("ruinas es esta, unos aposentos maravillosamente ");
		System.out.println("decorados siempre con motivos solares y geometr�a");
		System.out.println("triangular, dos armarios muestran las riquezas que");
		System.out.println("hab�an poseido en otro tiempo, ahora las finas ropas");
		System.out.println("de seda est�n empapadas y destrozadas. Sorprendentemente");
		System.out.println("incluso un pozo que baja directamente a un r�o subterraneo");
		System.out.println("una estancia digna del emperador Iline III. Pero no todo");
		System.out.println("son riquezas, sobre las rasgadas s�banas lo que parecer�a");
		System.out.println("una l�mina de luz con forma v�gamente humana. Extra�as voces");
		System.out.println("salen de esa direcci�n, hablando un idioma similar al tuyo");
		System.out.println("pero que en ning�n momento terminas de enteneder. La l�mina");
		System.out.println("se acerca sin tocar el suelo, su presencia es abrasante");
		System.out.println("y no hay forma de distinguir sus intenciones.");
		System.out.println("�Que haces?");
		System.out.println("1- Atacar la extr��a l�mina.");
		System.out.println("2- Intentar salir por la puerta.");
		System.out.println("3- Lanzarse por el pozo.");
		System.out.println("4- Quedarse est�tico.");
		choice = s.nextInt();
		
		switch (choice) {
			case 1:
				fightSolarBeasts(3);
				Aencounter = true;
				aposentos();
				break;
			case 2:
				if(inv.contains("Medall�n del sol") && roll20() > 13) {
					System.out.println("Insertas como puedes el medall�n en la");
					System.out.println("ranura, y abres la puerta de golpe sales");
					System.out.println("a la carrera cerrando los aposentos tras");
					System.out.println("de ti, por poco no te caes por el hueco en");
					System.out.println("las escaleras.");
					torreH();
				} else {
					System.out.println("Tes es imposible huir, la puerta no cede");
					System.out.println("por mucho que la agites, tu �nica opci�n es combatir.");
					fightSolarBeasts(3);
					Aencounter = true;
					aposentos();
				}
				break;
			case 3:
				if (roll20() == 17) {
					System.out.println("Te lanzas por el pozo, m�s bien a la cuerda");
					System.out.println("bajas con cuidado de no quemarte las manos");
					System.out.println("hasta las g�lidas aguas del r�o subterraneo");
					System.out.println("y nadas hasta lo que parece un muelle bajo");
					System.out.println("tierra.");
					if (Ormr == true) {
						rioCarga1();
					} else {
						rioCarga2();
					}
				} else {
					System.out.println("Tuviste un desafortunado error de calculo");
					System.out.println("te lanzaste de cabeza contra el pozo y tu");
					System.out.println("cabeza golpe� el reborde de una triangular");
					System.out.println("piedra. Tu cuerpo cay� inerte el resto de");
					System.out.println("la caida inerte...");
					muerte();
				}
				break;
			case 4:
				System.out.println("Aguantas tu terreno conforme avanza la viviente");
				System.out.println("saeta de fuego, empiezas a sudar a chorros a cada");
				System.out.println("pie que avanza en tu direcci�n. Se detiene frente");
				System.out.println("a ti, esas voces que no puedes entender hablando");
				System.out.println("sin parar a tu alrededor. La silueta de luz se acerca.");
				if (inv.contains("Medall�n del sol")) {
					System.out.println("La silueta toca el medall�n que le arrebataste al");
					System.out.println("cadaver en la taberna tenso cabo. La mano del");
					System.out.println("espectro se va fundiendo conforme se calienta el");
					System.out.println("medall�n, de pronto conforme m�s y m�s de la");
					System.out.println("viviente saeta, te ves incapaz de moverte");
					System.out.println("forzado a sentir como el medall�n al blanco");
					System.out.println("vivo marca tu piel una vez te ves capaz de");
					System.out.println("soltarlo una vez ha desaparecido la l�mina");
					System.out.println("de luz. El medall�n parece quemado pero");
					System.out.println("conserva la forma, tu cuerpo ahora est�");
					System.out.println("marcado por el sol del medall�n y ");
					System.out.println("est�s solo una vez m�s.");
					marcado = true;
					inv.remove("Medall�n del sol");
					inv.add("Medall�n del sol quemado");
					aposentos();
				} else {
					System.out.println("La l�mina de luz se acerta y te analiza");
					System.out.println("buscando algo en t�, pero no lo encuentra");
					System.out.println("-�Cual es tu devoci�n?");
					System.out.println("Escuchas de una de las voces que antes no");
					System.out.println("entendias.");
					System.out.println("�Que respondes?");
					System.out.println("1- La del Sol");
					System.out.println("2- La de otro");
					choice = s.nextInt();
					switch (choice) {
						case 1:
								if(devotado == false) {
									System.out.println("-Pues tal es su calor");
									System.out.println("En un instante la silueta luminosa");
									System.out.println("ha desaparecido, pero tu notal algo distinto en la");
									System.out.println("habitaci�n.");
									MaxSpellSlots = MaxSpellSlots + 3;
									SpellSlots = MaxSpellSlots;
									devotado = true;
									aposentos();
								} else {
									System.out.println("-No me mintais, pues siento la devoci�n a otros en t�.");
									System.out.println("La l�mina de luz desaparece sin m�s dilaci�n.");
									aposentos();
								}
							break;
						case 2:
							System.out.println("-Una pena --Responde otra de las voces");
							System.out.println("la l�mina poco a poco se desvanece de");
							System.out.println("tu campo de visi�n para no volver a ser vista.");
							aposentos();
							break;
						default:
							System.out.println("Ante tu negativa a elegir una respuesta");
							System.out.println("no hay repuesta tampoco por parte de la");
							System.out.println("l�mina, la cual desaparece al poco.");
							aposentos();
							break;
					}
				}
				break;
			default:
				System.out.println("Eso no es una opci�n");
				aposentosE();
				break;
		}
		
		aposentosE();
	} 
	
	public static void aposentos() {
		System.out.println("Con los aposentos vac�os notas la brisa que corre");
		System.out.println("a traves de una de las pocas ventanas sobre tierra");
		System.out.println("hasta el pozo por donde huye el aire, la l�mina de");
		System.out.println("luz ha desaparecido y tencuentras solo en los aposentos");
		System.out.println("poco hay que destacar, una habitaci�n para alguien");
		System.out.println("de alta alcurnia que se ha ido deteriorando con los a�os");
		System.out.println("�Que quieres hacer?");
		System.out.println("1- Rebuscar por la habitaci�n");
		System.out.println("2- Al torre�n hundido");
		System.out.println("3- Descansar");
		System.out.println("4- Inventario");
		System.out.println("5- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();
		
		while (choice != 5) {
			switch (choice) {
				case 1:
					if (looted4 == false) {
						System.out.println("Rebuscando entre los objetos de la sala");
						System.out.println("encuentras monedas extra�as y antiguas");
						System.out.println("pero a�n as� podr�an server en el mercado.");
						galeones = galeones + roll20() + roll6();
						looted4 = true;
						aposentos();
					} else {
						System.out.println("Todo aquello de valor que pudiera haber");
						System.out.println("en este lugar ha sido ya saqueado, por");
						System.out.println("t� y por aquellos antes que t�.");
						aposentos();
					}
					break;
				case 2:
					torreH();
					break;
				case 3:
					longRest();
					aposentos();
					break;
				case 4:
					inventory();
					aposentos();
					break;
			}//switch
		}//while
		if (choice == 5) {System.exit(0);}
		aposentos();
	}
	
	//MONTA�AS DE LA LUZ
	public static void faldaMont() {
		System.out.println("Haces tu camino hasta las faldas de la cordillera que");
		System.out.println("suponen las monta�as doradas, monta�as cuyas paredes");
		System.out.println("hechas de una rara arenisca le dan una tonalidad amarillenta");
		System.out.println("casi dorada, nadie sabe exactamente que causa este color");
		System.out.println("lo que se sabe es que no hay registro de otra cordillera similar.");
		System.out.println("Conforme asciendes por uno de los caminos que cruzan");
		System.out.println("estas monta�as que carecen de �rbol alguno.");
		if (grupCarr == false) {
			System.out.println("Algo capta tu atenci�n, un grupo de carromatos se agrupan frente a");
			System.out.println("la pared de la monta�a, el grupo es peque�o, tres carros");
			System.out.println("no m�s, pero entre ellos se mueve un grupo mayor de personas");
			System.out.println("todos con t�nicas celestes por las que se extienden tent�culos");
			System.out.println("de oro salientes de un c�rculo central, todos compartiendo un");
			System.out.println("collar sobre la t�nica, un collar con iconograf�a del sol");
			System.out.println("como la que vest�a el hombre de la taberna.");
			System.out.println("Al fondo uno de estos hombres en impolutas t�nicas posa algo contra");
			System.out.println("la pared de las monta�as, la cual parece desaparecer como");
			System.out.println("si nunca hubiera estado ah� antes de que se marche el hombre.");
		} else {
			System.out.println("La falta de pared se mantiene tras los sucedido dandote via libre");
			System.out.println("a un interior cuyo estilo arquitect�nico es �nico, repleto de tri�ngulos");
		}
		System.out.println("�Que haces?");
		if(grupCarr == false) {
		System.out.println("1- Intentas ir hacia la pared desaparecida.");
		System.out.println("2- Atacas a los integrantes del culto al Sol");
		System.out.println("3- Intentas robar de los carromatos");
		System.out.println("4- Volver a los campos");
		System.out.println("5- Inventario");
		} else {
			System.out.println("1- Adentrarte en la monta�a");
			System.out.println("2- Volver a los campos.");
			System.out.println("3- Descansar");
			System.out.println("4- inventario");
			System.out.println("5- Salir de la sesi�n [NO SE GUARDA]");
		}
		System.out.println("");
		choice = s.nextInt();
		
		switch(choice) {
			case 1:
				if (grupCarr = false) {
					if (grupCarr = false) {
						int tirada = roll20();
						if(stealthDis = true) {
							int tira1 = roll20();
							if (tira1 < tirada) {tirada = tira1;}
							} //StealthDis
							if (tirada >= 16) {
								System.out.println("Te acercas al carromato con todo el sigilo posible");
								System.out.println("comienzas a rebuscar entre las pertenencias transportadas");
								System.out.println("y encuentas:");
								
							} else {
								System.out.println("Por mucho que intentas ser sigiloso no te puedes");
								System.out.println("acercar sin antes haber sido visto por alguno de");
								System.out.println("los presentes.");
								System.out.println("-Ubi es? --Escuchas desde la pared de la monta�a");
								System.out.println("-Nescio. Capere fur! --Responde otra de las voces");
								System.out.println("antes de que tengas a todos encima.");
								fight(1);
								System.out.println("El siguiente llega tras acabar con el primero.");
								fight(1);
								System.out.println("Tras el segundo aparece alguien carente de arma alguna");
								fight(2);
								System.out.println("Tras acabar con esos tres el ultimo que se ha quedado aparece");
								System.out.println("rodeado una extra�a aura dorada.");
								fight(3);
								System.out.println("Tras tener que enfrentarte a cuatro de estas personas");
								System.out.println("en t�nicas el resto huye, unas tantas al interior de la");
								System.out.println("monta�a y otras tantas por el camino no sin antes llevarse");
								System.out.println("los carromatos sabiendo que estabas ocupado.");
								grupCarr = true;
								interiorMont();
							}
					} else {
						interiorMont();
					}
				} else {
					interiorMont();
				}
				break;
			case 2:
				if (grupCarr = false) {
					System.out.println("Caminas de frente al grupo de personas las cuales");
					System.out.println("se giran en sorpresa al verte, en cuanto notan tu");
					System.out.println("arma en mano todos cambian las expresiones de sorpresa");
					System.out.println("por otras amenazantes, se lanzan a por t� bajo el grito");
					System.out.println("");
					System.out.println("-SOL MORIETUR!");
					fight(1);
					System.out.println("El siguiente llega tras acabar con el primero.");
					fight(1);
					System.out.println("Tras el segundo aparece alguien carente de arma alguna");
					fight(2);
					System.out.println("Tras acabar con esos tres el ultimo que se ha quedado aparece");
					System.out.println("rodeado una extra�a aura dorada.");
					fight(3);
					System.out.println("Tras tener que enfrentarte a cuatro de estas personas");
					System.out.println("en t�nicas el resto huye, unas tantas al interior de la");
					System.out.println("monta�a y otras tantas por el camino no sin antes llevarse");
					System.out.println("los carromatos sabiendo que estabas ocupado.");
					grupCarr = true;
					faldaMont();
				} else {
					camposDeTrigo();
				}
				break;
			case 3:
				if (grupCarr = false) {
					int tirada = roll20();
					if(stealthDis = true) {
						int tira1 = roll20();
						if (tira1 < tirada) {tirada = tira1;}
						} //StealthDis
						if (tirada >= 16) {
							System.out.println("Te acercas al carromato con todo el sigilo posible");
							System.out.println("comienzas a rebuscar entre las pertenencias transportadas");
							System.out.println("y encuentas:");
							
						} else {
							System.out.println("Por mucho que intentas ser sigiloso no te puedes");
							System.out.println("acercar sin antes haber sido visto por alguno de");
							System.out.println("los presentes.");
							System.out.println("-Ubi es? --Escuchas desde la pared de la monta�a");
							System.out.println("-Nescio. Capere fur! --Responde otra de las voces");
							System.out.println("antes de que tengas a todos encima.");
							fight(1);
							System.out.println("El siguiente llega tras acabar con el primero.");
							fight(1);
							System.out.println("Tras el segundo aparece alguien carente de arma alguna");
							fight(2);
							System.out.println("Tras acabar con esos tres el ultimo que se ha quedado aparece");
							System.out.println("rodeado una extra�a aura dorada.");
							fight(3);
							System.out.println("Tras tener que enfrentarte a cuatro de estas personas");
							System.out.println("en t�nicas el resto huye, unas tantas al interior de la");
							System.out.println("monta�a y otras tantas por el camino no sin antes llevarse");
							System.out.println("los carromatos sabiendo que estabas ocupado.");
							grupCarr = true;
							faldaMont();
						}
				} else {
					longRest();
					faldaMont();
				}
				break;
			case 4:
				if (grupCarr = false) {
					camposDeTrigo();
				} else {
					inventory();
					faldaMont();
				}
				break;
			case 5:
				if (grupCarr = false) {
					inventory();
					faldaMont();
				} else {
					System.exit(0);
				}
				break;
		}
		
		faldaMont();
	}
	
	public static void interiorMont() {
		System.out.println("Para tu sorpresa el interior se encuentra bien iluminado");
		System.out.println("pasillos y pasillos de piedraas triangulares que hacen de");
		System.out.println("ladrillos se expanden por el interior de la monta�a, un ");
		System.out.println("lugar abandonado por sus antiguos due�os y ahora apropiado");
		System.out.println("por esas personas de t�nicas celestes y doradas, las cuales");
		System.out.println("se han escabullido por estos t�neles, por muchos ataques a ");
		System.out.println("tabernas o aires sectarios terminan siendo un campesinos");
		System.out.println("muy asustadizos.");
		System.out.println("Avanzar acompa�ado del eco de tus pasos, la luz cuyo origen");
		System.out.println("es desconocido no pierde intensidad y no titila en ning�n");
		System.out.println("momento como lo har�a una vela. No tarde te encunetras en");
		System.out.println("un cruze de pasillos, tres caminos, o cuatro si cuentas");
		System.out.println("por el que ha venido se presentan ante ti, desconoces a");
		System.out.println("donde puede llevar cada uno.");
		System.out.println("�Que haces?");
		System.out.println("1- Ir al pasillo frente a t�");
		System.out.println("2- Ir al pasillo a siniestra");
		System.out.println("3- Ir al pasillo a diestra");
		System.out.println("4- Dar media vulta");
		System.out.println("5- Descansar");
		System.out.println("6- Inventario");
		System.out.println("7- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();
		
		while(choice != 7) {
			switch(choice) {
				case 1:
					salonBastSol();
					break;
				case 2:
					if(forj == false) {
						forjaOrm1();
					} else {
						forjaOrm2();
					}
					break;
				case 3:
					altarSol();
					break;
				case 4:
					faldaMont();
					break;
				case 5:
					longRest();
					interiorMont();
					break;
				case 6:
					inventory();
					interiorMont();
					break;
			}//switch
		} //while
		if (choice == 7) {
			System.exit(0);
		}
		interiorMont();
	}
	
	public static void altarSol() {
		System.out.println("Tras seguir por los pasillos determinas que la luz");
		System.out.println("proviene de los huecos entre los ladrillos triangulares");
		System.out.println("una luz fr�a y azulada, distinta a la de una vela o ");
		System.out.println("cualquier hechizo de fuego, m�s similar a un rayo que");
		System.out.println("al propio Sol.");
		System.out.println("Al final del camino una sala esf�rica con una platarforma");
		System.out.println("se encuentra sin uso, la plataforma circular acoge un cilindro");
		System.out.println("el cual atraviesa la plataforma hasta ambos extremos de la sala");
		System.out.println("rodeando este cilindro velas en lo que parece un altar");
		System.out.println("en el cual ofrendas con iconograf�a del Sol se amontonan");
		System.out.println("el cilindro central rodeado por extra�as y coloridas");
		System.out.println("cuerdas lo rodea una extra�a sensaci�n de divinidad");
		System.out.println("�Que haces?");
		System.out.println("1- Acercarte al altar");
		System.out.println("2- Dar media vuelta");
		System.out.println("3- Descansar");
		System.out.println("4- Inventario");
		System.out.println("5- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();
		
		while(choice != 5) {
			switch(choice) {
				case 1:
						if(devotado == true) {
							System.out.println("Acercandode al pilar poco cambia");
							System.out.println("las cuerdas de colores siguen iguales");
							System.out.println("pero la sensaci�n de divinidad que emite");
							System.out.println("no desaparece aunque no llegues a poder");
							System.out.println("acercarte a la misma.");
							altarSol();
						} else {
							System.out.println("Conforme te acercas al altar la extra�a");
							System.out.println("sensaci�n se apodera de ti. un sensaci�n");
							System.out.println("electrizante corre bajo tu piel. Cuando ");
							System.out.println("termina, te sientes renovado, casi alguien nuevo.");
							devotado = true;
							atkBonus = atkBonus + 3;
							altarSol();
						}
					break;
				case 2:
					interiorMont();
					break;
				case 3:
					longRest();
					altarSol();
					break;
				case 4:
					inventory();
					altarSol();
					break;
			}
		}
		if(choice == 5) {
			System.exit(0);
		}
		altarSol();
	}
	
	public static void forjaOrm1() {
		System.out.println("Esta estancia sorprendentemente bien ventilada para");
		System.out.println("no ver aperturas a primera vista, la habitaci�n est�");
		System.out.println("ocupada por montones de materiales metal�rgicos y similares");
		System.out.println("dedicados a la forja, los instrumentos que reposan sobre");
		System.out.println("calmadas brasas se ven tanteados, por los gordos dedos");
		System.out.println("de un corpulento hombre, ataviado con un delantal de cuero");
		System.out.println("y una m�scara de oro que oculta su rostro, en las manos");
		System.out.println("un hierro candente en cuyo final la efigie del sol arde");
		System.out.println("con roja ira. El hombre no parece contento de ver tu falta");
		System.out.println("de ropajes dorados y celestes, y sin mediar palabra alguna");
		System.out.println("se abalanza sobre ti.");
		System.out.println("�Que haces?");
		System.out.println("1- Atacar de cara");
		System.out.println("2- Intentar esquivar");
		choice = s.nextInt();
		
		switch(choice) {
			case 1:
				System.out.println("Al atacar de cara te expones a un golpe leve");
				playerHP = playerHP - roll4();
				fight(4);
				forj = true;
				forjaOrm2();
				break;
			case 2:
				if(roll20() >= 13) {
					System.out.println("Consigues esquivar el primer golpe");
					fight(4);
					forj = true;
					forjaOrm2();
				} else {
					System.out.println("Intentas esquivar pero recibes un golpe leve");
					playerHP = playerHP - roll4();
					fight(4);
					forj = true;
					forjaOrm2();
				}
				break;
		}
		
		forjaOrm1();
	}
	
	public static void forjaOrm2() {
		System.out.println("Una vez la forja est� libre y el herrero yace en el");
		System.out.println("suelo con su hierro candente perdiendo intesidad en");
		System.out.println("el color, tienes completa libertad de usarla como te");
		System.out.println("plazca. El calor te hace sudar y llega a ser molesto");
		System.out.println("al punto de darte mareos.");
		System.out.println("�Que quieres hacer?");
		System.out.println("1- Forjar algo");
		System.out.println("2- Marcharte");
		System.out.println("3- Descansar");
		System.out.println("4- Inventario");
		System.out.println("5- Salir de la sesi�n [NO SE GUARDA]");
		choice = s.nextInt();
		
		while (choice != 5) {
			switch(choice) {
				case 1:
					if (inv.contains("Escama Ormrinn")) {
						int rand = roll4();
						inv.remove("Escama Ormrinn");
							switch(rand) {
								case 1:
									System.out.println("A tu mente imagenes de armaduras vienen");
									System.out.println("Tu armadura ha cambiado a: ");
									System.out.println("Armadura de escamas Ormrinn [18]");
									playerArmor = "Cota de placas";
									stealthDis = true;
									playerAC = 14;
									totalAC = playerAC + bonusAC;
									forjaOrm2();
									break;
								case 2:
									System.out.println("A tu mente imagenes de una lanza llegan");
									System.out.println("Tu arma ha cambiado a: ");
									System.out.println("Lanza de Ormirinn [1d12 + 1d6]");
									playerWeapon = "Lanza de Ormirinn [1d12 + 1d6]";
									playerDmg = roll12() + roll6();
									typeDmg = 2;
									forjaOrm2();
									break;
								case 3:
									System.out.println("A tu mente llegan imagenes de munici�n a distancia");
									System.out.println("Tu arma a distancia ahora hace 6 m�s de da�o");
									playerDisDmg = playerDisDmg + 6;
									forjaOrm2();
									break;
								case 4:
									System.out.println("A tu mente llegan imagenes de antiguas runas");
									System.out.println("con las escamas creas un collar que mejora tu");
									System.out.println("magia.");
									SpellBonus = 6;
									forjaOrm2();
									break;
							}
					} else {
						System.out.println("No tienes nada que fojar");
						forjaOrm2();
					}
					break;
				case 2:
					interiorMont();
					break;
				case 3:
					longRest();
					forjaOrm2();
					break;
				case 4:
					inventory();
					forjaOrm2();
					break;
			}
		}
		if (choice == 5) {
			System.exit(0);
		}
		
		forjaOrm2();
	}
	
	public static void salonBastSol() {
		System.out.println("Amplio sal�n con ventanas extra�amente colocadas");
		System.out.println("sorprendentemente las ventanas que vistas a la pura");
		System.out.println("roca no ceden ante el peso de la monta�a, en el met�lico");
		System.out.println("interior de esta extra�a estancia, una alargada mesa");
		System.out.println("bien cuidada y rodeada de sillas curules que nada");
		System.out.println("casan con los alrededores centra la estancia en ");
		System.out.println("una de estas sillas, un hombre que emite una extra�a");
		System.out.println("aura dorada y que espera con una alabarda entre las manos");
		System.out.println("y una hermosa armadura de placas con remates dorados.");
		System.out.println("al verte se levanta con cansancio y agarra con decisi�n");
		System.out.println("su arma antes de ponerse frente a t�, listo para un");
		System.out.println("duelo uno a uno.");
		fight(5);
		balcon();
	}
	
	public static void balcon() {
		
		System.out.println("Cuando el �ltimo bendico cae al suelo te encuentras");
		System.out.println("a escasos pasos de una peque�as escalinata que termina");
		System.out.println("en un balc�n con vistas al oc�ano nuboso.");
		System.out.println("Apoyado en la barandilla de metal un hombre cuya piel");
		System.out.println("est� arrugada y entre las dobleces asoman decoraciones");
		System.out.println("met�licas estra�as a la vista, el anciano es el �nico");
		System.out.println("que no viste de celeste y dorado, en su lugar una t�nica");
		System.out.println("negra con soles azules casi blanco a modo de decoraci�n");
		System.out.println("-Qui es? --Te pregunta con extra�a curiosidad en los ojos");
		System.out.println("Parece analizarte con calma absoluta, sus manos cruzadas");
		System.out.println("a la espalda.");
		if (finalshot > playerAC) {
			System.out.println("Una de sus m�nos se mueve de forma extra�amente rauda");
			System.out.println("para un hombre de su edad, contra tu pecho aprieta");
			System.out.println("una extra�a herramienta de la cual un rayo de luz sale");
			System.out.println("y perfora tu pecho al igual que tu armadura sin problema alguno.");
			muerte();
		} else {
			System.out.println("El hombre intenta sacar algo de un bolsillo oculto en su");
			System.out.println("t�nica, pero por suerte u eres m�s r�pido y agarras la dec�pita");
			System.out.println("mano que sujeta una extra�a herrmienta met�lica que parece");
			System.out.println("un par de tubos en forma de 'L'");
			System.out.println("-Nos postulo is. --Te dice con ojos de cordero degollado");
			System.out.println("�Que haces?");
			System.out.println("1- Acabar con el anciano.");
			System.out.println("2- Desarmar y perdonar el anciano.");
			choice = s.nextInt();
			switch (choice) {
				case 1:
					System.out.println("Con un simple empuj�n el anciano cae al");
					System.out.println("oc�ano nuboso en un sorprendente silencio.");
					System.out.println("***EL SOL HA SOBREVIVIDO***");
					System.out.println("*********POR AHORA*********");
					break;
				case 2:
					System.out.println("Arrebatas el extra�o objeto de las manos");
					System.out.println("del anciano, parece patidifuso de no haber");
					System.out.println("podido haber hecho algo con �l.");
					System.out.println("***EL SOL HA SOBREVIVIDO***");
					System.out.println("*********POR AHORA*********");
					break;
				default:
					System.out.println("Eso no es una opci�n");
					balcon();
					break;
			}
		}
		
	}
	
	//Utilidades
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		boolean salir = false;

		try {

			System.out.print(
					"                                           -=                                             \r\n"
							+ "                                          -*:                                             \r\n"
							+ "                                         .++-                                             \r\n"
							+ "                                         .+++                                             \r\n"
							+ "                     .                 .  =++=                                            \r\n"
							+ "                     +.                   .=++=                :-==:.                     \r\n"
							+ "                     -*-.                  -+++=             :++=.                        \r\n"
							+ "                      -**=-:.              -++++:           =++=                          \r\n"
							+ "                       .=+*++++=-:         =++++=  .       =++=                           \r\n"
							+ "                          :-+***+++=.     :+=====        :=+++:                           \r\n"
							+ "                             .=++++++= .:--===--::.   .-=++++-                            \r\n"
							+ "                               .=+++===++++++++++++=-:=++++=-                             \r\n"
							+ "                                 =-=++++=:.. ...:-++++=-=+=.                              \r\n"
							+ "                                 :++++-            :=+++::                                \r\n"
							+ "                            ....:+++=.               =+++:                                \r\n"
							+ "                      .-=+*****=++++   La muerte      =++=...      .::--==-:              \r\n"
							+ "           ..     .:=++******++-+++=      del         -+++-++++==+++++++======:           \r\n"
							+ "            :=****++++==----==+:++++         Sol      -+++-++++++++=-:                    \r\n"
							+ "               ..:..            -+++:                .+++=:====-:.                        \r\n"
							+ "                             .   =+++:              .=++=.                                \r\n"
							+ "                               .=-=+++=:.         :=+++=.                                 \r\n"
							+ "                              -++++-=+++++=----==++++=-=+:                                \r\n"
							+ "                             +++*+++:.-=++++++++++=--=++++-                               \r\n"
							+ "                            =++++=:      -=====:.   :=++++++-.                            \r\n"
							+ "                           -+++=      .  ++++++.      .-=++++*+=:                         \r\n"
							+ "                          .+++=          =++++=          .:-=+**++-                       \r\n"
							+ "                         .+**-           .++++=                .:=++.                     \r\n"
							+ "                       .=**=.             :++++                   .=+                     \r\n"
							+ "                    .:==-:                 .++*-                    =                     \r\n"
							+ "                                            .**+                                          \r\n"
							+ "                                          .  -**                                          \r\n"
							+ "                                             :*+                                          \r\n"
							+ "                                             -+                                           \r\n"
							+ "                                          .  :                                            \r\n"
							+ "																							 \r\n"
							+ "																							 \r\n"
							+ "																							 \r\n"
							+ "BlaGames�																		         \r\n"
							+ "LaMuerteDelSol�		 																     \r\n"
							+ "V 0.9-2																                     \r\n"
							+ "");

			System.out.println("1- Jugar");
			System.out.println("2- Salir");
			choice = s.nextInt();
			switch (choice) {
			case 1:
				clase();
				if (playerClass == "Vagabundo") {
					hoboStart();
				} else {
					tensoCabo();
				}
				break;
			case 2:
				System.exit(0);
				break;
			}
			if (salir = true) {
				System.exit(0);
			}
		} catch (java.util.InputMismatchException e) {
			System.out.println("Algo sali� mal");
		}

	}

	public static int roll20() {
		Random rand = new Random();
		int n = rand.nextInt(21);
		while (n == 0) {
			n = rand.nextInt(21);
		} // 1-20
		return n;
	}

	public static int roll12() {
		Random rand = new Random();
		int n = rand.nextInt(13);
		while (n == 0) {
			n = rand.nextInt(13);
		} // 1-12
		return n;
	}

	public static int roll10() {
		Random rand = new Random();
		int n = rand.nextInt(11);
		while (n == 0) {
			n = rand.nextInt(11);
		} // 1-10
		return n;
	}

	public static int roll8() {
		Random rand = new Random();
		int n = rand.nextInt(9);
		while (n == 0) {
			n = rand.nextInt(9);
		} // 1-8
		return n;
	}

	public static int roll6() {
		Random rand = new Random();
		int n = rand.nextInt(7);
		while (n == 0) {
			n = rand.nextInt(7);
		} // 1-6
		return n;
	}

	public static int roll4() {
		Random rand = new Random();
		int n = rand.nextInt(5);
		while (n == 0) {
			n = rand.nextInt(5);
		} // 1-4
		return n;
	}
} // end of class

//anotations
// https://codereview.stackexchange.com/questions/171431/text-based-rpg-dungeon-game-in-java