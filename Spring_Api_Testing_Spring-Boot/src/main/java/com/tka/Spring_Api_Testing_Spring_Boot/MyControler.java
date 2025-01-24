package com.tka.Spring_Api_Testing_Spring_Boot;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/TCS")
public class MyControler {
	

		@GetMapping("/Tcs_home")
		public String TCS_HomePage() {
			return "Welcome To TCS Family";
		}

		@PutMapping("/careers")
		public String TCS_Careeer() {
			return "Join Us";
		}

		@PostMapping("/Newsroom")
		public String TCS_Newsroom() {
			return "Stay up-to-date on all press announcements by TCS";
		}

		@DeleteMapping("/ContactUS")
		public String TCS_ContactUs() {
			return "We’re here to help! Tell us what you’re looking for and we’ll get you connected to the right people.";
		}

		@PatchMapping("/Tcs_worlwide")
		public String TCS_Worldwide() {
			return "We bring together global best practices and local resources to customers across industries and around the world";
		}

	

}
