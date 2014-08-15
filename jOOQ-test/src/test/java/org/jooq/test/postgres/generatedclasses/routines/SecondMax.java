/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SecondMax extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = 575408053;

	/**
	 * The parameter <code>public.second_max.RETURN_VALUE</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>public.second_max._1</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> _1 = createParameter("_1", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public SecondMax() {
		super("second_max", org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.routines.SecondMax._1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public SecondMax set__1(org.jooq.Field<java.lang.Integer> field) {
		setField(_1, field);
		return this;
	}
}