package com.example.polygon.doman;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor

public class Box  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NonNull
    @Column(unique = true, nullable = false, length = 80)
    private String name;
    private String description;
//    @Enumerated(EnumType.STRING)
//    private BoxStatus boxStatus;
//    @Enumerated(EnumType.STRING)
//    private BoxType boxType;

}
