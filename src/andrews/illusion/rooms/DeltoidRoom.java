package andrews.illusion.rooms;

import andrews.jengine.Room;

/**
 * @author STALKER_2010
 */
public class DeltoidRoom extends Room {
    public DeltoidRoom() {
        super();
    }

    public DeltoidRoom(String name) {
        super(name);
        background = "game_bg";
        objectsIDs.add("deltoid_mouse_point");
        objectsIDs.add("deltoid_base");
        objectsIDs.add("controller");
    }
}
