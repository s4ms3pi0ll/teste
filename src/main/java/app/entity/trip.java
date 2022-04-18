package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela TRIP
* @generated
*/
@Entity
@Table(name = "\"TRIP\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.trip")
public class trip implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "trip", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String trip;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_trip_0", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private trip cap;

    /**
    * Construtor
    * @generated
    */
    public trip(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public trip setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém trip
    * return trip
    * @generated
    */
    
    public java.lang.String getTrip(){
        return this.trip;
    }

    /**
    * Define trip
    * @param trip trip
    * @generated
    */
    public trip setTrip(java.lang.String trip){
        this.trip = trip;
        return this;
    }
    /**
    * Obtém cap
    * return cap
    * @generated
    */
    
    public trip getCap(){
        return this.cap;
    }

    /**
    * Define cap
    * @param cap cap
    * @generated
    */
    public trip setCap(trip cap){
        this.cap = cap;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
trip object = (trip)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}