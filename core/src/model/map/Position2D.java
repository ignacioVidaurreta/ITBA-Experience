package model.map;

/**
 *@author: lpinilla
 */
import java.io.Serializable;
import java.lang.Math;

public class Position2D implements Serializable {

    private int x,y;

    public Position2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Integer getX(){
        return this.x;
    }

    public Integer getY(){
        return this.y;
    }

    public int hashCode(){
        return (int)Math.pow(2, getX()) + (int)Math.pow(3, getY());
    }

    public boolean equals(Object o){
        if(o == null) return false;
        if(this == o) return true;
        if(o.getClass() != this.getClass()) return false;
        Position2D pos = (Position2D) o;
        return (this.getX() == pos.getX()) && (this.getY() == pos.getY());
    }
}