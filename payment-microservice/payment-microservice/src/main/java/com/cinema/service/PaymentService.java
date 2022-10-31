package com.cinema.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cinema.domain.Payment;

import com.cinema.repository.PaymentRepository;

import vo.BookingDetails;
import vo.ResponseTemplateVo;


@Service("paymentService")
@Scope("singleton")
public class PaymentService implements IPaymentService{

	@Autowired
	@Qualifier("paymentRepository")
	private PaymentRepository paymentRepository;
	
	@Override
	public Payment save(Payment payment) {
		
		return paymentRepository.save(payment);
	}

	@Override
	public Payment update(Payment payment) {
		
		return paymentRepository.save(payment);
	}

	@Override
	public void delete(int payment_id) {
		paymentRepository.deleteById(payment_id);
	}

	@Override
	public List<Payment> getAllPayments() {
		
		return paymentRepository.findAll();
	}

	@Override
	public Payment getPaymentsById(int payment_id) {
		return paymentRepository.findById(payment_id).get();
	}

	@Override
	public List<Payment> getAllPaymentByDate(String date) {
		return paymentRepository.findByDateLike(date);
	}

	@Override
	public List<Payment> getAllPaymentByAmount(String amount) {
		return paymentRepository.findByAmountLike(amount);
	}
//////////////////////
	
@Autowired
private RestTemplate restTemplate;
@Override
public ResponseTemplateVo getPaymentWithBooking(int booking_id) {



ResponseTemplateVo vo= new ResponseTemplateVo();

Payment payment = paymentRepository.findById(booking_id).get();

    
BookingDetails bookingDetails =restTemplate.getForObject("http://localhost:8084/bookingsbyid/"+payment.getBooking_id(),BookingDetails.class);
    

  vo.setPayment(payment);
  vo.setBookingDetails(bookingDetails);
  return vo ;

}


}
