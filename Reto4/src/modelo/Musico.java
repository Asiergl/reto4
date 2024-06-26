package modelo;

import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class Musico extends Artista {
private String caracteristica;

public Musico(int idArtista, String nombreArtistico, ImageIcon imagen, String descripcion, String caracteristica) {
	super(idArtista, nombreArtistico, imagen, descripcion);
	this.caracteristica=caracteristica;
	
}

@Override
public String toString() {
	return "Musico [caracteristica=" + caracteristica + ", getCaracteristica()=" + getCaracteristica()
			+ ", getIdArtista()=" + getIdArtista() + ", getNombreArtistico()=" + getNombreArtistico() + ", getImagen()="
			+ getImagen() + ", getDescripcion()=" + getDescripcion() + ", getClass()=" + getClass() + ", hashCode()="
			+ hashCode() + ", toString()=" + super.toString() + "]";
}

public Musico() {
	// TODO Auto-generated constructor stub
}

public String getCaracteristica() {
	return caracteristica;
}

public void setCaracteristica(String caracteristica) {
	this.caracteristica = caracteristica;
}
}
