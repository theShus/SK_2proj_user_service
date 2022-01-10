package domain;

import javax.persistence.*;


@Entity
public class Admin{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUserHolder() {
        return user;
    }

    public void setUserHolder(User user) {
        this.user = user;
    }
}