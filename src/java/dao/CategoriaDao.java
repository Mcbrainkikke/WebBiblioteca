/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Categoria;

/**
 *
 * @author Victor
 */
public class CategoriaDao {

    public static boolean registrar(Categoria cat) {
        try {
            String SQL = "INSERT INTO categorias(nombre) VALUES(?);";
            Connection con = Conexion.conectar();
            PreparedStatement st = con.prepareStatement(SQL);
            st.setString(1, cat.getNombre());
            if (st.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            
            return false;
        }
    }

    public static ArrayList<Categoria> listar() {
        try {
            String SQL = "select * from categorias;";
            Connection con = Conexion.conectar();
            PreparedStatement st = con.prepareStatement(SQL);
            //st.setString(1, cat.getNombre());
            ResultSet resultado = st.executeQuery();
            ArrayList<Categoria> lista = new ArrayList<>();
            Categoria cat;
            while (resultado.next()) {
                cat = new Categoria();
                cat.setCodigo(resultado.getInt("codigo"));
                cat.setNombre(resultado.getString("nombre"));
                lista.add(cat);
            }
            return lista;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public static String getCategoria(int cod){
        try {
            String SQL="select nombre from categorias where codigo=?;";
            Connection con= Conexion.conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            st.setInt(1, cod);
            ResultSet resultado=st.executeQuery();            
            
            if(resultado.next()){               
                return resultado.getString("nombre");                
            }
            return "--";
        }catch (SQLException ex){
            return "--";
        }
    }

}
