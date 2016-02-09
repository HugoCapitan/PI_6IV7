public class MainClass {
	public static void main(String [] args){
		Persona objPersona = new Alumno();
		// objPersona.name = 'Alfredo';
		// System.out.println(objPersona.name);
		objPersona.setName("Alejandro");
		System.out.println(objPersona.sayHi());
	}
}