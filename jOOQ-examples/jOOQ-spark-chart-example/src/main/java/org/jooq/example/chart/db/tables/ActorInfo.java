/**
 * This class is generated by jOOQ
 */
package org.jooq.example.chart.db.tables;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.example.chart.db.Public;
import org.jooq.example.chart.db.tables.records.ActorInfoRecord;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0",
        "schema version:public_2",
    },
    date = "2016-06-30T15:44:15.143Z",
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ActorInfo extends TableImpl<ActorInfoRecord> {

    private static final long serialVersionUID = -2070973489;

    /**
     * The reference instance of <code>public.actor_info</code>
     */
    public static final ActorInfo ACTOR_INFO = new ActorInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ActorInfoRecord> getRecordType() {
        return ActorInfoRecord.class;
    }

    /**
     * The column <code>public.actor_info.actor_id</code>.
     */
    public final TableField<ActorInfoRecord, Integer> ACTOR_ID = createField("actor_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.actor_info.first_name</code>.
     */
    public final TableField<ActorInfoRecord, String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>public.actor_info.last_name</code>.
     */
    public final TableField<ActorInfoRecord, String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>public.actor_info.film_info</code>.
     */
    public final TableField<ActorInfoRecord, String> FILM_INFO = createField("film_info", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>public.actor_info</code> table reference
     */
    public ActorInfo() {
        this("actor_info", null);
    }

    /**
     * Create an aliased <code>public.actor_info</code> table reference
     */
    public ActorInfo(String alias) {
        this(alias, ACTOR_INFO);
    }

    private ActorInfo(String alias, Table<ActorInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private ActorInfo(String alias, Table<ActorInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActorInfo as(String alias) {
        return new ActorInfo(alias, this);
    }

    /**
     * Rename this table
     */
    public ActorInfo rename(String name) {
        return new ActorInfo(name, null);
    }
}
