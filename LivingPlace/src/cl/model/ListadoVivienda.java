package cl.model;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class ListadoVivienda implements TableModel{
    
    private List<BuscarVivienda> buscar;

    

    public ListadoVivienda(List<BuscarVivienda> buscar) {
        this.buscar = buscar;
    }

    public ListadoVivienda() {
        
    }
    
    public void setListadoVivienda(List<BuscarVivienda> buscar) {
        this.buscar = buscar;
    }
    
    
 
    @Override
    public int getRowCount() {
        return buscar.size();
    }
 
    @Override
    public int getColumnCount() {
        return 7;
    }
 
    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Rol";
            case 1:
                return "Dirección";
            case 2:
                return "Cantidad Pieza";
            case 3:
                return "Cantidad Baño";
            case 4:
                return "Tipo de vivienda";
            case 5:
                return "Precio";
            case 6:
                return "Nuevo o Usado";
            default:
                return null;
        }
    }
 
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return Integer.class;
            case 3:
                return Integer.class;
            case 4:
                return String.class;
            case 5:
                return Integer.class;
            case 6:
                return String.class;
            default:
                return null;
        }
    }
 
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
 
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        BuscarVivienda bv = buscar.get(rowIndex);
 
        switch (columnIndex) {
            case 0:
                return bv.getRol();
            case 1:
                return bv.getDireccion();
            case 2:
                return bv.getPieza();
            case 3:
                return bv.getBaño();
            case 4:
                return bv.getTipoVivienda();
            case 5:
                return bv.getPrecio();
            case 6:
                return bv.getNuevoUsado();
            default:
                return null;
        }
    }
 
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        // modificar la lista BD
    }
 
    @Override
    public void addTableModelListener(TableModelListener l) {
        //
    }
 
    @Override
    public void removeTableModelListener(TableModelListener l) {
        //
    }
 
}
