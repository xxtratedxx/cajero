package co.edu.uniajc.cajero.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Detalle.class)
public abstract class Detalle_ {

	public static volatile SingularAttribute<Detalle, Transaccion> id_transaccion;
	public static volatile SingularAttribute<Detalle, Tarjeta> id_tarjeta;
	public static volatile SingularAttribute<Detalle, BigDecimal> monto;
	public static volatile SingularAttribute<Detalle, Integer> idDetalle;
	public static volatile SingularAttribute<Detalle, Cuenta> idcuenta;
	public static volatile SingularAttribute<Detalle, Movimiento> id_movimiento;

}

