package models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import play.data.format.Formats;
import play.data.validation.Constraints;

import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Find;
@Entity
public class Cliente extends Model{

	private static final long serialVersionUID = 1L;

	@Id
    public Long id;
    
    @Constraints.Required
    public String nombre;
    
    @Constraints.Required
    public String apellido;
    
    @Constraints.Required
    public String direccion;
    
    @Constraints.Required
    public String ocupacion;


    public static Find<Long,Cliente> find = new Find<Long,Cliente>(){};
  		public static List<Cliente> listadoCliente() {
  			// TODO Auto-generated method stub
  			return find.all();
  		}
    
	
}
