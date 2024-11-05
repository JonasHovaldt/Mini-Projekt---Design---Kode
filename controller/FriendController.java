package controller;
import model.Friend;
import model.FriendContainer;

/**
 * Write a description of class FriendController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FriendController
{
    public Friend findFriendByPhone(String phone){
        // FriendContainer friendContainer = FriendContainer.getInstance();
        // for(Friend friend : friendContainer.getAllFriends()){
            // if(friend.getPhone().equals(phone)){
                // return friend;
            // }
        // }
        // return null;
        return FriendContainer.getInstance().findFriendByPhone(phone);
    }
}
