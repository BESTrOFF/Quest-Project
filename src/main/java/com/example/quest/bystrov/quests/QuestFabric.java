package com.example.quest.bystrov.quests;

import com.example.quest.bystrov.exceptions.CreateQuestException;

public class QuestFabric {
    public Quest createQuest(String questName){
        switch (questName){
            case ("AlienQuest"):
                return new AlienQuest();
            default:
                throw new CreateQuestException("Incorrect name of the quest to create");
        }
    }
}
