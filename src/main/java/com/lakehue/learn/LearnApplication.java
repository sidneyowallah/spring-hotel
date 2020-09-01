package com.lakehue.learn;

import com.lakehue.learn.data.entity.Guest;
import com.lakehue.learn.data.entity.Reservation;
import com.lakehue.learn.data.entity.Room;
import com.lakehue.learn.data.repository.GuestRepository;
import com.lakehue.learn.data.repository.ReservationRepository;
import com.lakehue.learn.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnApplication.class, args);
	}

}
