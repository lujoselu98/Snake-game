/***********************************************************************************
******************* PRÁCTICA FINAL METODOLOGÍA DE LA PROGRAMACIÓN ******************
******************** Carlos Vázquez Losada y Jorge Galindo Peña ********************
************************************************************************************/
package clases;

import javax.swing.JPanel;

public class Serpiente {

    private int colocacionX, colocacionY;

    public Serpiente(int colocacionX, int colocacionY){
        this.colocacionX=colocacionX;
        this.colocacionY=colocacionY;
    }

    public int getColocacionX(){
        return colocacionX;
    }

    public int getColocacionY(){
        return colocacionY;
    }

    public void setColocacionY(int colocacionY){
        this.colocacionY=colocacionY;
    }

    public void setColocacionX(int colocacionX){
        this.colocacionX=colocacionX;
    }
}
