package paquete;
/**
 * Clase para ser analizada
 * @author jhonnsonpardo
 */
import java.math.BigInteger;
import java.util.Random;

public class principal 
{
	private double api = 0;
	private double metodos = 0;
	private double archivos = 0;
	private double clases = 0;
	private double librerias = 0;
	private double paquetes = 0;
	private double codigoMuerto = 0;
	private double lineasCodigo = 0;
	private double densidadComentarios = 0;
	private double codigoDuplicado = 0;
	private double archivosDuplicados = 0;
	private double complejidadCiclomatica = 0;
	private double complejidadClase = 0;
	private double complejidadMetodo = 0;
	private double complejidadArchivo = 0;
	private double longitudPrograma = 0;
	private double longitudVocabulario = 0;
	private double volumenPrograma = 0;
	private double volumenCompacto = 0;
	private double dificultadPrograma = 0;
	private double esfuerzoProgramacion = 0;
	private double tiempo = 0;
	private double violaciones = 0;
	private double errores = 0;
        
        int codM;
        String y;
        boolean asd;

	/**
         * 
         * @param api
         * @param metodos
         * @param archivos
         * @param clases
         * @param librerias
         * @param paquetes
         * @param codigoMuerto
         * @param lineasCodigo
         * @param densidadComentarios
         * @param codigoDuplicado
         * @param archivosDuplicados
         * @param complejidadCiclomatica
         * @param complejidadClase
         * @param complejidadMetodo
         * @param complejidadArchivo
         * @param longitudPrograma
         * @param longitudVocabulario
         * @param volumenPrograma
         * @param volumenCompacto
         * @param dificultadPrograma
         * @param esfuerzoProgramacion
         * @param tiempo
         * @param violaciones
         * @param errores 
         */
	public principal(double api, double metodos, double archivos, double clases, double librerias, double paquetes,
			double codigoMuerto, double lineasCodigo, double densidadComentarios, double codigoDuplicado,
			double archivosDuplicados, double complejidadCiclomatica, double complejidadClase, double complejidadMetodo,
			double complejidadArchivo, double longitudPrograma, double longitudVocabulario, double volumenPrograma,
			double volumenCompacto, double dificultadPrograma, double esfuerzoProgramacion, double tiempo,
			double violaciones, double errores) {
		this.api = api;
		this.metodos = metodos;
		this.archivos = archivos;
		this.clases = clases;
		this.librerias = librerias;
		this.paquetes = paquetes;
		this.codigoMuerto = codigoMuerto;
		this.lineasCodigo = lineasCodigo;
		this.densidadComentarios = densidadComentarios;
		this.codigoDuplicado = codigoDuplicado;
		this.archivosDuplicados = archivosDuplicados;
		this.complejidadCiclomatica = complejidadCiclomatica;
		this.complejidadClase = complejidadClase;
		this.complejidadMetodo = complejidadMetodo;
		this.complejidadArchivo = complejidadArchivo;
		this.longitudPrograma = longitudPrograma;
		this.longitudVocabulario = longitudVocabulario;
		this.volumenPrograma = volumenPrograma;
		this.volumenCompacto = volumenCompacto;
		this.dificultadPrograma = dificultadPrograma;
		this.esfuerzoProgramacion = esfuerzoProgramacion;
		this.tiempo = tiempo;
		this.violaciones = violaciones;
		this.errores = errores;
	}

        //Metodo para leer 
	public double getApi() {
		return api;
	}

	public void setApi(double api) {
		this.api = api;
	}

        //Comentario normal
	public double getMetodos() {
		return metodos;
	}

	public void setMetodos(double metodos) {
		this.metodos = metodos;
	}

	public double getArchivos() {
		return archivos;
	}

	public void setArchivos(double archivos) {
		this.archivos = archivos;
	}

	public double getClases() {
		return clases;
	}
        /*
        Comentario de bloque
        */
	public void setClases(double clases) {
		this.clases = clases;
	}

	public double getLibrerias() {
		return librerias;
	}

	public void setLibrerias(double librerias) {
		this.librerias = librerias;
	}

	public double getPaquetes() {
		return paquetes;
	}

	public void setPaquetes(double paquetes) {
		this.paquetes = paquetes;
	}

	public double getCodigoMuerto() {
		return codigoMuerto;
	}

	public void setCodigoMuerto(double codigoMuerto) {
		this.codigoMuerto = codigoMuerto;
	}

	public double getLineasCodigo() {
		return lineasCodigo;
	}

	public void setLineasCodigo(double lineasCodigo) {
		this.lineasCodigo = lineasCodigo;
	}

	public double getDensidadComentarios() {
		return densidadComentarios;
	}

	public void setDensidadComentarios(double densidadComentarios) {
		this.densidadComentarios = densidadComentarios;
	}

	public double getCodigoDuplicado() {
		return codigoDuplicado;
	}

	public void setCodigoDuplicado(double codigoDuplicado) {
		this.codigoDuplicado = codigoDuplicado;
	}

	public double getArchivosDuplicados() {
		return archivosDuplicados;
	}

	public void setArchivosDuplicados(double archivosDuplicados) {
		this.archivosDuplicados = archivosDuplicados;
	}

	public double getComplejidadCiclomatica() {
		return complejidadCiclomatica;
	}

	public void setComplejidadCiclomatica(double complejidadCiclomatica) {
		this.complejidadCiclomatica = complejidadCiclomatica;
	}

	public double getComplejidadClase() {
		return complejidadClase;
	}

	public void setComplejidadClase(double complejidadClase) {
		this.complejidadClase = complejidadClase;
	}

	public double getComplejidadMetodo() {
		return complejidadMetodo;
	}

	public void setComplejidadMetodo(double complejidadMetodo) {
		this.complejidadMetodo = complejidadMetodo;
	}

	public double getComplejidadArchivo() {
		return complejidadArchivo;
	}

	public void setComplejidadArchivo(double complejidadArchivo) {
		this.complejidadArchivo = complejidadArchivo;
	}

	public double getLongitudPrograma() {
		return longitudPrograma;
	}

	public void setLongitudPrograma(double longitudPrograma) {
		this.longitudPrograma = longitudPrograma;
	}

	public double getLongitudVocabulario() {
		return longitudVocabulario;
	}

	public void setLongitudVocabulario(double longitudVocabulario) {
		this.longitudVocabulario = longitudVocabulario;
	}

	public double getVolumenPrograma() {
		return volumenPrograma;
	}

	public void setVolumenPrograma(double volumenPrograma) {
		this.volumenPrograma = volumenPrograma;
	}

	public double getVolumenCompacto() {
		return volumenCompacto;
	}

	public void setVolumenCompacto(double volumenCompacto) {
		this.volumenCompacto = volumenCompacto;
	}

	public double getDificultadPrograma() {
		return dificultadPrograma;
	}

	public void setDificultadPrograma(double dificultadPrograma) {
		this.dificultadPrograma = dificultadPrograma;
	}

	public double getEsfuerzoProgramacion() {
		return esfuerzoProgramacion;
	}

	public void setEsfuerzoProgramacion(double esfuerzoProgramacion) {
		this.esfuerzoProgramacion = esfuerzoProgramacion;
	}

	public double getTiempo() {
		return tiempo;
	}

	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

	public double getViolaciones() {
		return violaciones;
	}

	public void setViolaciones(double violaciones) {
		this.violaciones = violaciones;
	}

	public double getErrores() {
		return errores;
	}

	public void setErrores(double errores) {
		this.errores = errores;
	}
}
