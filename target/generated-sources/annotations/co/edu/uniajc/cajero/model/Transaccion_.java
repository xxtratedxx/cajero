package co.edu.uniajc.cajero.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Transaccion.class)
public abstract class Transaccion_ {

	public static volatile SingularAttribute<Transaccion, Cajero> idcajero;
	public static volatile SingularAttribute<Transaccion, Integer> ind_Estado;
	public static volatile SingularAttribute<Transaccion, BigDecimal> valor;
	public static volatile SingularAttribute<Transaccion, Date> fec_Creacion;
	public static volatile SingularAttribute<Transaccion, Integer> id_Transaccion;

}

