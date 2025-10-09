package com.example.apalabradosjavafx;

import javafx.fxml.FXML;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class JuegoController {

    // Introducción palabras
    @FXML private TextField palabraIntroducir = new TextField();
    private String palabraAdivinar = "plata";
    private ArrayList<ArrayList> listaFilas = new ArrayList<>();
    private int turno = 0;

    // Labels contenedores de letras
    // Primera fila
    @FXML private Label letra1, letra2, letra3, letra4, letra5 = new Label();

    // Segunda fila
    @FXML private Label letra6, letra7, letra8, letra9, letra10 = new Label();

    // Tercera fila
    @FXML private Label letra11, letra12, letra13, letra14, letra15 = new Label();

    // Cuarta fila
    @FXML private Label letra16, letra17, letra18, letra19, letra20 = new Label();

    // Quinta fila
    @FXML private Label letra21, letra22, letra23, letra24, letra25 = new Label();

    // Letras
    @FXML private Label a, b, c, d, e, f, g, h, i, j, k , l, m, n, ñ, o, p, q, r, s, t, u, v, w, x, y, z = new Label();
    @FXML
    public void initialize() {
        ArrayList<Label> fila1 = new ArrayList<>(Arrays.asList(letra1, letra2, letra3, letra4, letra5));
        ArrayList<Label> fila2 = new ArrayList<>(Arrays.asList(letra6, letra7, letra8, letra9, letra10));
        ArrayList<Label> fila3 = new ArrayList<>((Arrays.asList(letra11, letra12, letra13, letra14, letra15)));
        ArrayList<Label> fila4 = new ArrayList<>((Arrays.asList(letra16, letra17, letra18, letra19, letra20)));
        ArrayList<Label> fila5 = new ArrayList<>((Arrays.asList(letra21, letra22, letra23, letra24, letra25)));

        // Array de arrays conteniendo filas
        listaFilas = new ArrayList<>(Arrays.asList(fila1, fila2, fila3, fila4, fila5));
    }
    @FXML
    protected void palabraAcertar(){
        String palabra = palabraIntroducir.getText();
        for(int i = 0; i < palabra.length(); i++){
            String letra = String.valueOf(palabra.charAt(i));
            switch (i) {
                case 0:
                    Label letra1Asignar = (Label) (listaFilas.get(turno)).get(i);
                    letra1Asignar.setText(letra.toUpperCase());
                    if(comprobarAciertoLetra(letra, i) == 1){
                        letra1Asignar.getStyleClass().clear();
                        letra1Asignar.getStyleClass().add("letraPosicionAcertada");
                    }else if(comprobarAciertoLetra(letra, i) == 2){
                        letra1Asignar.getStyleClass().clear();
                        letra1Asignar.getStyleClass().add("letraAcertada");
                    }
                    break;
                case 1:
                    Label letra2Asignar = (Label) (listaFilas.get(turno)).get(i);
                    letra2Asignar.setText(letra.toUpperCase());
                    if(comprobarAciertoLetra(letra, i) == 1){
                        letra2Asignar.getStyleClass().clear();
                        letra2Asignar.getStyleClass().add("letraPosicionAcertada");
                    }else if(comprobarAciertoLetra(letra, i) == 2){
                        letra2Asignar.getStyleClass().clear();
                        letra2Asignar.getStyleClass().add("letraAcertada");
                    }
                    break;
                case 2:
                    Label letra3Asignar = (Label) (listaFilas.get(turno)).get(i);
                    letra3Asignar.setText(letra.toUpperCase());
                    if(comprobarAciertoLetra(letra, i) == 1){
                        letra3Asignar.getStyleClass().clear();
                        letra3Asignar.getStyleClass().add("letraPosicionAcertada");
                    }else if(comprobarAciertoLetra(letra, i) == 2){
                        letra3Asignar.getStyleClass().clear();
                        letra3Asignar.getStyleClass().add("letraAcertada");
                    }
                    break;
                case 3:
                    Label letra4Asignar = (Label) (listaFilas.get(turno)).get(i);
                    letra4Asignar.setText(letra.toUpperCase());
                    if(comprobarAciertoLetra(letra, i) == 1){
                        letra4Asignar.getStyleClass().clear();
                        letra4Asignar.getStyleClass().add("letraPosicionAcertada");
                    }else if(comprobarAciertoLetra(letra, i) == 2){
                        letra4Asignar.getStyleClass().clear();
                        letra4Asignar.getStyleClass().add("letraAcertada");
                    }
                    break;
                case 4:
                    Label letra5Asignar = (Label) (listaFilas.get(turno)).get(i);
                    letra5Asignar.setText(letra.toUpperCase());
                    if(comprobarAciertoLetra(letra, i) == 1){
                        letra5Asignar.getStyleClass().clear();
                        letra5Asignar.getStyleClass().add("letraPosicionAcertada");
                    }else if(comprobarAciertoLetra(letra, i) == 2){
                        letra5Asignar.getStyleClass().clear();
                        letra5Asignar.getStyleClass().add("letraAcertada");
                    }
                    break;
            }
        }
        turno++;
    }

    // Comprueba si se ha acertado la letra en la posición, la letra en la palabra o nada.
    protected int comprobarAciertoLetra(String letra, int posicion) {
        String letraPalabra = String.valueOf(palabraAdivinar.charAt(posicion));
        marcarLetraAcertada(letra);
        if(letraPalabra.equals(letra)){
            return 1;
        }
        else if(palabraAdivinar.contains(letra)) {
            return 2;
        }
        else{
            return 3;
        }
    }

    // Marcado letra acertada
    protected void marcarLetraAcertada(String letra) {
        switch (letra) {
            case "a" -> a.getStyleClass().setAll("letrasUsadas");
            case "b" -> b.getStyleClass().setAll("letrasUsadas");
            case "c" -> c.getStyleClass().setAll("letrasUsadas");
            case "d" -> d.getStyleClass().setAll("letrasUsadas");
            case "e" -> e.getStyleClass().setAll("letrasUsadas");
            case "f" -> f.getStyleClass().setAll("letrasUsadas");
            case "g" -> g.getStyleClass().setAll("letrasUsadas");
            case "h" -> h.getStyleClass().setAll("letrasUsadas");
            case "i" -> i.getStyleClass().setAll("letrasUsadas");
            case "j" -> j.getStyleClass().setAll("letrasUsadas");
            case "k" -> k.getStyleClass().setAll("letrasUsadas");
            case "l" -> l.getStyleClass().setAll("letrasUsadas");
            case "m" -> m.getStyleClass().setAll("letrasUsadas");
            case "n" -> n.getStyleClass().setAll("letrasUsadas");
            case "ñ" -> ñ.getStyleClass().setAll("letrasUsadas");
            case "o" -> o.getStyleClass().setAll("letrasUsadas");
            case "p" -> p.getStyleClass().setAll("letrasUsadas");
            case "q" -> q.getStyleClass().setAll("letrasUsadas");
            case "r" -> r.getStyleClass().setAll("letrasUsadas");
            case "s" -> s.getStyleClass().setAll("letrasUsadas");
            case "t" -> t.getStyleClass().setAll("letrasUsadas");
            case "u" -> u.getStyleClass().setAll("letrasUsadas");
            case "v" -> v.getStyleClass().setAll("letrasUsadas");
            case "w" -> w.getStyleClass().setAll("letrasUsadas");
            case "x" -> x.getStyleClass().setAll("letrasUsadas");
            case "y" -> y.getStyleClass().setAll("letrasUsadas");
            case "z" -> z.getStyleClass().setAll("letrasUsadas");
        }
    }
}
