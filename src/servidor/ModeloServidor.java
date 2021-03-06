package servidor;

import java.net.Socket;
import java.util.Random;
import java.util.ArrayList;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author c.vazquezlos
 */
public class ModeloServidor {

    private ArrayList<Jugador> jugadores;
    private int longitudX;
    private int longitudY;
    private int velocidad = 3000;
    private Punto tesoro;
    private Punto tesoroTemporal;
    Thread hilo = iniciar();
    private boolean terminar;
    private ServerView vistaServidor;
    private SocketServidor socketServidor;

    /**
     *
     * @param longitudX
     * @param longitudY
     * @throws IOException
     */
    public ModeloServidor(int longitudX, int longitudY) throws IOException {
        terminar = false;
        jugadores = new ArrayList<Jugador>();
        this.longitudX = longitudX;
        this.longitudY = longitudY;
        // Genera un tesoro en una posición aleatoria
        Random rnd = new Random();
        this.tesoro = new Punto(rnd.nextInt(this.longitudX - 1), rnd.nextInt(this.longitudY - 1));
        this.tesoroTemporal = new Punto();
        // Comienza el hilo
        hilo.start();
    }

    public void setVistaServidor(ServerView vistaServidor) {
        this.vistaServidor = vistaServidor;
    }

    /**
     *
     * @param idJugador
     * @param socket
     * @throws IOException
     */
    public void añadeJugador(int idJugador, Socket socket) throws IOException {
        Random rnd = new Random();
        // Inserta al jugador en una posición aleatoria en el tablero
        Punto punto = new Punto(rnd.nextInt(longitudX), rnd.nextInt(longitudY));
        LinkedList serpiente = new LinkedList();
        serpiente.add(punto);
        Jugador jugador = new Jugador(serpiente, idJugador, socket);
        jugador.setDireccion(rnd.nextInt(4));
        jugadores.add(jugador);
    }

    /**
     *
     * @param idJugador
     * @throws IOException
     */
    public void conecta(int idJugador) throws IOException {
        String cabecera = "IDC";
        String cuerpo = idJugador + ";" + longitudX + ";" + longitudY;
        enviarMensaje(cabecera + ";" + cuerpo);
        enviaMensaje(cabecera + ";" + cuerpo, idJugador);
        pintarTesoro(tesoro.getCoordenadaX(), tesoro.getCoordenadaY(), 1);
    }

    public void enviaMensaje(String mensaje, int idJugador) throws IOException {
        System.out.println("a cliente " + idJugador + ":" + mensaje);
        jugadores.get(buscaPosicionJugador(idJugador)).getStreamOut().writeBytes(mensaje + "\n");
        jugadores.get(buscaPosicionJugador(idJugador)).getStreamOut().flush();
    }

    /**
     *
     * @param mensaje
     * @throws IOException
     */
    public void enviarMensaje(String mensaje) throws IOException {
        System.out.println("a clientes:" + mensaje);
        for (Jugador j : jugadores) {
            j.getStreamOut().writeBytes(mensaje + "\n");
            j.getStreamOut().flush();
        }
    }

    /**
     *
     * @throws IOException
     * @throws InterruptedException
     */
    /*
    public void finalizaConexion() throws IOException, InterruptedException {
        String cabecera = "FIN";
        for (int i = 0; i < jugadores.size(); i++) {
            enviarMensaje(cabecera);
            jugadores.get(i).getStreamOut().close();
            jugadores.get(i).getSocket().close();
        }
        for (int i = 0; i < jugadores.size(); i++){
            jugadores.remove(i);
        }
        this.terminar = true;
    }
     */
    /**
     *
     * @return
     */
    public boolean esTerminado() {
        return terminar;
    }

    public ArrayList<Jugador> getArrayJugadores() {
        return jugadores;
    }

    public void finalizaCliente(int idJugador) throws IOException {
        int posicionCliente = buscaPosicionJugador(idJugador);
        jugadores.get(posicionCliente).getSocket().close();
        jugadores.get(posicionCliente).getStreamOut().close();
        jugadores.remove(posicionCliente);
        reorganizaArrayList();
        vistaServidor.eliminaFila(posicionCliente);
    }

    private void reorganizaArrayList() {
        ArrayList<Jugador> jugadoresAux = new ArrayList<Jugador>();
        for (int i = 0; i < jugadores.size(); i++) {
            jugadoresAux.add(jugadores.get(i));
            jugadores.remove(i);
        }
        for (int i = 0; i < jugadoresAux.size(); i++) {
            jugadores.add(jugadoresAux.get(i));
        }
    }

