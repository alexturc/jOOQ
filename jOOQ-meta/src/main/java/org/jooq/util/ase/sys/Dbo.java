/**
 * This class is generated by jOOQ
 */
package org.jooq.util.ase.sys;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class Dbo extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 779179635;

	/**
	 * The singleton instance of dbo
	 */
	public static final Dbo DBO = new Dbo();

	/**
	 * No further instances allowed
	 */
	private Dbo() {
		super("dbo");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.util.ase.sys.tables.Sysindexes.SYSINDEXES,
			org.jooq.util.ase.sys.tables.Sysobjects.SYSOBJECTS,
			org.jooq.util.ase.sys.tables.Sysreferences.SYSREFERENCES,
			org.jooq.util.ase.sys.tables.Sysusers.SYSUSERS);
	}
}
