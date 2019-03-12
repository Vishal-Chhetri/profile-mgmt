/**
 * 
 */
package com.project.school.profilemgmt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.school.profilemgmt.model.Student;

/**
 * @author Vishal
 *
 */
@Repository
public interface StudentProfileRepository extends MongoRepository<Student, String>{

}
