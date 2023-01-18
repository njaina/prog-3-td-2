package app.foot.exception;

import app.foot.model.Player;

public class GoalScorerValidator {
    public static void scoreGoal(Player player, int minute) throws Exception {
        if (player.getIsGuardian()) {
            throw new Exception("Un gardien de but ne peut pas marquer de buts!");
        }
        if (minute < 0 || minute > 90) {
            throw new Exception("La minute doit être entre 0 et 90!");
        }

    }
}
