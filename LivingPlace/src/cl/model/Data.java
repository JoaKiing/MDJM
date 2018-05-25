package cl.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JOAQUIN CABELLO
 */
public class Data {

    private ResultSet rs;
    private String query;
    private final Conexion con;
    private List<TipoVivienda> listaTipoViviendas;
    private List<Vivienda> listaViviendas;
    private TipoVivienda tipoV;
    private Vivienda v;
    private Estadisticas es;
    private List<Estadisticas> listaEstadisticas;
    private List<Cliente> listaCliente;
    private Cliente cliente;

    public Data() throws ClassNotFoundException, SQLException {
        con = new Conexion("localhost", "living_place", "root", "");
    }

    public boolean existeRut(String rut) throws SQLException {
        boolean existe = false;

        query = "SELECT COUNT(*) id FROM persona WHERE run = " + rut + " ";

        rs = con.ejecutarSelect(query);

        if (rs.next()) {
            if (rs.getInt(1) == 0) {
                existe = true;
            }
        }

        return existe;
    }
    
    public boolean existeRutCliente(String rut) throws SQLException{
        boolean existe = false;
        
        query = "SELECT COUNT(*) FROM cliente WHERE run = '" + rut + "'";
        
        rs = con.ejecutarSelect(query);
        
        if (rs.next()) {
            if (rs.getInt(1) == 1) {
                existe = true;
            }else{
                existe = false;
            }
        }

        return existe;
    }

    public void registrarVendedor(Vendedorr nuevo) throws SQLException {
        query = "INSERT INTO vendedor VALUES(NULL, '" + nuevo.getNombre() + "', '" + nuevo.getRut() + "');";
        con.ejecutar(query);
    }

    public void registrarCliente(Cliente nuevo) throws SQLException {
        query = "INSERT INTO cliente VALUES(NULL, '" + nuevo.getNombre() + "', '" + nuevo.getRun() + "', '" + nuevo.getSueldo() + "');";
        con.ejecutar(query);
    }

    public List<Vivienda> orderByDesc() throws SQLException {
        listaViviendas = new ArrayList<>();
        
        query = "SELECT * FROM info_vivienda_disponibles ORDER BY precio DSC";
        rs = con.ejecutarSelect(query);
        
        while (rs.next()) {
            v = new Vivienda();

            v.setId(rs.getInt(1));
            v.setRol(rs.getString(2));
            v.setDireccion(rs.getString(3));
            v.setCantPiezas(rs.getInt(4));
            v.setCantBaños(rs.getInt(5));
            v.setTipoVivienda(rs.getInt(6));
            v.setPrecio(rs.getInt(7));
            v.setEstado(rs.getBoolean(8));

            listaViviendas.add(v);
        }

        return listaViviendas;

    }

    public List<Vivienda> orderByAsc() throws SQLException {
        listaViviendas = new ArrayList<>();
        
        query = "SELECT * FROM info_vivienda_disponibles ORDER BY precio ASC";
        rs = con.ejecutarSelect(query);

        while (rs.next()) {
            v = new Vivienda();

            v.setId(rs.getInt(1));
            v.setRol(rs.getString(2));
            v.setDireccion(rs.getString(3));
            v.setCantPiezas(rs.getInt(4));
            v.setCantBaños(rs.getInt(5));
            v.setTipoVivienda(rs.getInt(6));
            v.setPrecio(rs.getInt(7));
            v.setEstado(rs.getBoolean(8));

            listaViviendas.add(v);
        }

        return listaViviendas;

    }

    public List<Vivienda> buscarVivienda(TipoVivienda tipo) throws SQLException {
        listaViviendas = new ArrayList<>();

        query = "SELECT * FROM info_vivienda_disponibles WHERE tipo_vivienda.nombre = '" + tipo.getNombre() + "';";
        rs = con.ejecutarSelect(query);

        while (rs.next()) {
            v = new Vivienda();

            v.setId(rs.getInt(1));
            v.setRol(rs.getString(2));
            v.setDireccion(rs.getString(3));
            v.setCantPiezas(rs.getInt(4));
            v.setCantBaños(rs.getInt(5));
            v.setTipoVivienda(rs.getInt(6));
            v.setPrecio(rs.getInt(7));
            v.setEstado(rs.getBoolean(8));

            listaViviendas.add(v);
        }

        return listaViviendas;

    }

