
//La definici�n de la clase mediante la palabra reservada Carta.
//Public class NOMBRE DE LA CLASE
public class Carta {
	
	//PROPIEDADES O VARIABLES
	private int numero;
	private String palo;
	
	//CONSTANTES
	//las definimos public para que sean comunes a todas las clases,static para que sea accesible sin crear el objeto y final para crear la constante
	public static final String BASTOS="BASTOS";
	public static final String COPAS="COPAS";
	public static final String ESPADAS="ESPADAS";
	public static final String OROS="OROS";
	//Una buena pr�ctica es que el nombre de las constantes sea siempre en may�sculas
	
	//Constructor
	//Punto de entrada que se ejecuta al crear un objeto de tipo Carta
	public Carta() {
		System.out.println("Creo un objeto de tipo Carta");
	}
	
	//FUNCI�N O M�TODO
	//public/private qu�Saca nombreMetodo(qu�Entra)
	//public/private OUT nombreMetodo (IN)
	public void setNumero(int numero){
		//Si pasa algo haz...
		if(numero<1){
			this.numero=1;
		}else if (numero>12){
			this.numero=12;
		}else{
			this.numero=numero;
		}
	}
	public int getNumero(){  //el m�todo get hace lo comtrario que set, no entra nada (par�ntesis vacios) y saca un int.
		return numero;
	}
	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;//para distinguir el palo de la clase del palo del m�todo
	}//this.variable de la clase (palo de la clase) = variable que entra (palo que entra)
	//Con lo que el palo de la clase ser� el palo que entre


}
