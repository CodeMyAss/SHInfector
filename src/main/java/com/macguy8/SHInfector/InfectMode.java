package com.macguy8.SHInfector;

/**
 * Created by macguy8 on 6/1/2014.
 */
public enum InfectMode {

    //*************************//

    PASTE_PROPERTIES(PastePropertiesMode.class);

    //*************************//

    private InfectModeBase object;

    //*************************//

    InfectMode(Class<? extends InfectModeBase> clazz) {
        try {
            object = clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void activate() {
        object.activate();
    }

    //*************************//

}