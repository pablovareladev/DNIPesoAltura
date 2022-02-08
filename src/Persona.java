
public class Persona {

	//atributos
	private String nombre;
	private int edad;
	private String DNI;
	private String sexo;
	private double peso;
	private double altura;

	//constructores 
	public Persona() {


	}

	public Persona(String n, int e, String s) {

		this.nombre = n;
		this.edad = e;
		this.sexo = s;

	}

	public Persona(String n, int e, String dni, String s, double p, double a) {
		this.nombre = n;
		this.edad = e;
		this.DNI = dni;
		this.sexo = s;
		this.peso = p;
		this.altura = a;


	}
	
	
	public Persona(String n, int e, String s, double p, double a) {

		this.nombre = n;
		this.edad = e;
		this.sexo = s;
		this.peso = p;
		this.altura = a;

	}


	//getters y setters
	public String getNombre(){
		return nombre;
	}

	public void setNombre(String n) {
		this.nombre = n;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int e) {
		this.edad = e;
	}

	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dni) {
		this.DNI = dni;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String s) {
		this.sexo = s;
	}

	public double getPeso() {
		return peso;
	}
	public void setPeso(double p) {
		this.peso = p;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double a) {
		this.altura = a;
	}


	//metodos
	public int calcularIMC(double p, double a) {


		//si está por debajo de su peso ideal
		if(p / Math.pow(a, 2) <= 25 && p / Math.pow(a, 2) >= 20) {
			System.out.println("Está por debajo de su peso ideal");
			return 0;

			//si tiene soobrepeso
		}else if(p / Math.pow(a, 2) > 25){
			System.out.println("Tiene sobrepeso");
			return 1;
		}

		//si no tiene sobrepeso ni está por debajo, esta seria la opcion de menor que 20
		System.out.println("IMC menor que 20");
		return -1;


	}

	public boolean esMayorDeEdad(int e) {
		//en caso de que la persona sea mayor de edad devolverá true
		if(e >= 18) {
			return true;
		}
		//si no es mayor de edad nos devolverá false
		return false;	

	}
	
	public String generaDNI() {
		int numero = 0;
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		numero = (int)(Math.random()*(10000000-1+99999999)+1); 
		
		int res = numero % 23;
		
		String dni = String.valueOf(numero) + letras[res];
		
		return dni;
		
		
	}


}
