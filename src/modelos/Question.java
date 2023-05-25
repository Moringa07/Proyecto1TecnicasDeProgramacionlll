/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author yorman
 */
public class Question {
    // Esta parte es simple, en este string se almacenara la pregunta
    private String pregunta;
    
    // Este array almacena la lista de opciones para respuestas, si lenght = 0 entonces es una pregunta de texto
    private String[] posiblesRespuestas;
    
    // Este array de int almacenara la pocision de la respuesta correcta en el array Preguntas, preguntas.lenght = 0 entonces
    // el tipo de pregunta es de texto
    private int[] respuestasCorrectas;
    
    // Esta almacena la respuesta del usuario, en caso de que sean respuestas multiples
    private int[] respuestasDelUsuario;
    
    // En caso de que sea una respuesta de texto aqui se almacena la respuesta
        private String respuestaTextoUsuario;

    public Question(String pregunta, String[] posiblesRespuestas, int[] respuestasCorrectas) {
        this.pregunta = pregunta;
        this.posiblesRespuestas = posiblesRespuestas;
        this.respuestasCorrectas = respuestasCorrectas;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String[] getPosiblesRespuestas() {
        return posiblesRespuestas;
    }

    public void setPosiblesRespuestas(String[] posiblesRespuestas) {
        this.posiblesRespuestas = posiblesRespuestas;
    }

    public int[] getRespuestasCorrectas() {
        return respuestasCorrectas;
    }

    public void setRespuestasCorrectas(int[] respuestasCorrectas) {
        this.respuestasCorrectas = respuestasCorrectas;
    }

    public int[] getRespuestasDelUsuario() {
        return respuestasDelUsuario;
    }

    public void setRespuestasDelUsuario(int[] respuestasDelUsuario) {
        this.respuestasDelUsuario = respuestasDelUsuario;
    }

    public String getRespuestaTextoUsuarioo() {
        return respuestaTextoUsuario;
    }

    public void setRespuestaTextoUsuario(String respuestaTextoUsuario) {
        this.respuestaTextoUsuario = respuestaTextoUsuario;
    }
    

    
}
