package com.ejemplo.demo.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope; // Anotación 100% nativa de Spring
import java.io.Serializable;

@Component("usuarioBean")
@RequestScope
public class UsuarioBean implements Serializable {

    private String textoInput = "";
    private String mensajeResultado = "¡Hola desde Spring Boot + PrimeFaces!";

    public void transformarTexto() {
        if (textoInput != null && !textoInput.trim().isEmpty()) {
            this.mensajeResultado = "Procesado en Servidor Spring: " + textoInput.toUpperCase();
        } else {
            this.mensajeResultado = "Escribe algo en el cuadro de texto.";
        }
    }

    // Getters y Setters
    public String getTextoInput() { return textoInput; }
    public void setTextoInput(String textoInput) { this.textoInput = textoInput; }

    public String getMensajeResultado() { return mensajeResultado; }
    public void setMensajeResultado(String mensajeResultado) { this.mensajeResultado = mensajeResultado; }
}