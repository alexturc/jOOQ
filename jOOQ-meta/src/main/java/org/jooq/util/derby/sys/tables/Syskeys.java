/**
 * This class is generated by jOOQ
 */
package org.jooq.util.derby.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class Syskeys extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -684190751;

	/**
	 * The singleton instance of SYS.SYSKEYS
	 */
	public static final org.jooq.util.derby.sys.tables.Syskeys SYSKEYS = new org.jooq.util.derby.sys.tables.Syskeys();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The table column <code>SYS.SYSKEYS.CONSTRAINTID</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINTID = createField("CONSTRAINTID", org.jooq.impl.SQLDataType.CHAR, SYSKEYS);

	/**
	 * The table column <code>SYS.SYSKEYS.CONGLOMERATEID</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CONGLOMERATEID = createField("CONGLOMERATEID", org.jooq.impl.SQLDataType.CHAR, SYSKEYS);

	/**
	 * No further instances allowed
	 */
	private Syskeys() {
		super("SYSKEYS", org.jooq.util.derby.sys.Sys.SYS);
	}
}
