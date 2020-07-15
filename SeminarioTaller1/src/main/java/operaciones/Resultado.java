package operaciones;
import java.util.ArrayList;
import javax.swing.JOptionPane;






public class Resultado {
String NoPermitir = "";

	public ArrayList<Integer> formato(String cadena) {
		String caden = cadena.trim();
		caden = caden.toLowerCase();
		String[] cdn = caden.split(",");
		ArrayList<Integer> numers = new ArrayList<Integer>(); 
		
	for (int i = 0; i < cdn.length; i++) {
	if (isNumeric(cdn[i])){
	numers.add(Integer.parseInt(cdn[i]));
	}else
        {NoPermitir += cdn[i] + " - ";
        }}
                
	mostarNumero(numers);
	return numers;
	}
	public void mostarNumero(ArrayList<Integer> contenedora){
	int sumar = 0;
                
	for (int i = 0; i < contenedora.size(); i++) {
	sumar += contenedora.get(i);}
                
	JOptionPane.showMessageDialog(null, "El Resultado De La Suma es : " +sumar);
	JOptionPane.showMessageDialog(null, "no son numericos : " + NoPermitir);}
        
	public int suma(int x, int y) {
	return x + y;}

	private boolean isNumeric(String cadena){
	try {Integer.parseInt(cadena);
	return true;} 
        catch (NumberFormatException nfe){
	return false;           
}}}

