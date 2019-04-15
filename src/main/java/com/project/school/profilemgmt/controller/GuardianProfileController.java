/**
 * 
 */
package com.project.school.profilemgmt.controller;

import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.school.profilemgmt.model.Guardian;
import com.project.school.profilemgmt.service.GuardianProfileService;

/**
 * @author Vishal
 *
 */
@RestController
@RequestMapping("/guardianProfile")
public class GuardianProfileController {
	@Autowired
	private GuardianProfileService guardianProfileService;
	
	@GetMapping("")	
	public Optional<Guardian> getGuardianById(@PathParam(value="id" )String id){
		return guardianProfileService.getGuardianById(id);
	}
	@PutMapping("")
	public Guardian saveGuardian(@RequestBody Guardian guardian) {
		return guardianProfileService.saveGuardian(guardian);
	}

}
