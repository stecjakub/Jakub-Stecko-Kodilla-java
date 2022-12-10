package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    public List<ForumUser> forumUserList = new ArrayList<>();

    public Forum(){
        forumUserList.add(new ForumUser(2381,"dasdadsa",'M',2001,21));
        forumUserList.add(new ForumUser(1745,"bljash",'M',1999,0));
        forumUserList.add(new ForumUser(2187,"sssa",'M',2010,0));
        forumUserList.add(new ForumUser(2011,"tgv",'F',2013,4));
        forumUserList.add(new ForumUser(921,"yhgvf",'M',1989,7));
        forumUserList.add(new ForumUser(5692,"qwec",'M',1962,43));
        forumUserList.add(new ForumUser(12,"omkmj",'F',1976,0));
        forumUserList.add(new ForumUser(6672,"gfbybf",'F',1985,3));
        forumUserList.add(new ForumUser(8912,"dtbdf",'F',1966,0));
        forumUserList.add(new ForumUser(92,"asdsad",'M',2002,31));
        forumUserList.add(new ForumUser(1221,"tttbgg",'M',2009,2));

    }

    public List<ForumUser> getForumUserList() {
        return new ArrayList<>(forumUserList);
    }
}
