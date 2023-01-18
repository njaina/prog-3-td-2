package app.foot.controller;

import app.foot.model.Match;
import app.foot.model.PlayerScorer;
import app.foot.repository.entity.MatchEntity;
import app.foot.repository.entity.PlayerScoreEntity;
import app.foot.service.MatchService;
import app.foot.service.PlayerScorerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.regex.Matcher;
import java.util.stream.Stream;

@RestController
@AllArgsConstructor
public class MatchController {
    private final MatchService service;
    private final PlayerScorerService score;

    @GetMapping("/matches")
    public List<Match> getMatches() {
        return service.getMatches();
    }
    @GetMapping("/matches/{matchId}")
    public Stream<Match> getById(@PathVariable int id){
        return service.getById(id);
    }
    @PostMapping("matches/{matchId}/scores")
    public List<PlayerScorer> post(@RequestBody List<PlayerScoreEntity> scorer) {
        return score.newScore(scorer);
    }
}
