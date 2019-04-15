/**
 * 
 */
package com.project.school.profilemgmt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.school.profilemgmt.model.Guardian;

/**
 * @author Vishal
 *
 */
@Repository
public interface GuardianProfileRepository extends MongoRepository<Guardian, String>{

}
