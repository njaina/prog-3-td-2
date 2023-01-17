package app.foot.controller;

import app.foot.model.Match;
import app.foot.repository.entity.MatchEntity;
import app.foot.service.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @PostMapping("/matches")
    public List<MatchEntity> create(List<MatchEntity> c){ return service.create(c);}
}
