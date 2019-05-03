package com.proyecto.idao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.beans.Direccion;
import com.proyecto.beans.Producto;
import com.proyecto.beans.Proveedor;
import com.proyecto.dao.ProveedorDAO;

@Service
public class ProveedorDAOImpl implements ProveedorDAO{
	
	@Autowired
	private DataSource dataSource;
	
	public boolean registrar(Proveedor t) {
		// TODO Auto-generated method stub
		int rs=0;
		String sql="INSERT INTO proveedor(cve_prov,compania_prov,tel_prov,direccion_prov) "
				+ "values(?,?,?,?)";
		Connection con=null;	
		
		try {
			
			con=dataSource.getConnection();
			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,t.getClave());
			ps.setString(2,t.getCompania());
			ps.setString(3, t.getTel());
			ps.setString(4, t.getDireccion().formatear());
			
			rs=ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			System.out.println("Error:ProveedorDAOImpl:registrar(): "+e.toString());
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("Error:ProveedorDAOImpl:cerrar_conexion: "+e.toString());
				}
			}
		}
		if(rs>0) {
			return true;
		}else {
			return false;
		}
	}

	public List<Proveedor> listarTodos() {
		// TODO Auto-generated method stub
		ArrayList<Proveedor> proveedores=new ArrayList<Proveedor>();
		Proveedor p;
		Connection con=null;	
		ResultSet rs = null;
		try {

			con=dataSource.getConnection();
			String consulta = "SELECT * FROM proveedor";
			PreparedStatement sentencia= con.prepareStatement(consulta);
			rs = sentencia.executeQuery();
			while (rs.next()) {
				p=new Proveedor();
				p.setClave(rs.getInt("cve_prov"));
				p.setCompania(rs.getString("compania_prov"));
				p.setTel(rs.getString("tel_prov"));
				
				proveedores.add(p);
			}
		} catch (SQLException e) {
			System.out.println("Error:ProductoDAOImpl:listarTodos:"+e.toString());
		}
		
		return proveedores;
	}

	public List<Proveedor> buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	public Proveedor buscarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean actualizar(Proveedor t) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean eliminar(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
