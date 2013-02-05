
package model;


import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.persistence.*;
import javax.transaction.UserTransaction;


/**
 * modelFood.java
 * 
 * Feb 5, 2013
 * 
 * @author Chuck Wojciuk
 */
@Entity
@NamedQuery(name = "findFoodByName", query="SELECT f FROM Food f WHERE f.name =")
public class Food implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable=false)
    private String name;
    private double price;
    @Column(length=2000)
    private String description;
    public Long getId() {
        return id;
    }


    public void setId( Long id ) {
        this.id = id;
    }
    public String getName() {
        return name;
    }


    public void setName( String name ) {
        this.name = name;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice( double price ) {
        this.price = price;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription( String description ) {
        this.description = description;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += ( id != null ? id.hashCode() : 0 );
        return hash;
    }


    @Override
    public boolean equals( Object object ) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if ( !( object instanceof Food ) ) {
            return false;
        }
        Food other = ( Food ) object;
        if ( ( this.id == null && other.id != null ) ||
             ( this.id != null && !this.id.equals( other.id ) ) ) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "model.Food[ id=" + id + " ]";
    }
    public void persist( Object object ) {
        /* Add this to the deployment descriptor of this module (e.g. web.xml, ejb-jar.xml):
         * <persistence-context-ref>
         * <persistence-context-ref-name>persistence/LogicalName</persistence-context-ref-name>
         * <persistence-unit-name>Week4HomeworkPU</persistence-unit-name>
         * </persistence-context-ref>
         * <resource-ref>
         * <res-ref-name>UserTransaction</res-ref-name>
         * <res-type>javax.transaction.UserTransaction</res-type>
         * <res-auth>Container</res-auth>
         * </resource-ref> */
        try {
            Context ctx = new InitialContext();
            UserTransaction utx =
                            ( UserTransaction ) ctx.lookup( "java:comp/env/UserTransaction" );
            utx.begin();
            EntityManager em =
                          ( EntityManager ) ctx.lookup( "java:comp/env/persistence/LogicalName" );
            em.persist( object );
            utx.commit();
        } catch ( Exception e ) {
            Logger.getLogger( getClass().getName() ).
                    log( Level.SEVERE, "exception caught", e );
            throw new RuntimeException( e );
        }
    }

}
