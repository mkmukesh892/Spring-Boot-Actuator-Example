package com.fico.spring.mukesh.repository;

import java.util.List;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fico.spring.mukesh.model.Customer;
// @RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
List<Customer> findByLastName(@Param("name") String name);
}
