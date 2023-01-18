package app.foot.controller;

import app.foot.model.Match;
import app.foot.model.PlayerScorer;
import app.foot.repository.entity.MatchEntity;
import app.foot.service.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.regex.Matcher;

@RestController
@AllArgsConstructor
public class MatchController {
    private final MatchService service;

    @GetMapping("/matches")
    public List<Match> getMatches() {
        return service.getMatches();
    }
    /**@PostMapping("/matches/{matchId}/goals")
    public Match addGoals(@PathVariable int matchId, @RequestBody List<PlayerScorer> scorers) {
        scorers.forEach(validator::accept);
        return service.addGoals(matchId, scorers);
    }*/
}
