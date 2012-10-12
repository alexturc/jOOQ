/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test;

/**
 * This class is generated by jOOQ.
 *
 * @deprecated - [#1866] - 2.6.0 - Schema-specific factories will no longer 
 * be generated in the future. Do not reuse.
 */
@java.lang.SuppressWarnings("all")
public class TestFactory extends org.jooq.util.oracle.OracleFactory {

	private static final long serialVersionUID = -676139894;

	/**
	 * Create a factory with a connection
	 *
	 * @param connection The connection to use with objects created from this factory
	 */
	public TestFactory(java.sql.Connection connection) {
		super(connection);

		initDefaultSchema();
	}

	/**
	 * Create a factory with a data source
	 *
	 * @param dataSource The data source to use with objects created from this factory
	 */
	public TestFactory(javax.sql.DataSource dataSource) {
		super(dataSource);

		initDefaultSchema();
	}

	/**
	 * Create a factory with a connection and a schema mapping
	 * 
	 * @deprecated - 2.0.5 - Use {@link #TestFactory(java.sql.Connection, org.jooq.conf.Settings)} instead
	 */
	@Deprecated
	public TestFactory(java.sql.Connection connection, org.jooq.SchemaMapping mapping) {
		super(connection, mapping);

		initDefaultSchema();
	}

	/**
	 * Create a factory with a connection and some settings
	 *
	 * @param connection The connection to use with objects created from this factory
	 * @param settings The settings to apply to objects created from this factory
	 */
	public TestFactory(java.sql.Connection connection, org.jooq.conf.Settings settings) {
		super(connection, settings);

		initDefaultSchema();
	}

	/**
	 * Create a factory with a data source and some settings
	 *
	 * @param dataSource The data source to use with objects created from this factory
	 * @param settings The settings to apply to objects created from this factory
	 */
	public TestFactory(javax.sql.DataSource dataSource, org.jooq.conf.Settings settings) {
		super(dataSource, settings);

		initDefaultSchema();
	}

	/**
	 * Initialise the render mapping's default schema.
	 * <p>
	 * For convenience, this schema-specific factory should override any pre-existing setting
	 */
	private final void initDefaultSchema() {
		org.jooq.conf.SettingsTools.getRenderMapping(getSettings()).setDefaultSchema(org.jooq.test.oracle.generatedclasses.test.Test.TEST.getName());
	}
}
