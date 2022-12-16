package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args){
        Forum forumUserList = new Forum();
        Map<Integer, ForumUser> theResultListOfForumUser = forumUserList.getForumUserList().stream().filter(forumUser -> forumUser.getDateOfBirth()>1900 && forumUser.getDateOfBirth() <= 2002).filter(forumUser -> forumUser.getSex()=='M').filter(forumUser -> forumUser.getNumberOfPublishedPost() >= 1).collect(Collectors.toMap(ForumUser::getiD, ForumUser ->ForumUser));

        System.out.println("#elements: " + theResultListOfForumUser.size() + "\n");
        theResultListOfForumUser.entrySet().stream().map(entry->entry.getKey() + ":" + entry.getValue()).forEach(System.out::println);

    }
}
