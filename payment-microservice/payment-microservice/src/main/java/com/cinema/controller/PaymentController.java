package com.cinema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import com.cinema.domain.Payment;
import com.cinema.service.IPaymentService;

import vo.ResponseTemplateVo;


@RestController
@Scope("request")
public class PaymentController {

	@Autowired
	@Qualifier("paymentService")
	private IPaymentService paymentService;
	
	
	@GetMapping(value="/getAllPayments",produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Payment> getAllPayments(){
		return paymentService.getAllPayments();
	}
	
	/////////////////////

	
	@GetMapping(value="/paymentwithbooking/{Id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseTemplateVo getPaymentWithBooking(@PathVariable("Id") Integer booking_id) {
		
		return paymentService.getPaymentWithBooking(booking_id);
	}
	
	

	//////////////////////
	
	
	@GetMapping(value="/getPaymentsById/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
	public Payment getPaymentById(@PathVariable("id") Integer payment_id) {
		return paymentService.getPaymentsById(payment_id);
	}
	
	@GetMapping(value="/getAllPaymentsByDate/{date}",produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Payment> getAllPaymentsByDate(@PathVariable String date){
		return paymentService.getAllPaymentByDate(date);
	}
	
	@GetMapping(value="/getAllPaymentsByAmount/{amount}",produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Payment> getAllPaymentsByAmount(@PathVariable String amount){
		return paymentService.getAllPaymentByAmount(amount);
	}
	
	@DeleteMapping(value="/deleteById/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteById(@PathVariable   Integer payment_id) {
		paymentService.delete(payment_id);
	}
	
	@PutMapping(value="/updatePayment",produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(code = HttpStatus.OK)
	public Payment updatePayment(@RequestBody   Payment payment) {
		return paymentService.update(payment);
	}
	
	@PostMapping(value="/savePayment",produces = {MediaType.APPLICATION_JSON_VALUE},
			consumes = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(code = HttpStatus.CREATED)
	public Payment savePayment(@RequestBody Payment payment) {
		return paymentService.save(payment);
	}
}
