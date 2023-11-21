package proejct.gachicode.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@Getter
public class UserProfile {

    @Id @GeneratedValue
    @Column(name = "user_profile_id")
    private Long id;


}
