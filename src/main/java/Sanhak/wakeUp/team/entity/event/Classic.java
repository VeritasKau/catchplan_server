package Sanhak.wakeUp.team.entity.event;

import Sanhak.wakeUp.team.entity.Scrap;
import jakarta.persistence.*;
import lombok.Getter;


import java.util.ArrayList;
import java.util.List;


@Getter
@Entity
public class Classic   {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "classic_id")
    private Long id;
    private String image;
    private String text;
    private String where;
    private String duration;
    private String url;
    private String detail;
    private String detail2;
    @OneToMany(mappedBy = "classic")
    private List<Scrap> scraps = new ArrayList<>();
}
