package com.rubypaper.domain;

        import jakarta.persistence.Column;
        import jakarta.persistence.Entity;
        import jakarta.persistence.GeneratedValue;
        import jakarta.persistence.Id;
        import lombok.Getter;
        import lombok.Setter;
        import lombok.ToString;

        import java.util.Date;

@Getter
@Setter
@ToString
@Entity
public class Board {
    @Id @GeneratedValue
    private Long seq;
    private String title;
    @Column(updatable = false)
    private String writer;
    private String content;

    @Column(insertable = false, updatable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date createDate;

    @Column(insertable = false, updatable = false, columnDefinition = "bigint default 0")
    private Long cnt;
}
