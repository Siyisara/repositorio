
package operaciones;
import javax.swing.JOptionPane;



public class Main_1 {
    	public static void main(String[] args) {
		Resultado r = new Resultado();
		String cadena = JOptionPane.showInputDialog("Digite seguido de ',' por ejemplo: '2,6,a'");
		r.formato(cadena);
		
	}
}

