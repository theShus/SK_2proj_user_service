package dto;

import java.util.Date;

/**
 * Created on 09.01.2022. by Andrija inside package dto.
 */
public class ManagerCreateDto {
   // private Long id;
    private String hotel;
    private Date hireDate;
    private Long userId;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
