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
public class Syssequences extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -94732695;

	/**
	 * The singleton instance of SYS.SYSSEQUENCES
	 */
	public static final org.jooq.util.derby.sys.tables.Syssequences SYSSEQUENCES = new org.jooq.util.derby.sys.tables.Syssequences();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The table column <code>SYS.SYSSEQUENCES.SEQUENCEID</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SEQUENCEID = createField("SEQUENCEID", org.jooq.impl.SQLDataType.CHAR, SYSSEQUENCES);

	/**
	 * The table column <code>SYS.SYSSEQUENCES.SEQUENCENAME</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SEQUENCENAME = createField("SEQUENCENAME", org.jooq.impl.SQLDataType.VARCHAR, SYSSEQUENCES);

	/**
	 * The table column <code>SYS.SYSSEQUENCES.SCHEMAID</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SCHEMAID = createField("SCHEMAID", org.jooq.impl.SQLDataType.CHAR, SYSSEQUENCES);

	/**
	 * The table column <code>SYS.SYSSEQUENCES.SEQUENCEDATATYPE</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SEQUENCEDATATYPE = createField("SEQUENCEDATATYPE", org.jooq.impl.SQLDataType.CLOB, SYSSEQUENCES);

	/**
	 * The table column <code>SYS.SYSSEQUENCES.CURRENTVALUE</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Long> CURRENTVALUE = createField("CURRENTVALUE", org.jooq.impl.SQLDataType.BIGINT, SYSSEQUENCES);

	/**
	 * The table column <code>SYS.SYSSEQUENCES.STARTVALUE</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Long> STARTVALUE = createField("STARTVALUE", org.jooq.impl.SQLDataType.BIGINT, SYSSEQUENCES);

	/**
	 * The table column <code>SYS.SYSSEQUENCES.MINIMUMVALUE</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Long> MINIMUMVALUE = createField("MINIMUMVALUE", org.jooq.impl.SQLDataType.BIGINT, SYSSEQUENCES);

	/**
	 * The table column <code>SYS.SYSSEQUENCES.MAXIMUMVALUE</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Long> MAXIMUMVALUE = createField("MAXIMUMVALUE", org.jooq.impl.SQLDataType.BIGINT, SYSSEQUENCES);

	/**
	 * The table column <code>SYS.SYSSEQUENCES.INCREMENT</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Long> INCREMENT = createField("INCREMENT", org.jooq.impl.SQLDataType.BIGINT, SYSSEQUENCES);

	/**
	 * The table column <code>SYS.SYSSEQUENCES.CYCLEOPTION</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> CYCLEOPTION = createField("CYCLEOPTION", org.jooq.impl.SQLDataType.CHAR, SYSSEQUENCES);

	/**
	 * No further instances allowed
	 */
	private Syssequences() {
		super("SYSSEQUENCES", org.jooq.util.derby.sys.Sys.SYS);
	}
}
