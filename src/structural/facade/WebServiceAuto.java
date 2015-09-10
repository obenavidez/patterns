/**
 * 
 */
package structural.facade;

import java.util.List;

/**
 * @author jaherrera
 * 
 */
public interface WebServiceAuto {
	
	String documento(int indice);

	List<String> buscaVehiculos(int precioMedio, int desviacionMax);
}
