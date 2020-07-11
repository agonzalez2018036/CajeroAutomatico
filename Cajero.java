import java.util.Scanner;
import java.util.Random;
import java.math.BigInteger;

public class Cajero{
	public static void main(String args[]){
	
	// Objetos
	Scanner in = new Scanner(System.in); 
	Random videos = new Random();
	BigInteger numTrans = new BigInteger(50, videos);

	// variables String
	String user = "", user1 = "Miguel", user2 = "Alvaro", user3 = "Carlos", password1 = "1234", password2 = "1234", password3 = "1234",
	password = "";

	//variables Int 
	int saldom = 5000, saldoa = 20000, saldoc = 4000, opcion = 0, num1 = 50, num2 = 100, num3 = 200, num4 = 500, num5 = 1000, bucle = 0,
	menu1 = 0, mvariable2 = 0, mvariable1 = 0, mvariable = 0, max = 0, num10 = 0;

	System.out.println("********************");
	System.out.println("*    Bienvenido    *");
	System.out.println("********************");
	System.out.println("");
	System.out.print("Ingrese su nombre de usuario: ");
	user = in.nextLine();
	System.out.print("Ingrese su contrase�a: ");
	password = in.nextLine();
	System.out.println("");

	if(user.equals(user1) && password.equals(password1)){
	do{
	System.out.println("********************");
	System.out.println("*   Hola Miguel    *");
	System.out.println("********************");
	System.out.println("");
	System.out.println("       MENU     ");
	System.out.println("");
	System.out.println("1. Saldo Actual");
	System.out.println("2. Retiros");
	System.out.print("Ingrese una opcion: ");
	menu1 = in.nextInt();
	System.out.println("");
	
	if(menu1 == 1){
	System.out.println("");
	System.out.println("Su saldo actual es de Q" + saldom);
	System.out.println("");
	System.out.println("�Desea Realizar otra operacion?");
	System.out.print("0.Si    1.No ");
	bucle = in.nextInt();
	System.out.println("");
		
	}else if(menu1 == 2){
	System.out.println("*********");
	System.out.println("*Retiros*");
	System.out.println("*********");
	System.out.println("1. Q50");
	System.out.println("2. Q100");
	System.out.println("3. Q200");
	System.out.println("4. Q500");
	System.out.println("5. Q1000");
	System.out.println("6. Monto Variado");
	System.out.println("7. Salir");
	System.out.print("�Cuanto desea retirar? ");
	opcion = in.nextInt();
	System.out.println("");

	switch(opcion){
		case 1:
			max = max + num1;
			if(num1 < saldom && max <= 2000 && num1 != saldom){
				saldom = saldom - num1;
				System.out.println("Espere un momento...");
				System.out.println("Listo, se han retirado Q50 exitosamente");
				System.out.println("Su numero de transaccion es: " + numTrans);
				System.out.println("Su saldo actual es de Q" + saldom);
			} else if(num1 > saldom){
				System.out.println("Lo sentimos, el monto ha retirar excede su saldo actual");
			} else if(max > 2000){
				System.out.println("Lo sentimos, no puede retirar mas de Q2000");
				max = max - num1;
			} else if(num1 == saldom){
				System.out.println("No puede retirar por completo su dinero");
			}
				System.out.println("");
				System.out.println("�Desea realizar otra operacion?");
				System.out.print("0.Si    1.No ");
				bucle = in.nextInt();
				System.out.println("");
				if(bucle == 1){
					System.out.println("Esperamos que vuelva pronto!!");
				}
			break;
		case 2:
			max = max + num2;
			if(num2 < saldom && max <= 2000 && num2 != saldom){
				saldom = saldom - num2;
				System.out.println("Espere un momento...");
				System.out.println("Listo, se han retirado Q100 exitosamente");
				System.out.println("Su numero de transaccion es: " + numTrans);
				System.out.println("Su saldo actual es de Q" + saldom);
			} else if(num2 > saldom){
				System.out.println("Lo sentimos, el monto ha retirar excede su saldo actual");
			} else if(max > 2000){
				System.out.println("Lo sentimos, no puede retirar mas de Q2000");
				max = max - num2;
			} else if(num2 == saldom){
				System.out.println("No puede retirar por completo su dinero");
			}
				System.out.println("");
				System.out.println("�Desea realizar otra operacion?");
				System.out.print("0.Si     1.No ");
				bucle = in.nextInt();
				System.out.println("");
			if(bucle == 1){
				System.out.println("Esperamos que vuelva pronto!!");
			}
			break;
		case 3:
			max = max + num3;
			if(num3 < saldom && max <= 2000 && num3 != saldom){
				saldom = saldom - num3;
				System.out.println("Espere un momento...");
				System.out.println("Listo, se han retirado Q200 exitosamente");
				System.out.println("Su numero de transaccion es: " + numTrans);
				System.out.println("Su saldo actual es de Q" + saldom);
			} else if(num3 > saldom){
				System.out.println("Lo sentimos, el monto ha retirar excede su saldo actual");
			} else if(max > 2000){
				System.out.println("Lo sentimos, no puede retirar mas de Q2000");
				max = max - num3;
			} else if(num3 == saldom){
				System.out.println("No puede retirar por completo su dinero");
			}
				System.out.println("");
				System.out.println("�Desea realizar otra operacion?");
				System.out.print("0.Si    1.No ");
				bucle = in.nextInt();
				System.out.println("");
			if(bucle == 1){
				System.out.println("Esperamos que vuelva pronto!!");
			}
			break;
		case 4: 
			max = max + num4;
			if(num4 < saldom && max <= 2000 && num4 != saldom){
				saldom = saldom - num4;
				System.out.println("Espere un momento...");
				System.out.println("Listo, se han retirado Q500 exitosamente");
				System.out.println("Su numero de transaccion es: " + numTrans);
				System.out.println("Su saldo actual es de Q" + saldom);
			} else if(num4 > saldom){
				System.out.println("Lo sentimos, el monto ha retirar excede su saldo actual");
			} else if(max > 2000){
				System.out.println("Lo sentimos, no puede retirar mas de Q2000");
				max = max - num4; 
			} else if(num4 == saldom){
				System.out.println("No puede retirar por completo su dinero");
			}
				System.out.println("");
				System.out.println("�Desea realizar otra operacion?");
				System.out.print("0.Si    1.No ");
				bucle = in.nextInt();
				System.out.println("");
			if(bucle == 1){
				System.out.println("Esperamos que vuelva pronto!!");
			}
			break;
		case 5:
			max = max + num5;
			if(num5 < saldom && max <= 2000 && num5 != saldom){
				saldom = saldom - num5;
				System.out.println("Espere un momento...");
				System.out.println("Listo, se han retirado Q1000 exitosamente");
				System.out.println("Su numero de transaccion es: " + numTrans);
				System.out.println("Su saldo actual es de Q" + saldom);
			} else if(num5 > saldom){
				System.out.println("Lo sentimos, el monto ha retirar excede su saldo actual");
			} else if(max > 2000){
				System.out.println("Lo sentimos, no puede retirar mas de Q2000");
				max = max - num5;
			} else if(num5 == saldom){
				System.out.println("No puede retirar por completo su dinero");
			}
				System.out.println("");
				System.out.println("�Desea realizar otra operacion?");
				System.out.print("0.Si    1.No ");
				bucle = in.nextInt();
				System.out.println("");
			if(bucle == 1){
				System.out.println("Esperamos que vuelva pronto!!");
			}
			break;
		case 6:
			System.out.print("Ingrese el monto que desea retirar: ");
			mvariable = in.nextInt();
			mvariable1 = mvariable / 50;                                                                    
			mvariable2 = mvariable % 50;   
			max = max + mvariable;                                                                       
			if (mvariable1 >= 1 && mvariable2 == 0 && mvariable < saldom && max <= 2000 && mvariable != saldom){
				saldom = saldom - mvariable;
				System.out.println("Espere un momento...");
				System.out.println("Usted retiro un monto de: " + mvariable);
				System.out.println("Su numero de transaccion es: " + numTrans);
				System.out.println("Tiene un saldo de: " + saldom);
				System.out.println("");
			} else if (mvariable1 < 1 || mvariable2 != 0){
				System.out.println("El monto no es valido, solo multiplos de 50.");
				System.out.println("");
				max = max - mvariable; 
			} else if(mvariable > saldom){
				System.out.println("Lo sentimos, el monto ha retirar excede su saldo actual");
				max = max - mvariable; 
			} else if(max > 2000){
				System.out.println("Lo sentimos, ha superado el retiro diario");
				max = max - mvariable; 
			} if(mvariable == saldom){
				System.out.println("No puede retirar por completo su dinero");
				max = max - mvariable; max = max - mvariable; 
			}

			System.out.println("");
			System.out.println("�Desea realizar otra operacion?");
			System.out.print("0.Si    1.No ");
			bucle = in.nextInt();
			System.out.println("");
			if(bucle == 1){
				System.out.println("Esperamos que vuelva pronto!!");
			}
			break;
		case 7:
			System.out.println("");
			System.out.println("�Seguro que desea salir?");
			System.out.print("0.No    1.Si ");
			bucle = in.nextInt();
			System.out.println("");
			if(bucle == 1){
			System.out.println("Esperamos que vuelva pronto!!");
			}
			break;
		default:
			System.out.println("Ingrese una opcion valida");
			break;
	}
	} else{
		System.out.println("Ingrese una opcion valida");
		System.out.println("");
	}

	} while(bucle == 0);

		// Aqui empieza el usuario #2

	} if(user.equals(user2) && password.equals(password2)){
	do{
	System.out.println("********************");
	System.out.println("*   Hola Alvaro    *");
	System.out.println("********************");
	System.out.println("");
	System.out.println("       MENU     ");
	System.out.println("");
	System.out.println("1. Saldo Actual");
	System.out.println("2. Retiros");
	System.out.print("Ingrese una opcion: ");
	menu1 = in.nextInt();
	System.out.println("");
	
	if(menu1 == 1){
		System.out.println("");
		System.out.println("Su saldo actual es de Q" + saldoa);
		System.out.println("");
		System.out.println("�Desea realizar otra operacion?");
		System.out.print("0. Si    1.No ");
		bucle = in.nextInt();
		System.out.println("");

	}else if(menu1 == 2){
		System.out.println("*********");
		System.out.println("*Retiros*");
		System.out.println("*********");
		System.out.println("1. Q50");
		System.out.println("2. Q100");
		System.out.println("3. Q200");
		System.out.println("4. Q500");
		System.out.println("5. Q1000");
		System.out.println("6. Monto Variado");
		System.out.println("7. Salir");
		System.out.print("�Cuanto deseas retirar? ");
		opcion = in.nextInt();
		System.out.println("");

	switch(opcion){
		case 1:
			max = max + num1;
			if(num1 < saldoa && max <= 2000 && num1 != saldoa){
				saldoa = saldoa - num1;
				System.out.println("Espere un momento...");
				System.out.println("Listo, se han retirado Q50 exitosamente");
				System.out.println("Su numero de transaccion es: " + numTrans);
				System.out.println("Su saldo actual es de Q" + saldoa);
			} else if(num1 > saldoa){
				System.out.println("Lo sentimos, el monto ha retirar excede su saldo actual");
			} else if(max > 2000){
				System.out.println("Lo sentimos, solo puede retirar un maximo de Q2000");
				max = max - num1;
			} else if(num1 == saldoa){
				System.out.println("No puede retirar por completo su dinero");
			}
				System.out.println("");
				System.out.println("�Desea realizar otra operacion?");
				System.out.print("0.Si    1.No ");
				bucle = in.nextInt();
				System.out.println("");
			if(bucle == 1){
				System.out.println("Esperamos que vuelva pronto!!");
			}
			break;
		case 2:
			max = max + num2;
			if(num2 < saldoa && max <= 2000 && num2 != saldoa){
				saldoa = saldoa - num2;
				System.out.println("Espere un momento...");
				System.out.println("Listo, se han retirado Q100 exitosamente");
				System.out.println("Su numero de transaccion es: " + numTrans);
				System.out.println("Su saldo actual es de Q" + saldoa);
			} else if(num2 > saldoa){
				System.out.println("Lo sentimos, el monto ha retirar excede su saldo actual");
			} else if(max > 2000){
				System.out.println("Lo sentimos, solo puede retirar un maximo de Q2000");
				max = max - num2;
			} else if(num2 == saldoa){
				System.out.println("No puede retirar por completo su dinero");
			}
				System.out.println("");
				System.out.println("�Desea realizar otra operacion?");
				System.out.print("0.Si    1.No ");
				bucle = in.nextInt();
				System.out.println("");
			if(bucle == 1){
				System.out.println("Esperamos que vuelva pronto!!");
			}
			break;
		case 3:
			max = max + num3;
			if(num3 < saldoa && max <= 2000 && num3 != saldoa){
				saldoa = saldoa - num3;
				System.out.println("Espere un momento...");
				System.out.println("Listo, se han retirado Q200 exitosamente");
				System.out.println("Su numero de transaccion es: " + numTrans);
				System.out.println("Su saldo actual es de Q" + saldoa);
			} else if(num3 > saldoa){
				System.out.println("Lo sentimos, el monto ha retirar excede su saldo actual");
			} else if(max > 2000){
				System.out.println("Lo sentimos, solo puede retirar un maximo de Q2000");
				max = max - num3;
			} else if(num3 == saldoa){
				System.out.println("No puede retirar por completo su dinero");
			}
				System.out.println("");
				System.out.println("�Desea realizar otra operacion?");
				System.out.print("0.Si    1.No ");
				bucle = in.nextInt();
				System.out.println("");
			if(bucle == 1){
				System.out.println("Esperamos que vuelva pronto!!");
			}
			break;
		case 4: 
			max = max + num4;
			if(num4 < saldoa && max <= 2000 && num4 != saldoa){
				saldoa = saldoa - num4;
				System.out.println("Espere un momento...");
				System.out.println("Listo, se han retirado Q500 exitosamente");
				System.out.println("Su numero de transaccion es: " + numTrans);
				System.out.println("Su saldo actual es de Q" + saldoa);
			} else if(num4 > saldoa){
				System.out.println("Lo sentimos, el monto ha retirar excede su saldo actual");
			} else if(max > 2000){
				System.out.println("Lo sentimos, solo puede retirar un maximo de Q2000");
				max = max - num4;
			} else if(num4 == saldoa){
				System.out.println("No puede retirar por completo su dinero");
			}
				System.out.println("");
				System.out.println("�Desea realizar otra operacion?");
				System.out.print("0.Si    1.No ");
				bucle = in.nextInt();
				System.out.println("");
			if(bucle == 1){
				System.out.println("Esperamos que vuelva pronto!!");
			}
			break;
		case 5:
			max = max + num5;
			if(num5 < saldoa && max <= 2000 && num5 != saldoa){
				saldoa = saldoa - num5;
				System.out.println("Espere un momento...");
				System.out.println("Listo, se han retirado Q1000 exitosamente");
				System.out.println("Su numero de transaccion es: " + numTrans);
				System.out.println("Su saldo actual es de Q" + saldoa);
			} else if(num5 > saldoa){
				System.out.println("Lo sentimos, el monto ha retirar excede su saldo actual");
			} else if(max > 2000){
				System.out.println("Lo sentimos, solo puede retirar un maximo de Q2000");
				max = max - num5;
			} else if(num5 == saldoa){
				System.out.println("No puede retirar por completo su dinero");
			}
			System.out.println("");
			System.out.println("�Desea realizar otra operacion?");
			System.out.print("0.Si    1.No ");
			bucle = in.nextInt();
			System.out.println("");
			if(bucle == 1){
				System.out.println("Esperamos que vuelva pronto!!");
			}
			break;
		case 6:
			System.out.print("Ingrese el monto que desea retirar: ");
			mvariable = in.nextInt();
			mvariable1 = mvariable / 50;                                                                    
			mvariable2 = mvariable % 50;  
			max = max + mvariable;                                                                        
			if (mvariable1 >= 1 && mvariable2 == 0 && mvariable < saldoa && max <= 2000 && mvariable != saldoa){
				saldoa = saldoa - mvariable;
				System.out.println("Usted retiro un monto de: " + mvariable);
				System.out.println("Su numero de transaccion es: " + numTrans);
				System.out.println("Tiene un saldo de: " + saldoa);
				System.out.println("");
			} else if (mvariable1 < 1 || mvariable2 != 0){
				System.out.println("El monto no es valido, solo multiplos de 50.");
				System.out.println("");
				max = max - mvariable; 
			} else if(mvariable > saldoa){
				System.out.println("El monto que desea retirar excede su saldo actual");
				max = max - mvariable; 
			} else if(max > 2000){
				System.out.println("Ha superado el maximo retiro diario de Q2000");
				max = max - mvariable; 
			} else if(mvariable == saldoa){
				System.out.println("No puede retirar por completo su dinero");
				max = max - mvariable; 
			}

			System.out.println("");
			System.out.println("�Desea realizar otra operacion?");
			System.out.print("0.Si    1.No ");
			bucle = in.nextInt();
			System.out.println("");
			if(bucle == 1){
				System.out.println("Esperamos que vuelva pronto!!");
			}
			break;
		case 7:
			System.out.println("");
			System.out.println("�Seguro que desea salir?");
			System.out.print("0.No    1.Si ");
			bucle = in.nextInt();
			System.out.println("");
			if(bucle == 1){
				System.out.println("Esperamos que vuelva pronto!!");
			}
			break;
		default:
			System.out.println("Ingrese una opcion valida");
			break;
	}
	} else{
		System.out.println("Ingrese una opcion valida");
		System.out.println("");
	}
	} while(bucle == 0);

		// Aqui empieza el usuario #3

	} if(user.equals(user3) && password.equals(password3)){
	do{
	System.out.println("********************");
	System.out.println("*   Hola Carlos    *");
	System.out.println("********************");
	System.out.println("");
	System.out.println("       MENU     ");
	System.out.println("");
	System.out.println("1. Saldo Actual");
	System.out.println("2. Retiros");
	System.out.print("Ingrese una opcion: ");
	menu1 = in.nextInt();
	System.out.println("");
	
	if(menu1 == 1){
		System.out.println("");
		System.out.println("Su saldo actual es de Q" + saldoc);
		System.out.println("");
		System.out.println("�Desea Realizar otra operacion?");
		System.out.print("0. Si    1.No ");
		bucle = in.nextInt();
		System.out.println("");
			
	}else if(menu1 == 2){
	System.out.println("*********");		
	System.out.println("*Retiros*");
	System.out.println("*********");	
	System.out.println("1. Q50");
	System.out.println("2. Q100");
	System.out.println("3. Q200");
	System.out.println("4. Q500");
	System.out.println("5. Q1000");
	System.out.println("6. Monto Variado");
	System.out.println("7. Salir");
	System.out.print("�Cuanto deseas retirar? ");
	opcion = in.nextInt();
	System.out.println("");

	switch(opcion){
		case 1:
			max = max + num1;
			if(num1 < saldoc && max <= 2000 && num1 != saldoc){
				saldoc = saldoc - num1;
				System.out.println("Espere un momento...");
				System.out.println("Listo, se han retirado Q50 exitosamente");
				System.out.println("Su numero de transaccion es: " + numTrans);
				System.out.println("Su saldo actual es de Q" + saldoc);
			} else if(num1 > saldoc){
				System.out.println("Lo sentimos, el monto ha retirar excede su saldo actual");
			} else if(max > 2000){
				System.out.println("Lo sentimos, solo puede retirar un maximo de Q2000");
				max = max - num1; 
			} else if(num1 == saldoc){
				System.out.println("No puede retirar por completo su dinero");
			}
			System.out.println("");
			System.out.println("�Desea realizar otra operacion?");
			System.out.print("0.Si    1.No ");
			bucle = in.nextInt();
			System.out.println("");
			if(bucle == 1){
				System.out.println("Esperamos que vuelva pronto!!");
			}
			break;
		case 2:
			max = max + num2;
			if(num2 < saldoc && max <= 2000 && num2 != saldoc){
				saldoc = saldoc - num2;
				System.out.println("Espere un momento...");
				System.out.println("Listo, se han retirado Q100 exitosamente");
				System.out.println("Su numero de transaccion es: " + numTrans);
				System.out.println("Su saldo actual es de Q" + saldoc);
			} else if(num2 > saldoc){
				System.out.println("Lo sentimos, el monto ha retirar excede su saldo actual");
			} else if(max > 2000){
				System.out.println("Lo sentimos, solo puede retirar un maximo de Q2000");
				max = max - num2;
			} else if(num2 == saldoc){
				System.out.println("No puede retirar por completo su dinero");
			}

			System.out.println("");
			System.out.println("�Desea realizar otra operacion?");
			System.out.print("0.Si    1.No ");
			bucle = in.nextInt();
			System.out.println("");
			if(bucle == 1){
				System.out.println("Esperamos que vuelva pronto!!");
			}
			break;
		case 3:
			max = max + num3;
			if(num3 < saldoc && max <= 2000 && num3 != saldoc){
			saldoc = saldoc - num3;
			System.out.println("Espere un momento...");
			System.out.println("Listo, se han retirado Q200 exitosamente");
			System.out.println("Su numero de transaccion es: " + numTrans);
			System.out.println("Su saldo actual es de Q" + saldoc);
			} else if(num3 > saldoc){
				System.out.println("Lo sentimos, el monto ha retirar excede su saldo actual");
			} else if(max > 2000){
				System.out.println("Lo sentimos, solo puede retirar un maximo de Q2000");
				max = max - num3;
			} else if(num3 == saldoc){
				System.out.println("No puede retirar por completo su dinero");
			}

			System.out.println("");
			System.out.println("�Desea realizar otra operacion?");
			System.out.print("0.Si    1.No ");
			bucle = in.nextInt();
			System.out.println("");
			if(bucle == 1){
				System.out.println("Esperamos que vuelva pronto!!");
			}
			break;
		case 4: 
			max = max + num4;
			if(num4 < saldoc && max <= 2000 && num4 != saldoc){
				saldoc = saldoc - num4;
				System.out.println("Espere un momento...");
				System.out.println("Listo, se han retirado Q500 exitosamente");
				System.out.println("Su numero de transaccion es: " + numTrans);
				System.out.println("Su saldo actual es de Q" + saldoc);
			} else if(num4 > saldoc){
				System.out.println("Lo sentimos, el monto ha retirar excede su saldo actual");
			} else if(max > 2000){
				System.out.println("Lo sentimos, solo puede retirar un maximo de Q2000");
				max = max - num4;
			} else if(num4 == saldoc){
				System.out.println("No puede retirar por completo su dinero");
			}

			System.out.println("");
			System.out.println("�Desea realizar otra operacion?");
			System.out.print("0.Si    1.No ");
			bucle = in.nextInt();
			System.out.println("");
			if(bucle == 1){
				System.out.println("Esperamos que vuelva pronto!!");
			}
			break;
		case 5:
			max = max + num5;
			if(num5 < saldoc && max <= 2000 && num5 != saldoc){
				saldoc = saldoc - num5;
				System.out.println("Espere un momento...");
				System.out.println("Listo, se han retirado Q1000 exitosamente");
				System.out.println("Su numero de transaccion es: " + numTrans);
				System.out.println("Su saldo actual es de Q" + saldoc);
			} else if(num5 > saldoc){
				System.out.println("Lo sentimos, el monto ha retira excede su saldo actual");
			} else if(max > 2000){
				System.out.println("Lo sentimos, solo puede retirar un maximo de Q2000");
				max = max - num5;
			} else if(num5 == saldoc){
				System.out.println("No puede retirar por completo su dinero");
			}

			System.out.println("");
			System.out.println("�Desea realizar otra operacion?");
			System.out.print("0.Si    1.No ");
			bucle = in.nextInt();
			System.out.println("");
			if(bucle == 1){
				System.out.println("Esperamos que vuelva pronto!!");
			}
			break;
		case 6:
			System.out.print("Ingrese el monto que desea retirar: ");
			mvariable = in.nextInt();
			mvariable1 = mvariable / 50;                                                                    
			mvariable2 = mvariable % 50;
			max = max + mvariable;                                                                          
			if (mvariable1 >= 1 && mvariable2 == 0 && mvariable < saldoc && max <= 2000 && mvariable != saldoc){
				saldoc = saldoc - mvariable;
				System.out.println("Usted retiro un monto de: " + mvariable);
				System.out.println("Su numero de transaccion es: " + numTrans);
				System.out.println("Tiene un saldo de: " + saldoc);
				System.out.println("");
			} else if (mvariable1 < 1 || mvariable2 != 0){
				System.out.println("El monto no es valido, solo multiplos de 50.");
				System.out.println("");
				max = max - mvariable; 
			} else if(mvariable > saldoc){
				System.out.println("El monto que desea retirar excede su saldo actual");
				max = max - mvariable; 
			} else if(max > 2000){
				System.out.println("No puede retirar mas de Q2000");
				max = max - mvariable; 
			} else if(mvariable == saldoc){
				System.out.println("No puede retirar por completo su dinero");
				max = max - mvariable; 
			}

			System.out.println("");
			System.out.println("�Desea realizar otra operacion?");
			System.out.print("0.Si    1.No ");
			bucle = in.nextInt();
			System.out.println("");
			if(bucle == 1){
				System.out.println("Esperamos que vuelva pronto!!");
			}
			break;
		case 7:
			System.out.println("");
			System.out.println("�Seguro que desea salir?");
			System.out.print("0.No    1.Si ");
			bucle = in.nextInt();
			System.out.println("");
			if(bucle == 1){
				System.out.println("Esperamos que vuelva pronto!!");
			}
			break;
		default:
			System.out.println("Ingrese una opcion valida");
		break;
	}
	} else{
		System.out.println("Ingrese una opcion valida");
		System.out.println("");
	}
	} while(bucle == 0);

	} else if(!user.equals(user1) && !password.equals(password1) || !user.equals(user2) && !password.equals(password2) ||
	!user.equals(user3) && !password.equals(password3)){
		System.out.println("Su nombre de usuario o contrase�a es incorrecta");
	}
	}
}