package ac.id.poliban.xyz_friend.dao;

import java.util.List;
import ac.id.poliban.xyz_friend.model.Friend;
public interface FriendDao {
    void insert(Friend f);

    void update(int id, Friend f);

    void update(Friend friend);

    void delete(int id);

    Friend getAFriend(int id);

    Friend getFriendById(int id);

    List<Friend> getAllFriends();
}
