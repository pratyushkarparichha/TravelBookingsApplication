package com.nit.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
	
  @GetMapping("/all")
  public String allAccess() {
    return "Public Content.";
  }
  
  @GetMapping("/user")
  @PreAuthorize("hasRole('USER')")          
  public String userAccess() {
    return "User Content.";
    //rest template taking to booking
  }
  
  @GetMapping("/attendee")
  @PreAuthorize("hasRole('ATTENDEE')")
  public String attendeeAccess() {
    return "Attendee Board.";
    //rest template taking to check_in
  }
  
  @GetMapping("/admin")
  @PreAuthorize("hasRole('ADMIN') or hasRole('ATTENDEE') or hasRole('USER')")
  public String adminAccess() {
    return "Admin Board.";
    //rest template taking to admin
  }
  
}
