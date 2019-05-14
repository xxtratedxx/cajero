package co.edu.uniajc.cajero.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Usuario.class)
public abstract class Usuario_ {

	public static volatile SingularAttribute<Usuario, TipoIdentificacion> tipoIdentificacion;
	public static volatile SingularAttribute<Usuario, Integer> idUsuario;
	public static volatile SingularAttribute<Usuario, String> apellido;
	public static volatile SingularAttribute<Usuario, Date> fecCreacion;
	public static volatile SingularAttribute<Usuario, String> direccion;
	public static volatile SingularAttribute<Usuario, String> celular;
	public static volatile SingularAttribute<Usuario, String> identificacion;
	public static volatile SingularAttribute<Usuario, String> nombre;
	public static volatile SingularAttribute<Usuario, String> email;
	public static volatile SingularAttribute<Usuario, Date> fecActualiza;

}

