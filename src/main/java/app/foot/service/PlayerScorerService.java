package app.foot.service;

import app.foot.model.Match;
import app.foot.model.Player;
import app.foot.model.PlayerScorer;
import app.foot.repository.PlayerScoreRepository;
import app.foot.repository.entity.PlayerScoreEntity;
import app.foot.repository.mapper.PlayerMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PlayerScorerService {
    private final PlayerScoreRepository repository;

    private final PlayerMapper mapper;
    public List<PlayerScorer> getScrore(){
        return repository.findAll().stream().map(mapper::toDomain).toList();
    }
    public List<PlayerScorer> newScore(List<PlayerScoreEntity> scorer){
        PlayerScorer minute = null;
        Player player = null;
        if(minute.getMinute()>=0 && minute.getMinute()<=90 || player.getIsGuardian()==false ){
            return repository.saveAll(scorer).stream()
                    .map(mapper::toDomain)
                    .toList();
        }
        throw new RuntimeException("There is an error, please verify again");
    }
}
