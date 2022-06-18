package kr.co.aske.quickblog.user.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    Long Id;

    @Column
    String Name;
}
