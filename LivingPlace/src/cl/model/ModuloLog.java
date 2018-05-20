package cl.model;


import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
 
public class ModuloLog implements TableModel {
 
    private List<ClienteVendedor> listaCliVen;

    

    public ModuloLog(List<ClienteVendedor> listaCliVen) {
        this.listaCliVen = listaCliVen;
    }
    
    public void setListaCliVen(List<ClienteVendedor> listaCliVen) {
        this.listaCliVen = listaCliVen;
    }
    
    
 
    @Override
    public int getRowCount() {
        return listaCliVen.size();
    }
 
    @Override
    public int getColumnCount() {
        return 6;
    }
 
    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Nombre Vendedor";
            case 1:
                return "Rut Vendedor";
            case 2:
                return "Nombre Cliente";
            case 3:
                return "Fecha Registro";
            case 4:
                return "Hora Registro";
            case 5:
                return "Accion del Vendedor";
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
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
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
        ClienteVendedor cl = listaCliVen.get(rowIndex);
 
        switch (columnIndex) {
            case 0:
                return cl.getVendedor();
            case 1:
                return cl.getRutVendedor();
            case 2:
                return cl.getCliente();
            case 3:
                return cl.getFecha();
            case 4:
                return cl.getHora();
            case 5:
                return cl.getAccion();
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
