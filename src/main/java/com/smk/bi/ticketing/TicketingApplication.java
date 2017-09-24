package com.smk.bi.ticketing;
import com.smk.bi.ticketing.model.City;
import com.smk.bi.ticketing.model.Customer;
import com.smk.bi.ticketing.model.Route;
import com.smk.bi.ticketing.model.User;
import com.smk.bi.ticketing.repository.CityRepository;
import com.smk.bi.ticketing.repository.CustomerRepository;
import com.smk.bi.ticketing.repository.RouteRepository;
import com.smk.bi.ticketing.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class TicketingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketingApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(CustomerRepository customerRepository){
		return (args) -> {
			 Customer customer = new Customer();
			customer.setName("digo");
			customer.setIdentifyNumber(72818272);
			customer.setCustomerAddres("jalan diponegor");
			customer.setCustomerEmail("digo@gmail");
			customer.setCostumerPhone("08182828282");
			customerRepository.save(customer);
		};
	}

	public CommandLineRunner demo2(CityRepository cityRepository) {
		return (args) -> {
			City city = new City();
			city.setCityName("Bandung");
			city.setValid("a");
			cityRepository.save(city);
		};
	}
	public CommandLineRunner demo3(RouteRepository routeRepository) {
		return (args) -> {
			Route route = new Route();
			route.setRouteName("Bandung");
			route.setValid("valid");
			routeRepository.save(route);
		};
	}
	public CommandLineRunner demo4(UserRepository userRepository) {
		return (args) -> {
			User user = new User();
			user.setUserId("Bandung");
			user.setPassword("12342");
			user.setCustomerId((long) 1);
			userRepository.save(user);
		};
	}
}

