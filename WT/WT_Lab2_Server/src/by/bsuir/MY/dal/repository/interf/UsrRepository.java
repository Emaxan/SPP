////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2017.                                                         /
// Developed by Maksim Ermoshyn.                                               /
////////////////////////////////////////////////////////////////////////////////

package by.bsuir.MY.dal.repository.interf;

import by.bsuir.MY.dal.model.User;

/**
 * Interface for repository for {@link User}.
 */
public interface UsrRepository extends Repository<User> {

    /**
     * Return {@link User} by email.
     *
     * @param email Email of {@link User}.
     * @return {@link User} if it present in database, {@code null} otherwise.
     */
    User getByEmail(String email);
}
