/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sybase.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class Systab extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -500789497;

	/**
	 * The singleton instance of SYS.SYSTAB
	 */
	public static final org.jooq.util.sybase.sys.tables.Systab SYSTAB = new org.jooq.util.sybase.sys.tables.Systab();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The table column <code>SYS.SYSTAB.table_id</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> TABLE_ID = createField("table_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>SYS.SYSTAB.dbspace_id</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> DBSPACE_ID = createField("dbspace_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>SYS.SYSTAB.count</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> COUNT = createField("count", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>SYS.SYSTAB.creator</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> CREATOR = createField("creator", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>SYS.SYSTAB.table_page_count</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> TABLE_PAGE_COUNT = createField("table_page_count", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>SYS.SYSTAB.ext_page_count</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> EXT_PAGE_COUNT = createField("ext_page_count", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>SYS.SYSTAB.commit_action</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> COMMIT_ACTION = createField("commit_action", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>SYS.SYSTAB.share_type</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> SHARE_TYPE = createField("share_type", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>SYS.SYSTAB.object_id</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> OBJECT_ID = createField("object_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>SYS.SYSTAB.last_modified_at</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.sql.Timestamp> LAST_MODIFIED_AT = createField("last_modified_at", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The table column <code>SYS.SYSTAB.table_name</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_NAME = createField("table_name", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>SYS.SYSTAB.table_type</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Byte> TABLE_TYPE = createField("table_type", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The table column <code>SYS.SYSTAB.replicate</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> REPLICATE = createField("replicate", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>SYS.SYSTAB.server_type</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Byte> SERVER_TYPE = createField("server_type", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The table column <code>SYS.SYSTAB.tab_page_list</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, byte[]> TAB_PAGE_LIST = createField("tab_page_list", org.jooq.impl.SQLDataType.LONGVARBINARY, this);

	/**
	 * The table column <code>SYS.SYSTAB.ext_page_list</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, byte[]> EXT_PAGE_LIST = createField("ext_page_list", org.jooq.impl.SQLDataType.LONGVARBINARY, this);

	/**
	 * The table column <code>SYS.SYSTAB.pct_free</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> PCT_FREE = createField("pct_free", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>SYS.SYSTAB.clustered_index_id</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> CLUSTERED_INDEX_ID = createField("clustered_index_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>SYS.SYSTAB.encrypted</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> ENCRYPTED = createField("encrypted", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The table column <code>SYS.SYSTAB.last_modified_tsn</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> LAST_MODIFIED_TSN = createField("last_modified_tsn", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>SYS.SYSTAB.file_id</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> FILE_ID = createField("file_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The table column <code>SYS.SYSTAB.table_type_str</code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_TYPE_STR = createField("table_type_str", org.jooq.impl.SQLDataType.CHAR, this);

	public Systab() {
		super("SYSTAB", org.jooq.util.sybase.sys.Sys.SYS);
	}

	public Systab(java.lang.String alias) {
		super(alias, org.jooq.util.sybase.sys.Sys.SYS, org.jooq.util.sybase.sys.tables.Systab.SYSTAB);
	}

	@Override
	public org.jooq.util.sybase.sys.tables.Systab as(java.lang.String alias) {
		return new org.jooq.util.sybase.sys.tables.Systab(alias);
	}
}
