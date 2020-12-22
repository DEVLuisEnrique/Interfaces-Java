package packageInterface;

public interface InterfaceB {
	//Metodo Defau
	
	public abstract void mostrarMensaje();
	
	public void eliminarMensaje();
	
	public default void saluda() {
		System.out.println("Hola mundo desde una interface!");
	}

}
