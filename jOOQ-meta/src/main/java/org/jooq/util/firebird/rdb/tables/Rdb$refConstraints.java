/**
 * This class is generated by jOOQ
 */
package org.jooq.util.firebird.rdb.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class Rdb$refConstraints extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 14305717;

	/**
	 * The singleton instance of RDB$REF_CONSTRAINTS
	 */
	public static final org.jooq.util.firebird.rdb.tables.Rdb$refConstraints RDB$REF_CONSTRAINTS = new org.jooq.util.firebird.rdb.tables.Rdb$refConstraints();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The table column <code>RDB$REF_CONSTRAINTS.RDB$CONSTRAINT_NAME</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$CONSTRAINT_NAME = createField("RDB$CONSTRAINT_NAME", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>RDB$REF_CONSTRAINTS.RDB$CONST_NAME_UQ</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$CONST_NAME_UQ = createField("RDB$CONST_NAME_UQ", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>RDB$REF_CONSTRAINTS.RDB$MATCH_OPTION</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$MATCH_OPTION = createField("RDB$MATCH_OPTION", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>RDB$REF_CONSTRAINTS.RDB$UPDATE_RULE</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$UPDATE_RULE = createField("RDB$UPDATE_RULE", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>RDB$REF_CONSTRAINTS.RDB$DELETE_RULE</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$DELETE_RULE = createField("RDB$DELETE_RULE", org.jooq.impl.SQLDataType.CHAR, this);

	public Rdb$refConstraints() {
		super("RDB$REF_CONSTRAINTS");
	}

	public Rdb$refConstraints(java.lang.String alias) {
		super(alias, null, org.jooq.util.firebird.rdb.tables.Rdb$refConstraints.RDB$REF_CONSTRAINTS);
	}

	@Override
	public org.jooq.util.firebird.rdb.tables.Rdb$refConstraints as(java.lang.String alias) {
		return new org.jooq.util.firebird.rdb.tables.Rdb$refConstraints(alias);
	}
}
