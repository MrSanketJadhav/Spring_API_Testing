package com.tka;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Amazon")
public class MyControler {


		@RequestMapping(value = "/register", method = RequestMethod.GET)
		public String amazonaccount() {
			return "create an account";
		}

		@RequestMapping(value = "/amazonprofile", method = RequestMethod.POST)
		public String amazonprofile() {
			return "welcome";
		}

		@RequestMapping(value = "/mobile-phones", method = RequestMethod.PUT)
		public String Amazonshoping() {
			return "Order Mobile & Accessories....";
		}

		@RequestMapping(value = "/home-kitchen", method = RequestMethod.DELETE)
		public String Amazongroceries() {
			return "Order groceries ";
		}

		@RequestMapping(value = "/orders", method = RequestMethod.PATCH)
		public String AmazonOrder() {
			return " Your order is on the way";
		}
	

}
