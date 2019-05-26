package co.edu.uniajc.cajero.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Detalle.class)
public abstract class Detalle_ {

	public static volatile SingularAttribute<Detalle, BigDecimal> monto;
	public static volatile SingularAttribute<Detalle, Movimiento> movimiento;
	public static volatile SingularAttribute<Detalle, Transaccion> transaccion;
	public static volatile SingularAttribute<Detalle, Cuenta> cuenta;
	public static volatile SingularAttribute<Detalle, DetalleId> id;
	public static volatile SingularAttribute<Detalle, Tarjeta> tarjeta;

}

