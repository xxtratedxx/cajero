package co.edu.uniajc.cajero.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cuenta.class)
public abstract class Cuenta_ {

	public static volatile SingularAttribute<Cuenta, Estado> estado;
	public static volatile SingularAttribute<Cuenta, String> clave;
	public static volatile SingularAttribute<Cuenta, String> numero;
	public static volatile SingularAttribute<Cuenta, Banco> banco;
	public static volatile SingularAttribute<Cuenta, Producto> producto;
	public static volatile SingularAttribute<Cuenta, BigDecimal> saldo;
	public static volatile SingularAttribute<Cuenta, Integer> idCuenta;

}