    public String buscaNickJugador(int idJugador) {
        if (buscaPosicionJugador(idJugador) != -1) {
            return jugadores.get(buscaPosicionJugador(idJugador)).getNick();
        } else {
            return "";
        }
    }

    private int buscaPosicionJugador(int idJugador) {
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getIdCliente() == idJugador) {
                return i;
            }
        }
        return -1;
    }

    /**
     *
     * @param nuevaDir
     * @param idJugador
     */
    public void cambiarDireccion(String nuevaDir, int idJugador) {
        switch (nuevaDir) {
            case "ARRIBA":
                arriba(idJugador);
                break;
            case "ABAJO":
                abajo(idJugador);
                break;
            case "IZQUIERDA":
                izquierda(idJugador);
                break;
            case "DERECHA":
                derecha(idJugador);
                break;
        }
    }

    private void arriba(int idJugador) {
        int posicion = buscaPosicionJugador(idJugador);
        if (jugadores.get(posicion).getDireccion() != 3) {
            jugadores.get(posicion).setDireccion(1);
        }
    }

    private void abajo(int idJugador) {
        int posicion = buscaPosicionJugador(idJugador);
        if (jugadores.get(posicion).getDireccion() != 1) {
            jugadores.get(posicion).setDireccion(3);
        }
    }

    private void izquierda(int idJugador) {
        int posicion = buscaPosicionJugador(idJugador);
        if (jugadores.get(posicion).getDireccion() != 2) {
            jugadores.get(posicion).setDireccion(0);
        }
    }

    private void derecha(int idJugador) {
        int posicion = buscaPosicionJugador(idJugador);
        if (jugadores.get(posicion).getDireccion() != 0) {
            jugadores.get(posicion).setDireccion(2);
        }
    }

    private void pintarTesoro(int coordenadaX, int coordenadaY, int t) throws IOException {
        String cabecera = "TSR";
        String cuerpo = t + ";" + coordenadaX + ";" + coordenadaY;
        enviarMensaje(cabecera + ";" + cuerpo);
    }

    private void puntuacion(int idJugador) throws IOException {
        String cabecera = "PTS";
        int posicion = buscaPosicionJugador(idJugador);
        String cuerpo = Integer.toString((jugadores.get(posicion).getSerpiente().size()) * 10);
        enviarMensaje(cabecera + ";" + cuerpo);
        enviaMensaje(cabecera + ";" + cuerpo, idJugador);
        vistaServidor.actualizaPuntuacion(idJugador, ((jugadores.get(posicion).getSerpiente().size()) * 10), jugadores.get(posicion).getNick());
    }

    private void addTesoro(int tesoroAAñadir) throws IOException {
        Random rnd = new Random();
        if (tesoroAAñadir == 1) {
            int x = rnd.nextInt(longitudX);
            int y = rnd.nextInt(longitudY);
            tesoro = new Punto(x, y);
            pintarTesoro(tesoro.getCoordenadaX(), tesoro.getCoordenadaY(), 1);
        } else {
            int x = rnd.nextInt(longitudX);
            int y = rnd.nextInt(longitudY);
            tesoroTemporal = new Punto(x, y);
            pintarTesoro(tesoroTemporal.getCoordenadaX(), tesoroTemporal.getCoordenadaY(), 2);
        }
    }

    /**
     *
     * @param t
     * @param id
     * @throws IOException
     */
    public void tesoroComido(int t, int id) throws IOException {
        if (t == 1) {
            //actualizar puntuacion jugador id con puntuacion tesoro tipo 1;
            addTesoro(1);
        } else {
            //actualizar puntuacion jugador id con puntuacion tesoro tipo 2;
            addTesoro(2);
        }
        // Se genera un nuevo punto
        jugadores.get(buscaPosicionJugador(id)).getSerpiente().add(new Punto());
    }

    /**
     *
     * @param idJugador
     * @param mensaje
     * @throws IOException
     */
    public void gameOver(int idJugador, String mensaje) throws IOException {
        String cabecera = "ERR";
        String contenido = idJugador + ";" + mensaje;
        enviarMensaje(cabecera + ";" + contenido);
        enviaMensaje(cabecera + ";" + contenido, idJugador);
    }

    private void distancia(int id, int coordenadaXInicial, int coordenadaYInicial, int coordenadaXFinal, int coordenadaYFinal) throws IOException {
        String cabecera = "MOV";
        String contenido = id + ";" + coordenadaXInicial + ";" + coordenadaYInicial + ";" + coordenadaXFinal + ";" + coordenadaYFinal;
        enviarMensaje(cabecera + ";" + contenido);
    }

    public void setNickEnJugador(String nick, int idJugador) {
        jugadores.get(buscaPosicionJugador(idJugador)).setNick(nick);
    }

    /**
     *
     * @return
     */
    public Thread iniciar() {
        return new Thread() {
            @Override
            public void run() {
                int mostrarTesoro = 0;
                while (true) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                    }
                    // En cada Thread recorre los jugadores, actualizando sus posiciones
                    for (Jugador j : jugadores) {
                        try {
                            actualizarPosicion(j.getIdCliente());
                            tesoroComido(j.getIdCliente());
                        } catch (Exception e) {
                        }
                    }
                    mostrarTesoro++;
                    if (mostrarTesoro == 10) {
                        try {
                            pintarTesoro(tesoroTemporal.getCoordenadaX(), tesoroTemporal.getCoordenadaY(), 0);
                        } catch (IOException ex) {
                            Logger.getLogger(ModeloServidor.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            addTesoro(2);
                        } catch (IOException ex) {
                            Logger.getLogger(ModeloServidor.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }

            // Si el jugador se ha movido, se actualiza su posición
            private void actualizarPosicion(int idJugador) throws IOException {
                int posicion = buscaPosicionJugador(idJugador);
                int xi = ((Punto) jugadores.get(posicion).getSerpiente().getFirst()).getCoordenadaX();
                int yi = ((Punto) jugadores.get(posicion).getSerpiente().getFirst()).getCoordenadaY();
                int xf = ((Punto) jugadores.get(posicion).getSerpiente().getLast()).getCoordenadaX();
                int yf = ((Punto) jugadores.get(posicion).getSerpiente().getLast()).getCoordenadaY();
                LinkedList ll = (LinkedList) jugadores.get(posicion).getSerpiente().clone();
                ll.removeFirst();
                // Si se choca contra si mismo entonces para
                if (ll.contains(jugadores.get(posicion).getSerpiente().getFirst())) {
                    gameOver(idJugador, "Choque consigo mismo");
                    // Si se choca contra otros jugadores entonces para
                } else if (chocaContraJugador(idJugador)) {
                    gameOver(idJugador, "Choque con otro jugador");
                } else {
                    // Si no se choca contra otros jugadores, entonces se mueve
                    jugadores.get(posicion).getSerpiente().removeLast();
                    // Controlamos que se salga del tablero
                    puntuacion(idJugador);
                    int direccion = jugadores.get(posicion).getDireccion();
                    switch (direccion) {
                        case (0):
                            if (yi > 0) {
                                yi--;
                            } else {
                                gameOver(idJugador, "Salida del tablero");
                            }
                            break;
                        case (1):
                            if (xi > 0) {
                                xi--;
                            } else {
                                gameOver(idJugador, "Salida del tablero");
                            }
                            break;
                        case (2):
                            if (yi < longitudY) {
                                yi++;
                            } else {
                                gameOver(idJugador, "Salida del tablero");
                            }
                            break;
                        case (3):
                            if (xf < longitudX) {
                                xi++;
                            } else {
                                gameOver(idJugador, "Salida del tablero");
                            }
                            break;
                    }
                    jugadores.get(posicion).getSerpiente().addFirst(new Punto(xi, yi));
                    distancia(jugadores.get(posicion).getIdCliente(), xi, yi, xf, yf);
                }
            }

            private boolean chocaContraJugador(int idJugador) {
                boolean chocar = false;
                int posicion = buscaPosicionJugador(idJugador);
                for (Jugador j : jugadores) {
                    if (j.getIdCliente() != idJugador && !chocar) {
                        if (j.getSerpiente().contains(jugadores.get(posicion).getSerpiente().getFirst())) {
                            chocar = true;
                        }
                    }
                }
                return chocar;
            }

            private void tesoroComido(int idJugador) throws IOException {
                int posicion = buscaPosicionJugador(idJugador);
                if (tesoro.equals((Punto) jugadores.get(posicion).getSerpiente().getFirst())) {
                    ModeloServidor.this.tesoroComido(1, idJugador);
                }
                if (tesoroTemporal.equals((Punto) jugadores.get(posicion).getSerpiente().getFirst())) {
                    ModeloServidor.this.tesoroComido(2, idJugador);
                }
            }
        };
    }
}
