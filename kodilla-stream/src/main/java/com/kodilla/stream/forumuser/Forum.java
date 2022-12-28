package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    public List<ForumUser> forumUserList = new ArrayList<>();

    public Forum(){
        forumUserList.add(new ForumUser(2381,"dasdadsa",'M', LocalDate.of(2002,12,24),21));
        forumUserList.add(new ForumUser(1745,"bljash",'M',LocalDate.of(1965,3,5),0));
        forumUserList.add(new ForumUser(2187,"sssa",'M',LocalDate.of(2011,6,1),0));
        forumUserList.add(new ForumUser(2011,"tgv",'F',LocalDate.of(1976,4,3),4));
        forumUserList.add(new ForumUser(921,"yhgvf",'M',LocalDate.of(1999,7,4),7));
        forumUserList.add(new ForumUser(5692,"qwec",'M',LocalDate.of(1967,5,19),43));
        forumUserList.add(new ForumUser(12,"omkmj",'F',LocalDate.of(2009,12,30),0));
        forumUserList.add(new ForumUser(6672,"gfbybf",'M',LocalDate.of(1987,8,27),3));
        forumUserList.add(new ForumUser(8912,"dtbdf",'M',LocalDate.of(2004,16,21),0));
        forumUserList.add(new ForumUser(92,"asdsad",'F',LocalDate.of(2010,6,22),31));
        forumUserList.add(new ForumUser(1221,"tttbgg",'F',LocalDate.of(2000,11,13),2));

    }

    public List<ForumUser> getForumUserList() {
        return new ArrayList<>(forumUserList);
    }
}
