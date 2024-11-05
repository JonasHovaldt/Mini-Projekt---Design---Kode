package model;
import java.util.ArrayList;


/**
 * Write a description of class FriendContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FriendContainer
{
    // instance variables - replace the example below with your own
    private static FriendContainer instance;
    private ArrayList<Friend> friends;

    /**
     * Constructor for objects of class FriendContainer
     */
    private FriendContainer()
    {
        // initialise instance variables
        friends = new ArrayList<>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static FriendContainer getInstance(){
        if(instance == null){
            instance = new FriendContainer();
        }
        return instance;
    }
    
    public void addFriend(Friend friend){
        friends.add(friend);
    }
    
    public void removeFriend(Friend friend){
        friends.remove(friend);
    }
    
    public ArrayList<Friend> getAllFriends(){
        return new ArrayList<>(friends);
    }
    
    public Friend findFriendByPhone(String phone){
        for(Friend friend : getAllFriends()){
            if(friend.getPhone().equals(phone)){
                return friend;
            }
        }
        return null;
    }
}
