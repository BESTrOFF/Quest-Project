package com.example.quest.questions.quests;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AlienQuest implements Quest {
    private boolean fight;
    private final Random randomizer;

    public AlienQuest() {
        fight = false;
        randomizer = new Random();

    }

    public String getQuestion(String answer) {
        int believe;

        switch (answer) {
            case ("LostTheMemory"):
                return "You've lost your memory. Accept the UFO challenge?";

            case ("ChallengeAccepted"):
                return "Go up to the bridge?";

            case ("Bridge"):
                return "Who are you?";

            case ("True"):
                return "They took you home";

            case ("Lie"):
                return "What do you say?";

            case ("Doctor"):
                believe = randomizer.nextInt(10) + 1;

                if (believe > 5) { // Они поверили, что ты Доктор, но могут оказаться врагами доктора.
                    if ((randomizer.nextInt(10) + 1) > 5) {
                        fight = false;
                        return "They believed you and take you to the Earth.";
                    } else {
                        fight = true;
                        return "They turned out to be Doctor's enemies. Get ready to fight.";
                    }
                } else { // Они не поверили
                    fight = true;
                    return "They didn't believed you. Get ready to fight";
                }

            case ("Captain"):
                believe = randomizer.nextInt(10) + 1;

                if (believe > 5) { // Они поверили, что ты капитан
                    fight = false;
                    return "They believed you and take you to the Earth.";
                } else { // Они не поверили
                    fight = true;
                    return "They didn't believed you. Get ready to fight";
                }

            case ("EndGame"):
                return "End. Play again?";

            default:
                return null;
        }
    }

    public List<String> getVariants(String answer) {
        List<String> variants;

        switch (answer) {
            case ("LostTheMemory"):
                variants = new ArrayList<>();

                variants.add("<button type=\"submit\" name=\"answer\" value=\"ChallengeAccepted\">Yes</button>");
                variants.add("<button type=\"submit\" name=\"answer\" value=\"EndGame\">No</button>");

                return variants;

            case ("ChallengeAccepted"):
                variants = new ArrayList<>();

                variants.add("<button type=\"submit\" name=\"answer\" value=\"Bridge\">Yes</button>");
                variants.add("<button type=\"submit\" name=\"answer\" value=\"EndGame\">No</button>");

                return variants;

            case ("Bridge"):
                variants = new ArrayList<>();

                variants.add("<button type=\"submit\" name=\"answer\" value=\"True\">True</button>");
                variants.add("<button type=\"submit\" name=\"answer\" value=\"Lie\">Lie</button>");

                return variants;

            case ("Lie"):
                variants = new ArrayList<>();

                variants.add("<button type=\"submit\" name=\"answer\" value=\"Doctor\">" +
                        "I'm Doctor. Urgently take me to Earth!" +
                        "</button>");
                variants.add("<button type=\"submit\" name=\"answer\" value=\"Captain\">" +
                        "I'm the captain of this ship. Heading for Earth!" +
                        "</button>");

                return variants;

            case ("Doctor"):
            case ("Captain"):
                variants = new ArrayList<>();
                if (!fight) {
                    variants.add(" <a href=\"index.jsp\">Try again?</a>");
                }
                return variants;

            case ("EndGame"):
            case ("True"):
                variants = new ArrayList<>();

                variants.add(" <a href=\"index.jsp\">Try again?</a>");

                return variants;

            default:
                return null;
        }
    }

    public String getPath(String answer) {
        if (!fight) {
            return "WEB-INF/jsps/game.jsp";
        } else return "fight";
    }

}
