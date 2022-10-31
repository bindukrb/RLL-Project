package vo;

import com.cinema.domain.Payment;

public class ResponseTemplateVo {
 
	private BookingDetails bookingDetails;
	
	private Payment payment;

	public ResponseTemplateVo() {
		super();
		
	}

	public ResponseTemplateVo(BookingDetails bookingDetails, Payment payment) {
		super();
		this.bookingDetails = bookingDetails;
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "ResponseTemplateVo [bookingDetails=" + bookingDetails + ", payment=" + payment + "]";
	}

	public BookingDetails getBookingDetails() {
		return bookingDetails;
	}

	public void setBookingDetails(BookingDetails bookingDetails) {
		this.bookingDetails = bookingDetails;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
}
