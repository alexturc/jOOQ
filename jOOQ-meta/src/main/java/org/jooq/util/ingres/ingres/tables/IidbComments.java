/**
 * This class is generated by jOOQ
 */
package org.jooq.util.ingres.ingres.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class IidbComments extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1842272835;

	/**
	 * The singleton instance of $ingres.iidb_comments
	 */
	public static final org.jooq.util.ingres.ingres.tables.IidbComments IIDB_COMMENTS = new org.jooq.util.ingres.ingres.tables.IidbComments();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The table column <code>$ingres.iidb_comments.object_name</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> OBJECT_NAME = createField("object_name", org.jooq.impl.SQLDataType.CHAR, IIDB_COMMENTS);

	/**
	 * The table column <code>$ingres.iidb_comments.object_owner</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> OBJECT_OWNER = createField("object_owner", org.jooq.impl.SQLDataType.CHAR, IIDB_COMMENTS);

	/**
	 * The table column <code>$ingres.iidb_comments.object_type</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> OBJECT_TYPE = createField("object_type", org.jooq.impl.SQLDataType.CHAR, IIDB_COMMENTS);

	/**
	 * The table column <code>$ingres.iidb_comments.short_remark</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SHORT_REMARK = createField("short_remark", org.jooq.impl.SQLDataType.CHAR, IIDB_COMMENTS);

	/**
	 * The table column <code>$ingres.iidb_comments.text_sequence</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Long> TEXT_SEQUENCE = createField("text_sequence", org.jooq.impl.SQLDataType.BIGINT, IIDB_COMMENTS);

	/**
	 * The table column <code>$ingres.iidb_comments.long_remark</code>
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> LONG_REMARK = createField("long_remark", org.jooq.impl.SQLDataType.VARCHAR, IIDB_COMMENTS);

	/**
	 * No further instances allowed
	 */
	private IidbComments() {
		super("iidb_comments", org.jooq.util.ingres.ingres.$ingres.$INGRES);
	}
}
