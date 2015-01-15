
public class Principal {

	public static void main(String[] args) {
		// VARIABLES
		int miDinero=0;
		int dineroQuePierdo=0;
		int total=0;
		int ingresos[]={10, 30, 5, 15, 25};
		int gastos[]={-45, -60, -70};
		
		//CODIGO
		for(int i=0; i<ingresos.length; i++){
			miDinero+=ingresos[i];
		}
		for(int i=0; i<gastos.length; i++){
			dineroQuePierdo+=gastos[i];
		}
		total = miDinero+dineroQuePierdo;
		
		//STDOUT - PANTALLA
		System.out.println(total);
	}

}
