package jmr.learning;

import java.util.Objects;

/**
 * The <code>Dimension3D</code> class encapsulates the width, height and depth
 * of a three-dimensional point (in integer precision)
 *
 * @author Jesús Chamorro Martínez (jesus@decsai.ugr.es)
 * @param <T> the domain of the components.
 */
public class Dimension3D<T extends Number>  {
    /**
     * The width dimension; negative values can be used.
     */
    public T width;
    /**
     * The height dimension; negative values can be used.
     */
    public T height;
    /**
     * The depth dimension; negative values can be used.
     */
    public T depth;
    
    /**
     * Constructs a <code>Dimension3D</code> and initializes
     * it to the specified width, height and depth.
     *
     * @param width the width
     * @param height the height
     * @param depth the depth
     */
    public Dimension3D(T width, T height, T depth) {
        this.width = width;
        this.height = height;
        this.depth = depth; 
    }
    
    
    /**
     * Returns the width of this <code>Dimension3D</code> in double precision.
     *
     * @return the width of this <code>Dimension</code>.
     */
    public T getWidth() {
        return width;
    }

    /**
     * Returns the width of this <code>Dimension3D</code> in double precision.
     *
     * @return the width of this <code>Dimension</code>.
     */
    public T getHeight() {
        return height;
    }
    
    /**
     * Returns the depth of this <code>Dimension3D</code> in double precision.
     *
     * @return the depth of this <code>Dimension</code>.
     */
    public T getDepth() {
        return depth;
    }

    /**
     * Sets the size of this <code>Dimension3D</code> object to
     * the specified width, height and depth.
     *
     * @param width  the new width 
     * @param height the new height 
     * @param depth the new depth
     */
    public void setSize(T width, T height, T depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }    
    
    /**
     * Checks whether two dimension objects have equal values.
     *
     * @return {@code true} if this object is the same as the obj argument;
     * {@code false} otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Dimension3D) {
            Dimension3D d = (Dimension3D)obj;
            return (width == d.width) && (height == d.height) && (depth == d.depth);
        }
        return false;
    }

    /**
     * Returns the hash code for this <code>Dimension33D</code>.
     *
     * @return    a hash code for this <code>Dimension3D</code>
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.width);
        hash = 97 * hash + Objects.hashCode(this.height);
        hash = 97 * hash + Objects.hashCode(this.depth);
        return hash;
    }
    
    /**
     * Returns a string representation of the values of this
     * <code>Dimension3D</code> object.
     *
     * @return a string representation of this <code>Dimension3D</code> object
     */
    @Override
    public String toString() {
        return "[" + width + "," + height + "," + depth + "]";
    }
}