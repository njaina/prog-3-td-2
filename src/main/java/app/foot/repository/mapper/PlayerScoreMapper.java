package app.foot.repository.mapper;

import app.foot.model.PlayerScorer;

public class PlayerScoreMapper {
    public PlayerScorer toRest(PlayerScorer rest){
        return PlayerScorer.builder()
                .player(rest.getPlayer())
                .isOwnGoal(rest.getIsOwnGoal())
                .minute(rest.getMinute())
                .build();
    }
}
