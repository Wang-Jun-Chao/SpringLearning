package org.test.bookpub.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.test.bookpub.entity.Reviewer;

/**
 * Author: 王俊超
 * Date: 2017-04-04 11:24
 * All Rights Reserved !!!
 */
@RepositoryRestResource
public interface ReviewerRepository extends PagingAndSortingRepository<Reviewer, Long> {
}
