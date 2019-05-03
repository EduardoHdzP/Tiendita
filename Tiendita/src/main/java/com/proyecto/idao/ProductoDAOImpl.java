package com.proyecto.idao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
			System.out.println("ProductoDAOImpl:Error al registrar: "+e.toString());
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
		ArrayList<Producto> productos=new ArrayList<Producto>();
		Producto p;
		Connection con=null;	
		ResultSet rs = null;
		try {

			con=dataSource.getConnection();
			String consulta = "SELECT * FROM producto";
			PreparedStatement sentencia= con.prepareStatement(consulta);
			rs = sentencia.executeQuery();
			while (rs.next()) {
				p=new Producto();
				p.setClave(rs.getInt("cve_pro"));
				p.setNombre(rs.getString("nom_pro"));
				p.setMarca(rs.getString("marca_pro"));
				p.setCambio(rs.getString("cambio_pro"));
				p.setPresentacion(rs.getString("presentacion_pro"));
				p.setUtilidad(rs.getFloat("utilidad_pro"));
				p.setContenido(rs.getFloat("contenido_pro"));
				p.setuMedida(rs.getString("umedida_pro"));
				p.setTipo(rs.getString("tipo_pro"));
				productos.add(p);
			}
		} catch (SQLException e) {
			System.out.println("Error:ProductoDAOImpl:listarTodos:"+e.toString());
		}
		
		return productos;
	}

	public List<Producto> buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		ArrayList<Producto> productos=new ArrayList<Producto>();
		Producto p;
		Connection con=null;	
		try {
			con=dataSource.getConnection();
			String consulta = "SELECT * FROM producto WHERE nom_pro like ?";
			PreparedStatement sentencia= con.prepareStatement(consulta);
			sentencia.setString(1, "%"+nombre+"%");
			System.out.println(sentencia);
			ResultSet rs = sentencia.executeQuery();
			while (rs.next()) {
				p=new Producto();
				p.setClave(rs.getInt("cve_pro"));
				p.setNombre(rs.getString("nom_pro"));
				p.setMarca(rs.getString("marca_pro"));
				p.setCambio(rs.getString("cambio_pro"));
				p.setPresentacion(rs.getString("presentacion_pro"));
				p.setUtilidad(rs.getFloat("utilidad_pro"));
				p.setContenido(rs.getFloat("contenido_pro"));
				p.setuMedida(rs.getString("umedida_pro"));
				p.setTipo(rs.getString("tipo_pro"));
				productos.add(p);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error:ProductoDAOImpl:buscarPorNombre:"+e.toString());
		}
			
		
		return productos;
	}

	public Producto buscarPorId(int id) {
		// TODO Auto-generated method stub
		Producto p=null;
		Connection con=null;	
		try {
			con=dataSource.getConnection();
			String consulta = "SELECT * FROM producto WHERE cve_pro=?";
			PreparedStatement sentencia= con.prepareStatement(consulta);
			sentencia.setInt(1, id);
			ResultSet rs = sentencia.executeQuery();
			if (rs.next()) {
				p=new Producto();
				p.setClave(rs.getInt("cve_pro"));
				p.setNombre(rs.getString("nom_pro"));
				p.setMarca(rs.getString("marca_pro"));
				p.setCambio(rs.getString("cambio_pro"));
				p.setPresentacion(rs.getString("presentacion_pro"));
				p.setUtilidad(rs.getFloat("utilidad_pro"));
				p.setContenido(rs.getFloat("contenido_pro"));
				p.setuMedida(rs.getString("umedida_pro"));
				p.setTipo(rs.getString("tipo_pro"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error:ProductoDAOImpl:buscarPorId:"+e.toString());
		}
		return p;
	}

	public boolean actualizar(Producto t) {
		
		// TODO Auto-generated method stub
		Connection con=null;	
		try {
			con=dataSource.getConnection();
			String consulta = "UPDATE producto SET nom_pro = ?, marca_pro = ?, cambio_pro = ?, presentacion_pro = ?, utilidad_pro = ?, contenido_pro = ?, umedida_pro = ?, tipo_pro = ? WHERE cve_pro = ?";
			
			PreparedStatement sentencia= con.prepareStatement(consulta);
			sentencia.setString(1, t.getNombre());
			sentencia.setString(2, t.getMarca());
			sentencia.setString(3, t.getCambio());
			sentencia.setString(4, t.getPresentacion());
			sentencia.setFloat(5, t.getUtilidad());
			sentencia.setFloat(6, t.getContenido());
			sentencia.setString(7, t.getuMedida());
			sentencia.setString(8, t.getTipo());
			sentencia.setInt(9, t.getClave());
			int rs = sentencia.executeUpdate();
			System.out.println("Resultado: "+rs);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error:ProductoDAOImpl:actualizar:"+e.toString());
		}
		return false;
	}

	public boolean eliminar(int id) {
		// TODO Auto-generated method stub
		Connection con=null;	
		try {
			con=dataSource.getConnection();
			String consulta = "DELETE FROM producto WHERE cve_pro = ?";
			
			PreparedStatement sentencia= con.prepareStatement(consulta);
			sentencia.setInt(1, id);
			int rs = sentencia.executeUpdate();
			System.out.println("Resultado: "+rs);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error:ProductoDAOImpl:eliminar:"+e.toString());
		}
		return false;
	}

	public boolean existe(String nombre) {
		// TODO Auto-generated method stub
		ArrayList<Producto>productos=(ArrayList<Producto>) buscarPorNombre(nombre);
		if(productos.size()>0) {
			return true;
		}else {
			return false;
		}
		
	}

}
