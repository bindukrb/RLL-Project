package com.cinema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cinema.domain.Payment;


@Repository("paymentRepository")
public interface PaymentRepository extends JpaRepository<Payment, Integer>{
//	List<Payment> findByIdLike(Integer payment_id);
	List<Payment> findByDateLike(String date);
	List<Payment> findByAmountLike(String amount);
}
