package com.example.quest.questions.quests;

public class QuestFabric {
    public Quest createQuest(String questName){
        switch (questName){
            case ("AlienQuest"):
                return new AlienQuest();
            default:
                return new AlienQuest();
        }
    }
}
