import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		//declaramos variables y pedimos datos al usuario.
		String nombre = "";
		System.out.println("¿Cual es tu nombre?");
		nombre = teclado.next();

		int edad = 0;
		System.out.println("¿Cual es tu edad?");
		edad = teclado.nextInt();

		String dni = "";

		String sexo = "";
		System.out.println("Sexo");
		sexo = teclado.next();

		double peso = 0;
		System.out.println("diga su peso");
		peso = teclado.nextDouble();

		double altura = 0;
		System.out.println("diga su altura");
		altura = teclado.nextDouble();


		//Comprobaciones para la clase Persona
		//		
		//		Persona objeto = new Persona (nombre, edad, sexo);
		//		
		//		System.out.println(objeto.calcularIMC(peso, altura));
		//		
		//		//le ponemos al objeto un DNI con el set
		//		objeto.setDNI(objeto.generaDNI());
		//		//imprimimos por consola el DNI
		//		System.out.println(objeto.getDNI());
		//			
		//		
		//		System.out.println(objeto.esMayorDeEdad(edad));

		//instanciamos los objetos de la clase
		Persona objetoUno = new Persona (nombre, edad, sexo, peso, altura);
		//le damos valores a los atributos del objeto
		objetoUno.setNombre(nombre);
		objetoUno.setEdad(edad);
		objetoUno.setSexo(sexo);
		objetoUno.setPeso(peso);
		objetoUno.setAltura(altura);


		//mostramos atributos 
		System.out.println("Atributos del primer objeto: " + "\n" + objetoUno.getNombre() + 
				"\n" + objetoUno.getEdad() + "\n" + objetoUno.getSexo() + 
				"\n" + objetoUno.getPeso() + "Kg" + "\n" + objetoUno.getAltura() + "m");

		//llamamos a la clase para calcular si está en su peso ideal
		objetoUno.calcularIMC(peso, altura);

		//coprobamos si es mayor de edad true/false
		System.out.println(objetoUno.esMayorDeEdad(edad));


		Persona objetoDos = new Persona (nombre, edad, sexo);
		//le damos valores a los atributos del objeto
		objetoDos.setNombre(nombre);
		objetoDos.setEdad(edad);
		objetoDos.setSexo(sexo);

		System.out.println(objetoDos.esMayorDeEdad(edad));

		//mostramos atributos 
		System.out.println("Atributos del objeto dos: " + 
				"\n" + objetoDos.getNombre() + 
				"\n" + objetoDos.getEdad() + 
				"\n" + objetoDos.getSexo());




		Persona objetoTres = new Persona();
		//le damos valores a los atributos del objeto
		objetoTres.setNombre("Pablo");
		objetoTres.setEdad(21);
		objetoTres.setDNI(objetoTres.generaDNI());
		objetoTres.setSexo("Masculino");
		objetoTres.setPeso(75.4);
		objetoTres.setAltura(1.73);

		//mostramos atributos 
		System.out.println( "Atributos del objeto tres:" + "\n" + objetoTres.getNombre() + 
				"\n" + objetoTres.getEdad() + "\n" + objetoTres.getDNI()+ 
				"\n" + objetoTres.getSexo() + "\n" + objetoTres.getPeso() + "Kg" + 
				"\n" + 	objetoTres.getAltura() + "m");


		//llamamos a la clase para calcular si está en su peso ideal
		objetoTres.calcularIMC(peso, altura);


		//coprobamos si es mayor de edad true/false
		System.out.println(objetoTres.esMayorDeEdad(edad));
	}

}
