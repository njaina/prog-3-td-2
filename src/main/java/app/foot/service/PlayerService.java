package app.foot.service;

import app.foot.model.Player;
import app.foot.repository.PlayerRepository;
import app.foot.repository.PlayerScoreRepository;
import app.foot.repository.entity.PlayerEntity;
import app.foot.repository.mapper.PlayerMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PlayerService {
    private final PlayerRepository repository;
    private final PlayerMapper mapper;

    private final PlayerScoreRepository playerScoreRepository;

    public List<Player> getPlayers() {
        return repository.findAll().stream()
                .map(mapper::toDomain)
                .collect(Collectors.toUnmodifiableList());
    }

    public List<Player> createPlayers(List<Player> toCreate) {
        return repository.saveAll(toCreate.stream()
                        .map(mapper::toEntity)
                        .collect(Collectors.toUnmodifiableList())).stream()
                .map(mapper::toDomain)
                .collect(Collectors.toUnmodifiableList());
    }

    public Player updatePlayer(int id, Player player) {
        PlayerEntity playerEntity = mapper.toUpdateEntity(id, player);
        PlayerEntity updatedPlayerEntity = repository.save(playerEntity);
        return mapper.toDomain(updatedPlayerEntity);
    }
}