    public List<Vivienda> buscarViviendaXPrecioTipo(String orden, TipoVivienda tipo) throws SQLException {
        listaViviendas = new ArrayList<>();
        
        query = "SELECT * FROM info_vivienda_disponibles WHERE tipo_vivienda_FK = '" + tipo.getId()+ "' ORDER BY precio "+orden+"";
        rs = con.ejecutarSelect(query);
        
        while (rs.next()) {
            v = new Vivienda();

            v.setId(rs.getInt(1));
            v.setRol(rs.getString(2));
            v.setDireccion(rs.getString(3));
            v.setCantPiezas(rs.getInt(4));
            v.setCantBaños(rs.getInt(5));
            v.setTipoVivienda(rs.getInt(6));
            v.setPrecio(rs.getInt(7));
            v.setEstado(rs.getBoolean(8));

            listaViviendas.add(v);
        }

        return listaViviendas;
    }
    
    public List<Vivienda> buscarViviendaXEstado(boolean estado) throws SQLException {
        listaViviendas = new ArrayList<>();
        
        query = "SELECT * FROM info_vivienda_disponibles WHERE nuevo_usado = "+estado+";";
        rs = con.ejecutarSelect(query);
        
        while (rs.next()) {
            v = new Vivienda();

            v.setId(rs.getInt(1));
            v.setRol(rs.getString(2));
            v.setDireccion(rs.getString(3));
            v.setCantPiezas(rs.getInt(4));
            v.setCantBaños(rs.getInt(5));
            v.setTipoVivienda(rs.getInt(6));
            v.setPrecio(rs.getInt(7));
            v.setEstado(rs.getBoolean(8));

            listaViviendas.add(v);
        }

        return listaViviendas;
    }

    public List<Vivienda> mostarNombre(Vendedorr rut) throws SQLException {
        query = "SELECT  nombre FROM vendedor WHERE run = '" + rut.getRut() + "';";
        rs = con.ejecutarSelect(query);
        
        while (rs.next()) {
            v = new Vivienda();

            v.setId(rs.getInt(1));
            v.setRol(rs.getString(2));
            v.setDireccion(rs.getString(3));
            v.setCantPiezas(rs.getInt(4));
            v.setCantBaños(rs.getInt(5));
            v.setTipoVivienda(rs.getInt(6));
            v.setPrecio(rs.getInt(7));
            v.setEstado(rs.getBoolean(8));

            listaViviendas.add(v);
        }

        return listaViviendas;

    }

    public int registrarVivienda(Vivienda nueva) throws SQLException {
        query = "INSERT INTO vivienda VALUES(NULL, '" + nueva.getRol() + "', '" + nueva.getDireccion() + "', '" + nueva.getCantPiezas() + "','" + nueva.getCantBaños() + "','" + nueva.getTipoVivienda() + "','" + nueva.getPrecio() + "'," + nueva.getEstado() + ");";
        con.ejecutar(query);

        return ultimaVivienda();

    }

    public int ultimaVivienda() throws SQLException {
        int id = 0;

        query = "SELECT MAX(id) from vivienda";
        rs = con.ejecutarSelect(query);

        if (rs.next()) {
            id = rs.getInt(1);
        }

        return id;

    }

    public void estadoVivienda(int id) throws SQLException {
        query = "INSERT INTO estado_vivienda VALUES(NULL," + id + ",3);";
        con.ejecutar(query);
    }

    public List<ClienteVendedor> datosVendedor() throws SQLException {
        query = "SELECT * FROM modulo_log;";

        List<ClienteVendedor> lista = new ArrayList<>();

        rs = con.ejecutarSelect(query);

        while (rs.next()) {
            ClienteVendedor cv = new ClienteVendedor();

            cv.setVendedor(rs.getString(1));
            cv.setRutVendedor(rs.getString(2));
            cv.setCliente(rs.getString(3));
            cv.setFecha(rs.getString(4));
            cv.setHora(rs.getString(5));
            cv.setAccion(rs.getString(6));

            lista.add(cv);

        }
        return lista;
    }

