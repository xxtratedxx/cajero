package co.edu.uniajc.cajero.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Tarjeta.class)
public abstract class Tarjeta_ {

	public static volatile SingularAttribute<Tarjeta, Date> validthru;
	public static volatile SingularAttribute<Tarjeta, Integer> idTarjeta;
	public static volatile SingularAttribute<Tarjeta, Estado> estado;
	public static volatile SingularAttribute<Tarjeta, String> clave;
	public static volatile SingularAttribute<Tarjeta, String> numero;
	public static volatile SingularAttribute<Tarjeta, Date> fecCreacion;
	public static volatile SingularAttribute<Tarjeta, Cuenta> cuenta;
	public static volatile SingularAttribute<Tarjeta, Integer> indBlock;

}

