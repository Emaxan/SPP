////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2017.                                                         /
// Developed by Maksim Ermoshyn.                                               /
////////////////////////////////////////////////////////////////////////////////

package maksim.yarmoshyn.dal.unit_of_work;

import maksim.yarmoshyn.dal.dbcontext.DBContext;
import maksim.yarmoshyn.dal.model.interf.Entity;
import maksim.yarmoshyn.dal.repository.BaseRepository;
import maksim.yarmoshyn.dal.repository.interf.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Base Unit of Work to get repositories, than don't need special functionality.
 */
public class UnitOfWork implements UoW {

    /**
     * Map of repositories.
     */
    private final Map<Class, Object> repositoriesMap = new HashMap<>();
    /**
     * Database context.
     */
    private DBContext ctx;

    /**
     * Create new instance of UoW.
     *
     * @param context Database context.
     */
    public UnitOfWork(final DBContext context) {
        this.ctx = context;
    }

    /**
     * Get database context.
     *
     * @return Database context.
     */
    public DBContext getContext() {
        return ctx;
    }

    /**
     * Return repository with basic functionality for TEntity.
     *
     * @param objectClass Class of the repository.
     * @param <TEntity>   Class of the repository.
     * @return Repository for TEntity.
     */
    @Override
    @SuppressWarnings("unchecked")
    public <TEntity extends Entity> Repository<TEntity> getRepository(
            final Class<TEntity> objectClass
    ) {
        if (!repositoriesMap.containsKey(objectClass)) {
            repositoriesMap.put(
                    objectClass,
                    new BaseRepository(ctx, objectClass)
            );
        }

        return (Repository<TEntity>) repositoriesMap.get(objectClass);
    }
}
