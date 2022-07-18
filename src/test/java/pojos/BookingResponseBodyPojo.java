package pojos;

public class BookingResponseBodyPojo {

    // 1) tum keyler icin private variable'lar olusturuyoruz
    private Integer bookingid;
    private Bookingpojo booking;

    // 2) tum parametrelerle ve parametresiz constructor'larimizi olusturuyoruz

    public BookingResponseBodyPojo(Integer bookingid, Bookingpojo booking) {
        this.bookingid = bookingid;
        this.booking = booking;
    }

    public BookingResponseBodyPojo() {
    }

    // 3) Getters ve setters'larimizi olusturuyoruz


    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public Bookingpojo getBooking() {
        return booking;
    }

    public void setBooking(Bookingpojo booking) {
        this.booking = booking;
    }

    // 4) toString() metodumuzu olusturuyoruz

    @Override
    public String toString() {
        return "BookingResponseBodyPojo{" +
                "bookingid=" + bookingid +
                ", booking=" + booking +
                '}';
    }
}
