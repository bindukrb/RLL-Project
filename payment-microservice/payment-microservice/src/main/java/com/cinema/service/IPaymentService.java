package com.cinema.service;

import java.util.List;

import com.cinema.domain.Payment;

import vo.ResponseTemplateVo;



public interface IPaymentService {
	Payment save(Payment payment);
	Payment update(Payment payment);
	void delete(int payment_id);
	List<Payment> getAllPayments();
	Payment getPaymentsById(int payment_id);
	List<Payment> getAllPaymentByDate(String date);
	List<Payment> getAllPaymentByAmount(String amount);
	
//////////////
public ResponseTemplateVo getPaymentWithBooking(int booking_id);
////////////////
}
