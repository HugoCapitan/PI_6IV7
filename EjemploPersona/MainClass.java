public class MainClass {

	public static void main(String [] args){

		Persona objPersona = new Alumno();

		/* Así no:
		   objPersona.name = 'Alfredo';
		   System.out.println(objPersona.name); */

		objPersona = new Persona();
		System.out.println(objPersona.sayHi());

	}
}