/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
class Main {

    public static void main(String[] args) {
        String url = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\proyectoProgramacion\\src\\modelos/preguntas.json";

        try {
            Preguntas leer = new Preguntas(url);

            Question[] almaPreguntas = leer.obtenerPreguntas();
            Question[] preguntasExamen=leer.pruebaAleatoria(almaPreguntas, 2);
            
            for(Question pre : preguntasExamen){
                System.out.println(pre.getPregunta());
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

public class Preguntas {

    private String url; //ruta relativa del archivo 

    public Preguntas(String url) {
        this.url = url;
    }

    //metodos
    public Question[] obtenerPreguntas() throws IOException {
        String json = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(this.url));

            String linea = "";
            while (null != (linea = br.readLine())) {
                json += linea;
            }
            br.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Preguntas.class.getName()).log(Level.SEVERE, null, ex);
        }

        Gson gson = new Gson();
        Question preguntas[] = gson.fromJson(json, Question[].class);

        return preguntas;
    }

    public Question[] pruebaAleatoria(Question[] array, int len) {
        Question[] temp = new Question[len]; //alamcena las 25 preguntas finales 
        int posicion;  //almacena la posicion de la pregunta aleatoriamente
        int x = 0; //la cantidad de preguntas que se han almacenado hasta ahora en temp
        //cear la funcion
        for (int i = 0; i < temp.length; i++) {
            boolean exist = false; //comprueba un valor de emergencia que te avisa si ya existe esa misma pregunta en el array
            posicion = (int) (Math.random() * array.length);
            Question pregunta = array[posicion];

            for (int j=0; j < x;j++) { //comprueba si la pregunta existe 
                if (temp[j].equals(pregunta)) { //si las preguntas ya almacenadas es igual a la pregunta nueva entonces 
                    exist = true;                  //descarta la nueva pregunta y crea otra diferente 
                    i--;
                    break;
                }
            }

            if (!exist) {
                temp[i] = pregunta;
                x++;
            }
        }

        return temp;
    }
}
