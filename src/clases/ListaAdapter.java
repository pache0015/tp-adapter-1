package clases;

import javax.swing.DefaultListModel;

public class ListaAdapter extends DefaultListModel {
	
	private ListaDePalabrasOrdenadas lista;

	public ListaAdapter(ListaDePalabrasOrdenadas lista) {
		this.lista = lista;
	}
	
	@Override
	public void addElement(Object element) {
		lista.agregarPalabra((String) element);
	}
	
	@Override
	public Object getElementAt(int index) {
        return lista.getPalabraDePosicion(index);

	}
	
	public int getSize() {
		return lista.cantidadDePalabras();
	}

}
