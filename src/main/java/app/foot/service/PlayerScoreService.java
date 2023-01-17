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
public class PlayerScoreService {
    private final PlayerScoreRepository repository;
    private final PlayerMapper mapper;
    /**public List<PlayerScorer> newScore(List<PlayerScorer> scorer){
        List<PlayerScorer> domain = scorer.stream()
                .map(mapper::toDomain)
                .toList();
        return repository.saveAll(domain).stream()
                .map(mapper::toDomain)
                .toList();
    }*/
}
