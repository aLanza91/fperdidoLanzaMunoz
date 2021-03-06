/**
 * Acción: procesar login usuario
 */
package fotogramas.modelo.acciones;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.sql.*;

import fotogramas.controlador.Accion;
import fotogramas.modelo.beans.*;

/**
 * Procesa los datos de login y clave proporcionados por un usuario.
 * @author Eduardo A. Ponce
 */

public class AccionIndex implements Accion {

	// Aquí se deben declarar las propiedades de la acción
	private String vista;
	private final String vistaOK = "index.jsp";
	private final String vistaError = "WEB-INF/gesError.jsp";
	private BeanUsuario modelo;
	
	// Estas variables las necesitan todas las acciones 
	private ServletContext sc;
	private HttpSession sesion;
	private DataSource DS;
	private BeanError error;
	
	/**
	 * Constructor por defecto
	 */
	public AccionIndex()
	{
		
	}
	/** 
	 * Ejecuta el proceso asociado a la acción.
	 * @param request Objeto que encapsula la petición.
	 * @param response Objeto que encapsula la respuesta.
	 * @return true o false en función de que no se hayan producido errores o lo contrario.
	 * @see fotogramas.controlador.Accion#ejecutar(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public boolean ejecutar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException 
	{
		setVista(vistaOK);
		setModelo(new BeanUsuario());
		return false;
	}

	/**
	* Devuelve la vista actual.
	* @param La vista a devolver al usuario.
	*/
	public String getVista() 
	{
		return vista;
	}
	/**
	 * Establece la vista
	 * @param vista Página que se enviará al usuario
	 */
	public void setVista(String vista)
	{
		this.vista = vista;
	}
	/**
	 * Devuelve el modelo con el que trabajará la vista.
	 * @return El modelo a procesar por la vista. 
	 */
	public Object getModelo() 
	{
		return modelo;
	}
	/**
	 * Establece el modelo con el que trabajará  la vista.
	 * @param modelo Conjunto de datos a procesar por la vista.
	 */
	public void setModelo(BeanUsuario modelo)
	{
	    this.modelo = modelo;
	}
	/**
	 * Establece el contexto del servlet (nivel aplicación)
	 * @param sc Objeto ServletContext que encapsula el ámbito de aplicación.
	 */
	public void setSc(ServletContext sc) 
	{
		this.sc = sc;
	}
	/**
	 * Devuelve el contexto del servlet (nivel aplicación)
	 * @return Objeto que encapsula el nivel de aplicación.
	 */
	public ServletContext getSc()
	{
	    return sc;
	}
	/**
	 * Establece una situación de error.
	 * @param error Objeto BeanError que encapsula el error.
	 */
	public void setError(fotogramas.modelo.beans.BeanError error)
	{
	    this.error = error;
	}
	/**
	 * Devuelve un objeto de error asociado al procesamiento de la acción.
	 * @return Objeto que encapsula una situación de error producida durante
	 * la ejecución de la acción.
	 */
	public BeanError getError() {
		return error;
	}

	/**
	 * Establece el objeto que encapsula la sesión actual.
	 * @param sesion La sesión a establecer en la acción.
	 */
	public void setSesion(HttpSession sesion) {
		this.sesion = sesion;
	}
	/**
	 * Devuelve la sesión actual del usuario.
	 * @return sesion La sesión actual del usuario.
	 */
	public HttpSession getSesion() {
		return sesion;
	}
	
	public void setDS(DataSource ds)
	{
		DS = ds;
	}

}