    public List<BuscarVivienda> buscarVivienda() throws SQLException {
        query = "SELECT * FROM listado_vivienda;";

        List<BuscarVivienda> mostarViv = new ArrayList<>();

        rs = con.ejecutarSelect(query);

        while (rs.next()) {
            BuscarVivienda bv = new BuscarVivienda();

            bv.setRol(rs.getString(1));
            bv.setDireccion(rs.getString(2));
            bv.setPieza(rs.getInt(3));
            bv.setBaño(rs.getInt(4));
            bv.setTipoVivienda(rs.getString(5));
            bv.setPrecio(rs.getInt(6));
            bv.setNuevoUsado(rs.getString(7));

            mostarViv.add(bv);

        }
        return mostarViv;
    }

    public Cliente getCliente(String rut) throws SQLException {
        Cliente c = new Cliente();

        query = "SELECT * FROM cliente WHERE run = '" + rut + "'";

        rs = con.ejecutarSelect(query);

        if (rs.next()) {
            c.setId(rs.getInt(1));
            c.setNombre(rs.getString(2));
            c.setRun(rs.getString(3));
            c.setSueldo(rs.getInt(4));
        }

        return c;
    }

    public void registroEstadoViviendaVendida(int idVivienda) throws SQLException {
        query = "UPDATE estado_vivienda SET fk_estado = 1 WHERE fk_vivienda = " + idVivienda + "";
        con.ejecutar(query);
    }
    
    public void registroEstadoViviendaArrendada(int idVivienda) throws SQLException {
        query = "UPDATE estado_vivienda SET fk_estado = 2 WHERE fk_vivienda = " + idVivienda + "";
        con.ejecutar(query);
    }

    public Vendedorr getVendedor(String rut) throws SQLException {
        Vendedorr ve = new Vendedorr();

        query = "SELECT * FROM vendedor WHERE run = '" + rut + "'";

        rs = con.ejecutarSelect(query);

        if (rs.next()) {
            ve.setId(rs.getInt(1));
            ve.setNombre(rs.getString(2));
            ve.setRut(rs.getString(3));
        }

        return ve;
    }

    public List<TipoVivienda> getTipoVivienda() throws SQLException {
        listaTipoViviendas = new ArrayList<>();

        query = "SELECT * FROM tipo_vivienda";
        rs = con.ejecutarSelect(query);

        while (rs.next()) {
            tipoV = new TipoVivienda();

            tipoV.setId(rs.getInt(1));
            tipoV.setNombre(rs.getString(2));

            listaTipoViviendas.add(tipoV);
        }

        return listaTipoViviendas;
    }
    
    public List<Cliente> getListadoClientes() throws SQLException{
        listaCliente = new ArrayList<>();
        query = "SELECT * FROM cliente";
        
        rs = con.ejecutarSelect(query);
        
        while(rs.next()){
            cliente =  new Cliente();
            
            cliente.setId(rs.getInt(1));
            cliente.setNombre(rs.getString(2));
            cliente.setRun(rs.getString(3));
            cliente.setSueldo(rs.getInt(4));
            
            listaCliente.add(cliente);
        }
        
        return listaCliente;
    }

    public List<Vivienda> getListadoVivienda() throws SQLException {
        listaViviendas = new ArrayList<>();

        query = "SELECT * FROM info_vivienda_disponibles";
        rs = con.ejecutarSelect(query);

        while (rs.next()) {
            v = new Vivienda();

            v.setId(rs.getInt(1));
            v.setRol(rs.getString(2));
            v.setDireccion(rs.getString(3));
            v.setCantPiezas(rs.getInt(4));
            v.setCantBaños(rs.getInt(5));
            v.setTipoVivienda(rs.getInt(6));
            v.setPrecio(rs.getInt(7));
            v.setEstado(rs.getBoolean(8));

            listaViviendas.add(v);
        }

        return listaViviendas;
    }

    public Vivienda getVivienda(String rol) throws SQLException {
        v = new Vivienda();

        query = "SELECT * FROM vivienda WHERE rol = '" + rol + "'";
        rs = con.ejecutarSelect(query);

        if (rs.next()) {
            v.setId(rs.getInt(1));
            v.setRol(rs.getString(2));
            v.setDireccion(rs.getString(3));
            v.setCantPiezas(rs.getInt(4));
            v.setCantBaños(rs.getInt(5));
            v.setTipoVivienda(rs.getInt(6));
            v.setEstado(rs.getBoolean(7));
        }

        return v;

    }

