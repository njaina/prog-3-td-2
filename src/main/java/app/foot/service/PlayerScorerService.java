package app.foot.service;

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
        return repository.saveAll(scorer).stream()
                .map(mapper::toDomain)
                .toList();
    }
}
