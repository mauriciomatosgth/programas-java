package entities;

import exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private static Date now =  new Date();
    //Construtores
    public Reservation(){

    }

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut)  {

        if(checkIn.before(now)||checkOut.before(now)){
            throw new DomainException("A data deve ser futura a da data atual.");
        }
        if(!checkOut.after(checkIn)){
            throw new DomainException( "A data de Check-out deve ser futura a de check-in ");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    //Getter e Setter


    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }


    public Date getCheckOut() {
        return checkOut;
    }

    //metodos

    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut) {

        if(checkIn.before(now)||checkOut.before(now)){
            throw new DomainException("A data so pode ser atualizadas para data futuras.");
        }
        if(!checkOut.after(checkIn)){
           throw new DomainException( "A data de Check-out deve ser futura a de check-in ");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;

    }

    @Override
    public String toString(){
        return  "RESERVATION: "
                +"Room "
                + roomNumber
                + ", check-in: "
                + sdf.format(checkIn)
                + ", check-out: "
                +sdf.format(checkOut)
                + ", "
                + duration()
                + " nights";
    }


}
