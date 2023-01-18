package app.foot.controller;

import app.foot.model.PlayerScorer;
import app.foot.repository.entity.PlayerScoreEntity;
import app.foot.service.PlayerScorerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class PlayerScorerController {
    private final PlayerScorerService service;
    @GetMapping("/scores")
    public List<PlayerScorer> get(){
        return service.getScrore();
    }
    @PostMapping("/scores")
    public List<PlayerScorer> post(@RequestBody List<PlayerScoreEntity> scorer){
        return service.newScore(scorer);
    }
}
