package com.proyecto.idao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.proyecto.beans.Producto;
import com.proyecto.dao.ProductoDAO;

@Repository
public class ProductoDAOImpl implements ProductoDAO{
	
	@Autowired
	private DataSource dataSource;

	public boolean registrar(Producto t) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO producto(cve_pro,nom_pro,marca_pro,cambio_pro,presentacion_pro,utilidad_pro,contenido_pro,umedida_pro,tipo_pro) "
				+ "values(?,?,?,?,?,?,?,?,?)";
		Connection con=null;
		
		
		try {
			/*private int clave;
			private String nombre;
			private String marca;
			private String cambio;
			private String presentacion;
			private float utilidad;
			private float contenido;
			private String uMedida;
			private String tipo;*/
			con=dataSource.getConnection();
			if(con==null)
				System.out.println("Nulo");
			
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,t.getClave());
			ps.setString(2,t.getNombre());
			ps.setString(3, t.getMarca());
			ps.setString(4, t.getCambio());
			ps.setString(5, t.getPresentacion());
			ps.setFloat(6, t.getUtilidad());
			ps.setFloat(7, t.getContenido());
			ps.setString(8, t.getuMedida());
			ps.setString(9, t.getTipo());
			
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			System.out.println("ProductoDAO:Error al registrar: "+e.toString());
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("Error al cerrar conexion: "+e.toString());
				}
			}
		}
		return false;
	}

	public List<Producto> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Producto> buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	public Producto buscarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean actualizar(Producto t) {
		
		// TODO Auto-generated method stub
		return false;
	}

	public boolean eliminar(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
