package vo;

public class BookingDetails {
	
	
 private Integer booking_id;
	
	
 private String Date;
	
	
 private String Venue;
	

 private String SeatNo;
	

 private String movieName;
	

	private int price;
	
	
	private String time;


	public Integer getBooking_id() {
		return booking_id;
	}


	public void setBooking_id(Integer booking_id) {
		this.booking_id = booking_id;
	}


	public String getDate() {
		return Date;
	}


	public void setDate(String date) {
		Date = date;
	}


	public String getVenue() {
		return Venue;
	}


	public void setVenue(String venue) {
		Venue = venue;
	}


	public String getSeatNo() {
		return SeatNo;
	}


	public void setSeatNo(String seatNo) {
		SeatNo = seatNo;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	@Override
	public String toString() {
		return "BookingDetails [booking_id=" + booking_id + ", Date=" + Date + ", Venue=" + Venue + ", SeatNo=" + SeatNo
				+ ", movieName=" + movieName + ", price=" + price + ", time=" + time + "]";
	}


	public BookingDetails(Integer booking_id, String date, String venue, String seatNo, String movieName, int price,
			String time) {
		super();
		this.booking_id = booking_id;
		Date = date;
		Venue = venue;
		SeatNo = seatNo;
		this.movieName = movieName;
		this.price = price;
		this.time = time;
	}


	public BookingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}