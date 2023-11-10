package com.example.quest.bystrov.quests;

import com.example.quest.bystrov.exceptions.CreateQuestException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestFabricTest {
    private static QuestFabric questFabric;

    @BeforeAll
    public static void init(){
        questFabric = new QuestFabric();
    }

    @Test
    public void createQuest_method_when_incorrect_questName_throw_CreateQuestException(){
        assertThrows(CreateQuestException.class, () -> {
            questFabric.createQuest("WrongOrIncorrectName");
        });
    }

    @Test
    public void createQuest_method_create_AlienQuest_when_questName_is_AlienQuest(){
        assertInstanceOf(AlienQuest.class, questFabric.createQuest("AlienQuest"));
    }
}