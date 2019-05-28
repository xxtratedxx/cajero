package co.edu.uniajc.cajero.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cajero.class)
public abstract class Cajero_ {

	public static volatile SingularAttribute<Cajero, String> ubicacion;
	public static volatile SingularAttribute<Cajero, Integer> indServicio;
	public static volatile SingularAttribute<Cajero, Banco> idbanco;
	public static volatile SingularAttribute<Cajero, Integer> idCajero;
	public static volatile SingularAttribute<Cajero, BigDecimal> saldo;

}

