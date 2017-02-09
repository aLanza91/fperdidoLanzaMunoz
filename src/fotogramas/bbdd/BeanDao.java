package fotogramas.bbdd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import fotogramas.modelo.beans.BeanError;
import fotogramas.modelo.beans.BeanUsuario;

public class BeanDao {
	
	/**
	 * Información de la base de datos
	 */
	protected DataSource dataSource;

	/**
	 * Representa la conexión con la base de datos
	 */
	protected Connection conexion = null;
	
	/**
	 * Constructor, recibe el dataSource
	 * @param dataSource
	 */
	public BeanDao (DataSource dataSource){
		this.dataSource = dataSource;
	}
	/**
	 * Proceso que crea la conexión con la base de datos.
	 * @return la conexión
	 * @throws SQLException
	 */
	public Connection getConexion() throws SQLException {
		if (conexion == null) {
			this.conexion = dataSource.getConnection();
		}
		return conexion;
	}
	
	/**
     * Proceso que cierra la conexión con la base de datos.
     * @throws SQLException
     */

	public void close() throws SQLException {
		if (conexion != null) {
			conexion.close();
		}
		conexion = null;
	}
	/**
	 * Proceso que comprueba si existe un usuario(login), en la base de datos
	 * @param login
	 * @return devuelve true si existe
	 * @throws SQLException
	 */
	public Boolean compruebaUsuario(String login) throws SQLException{
	
		Boolean encontrado = false;
		boolean conexionNula = false;
		if (conexion == null) {
			getConexion();
			conexionNula = true;
		}
		Statement st = null;
		try {
			st = conexion.createStatement();
			ResultSet rs = st.executeQuery("select login from usuarios where login = '" + login + "'");
			if (rs.next()) {
				encontrado = true;
			}
		} finally {
			if (st != null) {
				st = null;
				if (conexionNula) {
					close();
				}
			}
		}
		return encontrado;
		
	}
	/**
	 * Proceso que obtiene los datos del usuario de la base de datos, si no
	 * existe el login o la clave es errónea lanza una excepción
	 * @param login
	 * @param clave
	 * @return devuelve un objeto BeanUsuario
	 * @throws SQLException
	 * @throws BeanError
	 */
	
	public BeanUsuario obtenerUsuario(String login, String clave) throws SQLException, BeanError {
		boolean conexionNula = false;
		if (conexion == null) {
			getConexion();
			conexionNula = true;
		}
		BeanUsuario usuario = null;
		Statement st = null;
		try {
			st = conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT login, clave from usuarios where login = '" + login + "'");
			// Se comprueba si existe el login
			
			if (rs.next()) {
				// Se comprueba si no coincide la clave y si coincide se obtiene
				// el nombre
				if (!rs.getString("clave").equals(clave)) {
					throw new BeanError(2, "La clave no coincide.");
				} else {
					usuario = new BeanUsuario(rs.getString("login"));
				}
			} else {
				throw new BeanError(1, "El login no existe.");
			}
		} finally {
			if (st != null) {
				st = null;
				if (conexionNula) {
					close();
				}
			}
		}
		return usuario;
	}

}
