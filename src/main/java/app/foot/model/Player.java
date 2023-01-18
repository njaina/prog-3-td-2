package app.foot.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class Player {
    private Integer id;
    private String name;
    private Boolean isGuardian;
}
