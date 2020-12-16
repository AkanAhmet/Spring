package com.akan.topics;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> listoftopics = new ArrayList<Topic>(Arrays.asList(new Topic("1","Ahmet","Akan"),
            new Topic("2","Duman","AKAN"),
            new Topic("3","Zıpzıp","AKAN")));

    public List<Topic> getAllTopics() {
        return  listoftopics;
    }


    public Topic getTopic(String id) {
        return  listoftopics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        listoftopics.add(topic);
    }

    public void updateTopic(Topic topic, String id) {
        for(int i=0; i<listoftopics.size();i++) {
            if(listoftopics.get(i).getId().equals(id)) {
                listoftopics.set(i,topic);
                return;
            }

        }
    }

    public void deleteTopic(String id) {
        listoftopics.removeIf(t -> t.getId().equals(id));
    }
}
