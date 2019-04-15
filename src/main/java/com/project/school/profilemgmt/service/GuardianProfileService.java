/**
 * 
 */
package com.project.school.profilemgmt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.school.profilemgmt.model.Guardian;
import com.project.school.profilemgmt.repository.GuardianProfileRepository;

/**
 * @author Vishal
 *
 */
@Service
public class GuardianProfileService {
	@Autowired
	private GuardianProfileRepository guardianProfileRepository;
	
	public Optional<Guardian> getGuardianById(String id){
		return guardianProfileRepository.findById(id);
	}
	
	public Guardian saveGuardian(Guardian guardian) {
		return guardianProfileRepository.save(guardian);
	}
	

}