    public void registroVenta(int idVendedor, int idVivienda, int idCliente) throws SQLException {
        query = "INSERT INTO registro_venta VALUES(NULL, " + idVendedor + "," + idVivienda + "," + idCliente + ",NOW()" + ");";
        con.ejecutar(query);

        registroEstadoViviendaVendida(idVivienda);
    }
    
    public List<Estadisticas> getListaViviendas() throws SQLException{
        listaEstadisticas = new ArrayList<>();
        
        query = "SELECT * FROM info_viviendas_vendidas_arrendadas";
        rs = con.ejecutarSelect(query);
        
        while(rs.next()) {    
            es = new Estadisticas();
            
            es.setId(rs.getInt(1));
            es.setRol(rs.getString(2));
            es.setDireccion(rs.getString(3));
            es.setCantPiezas(rs.getInt(4));
            es.setCantBaños(rs.getInt(5));
            es.setTipoVivienda(rs.getInt(6));
            es.setPrecio(rs.getInt(7));
            es.setEstado(rs.getBoolean(8));
            es.setNombreVendedor(rs.getString(9));
            es.setRunVendedor(rs.getString(10));
            es.setNombreCliente(rs.getString(11));
            es.setRunCliente(rs.getString(12));
            
            listaEstadisticas.add(es);
        }
        
        return listaEstadisticas;
    }
    
    public List<Estadisticas> getListaViviendasVendidas() throws SQLException{
        listaEstadisticas = new ArrayList<>();
        
        query = "SELECT * FROM info_Viviendas_vendidas";
        rs = con.ejecutarSelect(query);
        
        while(rs.next()) {    
            es = new Estadisticas();
            
            es.setId(rs.getInt(1));
            es.setRol(rs.getString(2));
            es.setDireccion(rs.getString(3));
            es.setCantPiezas(rs.getInt(4));
            es.setCantBaños(rs.getInt(5));
            es.setTipoVivienda(rs.getInt(6));
            es.setPrecio(rs.getInt(7));
            es.setEstado(rs.getBoolean(8));
            es.setNombreVendedor(rs.getString(9));
            es.setRunVendedor(rs.getString(10));
            es.setNombreCliente(rs.getString(11));
            es.setRunCliente(rs.getString(12));
            
            listaEstadisticas.add(es);
        }
        
        return listaEstadisticas;
    }
    
    public List<Estadisticas> getListaViviendasArrendadas() throws SQLException{
        listaEstadisticas = new ArrayList<>();
        
        query = "SELECT * FROM info_Viviendas_arrendadas";
        rs = con.ejecutarSelect(query);
        
        while(rs.next()) {    
            es = new Estadisticas();
            
            es.setId(rs.getInt(1));
            es.setRol(rs.getString(2));
            es.setDireccion(rs.getString(3));
            es.setCantPiezas(rs.getInt(4));
            es.setCantBaños(rs.getInt(5));
            es.setTipoVivienda(rs.getInt(6));
            es.setPrecio(rs.getInt(7));
            es.setEstado(rs.getBoolean(8));
            es.setNombreVendedor(rs.getString(9));
            es.setRunVendedor(rs.getString(10));
            es.setNombreCliente(rs.getString(11));
            es.setRunCliente(rs.getString(12));
            
            listaEstadisticas.add(es);
        }
        
        return listaEstadisticas;
    }
    
    public void registroArriendo(int idVendedor, int idVivienda, int idCliente) throws SQLException {
        query = "INSERT INTO registro_venta VALUES(NULL, " + idVendedor + "," + idVivienda + "," + idCliente + ",NOW()" + ");";
        con.ejecutar(query);

        registroEstadoViviendaArrendada(idVivienda);
    }
    
    public List<Vivienda> getViviendasUsadas() throws SQLException{
        listaViviendas = new ArrayList<>();
        
        query = "SELECT * FROM info_viviendas_usadas";
        rs = con.ejecutarSelect(query);
        
        while (rs.next()) {            
            v = new Vivienda();
            
            v.setRol(rs.getString(1));
            v.setDireccion(rs.getString(2));
            v.setCantPiezas(rs.getInt(3));
            v.setCantBaños(rs.getInt(4));
            v.setTipoVivienda(rs.getInt(5));
            v.setPrecio(rs.getInt(6));
            v.setEstado(rs.getBoolean(7));

            listaViviendas.add(v);
        }
        
        return listaViviendas;
    }

}
